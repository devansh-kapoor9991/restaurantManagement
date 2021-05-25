package com.restaurant.dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class SendEmail
{
    @Autowired
    private JavaMailSender javaMailSender;
    
    public void sendEmail(String emailid,String tablebill) {

        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo(emailid);

        msg.setSubject("Bill");
        msg.setText("Thank you for dining.Hope you had a good experince.Please Visit again.Have a nice day.Your total bill is-"+tablebill);

        javaMailSender.send(msg);

    }
}