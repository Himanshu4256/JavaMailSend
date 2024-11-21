//package com.mail.JavaMailSend;
//
//import jakarta.mail.Message;
//import jakarta.mail.MessagingException;
//import jakarta.mail.Session;
//import jakarta.mail.Transport;
//import jakarta.mail.internet.InternetAddress;
//import jakarta.mail.internet.MimeMessage;
//
//import java.util.*;
//
//
//public class GFGEmailSend {
//public static void main(String [] args)
//{
//    // email ID of Recipient.
//    String recipient = "mhimanshu2104@gmail.com";
//
//    // email ID of  Sender.
//    String sender = "bagsarahimanshu@gmail.com";
//
//    // using host as localhost
//    String host = "192.168.1.31";
//
//    // Getting system properties
//    Properties properties = System.getProperties();
//
//    // Setting up mail server
//    properties.setProperty("mail.smtp.host", host);
//
//    // creating session object to get properties
//    Session session = Session.getDefaultInstance(properties);
//
//    try
//    {
//        // MimeMessage object.
//        MimeMessage message = new MimeMessage(session);
//
//        // Set From Field: adding senders email to from field.
//        message.setFrom(new InternetAddress(sender));
//
//        // Set To Field: adding recipient's email to from field.
//        message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipient));
//
//        // Set Subject: subject of the email
//        message.setSubject("This is Subject");
//
//        // set body of the email.
//        message.setContent("<h1>This is a HTML text</h1>","text/html");
//
//        // Send email.
//        Transport.send(message);
//        System.out.println("Mail successfully sent");
//    }
//    catch (MessagingException mex)
//    {
//        mex.printStackTrace();
//    }
//}
//}
