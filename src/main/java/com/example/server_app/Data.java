package com.example.server_app;

import java.util.ArrayList;

public class Data implements DataInterface {

    @Override
    public ArrayList<User> users() {
       return SingleData.getSingleData().getUsers();
    }

    @Override
    public  boolean isExists(User user) {
        for (User user1 : users()) {
            if(user.equals(user1))return true;
        }
        return false;
    }
}
