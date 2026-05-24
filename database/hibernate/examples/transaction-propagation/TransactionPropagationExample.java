package database.hibernate.examples.transactionpropagation;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class TransactionPropagationExample {

    public static void main(String[] args) {

        System.out.println(
                "Transaction Propagation Example"
        );

        System.out.println(
                "Order -> Payment -> Audit"
        );

    }

}

@Service
class OrderService {

    private final PaymentService paymentService =
            new PaymentService();

    @Transactional(
            propagation =
                    Propagation.REQUIRED
    )
    public void placeOrder() {

        System.out.println(
                "Order transaction started"
        );

        paymentService.processPayment();

        System.out.println(
                "Order completed"
        );
    }

}

@Service
class PaymentService {

    private final AuditService auditService =
            new AuditService();

    @Transactional(
            propagation =
                    Propagation.REQUIRED
    )
    public void processPayment() {

        System.out.println(
                "Payment processing"
        );

        auditService.saveAudit();

    }

}

@Service
class AuditService {

    @Transactional(
            propagation =
                    Propagation.REQUIRES_NEW
    )
    public void saveAudit() {

        System.out.println(
                "Audit saved independently"
        );

    }

}

@Service
class ReportingService {

    @Transactional(
            propagation =
                    Propagation.NOT_SUPPORTED
    )
    public void generateReport() {

        System.out.println(
                "Report generated without transaction"
        );

    }

}

@Service
class ValidationService {

    @Transactional(
            propagation =
                    Propagation.SUPPORTS
    )
    public void validateOrder() {

        System.out.println(
                "Validation executed"
        );

    }

}