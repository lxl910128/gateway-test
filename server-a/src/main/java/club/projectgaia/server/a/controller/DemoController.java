package club.projectgaia.server.a.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Phoenix Luo
 * @version 2020/11/28
 **/
@RestController
public class DemoController {
    Logger log = LoggerFactory.getLogger(DemoController.class);
    
    @GetMapping("/hello")
    public String hello(HttpServletRequest request) {
        log.info(request.getHeader("test"));
        return "hello";
    }
    
}
