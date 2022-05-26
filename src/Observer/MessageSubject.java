package Observer;

public class MessageSubject implements Subject {

    @Override
    public void notifyUpdate( Observer emailObserver, String subject, String message) {

        emailObserver.update(subject, message);

    }
}



