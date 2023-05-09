package com.geekster.SpringAnnotation;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class MailAuthentication extends Authenticator {

    @Override
    protected PasswordAuthentication getPasswordAuthentication() {
        return new PasswordAuthentication(MailConstants.SENDER, "hoddzbirxfwkmrwj");
    }
}
