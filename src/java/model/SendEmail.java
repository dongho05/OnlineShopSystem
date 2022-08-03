/*
package testmail;
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;
import java.util.Properties;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author HP
 */
public class SendEmail {
    public void sendEmail(String email) throws MessagingException {
        Properties pr = new Properties();
        System.out.println("Preparing to send main");
        pr.setProperty("mail.smtp.host", "smtp.gmail.com");
        pr.setProperty("mail.smtp.port", "587");
        pr.setProperty("mail.smtp.auth", "true");
        pr.setProperty("mail.smtp.starttls.enable", "true");
        String myaccount = "dungndhe150788@fpt.edu.vn";
        String password = "anhdungzoo9";
        Session session = Session.getInstance(pr, new javax.mail.Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(myaccount, password);
            }
        });
        Message mess = prepareMessage(session,myaccount,email);
        Transport.send(mess);
        return;   
        }
    private static Message prepareMessage(Session session,String account,String infor) {
       Message message = new MimeMessage(session);
        try {
            message.setFrom(new InternetAddress(account));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(infor));
            message.setSubject("Feedback Email");
            message.setText("Thank you for using our service click here to give us feedback\n http://localhost:8080/OnlineShopSystem/feedback.jsp ");
            return message;           
        } catch (MessagingException ex) {
            Logger.getLogger(SendEmail.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}

