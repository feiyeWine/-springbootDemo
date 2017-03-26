package com.dao;

import com.model.Users;

import java.util.List;

/**
 * Created by YR on 2016/3/31.
 */
public class UsersDao {

    private List<Users> users;

    public List<Users> getUsers() {
        return users;
    }

    public void setUsers(List<Users> users) {
        this.users = users;
    }
}
