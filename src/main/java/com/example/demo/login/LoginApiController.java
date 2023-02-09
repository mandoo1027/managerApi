package com.example.demo.login;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class LoginApiController {

    private String userId = "mandoo1027";
    private String password = "rkskekfk5%";
    @PostMapping("/login")
    public Map<String,Boolean>  login(@RequestBody Map<String, String> resultMap){
        System.out.println("@@@@@@@@@@@@@@@");
        System.out.println(resultMap);
        String userId = resultMap.get("userId");
        String password = resultMap.get("password");
        boolean isLogin = false;
        if(this.userId.equals(userId)){
            if(this.password.equals(password)){
                isLogin = true;
            }else{
                isLogin = false;
            }
        }
        Map<String,Boolean> userlist = new HashMap<>();
        userlist.put("result",isLogin);
        return userlist;
    }
}
