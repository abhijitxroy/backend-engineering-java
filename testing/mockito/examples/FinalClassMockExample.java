package testing.mockito.examples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class FinalClassMockExample {

    @Test
    void mockFinalClass() {

        PaymentService service =
                Mockito.mock(
                        PaymentService.class
                );

        Mockito.when(
                service.processPayment()
        ).thenReturn("SUCCESS");

        String response =
                service.processPayment();

        assertEquals(
                "SUCCESS",
                response
        );

        Mockito.verify(service)
                .processPayment();

    }

}

final class PaymentService {

    String processPayment() {

        return "REAL_PAYMENT";

    }

}