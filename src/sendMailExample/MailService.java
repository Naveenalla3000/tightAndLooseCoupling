package sendMailExample;

class SendGrid{
    public void sendConfirmation(){
        System.out.println("Sending confirmation from sendgrid");
    }
}

class Resend{
    public void sendPurchase(){
        System.out.println("sending purchase from resend");
    }
}

class Twilio{
    public void sendOtp(){
        System.out.println("sending otp from twilio");
    }
}

public class MailService {
    public static void main(String[] args) {
        SendGrid sg = new SendGrid();
        Resend resend = new Resend();
        Twilio tw = new Twilio();

        sg.sendConfirmation();
        resend.sendPurchase();
        tw.sendOtp();

    }
}
