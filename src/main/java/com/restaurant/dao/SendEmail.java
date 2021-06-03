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
       double tablbill=Double.parseDouble(tablebill);
        tablbill=tablbill+(tablbill*0.18);
        
        msg.setTo(emailid);

        msg.setSubject("Bill");
        msg.setText("Thank you for dining with us.Hope you had a good experince."
        		+"\n" +"Please Visit again.Have a nice day."
        		+"\n"+ "Your total bill is-"
        		+tablbill+"(Inclusive of 18% GST)");

        javaMailSender.send(msg);

    }
}