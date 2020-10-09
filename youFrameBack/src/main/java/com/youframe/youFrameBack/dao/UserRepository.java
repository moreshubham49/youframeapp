package com.youframe.youFrameBack.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.youframe.youFrameBack.pojos.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	
}
