package sdibt.group.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import sdibt.group.service.RibbonService;

/**
 * @author wangjisen
 * @date 2019/3/29 14:31
 */
@Service
public class RibbonServiceImpl implements RibbonService {

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "showError")
    @Override
    public String showName(String name) {
        return restTemplate.getForObject("http://SERVICE-CLIENT/cloud-client?name="+name,String.class);
    }

    public String showError(String name) {
        return "Hi "+name+", sorry error.";
    }

}
