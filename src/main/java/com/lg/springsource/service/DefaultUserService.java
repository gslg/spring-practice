package com.lg.springsource.service;

import com.lg.springsource.beans.User;
import org.springframework.stereotype.Service;

/**
 * Created by liuguo on 2017/5/4.
 */
@Service("DefaultUserService")
public class DefaultUserService implements UserService {
    public User getUser(String username) {
        throw new UnsupportedOperationException();
    }

    public User getUser(String usercode, String username) {
        throw new UnsupportedOperationException();
    }

    public void insertUser(User user) {
        throw new UnsupportedOperationException();
    }

    public void updateUser(User user) {
        throw new UnsupportedOperationException();
    }
}
