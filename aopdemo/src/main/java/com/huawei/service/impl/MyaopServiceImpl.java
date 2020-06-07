package com.huawei.service.impl;

import com.huawei.entity.User;
import com.huawei.service.MyaopService;
import org.springframework.stereotype.Service;

@Service
public class MyaopServiceImpl implements MyaopService {
    static int count=1;
    @Override
    public void getCount() {
       count++;
        System.out.println(count);
    }

    @Override
    public int getAge(String name) {
        count++;
        int age=18;
        if (name.equals("zhangsan")) {
            age=20;
            System.out.println("good good study day day up");
        }
        return age;
    }

    @Override
    public int addList(User user) {
        if (!user.getName().equals("zhangsan")){
            return 1;
        }
        return 0;
    }
}
