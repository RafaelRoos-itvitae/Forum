package com.Forum.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Forum.Model.Message;

import java.util.List;

@Repository
public interface MessageRepository extends JpaRepository<Message, Long> {
    List<Message> findByMessageThreadIdOrderByMessageCreationTimeAsc(Long threadId);
}
