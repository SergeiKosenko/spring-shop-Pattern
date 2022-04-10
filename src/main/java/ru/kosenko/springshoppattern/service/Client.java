package ru.kosenko.springshoppattern.service;

import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.MimeMessage;

public class Client {
    public void sendMail(Session session, String email) throws MessagingException {
        MimeMessage message = (new MimeMessageBuilder(session))
                .from("serg.cos@internet.ru")
                .to(email)
                .subject("Привет от паттерна builder")
                .build();
// send it
        Transport.send(message);
    }

}
