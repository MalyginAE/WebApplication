package com.example.server_app;

import java.util.ArrayList;

public interface DataInterface {
    ArrayList<User> users();
    boolean isExists(User user);


}
