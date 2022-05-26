package ChainOfResponsibility;

import Singleton.Database;

public class PasswordValidity extends AccessHandler {

    private Database database = new Database();

    @Override
    public boolean handle(String email, String password) {
        if (!database.isPasswordValid(email, password)) {
            return false;
        }
        return handleNext(email, password);
    }
}



