package ucu.edu.ua;

public class MailSender {
    public void sendMail(MailInfo info) {
        switch (info.getMailCode()) {
            case BIRTHDAY -> System.out.println("Sending birthday greetings to " + info.getClient().getName());
            case GIFT -> System.out.println("Sending gift notification to " + info.getClient().getName());
        }
    }
}