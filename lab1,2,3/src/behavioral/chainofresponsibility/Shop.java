package behavioral.chainofresponsibility;

import java.util.Comparator;
import java.util.List;

public class Shop {

    private final List<RequestHandler> handlers;

    public Shop(List<RequestHandler> handlers) {
        this.handlers = handlers;
    }

    public void makeRequest(Request req) {
        handlers.stream()
                .sorted(Comparator.comparing(RequestHandler::getPriority))
                .filter(handler -> handler.canHandleRequest(req))
                .findFirst()
                .ifPresent(handler -> handler.handle(req));
    }
}