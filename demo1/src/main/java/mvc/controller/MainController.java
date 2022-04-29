package mvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    // "/" --> /WEB-INF/templates/index.html

    @RequestMapping("/")
    public String index() {
        // 返回视图名称
        return "index";
    }

    @RequestMapping("/success")
    public String success() {
        return "success";
    }

    @RequestMapping("/view")
    public String view() {
        return "view";
    }

    @RequestMapping("/rest")
    public String rest() {
        return "rest";
    }

}
