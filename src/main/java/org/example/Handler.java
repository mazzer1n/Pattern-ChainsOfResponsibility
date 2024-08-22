package org.example;

public abstract class Handler {
    private Handler next;

    public void handle(Bid bid) {
        if (next != null) {
            next.handle(bid);
        }
    }
    public Handler bind(Handler next) {
        this.next = next;
        return next;
    }
}
