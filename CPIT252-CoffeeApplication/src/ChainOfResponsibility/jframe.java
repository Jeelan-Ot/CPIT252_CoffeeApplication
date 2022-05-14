package ChainOfResponsibility;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Sara_
 */
public class jframe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //databaseConnector
        System.out.println("HERE");
        String email = "sarah@gmail.com", pass = "sarah13";
        AccessHandler handler = new UserExistence();
        handler.setNextHandler(new PasswordValidity());

        AccessAuth service = new AccessAuth(handler);
        service.logIn(email, pass);

    }

}
