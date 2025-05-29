package com.vk_mail.Email_Sender.controller;

import com.vk_mail.Email_Sender.service.SendEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    private SendEmailService sendEmailService;

    @GetMapping("sendEmail")
    public String setEmail(){
        sendEmailService.sendEmail("rahulmairwa1@gmail.com","test","hi rahul");
        return "Send Successfully";
    }
}
