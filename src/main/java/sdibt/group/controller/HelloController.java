package sdibt.group.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sdibt.group.service.RibbonService;

/**
 * @author wangjisen
 * @date 2019/3/28 18:35
 */
@RestController
public class HelloController {

    @Autowired
    private RibbonService ribbonService;

    @RequestMapping("/home")
    public String home(@RequestParam String name) {
        return ribbonService.showName(name);
    }

}
