package controller;

import dao.RoleDao;
import dao.RoleMenuDao;
import dao.UserDao;
import model.Role;
import model.RoleMenu;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserDao userDao;

    @Autowired
    private RoleDao roleDao;

    @Autowired
    private RoleMenuDao roleMenuDao;

    @RequestMapping("/info/{id}")
    public User getUser(@PathVariable Integer id) {
        return userDao.getUser(id);
    }

    @RequestMapping("/role/{id}")
    public Role getRole(@PathVariable Integer id) {
        return roleDao.getRoleById(id);
    }
    @RequestMapping("/menu/{id}")
    public List<RoleMenu> getMenu(@PathVariable Integer id) {
        return roleMenuDao.getRoleMenuByRoleId(id);
    }
}
