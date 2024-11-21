package com.mail.JavaMailSend.services;

import com.mail.JavaMailSend.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServices {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private MailService mailService;

    public Boolean sendInvitation(String email) {
//        Optional<User> userDetails = userRepository.findByEmail(email);
//
//        if (userDetails.isPresent()) {
//            User users = userDetails.get();
//            String body = "Hey User";
//            return mailService.sendMail("Invitation", email, body);
//        } else {
//            System.out.println("User not found with email: " + email);
//            return false; // Return false if user is not found
//        }
        return mailService.sendMail("Notification", email, "Hey User, Himanshu this side,I am sending you a testing mail");
    }
}