import java.util.List;

interface INotificationSender {
    void send(String message);
}

class EmailSend implements INotificationSender {
    @Override
    public void send(String message) {
        System.out.println("Email sent: " + message);
    }
}

class SmsSend implements INotificationSender {
    @Override
    public void send(String message) {
        System.out.println("SMS sent: " + message);
    }
}

class NotificationService {
    private List<INotificationSender> senders;

    public NotificationService(List<INotificationSender> senders) {
        this.senders = senders;
    }

    public void sendNotification(String message) {
        for (INotificationSender sender : senders) {
            sender.send(message);
        }
    }
}

public class Main4 {
    public static void main(String[] args) {
        INotificationSender emailSender = new EmailSend();
        INotificationSender smsSender = new SmsSend();
        List<INotificationSender> senders = List.of(emailSender, smsSender);

        NotificationService notificationService = new NotificationService(senders);
        notificationService.sendNotification("Привет мир!");
    }
}
