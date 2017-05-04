package com.lg.springsource.service;

import com.lg.springsource.beans.User;

/**
 * Created by liuguo on 2017/5/4.
 */
public interface UserService {
    User getUser(String username);
    User getUser(String usercode,String username);
    void insertUser(User user);
    void updateUser(User user);
}
