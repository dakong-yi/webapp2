package test;

import dao.UserDao;
import model.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test1 {
    private ApplicationContext applicationContext;

    @Before
    public void setup() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("classpath:conf/spring-mybatis.xml");
    }

    @Test
    public void testGetUser() throws Exception {
        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
        User user1 = userDao.getUser(1);
        System.out.println(user1.getName()+":"+user1.getId());
        System.out.println(1);
    }
}
