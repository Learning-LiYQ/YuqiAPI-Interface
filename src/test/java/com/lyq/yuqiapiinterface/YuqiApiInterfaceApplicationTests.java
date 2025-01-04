package com.lyq.yuqiapiinterface;

import com.lyq.yuqiapiclientsdk.client.YuqiApiClient;
import com.lyq.yuqiapiclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class YuqiApiInterfaceApplicationTests {
    @Resource
    private YuqiApiClient yuqiApiClient;

    @Test
    void contextLoads() {
        yuqiApiClient.getNameByGet("liyuqi");

        User user = new User();
        user.setUsername("liyuqi");
        yuqiApiClient.getUsernameByPost(user);
    }

}
