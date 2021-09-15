package com.example.server_app;

import java.util.ArrayList;

public class SingleData {
    private SingleData() {
        users.add(new User("Andrey", "qwerty007"));
        users.add(new User("Nikita","debashir"));
    }
    private static SingleData singleData = null;
    static {
        singleData = new SingleData();
    }
    private ArrayList<User> users = new ArrayList<>();

    public static SingleData getSingleData() {
        return singleData;
    }

    public ArrayList<User> getUsers() {
        return users;
    }
}
