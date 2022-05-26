package ChainOfResponsibility;

public class AccessAuth {

    private final AccessHandler handler;

    public AccessAuth(AccessHandler handler) {
        this.handler = handler;
    }

    public boolean logIn(String email, String password) {
        if (handler.handle(email, password)) {
            return true;
        }
        return false;
    }
}




