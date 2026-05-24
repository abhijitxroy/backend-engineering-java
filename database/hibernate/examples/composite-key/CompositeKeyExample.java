package backend-engineering-java.database.hibernate.examples.composite-key;

public class CompositeKeyExample {
	
}

package examples.compositekey;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serializable;
import java.util.Objects;

public class CompositeKeyExample {

    public static void main(String[] args) {

        OrderItemId orderItemId = new OrderItemId(1001L, 2005L);

        OrderItem orderItem = new OrderItem(
                orderItemId,
                2,
                1500.00
        );

        System.out.println("Order Id : " + orderItem.getId().getOrderId());
        System.out.println("Product Id : " + orderItem.getId().getProductId());
        System.out.println("Quantity : " + orderItem.getQuantity());
        System.out.println("Price : " + orderItem.getPrice());
    }
}

@Embeddable
class OrderItemId implements Serializable {

    @Column(name = "order_id")
    private Long orderId;

    @Column(name = "product_id")
    private Long productId;

    public OrderItemId() {
    }

    public OrderItemId(Long orderId, Long productId) {
        this.orderId = orderId;
        this.productId = productId;
    }

    public Long getOrderId() {
        return orderId;
    }

    public Long getProductId() {
        return productId;
    }

    @Override
    public boolean equals(Object object) {

        if (this == object) {
            return true;
        }

        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        OrderItemId that = (OrderItemId) object;

        return Objects.equals(orderId, that.orderId)
                && Objects.equals(productId, that.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, productId);
    }
}

@Entity
@Table(name = "order_items")
class OrderItem {

    @EmbeddedId
    private OrderItemId id;

    private Integer quantity;

    private Double price;

    public OrderItem() {
    }

    public OrderItem(
            OrderItemId id,
            Integer quantity,
            Double price
    ) {
        this.id = id;
        this.quantity = quantity;
        this.price = price;
    }

    public OrderItemId getId() {
        return id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }
}