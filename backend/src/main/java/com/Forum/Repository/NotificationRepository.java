package com.Forum.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Forum.Model.Notification;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, Long> {
    List<Notification>findByNotificationUserIdOrderByNotificationUpdateTimeDesc(Long notificationsUser);
}
