package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author luodaran
 * @date 2018/4/27
 */
@Controller
@EnableAutoConfiguration
public class App {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World! I am for Jenkins";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(App.class, args);
    }

}
