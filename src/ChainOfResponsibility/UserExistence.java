package ChainOfResponsibility;

import Singleton.Database;

public class UserExistence extends AccessHandler {

    private Database database = new Database();

    @Override
    public boolean handle(String email, String password) {

        if (!database.isUserExist(email)) {
            return false;
        }
        return handleNext(email, password);
    }
}




