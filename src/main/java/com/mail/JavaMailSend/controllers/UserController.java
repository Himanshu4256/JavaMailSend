package com.mail.JavaMailSend.controllers;

import com.mail.JavaMailSend.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserServices userServices;

    @GetMapping("/sendInvitation")
    public String sendInvitation(@RequestHeader("email") String email) {
        boolean result = userServices.sendInvitation(email);

        if (result) {
            return "Email Sent, Please check you mail";
        } else {
            return "Failed to send Email"; // Provide feedback based on result
        }
    }

}
