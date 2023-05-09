package org.geekster;

public class Main {
    public static void main(String[] args) {

        System.out.println("This Application is supposed to send Mails");

        HandleMail mail = new HandleMail();
        mail.sendMail();
    }
}