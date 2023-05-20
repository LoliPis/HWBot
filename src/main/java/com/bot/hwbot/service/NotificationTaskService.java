package com.bot.hwbot.service;

import com.bot.hwbot.entity.NotificationTask;
import com.bot.hwbot.repository.NotificationTaskRepository;
import org.springframework.stereotype.Service;

@Service
public class NotificationTaskService {

    private final NotificationTaskRepository notificationTaskRepository;

    public NotificationTaskService(NotificationTaskRepository notificationTaskRepository) {
        this.notificationTaskRepository = notificationTaskRepository;
    }

    public void save(NotificationTask notificationTask){
        notificationTaskRepository.save(notificationTask);
    }
}
