package DEMO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test02 {
    public static void main(String[] args) {
        String userStrs = "10001:张三:男:1990-01-01#10002:李四:女:1989-01-09#10003:王五:男:1999-09-09#10004:刘备:男:1899-01-01#10005:孙悟空:男:1900-01-01#10006:张三:女:1999-01-01#10007:刘备:女:1999-01-01#10008:张三:女:2003-07-01#10009:猪八戒:男:1900-01-01";
        List<User> users = new ArrayList<>();
        String[] user1 = userStrs.split("#");
        for (String s : user1) {
            User user = new User();
            String[] userData = s.split(":");
            user.setId(Long.valueOf(userData[0]));
            user.setName(userData[1]);
            user.setSex(userData[2]);
            user.setBirthday(LocalDate.parse(userData[3]));
            users.add(user);
        }
        System.out.println(users);

        Map<String,Integer> user = new HashMap<>();
        for (User user2 : users) {
            String name = user2.getName();
            if(user.containsKey(name)){
                user.put(name,user.get(name)+1);
            }else{
                user.put(name,1);
            }
        }
        user.forEach((k,v) ->{
            System.out.println(k+"："+v+"次");
        });

    }
}
