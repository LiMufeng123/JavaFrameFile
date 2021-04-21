package service;

import Dao.UserDao;
import Dao.UserDaoImpl;
import Dao.UserDaoMysqlImpl;

public class UserServiceImpl implements UserService{//业务层的实现
    //客户有了新需求，每次都要改源代码
    //private UserDao userDao  = new UserDaoMysqlImpl();//多态，通过service层访问底层Dao，只要创建Dao类就可以用多态访问

    private UserDao userDao;
    //set注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();

    }
}
