package cz.people.service;

import cz.people.entity.Coordinator;


public interface MailSenderService {

    void send(Coordinator coordinator,String textMessage,boolean htmlStatus);
}
