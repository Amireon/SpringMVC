package mvc.restful.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class UserController {

    /**
     * 使用RESTFul模拟用户资源的增删改查
     * /users    GET     查询所有用户信息
     * /user/1   GET     根据id查询用户信息
     * /user     POST    添加用户信息
     * /user/1   DELETE  删除用户信息
     * /user     PUT     更新用户信息
     */

    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public String getAllUsers() {
        System.out.println("查询所有用户信息");
        return "success";
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public String getUser(@PathVariable String id) {
        System.out.println("根据id查询用户信息，" + id);
        return "success";
    }

    @RequestMapping(value = "/user", method = RequestMethod.POST)
    public String addUser(String username, String password) {
        System.out.println("添加用户信息，username = " + username + ", password = " + password);
        return "success";
    }

    @RequestMapping(value = "/user", method = RequestMethod.PUT)
    public String updateUser(String username, String password) {
        System.out.println("更新用户信息，username = " + username + ", password = " + password);
        return "success";
    }




}
