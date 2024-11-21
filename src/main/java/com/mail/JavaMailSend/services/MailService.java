package com.mail.JavaMailSend.services;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class MailService {

    private static final Logger log = LoggerFactory.getLogger(MailService.class);

    @Autowired
    private JavaMailSender emailSender;

    @Value("${spring.mail.username}")
    private String emailFrom;


    public Boolean sendMail(String subject, String emailTo, String body) {
        try {
            MimeMessage message = emailSender.createMimeMessage();
            MimeMessageHelper msg = new MimeMessageHelper(message);
            msg.setTo(emailTo); // Use the parameter passed to the method
            msg.setFrom(emailFrom); // Ensure this is correct and matches the username in properties
            msg.setText(body, true);
            msg.setSubject(subject);

            System.out.println("Sending email...");
            emailSender.send(message);
            System.out.println("Email sent successfully.");
        } catch (MessagingException e) {
            e.printStackTrace();
            return false; // Return false if sending fails
        }
        return true; // Return true if mail sent successfully
    }
}
