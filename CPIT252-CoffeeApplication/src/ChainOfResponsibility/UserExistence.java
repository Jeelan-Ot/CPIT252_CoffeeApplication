package ChainOfResponsibility;

import Singleton.Database;

public class UserExistence extends AccessHandler {

    private Database database;

    @Override
    public boolean handle(String email, String password) {

        if (!database.isUserExist(email)) {
            System.out.println("user " + database.isUserExist(email));
            return false;
        }
        return handleNext(email, password);
    }
}
