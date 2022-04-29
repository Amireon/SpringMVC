package mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RequestMappingController {

    @RequestMapping(
            value = {"/testRequestMapping", "/trm"},
            method = {RequestMethod.GET, RequestMethod.POST}
            )
    public String test() {
        return "success";
    }

    @RequestMapping(
            value = {"/testParamsAndHeaders"},
            params = {"username"},
            headers = {"Host=localhost:8080"}
    )
    public String testParamsAndHeaders() {
        return "success";
    }

    @RequestMapping(value = "/a?a/testAnt")
    public String testAnt() {
        return "success";
    }

    @RequestMapping("/testPath/{id}/{username}")
    public String testPath(@PathVariable("id") Integer id, @PathVariable("username") String username) {
        System.out.println("id = " + id + ", username = " + username);
        return "success";
    }
}
