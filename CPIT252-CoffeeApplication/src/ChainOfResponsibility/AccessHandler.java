package ChainOfResponsibility;





public abstract class AccessHandler {

    private AccessHandler next;
    
    public AccessHandler setNextHandler(AccessHandler next){
       this.next = next;
       return next;
    }
    
    public abstract boolean handle(String username, String password);
    
    protected boolean handleNext(String username, String password){
        if (next == null){
            return true;
        } else {
            return next.handle(username, password);
        }
    }
}
