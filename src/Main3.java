interface IMessageSender {
    void sendMessage(String message);
}

interface ISmsSender extends IMessageSender {
    void sendSms(String phoneNumber, String message);
}

interface IEmailSender extends IMessageSender {
    void sendEmail(String emailAddress, String message);
}

class SmsSender implements ISmsSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Отправка SMS: " + message);
    }

    @Override
    public void sendSms(String phoneNumber, String message) {
        System.out.println("Отправка SMS на номер " + phoneNumber + ": " + message);
    }
}

class EmailSender implements IEmailSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Отправка email: " + message);
    }

    @Override
    public void sendEmail(String emailAddress, String message) {
        System.out.println("Отправка email на адрес " + emailAddress + ": " + message);
    }
}

public class Main3 {
    public static void main(String[] args) {
        ISmsSender smsSender = new SmsSender();
        smsSender.sendMessage("Привет!");
        smsSender.sendSms("+1234567890", "Важное сообщение!");

        IEmailSender emailSender = new EmailSender();
        emailSender.sendMessage("Здравствуйте!");
        emailSender.sendEmail("test@example.com", "Сообщение по электронной почте");
    }
}
