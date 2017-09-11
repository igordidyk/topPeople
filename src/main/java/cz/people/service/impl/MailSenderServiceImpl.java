package cz.people.service.impl;

import cz.people.entity.Coordinator;
import cz.people.service.MailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
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
public class MailSenderServiceImpl implements MailSenderService {
    @Autowired
    private JavaMailSender javaMailSender;
//    @Autowired
//    private PasswordEncoder passwordEncoder;

    @Override
    public void send(Coordinator coordinator)  {
        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);

        try {
            helper.setFrom(new InternetAddress(""));//костиль для вінди
            helper.setTo(coordinator.getEmail());
            helper.setText("Congratulations! Your registration completed successfully.\n" +
                    "Your login " +coordinator.getUsername()+
                    "pass " + coordinator.getPassword(),true);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        javaMailSender.send(message);


    }
}
