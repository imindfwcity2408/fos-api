package org.aa.cc;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    public List<String> getUserInfo(){

        List<String> userList = new ArrayList<>();
        userList.add("Javed");
        userList.add("Imran");
        return userList;
    }
}
