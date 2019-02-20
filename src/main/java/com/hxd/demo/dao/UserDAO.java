package com.hxd.demo.dao;

import com.hxd.demo.entity.User;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserDAO {
    List<User> selectAll();
}
