/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Secure;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.mail.PasswordAuthentication;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Liigah
 */
public class Email {
    private class VerficationToken{ //need a specific activation key for the specific user (stored in the database) 
        
    }
    
    public static void main(String[] args) {
      /* mail = Mail.registrationMail();
       MailClient.send(mail);
    }*/
    final String username = "ida7g4@gmail.com"; //e-mail address that will send the mail
    final String password = "p7project";// password of the email account
    
    Properties props = new Properties();
    props.put("mail.smtp.auth", "true");
    props.put("mail.smtp.starttls.enable", "true");
    props.put("mail.smtp.host", "smtp.gmail.com"); //SMTP server address to be able to send an email through gmail
    props.put("mail.smtp.port", "587"); //the port for the SMTP server
    
    Session session = Session.getInstance(props,
            new javax.mail.Authenticator() { //so that Java can access the gmail account and set up the message for me 
                protected PasswordAuthentication getPasswordAuthentication(){
                    return new PasswordAuthentication("ida7g4@gmail.com", "p7project");
                }
        
    });
    
    try {
     Message message = new MimeMessage (session);
     message.setFrom (new InternetAddress ("ida7g4@gmail.com"));
     message.setRecipients (Message.RecipientType.TO,
             InternetAddress.parse ("liigah@gmail.com")); //to whom the e-mail will be sent
     message.setSubject("Verification e-mail");
     message.setContent("<h:body style=background-color:white;font-family:Times New Roman;color:#0066cc;>"
        + "Hello! Please verify your email address to complete your TfF Account.\n "
             + "We received a request for our app using your email address.\n"
             + " If you did not make this request, ignore this message or send and e-mail to ida7g4@gmail.com.\n" 
             + "Thank you, \n"
             +"The Tinder for Friends Team!<br/><br/>"
        + "</body>", "text/html; charset=utf-8");
    Transport.send(message);
    
    System.out.println("The message has been sent");
    
    } catch (MessagingException e){
        throw new RuntimeException(e);
    }
}
}