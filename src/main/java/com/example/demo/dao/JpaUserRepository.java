package com.example.demo.dao;

import com.example.demo.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Administrator on 2019/1/24.
 */
public interface JpaUserRepository extends JpaRepository<User, Long> {
}
