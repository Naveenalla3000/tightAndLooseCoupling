package sendMailExample;

interface SendMail{
    void sendMail();
}

class Resend2 implements SendMail{

    @Override
    public void sendMail() {
        System.out.println("sending purchase from resend");
    }
}

class SendGrid2 implements SendMail{

    @Override
    public void sendMail() {
        System.out.println("Sending confirmation from sendgrid");
    }
}

class Twilio2 implements SendMail{

    @Override
    public void sendMail() {
        System.out.println("sending otp from twilio");
    }
}

public class MailService2 {
    public static void main(String[] args) {
        SendMail resend = new Resend2();
        SendMail sg = new SendGrid2();
        SendMail twilio = new Twilio2();

        resend.sendMail();
        sg.sendMail();
        twilio.sendMail();
    }
}
