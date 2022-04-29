package mvc.controller;

import mvc.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class ParamController {

    @RequestMapping("/param")
    public String param() {
        return "param";
    }

    @RequestMapping("/testServletAPI")
    public String testServletAPI(HttpServletRequest request) {
        // 形参位置的request表示当前请求
        HttpSession session = request.getSession();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username = " + username + ", password = " + password);
        return "success";
    }

    @RequestMapping("/testParam")
    public String testParam(
            @RequestParam("user_name") String username,
            String password,
            @RequestHeader("Host") String host,
            @CookieValue("JSESSIONID") String JSESSIONID
    ) {
        System.out.println("username = " + username + ", password = " + password);
        System.out.println("host = " + host);
        System.out.println("JSESSIONID = " + JSESSIONID);
        return "success";
    }

    @RequestMapping("/testPOJO")
    public String testPOJO(User user) {
        System.out.println(user);
        return "success";
    }



}
