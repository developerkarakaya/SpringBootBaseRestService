package com.springboot.start.springserviceexample.repository;

import com.springboot.start.springserviceexample.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository  extends JpaRepository<User,Integer> {


}
