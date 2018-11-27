package cn.mirrorming.demo.springcloud.web.admin.feign.service.hystrix;

import cn.mirrorming.demo.springcloud.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;

@Component
public class AdminServiceHystrix implements AdminService {
    @Override
    public String sayHi(String message) {
        return "hello，your message is :\"" + message + "\" but request error.";
    }
}