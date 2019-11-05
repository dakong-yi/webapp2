package controller;

import dao.UserDao;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserDao userDao;

    @RequestMapping("/info/{id}")
    public User getUser(@PathVariable Integer id) {
        return userDao.getUser(id);
    }

    @RequestMapping("/str")
    public String printStr() {
        return "aaa";
    }
}
