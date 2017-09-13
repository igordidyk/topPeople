package cz.people.service.impl;

import cz.people.entity.Coordinator;
import cz.people.service.MailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.transaction.Transactional;

@Service
@PropertySource("classpath:email.properties")
public class MailSenderServiceImpl implements MailSenderService {
    @Autowired
    private JavaMailSender javaMailSender;
    @Autowired
    private Environment env;
//    @Autowired
//    private PasswordEncoder passwordEncoder;

    @Override
    public void send(Coordinator coordinator,String textMessage,boolean htmlStatus)  {
        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);
//        String textMessage = "";
        try {
            helper.setFrom(new InternetAddress(env.getProperty("email.username")));//костиль для вінди
            helper.setTo(coordinator.getEmail());
            helper.setText(textMessage,htmlStatus);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        javaMailSender.send(message);


    }
}
