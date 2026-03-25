package behavioral.chainofresponsibility;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Shop shop = new Shop(Arrays.asList(
                new Cashier(),
                new Support(),
                new Manager()
        ));

        Request req1 = new Request(RequestType.PAY_ORDER, "Customer wants to pay for order");
        Request req2 = new Request(RequestType.CANCEL_ORDER, "Customer wants to cancel order");
        Request req3 = new Request(RequestType.RETURN_ITEM, "Customer wants to return item");

        shop.makeRequest(req1);
        shop.makeRequest(req2);
        shop.makeRequest(req3);
    }
}
