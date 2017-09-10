package Tools;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendPasswordReminderEmail {
private static Properties props = new Properties();
private final static String username = "szotanulo.en.info@gmail.com";
private final static String password = "kiskakas12";
private static Session session;
private static Message message;
	public static boolean sendEmailTo(String _email, String _subject, String _text){
		settingUpEmailService();
		authentication();
                
		try {
                    newMessage(_email,_subject,_text);    
                    Transport.send(message);
                    return true;
		} catch (MessagingException e) {
			return false;    
		}    
	}

    private static void settingUpEmailService() {
                props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.starttls.enable", "true");
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "587");
    }

    private static void authentication() {
        session = Session.getInstance(props,
		  new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		  });
    }

    private static void newMessage(String _email, String _subject, String _text) throws AddressException, MessagingException {
                        message = new MimeMessage(session);
			message.setFrom(new InternetAddress("szotanulo.en.info@gmail.com"));
			message.setRecipients(Message.RecipientType.TO,
				InternetAddress.parse(_email));
			message.setSubject(_subject);
			message.setText(_text);
    }
}
