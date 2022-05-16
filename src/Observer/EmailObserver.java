package Observer;

import Observer.Observer;

public class EmailObserver extends Observer {

    public EmailObserver(String recipient) {
        super.setRecipient(recipient);
    }

    @Override
    public void update(String subject, String message) {
        SendEmail.send(subject, message, getRecipient());
    }
}
