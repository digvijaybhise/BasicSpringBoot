package com.geekster.SpringAnnotation;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class HandleMail {

    @Autowired
    Student s1;

    public void sendMail(){

        Properties properties = System.getProperties();

        // set properties

        // host/ protocol
        properties.put("mail.smtp.host", "smtp.gmail.com");
        // port no. for 465
        properties.put("mail.smtp.port", 465);
        // enable connection with gmail
        properties.put("mail.smtp.ssl.enable", "true");
        // for authentication
        properties.put("mail.smtp.auth", "true");

        //Session
        Session session = Session.getInstance(properties, new MailAuthentication());

        // create the message object
        MimeMessage message = new MimeMessage(session);

        try {
            //SENDER
            message.setFrom(MailConstants.SENDER);
            //RECEIVER
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(MailConstants.RECEIVER));
            //SUBJECT
            message.setSubject(MailConstants.SUBJECT);
            //MESSAGE
            message.setText(s1.toString());


            Transport.send(message);
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }

    }

}
