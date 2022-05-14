package ChainOfResponsibility;



public class AccessAuth {

    private final AccessHandler handler;

    public AccessAuth(AccessHandler handler) {
        this.handler = handler;
    }

    public boolean logIn(String username, String password) {
        System.out.println("LOGIN");
        if (handler.handle(username, password)) {
            System.out.println("Authorization was successful!");
            
            return true;
        }
        return false;
    }
}
