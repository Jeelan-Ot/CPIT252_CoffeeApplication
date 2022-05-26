package ChainOfResponsibility;

public abstract class AccessHandler {

    protected AccessHandler nextAccessHandler;

    public void setNextHandler(AccessHandler nextAccessHandler) {
        this.nextAccessHandler = nextAccessHandler;
    }

    public abstract boolean handle(String email, String password);

    protected boolean handleNext(String email, String password) {
        if (nextAccessHandler == null) {
            return true;
        } else {
            return nextAccessHandler.handle(email, password);
        }
    }
}




