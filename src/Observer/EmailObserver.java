package Observer;

import Observer.Observer;

public class EmailObserver extends Observer {

    private SendEmail s = new SendEmail();

    public EmailObserver(String recipient) {
        super.setRecipient(recipient);
    }

    @Override
    public void update(String subject, String message) {
        s.send(subject, message, getRecipient());
    }
}




