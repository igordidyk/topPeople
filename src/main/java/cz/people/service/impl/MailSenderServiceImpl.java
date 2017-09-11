package cz.people.service.impl;

import cz.people.entity.Coordinator;
import cz.people.service.MailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
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

    @Override
    public void send(Coordinator coordinator)  {
        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);

        try {
            helper.setFrom(new InternetAddress("ihordidyk95@gmail.com"));//костиль для вінди
            helper.setTo(coordinator.getEmail());
            helper.setText("Welcome " + coordinator.getUsername() + "to the site",true);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        javaMailSender.send(message);


    }
}
