package MyTest;

import Dao.UserDaoImpl;
import Dao.UserDaoMysqlImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;
import service.UserServiceImpl;

public class Test01 {
    public static void main(String[] args) {
        //以前获取方式
//        UserService userService = new UserServiceImpl();
//       userService.setUserDao(new UserDaoImpl());
//        userService.getUser();
        //现在
        //获取ApplicationContext，拿到Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
         UserService userService = (UserService) context.getBean("UserServiceImpl");
         userService.getUser();
    }
}
