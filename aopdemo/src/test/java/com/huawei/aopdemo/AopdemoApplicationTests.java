package com.huawei.aopdemo;

import com.huawei.entity.User;
import com.huawei.service.MyaopService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class AopdemoApplicationTests {
    @Autowired
    private MyaopService myaopService;

    @Test
    void contextLoads() {
    }

    @Test
    public void Test01() {
        System.out.println("+++++++++++++++++++++++++++总数+++++++++++++++++++++++");
        myaopService.getCount();
        System.out.println("+++++++++++++++++++++name++++++++lisi+++++++++++++++++++++++++++++++++");
        int lisi = myaopService.getAge("lisi");
        System.out.println(lisi);
        System.out.println("++++++++++++++++++++++name+++++++zhangsan+++++++++++++++++++++++++++++++++");
        int zhangsan = myaopService.getAge("zhangsan");
        System.out.println(zhangsan);
        System.out.println("+++++++++++++++++++++++++++++++add+++++lisi+++++++++++++++++++++++++++++++++++++++++");
        User user = new User();
        user.setName("lisi");
        int i = myaopService.addList(user);
        System.out.println(i);
        System.out.println("+++++++++++++++++++++++++++++++add+++++zhangsan+++++++++++++++++++++++++++++++++++++++++");
        user.setName("zhangsan");
        int i1 = myaopService.addList(user);
        System.out.println(i1);
    }
}
