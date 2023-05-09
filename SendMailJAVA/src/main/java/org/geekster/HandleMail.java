package org.geekster;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class HandleMail {

    void sendMail(){
        //Host : gmail is smtp
        String host = "smtp.gmail.com";

        Properties properties = System.getProperties();
        System.out.println(properties);

        //Set Properties
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", 465);
        properties.put("mail.smtp.ssl.enable", "true");
        properties.put("mail.smtp.auth", "true");

        //Session
        Session session = Session.getInstance(properties, new MailAuthenticator());

        //Create the message object
        MimeMessage message = new MimeMessage(session);

        try {
            message.setFrom(MailConstants.SENDER);
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(MailConstants.RECEIVER));
            message.setSubject(MailConstants.SUBJECT);
            message.setText(MailConstants.MESSAGE);

            Transport.send(message);
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }

    }
}
