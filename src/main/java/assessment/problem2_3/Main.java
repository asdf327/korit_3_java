package assessment.problem2_3;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@ToString
@Getter @Setter
class Order {
    private int orderId;
    private String productName;
    private String consumerName;
    private int price;
    private int stock;

    public void showOrderInfo(){
        System.out.println("\n주문번호 : " + orderId + "\n상품명 : " + productName
                + "\n구매자" + consumerName + "\n가격 : " + price + "\n수량 : " + stock);
    }
}

public class Main {
    public static void main(String[] args) {
        Order order = Order.builder()
                .orderId(100)
                .productName("Samsung GalaxyBooj2 Pro")
                .consumerName("홍길동")
                .price(1450000)
                .stock(2)
                .build();
        order.showOrderInfo();
    }
}
