package ChainOfResponsibility;



import Singleton.Database;

public class UserExistence extends AccessHandler {

    Database database;

    @Override
    public boolean handle(String email, String password) {

        if (!database.isUserExist(email)) {
            return false;
        }
        return handleNext(email, password);
    }
}
