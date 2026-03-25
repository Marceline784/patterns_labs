package behavioral.chainofresponsibility;

public class Support implements RequestHandler {

    @Override
    public boolean canHandleRequest(Request req) {
        return req.getRequestType() == RequestType.CANCEL_ORDER;
    }

    @Override
    public int getPriority() {
        return 2;
    }

    @Override
    public void handle(Request req) {
        req.markHandled();
        System.out.println(name() + " handling request " + req);
    }

    @Override
    public String name() {
        return "Support";
    }
}
