package lk.ijse.controller;

import javafx.scene.control.Alert;
import org.hibernate.Session;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.util.Properties;

import static org.hibernate.Session.*;

public class SendMailController {
    public void sendEmail(String recipientEmail, String otp) {
        final String senderEmail = "stitchwaveclothings@gmail.com"; // Replace with your email
        final String senderPassword = "eygcrhkzazfdwhqw";     // Replace with your app-specific password

        // Setting up mail server
        Properties properties = new Properties();
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");

//        Session.session(properties, new Authenticator() {
//            @Override
//            protected PasswordAuthentication getPasswordAuthentication() {
//                return new PasswordAuthentication(senderEmail, senderPassword.toCharArray());
//            }
//        });
//
//        try {
//            // Compose the message
//            Message message = new MimeMessage((MimeMessage) session);
//            message.setFrom(new InternetAddress(senderEmail));
//            message.setRecipient(Message.RecipientType.TO, new InternetAddress(recipientEmail));
//            message.setSubject("Your OTP Code");
//            message.setText("Your OTP is: " + otp);
//
//            // Send the message
//            Transport.send(message);
//            new Alert(Alert.AlertType.INFORMATION, "Email sent successfully!").show();
//        } catch (MessagingException e) {
//            e.printStackTrace();
//        }
    }
}
