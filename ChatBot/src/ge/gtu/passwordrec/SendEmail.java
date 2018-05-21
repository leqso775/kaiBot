package ge.gtu.passwordrec;



import ge.gtu.model.User;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;




   public class SendEmail {
private static String USER_NAME = "thisiskaibot";  // GMail user name (just the part before "@gmail.com")
private static String PASSWORD = "kaibotisbest"; // GMail password
private static String RECIPIENT = "orevaotaku@gmail.com";
//private  String RECIPIENT = User.getEmail();
public static void main(String[] args) {
    String from = USER_NAME;
    String pass = PASSWORD;
    String[] to = { RECIPIENT }; // list of recipient email addresses
    String subject = "KaiBot sent this email";
    String body = "hello archil";

    sendFromGMail(from, pass, to, subject, body);
}

private static void sendFromGMail(String from, String pass, String[] to, String subject, String body) {
    Properties props = System.getProperties();
  String host = "smtp.gmail.com";
   // String host="localhost";
  // props.put("mail.smtp.ssl.trust", "smtp.gmail.com");
    props.put("mail.smtp.starttls.enable", "true");
   // props.put("mail.smtp.host", host);
   props.put("mail.smtp.ssl.trust", host);
    props.put("mail.smtp.user", from);
    props.put("mail.smtp.password", pass);
    props.put("mail.smtp.port", "587");//587
    props.put("mail.smtp.auth", "true");
 props.put("mail.smtp.user","username"); 
props.put("mail.smtp.host", "smtp.gmail.com"); 
props.put("mail.smtp.port", "25"); 
props.put("mail.debug", "true"); 
props.put("mail.smtp.auth", "true"); 
props.put("mail.smtp.starttls.enable","true"); 
props.put("mail.smtp.EnableSSL.enable","true");

props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");   
props.setProperty("mail.smtp.socketFactory.fallback", "false");   
props.setProperty("mail.smtp.port", "465");   
props.setProperty("mail.smtp.socketFactory.port", "465"); 

    Session session = Session.getDefaultInstance(props);
    MimeMessage message = new MimeMessage(session);

    try {
         //System.out.println("success point 2");

        message.setFrom(new InternetAddress(from));
        InternetAddress[] toAddress = new InternetAddress[to.length];

        // To get the array of addresses
        for( int i = 0; i < to.length; i++ ) {
            toAddress[i] = new InternetAddress(to[i]);
        }

        for( int i = 0; i < toAddress.length; i++) {
            message.addRecipient(Message.RecipientType.TO, toAddress[i]);
        }

         //System.out.println("success point 3");

        message.setSubject(subject);
        message.setText(body);
        // System.out.println("success point 4");

        Transport transport = session.getTransport("smtp");
        // System.out.println("success point 5");

        transport.connect(host, from, pass);
        transport.sendMessage(message, message.getAllRecipients());
        transport.close();
        //System.out.println("success 6");
    }
    catch (AddressException ae) {
        ae.printStackTrace();
    }
    catch (MessagingException me) {
        me.printStackTrace();
    }
  }
}
//thisIsKaiBot@gmail.com
//kaibotisbest
