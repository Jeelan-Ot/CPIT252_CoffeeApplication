
package Facade;

import ChainOfResponsibility.*;

public class LoginFacade {

    private AccessHandler handler;
    private String email;
    private String pass;
    public LoginFacade() {}

    public LoginFacade(String email, String pass) {
        this.email = email;
        this.pass = pass;
    }
    
    public boolean login(){
    
        boolean check = false;
        
        handler = new UserExistence();
        handler.setNextHandler(new PasswordValidity());
        AccessAuth service = new AccessAuth(handler);
        
        if (service.logIn(email, pass)) {
            check = true;
         } 
        return check;
    }
}




