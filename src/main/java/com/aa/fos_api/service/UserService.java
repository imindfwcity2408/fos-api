package com.aa.fos_api.service;

import com.aa.fos_api.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
    public List<User> getUserInfo(){
        User user1 = new User();
        user1.setName("Javed");
        user1.setCity("Dallas");
        user1.setId(UUID.randomUUID());
        User user2 = new User();
        user2.setName("Imran");
        user2.setCity("Fortworth");
        user2.setId(UUID.randomUUID());
        User user3 = new User();
        user3.setName("Aishah");
        user3.setCity("Irving");
        user3.setId(UUID.randomUUID());
        List<User> userList = new ArrayList<>();
        userList.add(user1);
        userList.add(user2);
        userList.add(user3);
        return userList;
    }
}
