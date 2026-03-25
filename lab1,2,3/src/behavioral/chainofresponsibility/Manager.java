package behavioral.chainofresponsibility;

public class Manager implements RequestHandler {

    @Override
    public boolean canHandleRequest(Request req) {
        return req.getRequestType() == RequestType.RETURN_ITEM;
    }

    @Override
    public int getPriority() {
        return 3;
    }

    @Override
    public void handle(Request req) {
        req.markHandled();
        System.out.println(name() + " handling request " + req);
    }

    @Override
    public String name() {
        return "Manager";
    }
}
