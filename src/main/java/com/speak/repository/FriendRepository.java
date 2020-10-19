package com.speak.repository;

import com.speak.model.user.Friend;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FriendRepository extends JpaRepository<Friend, Long>{

}
