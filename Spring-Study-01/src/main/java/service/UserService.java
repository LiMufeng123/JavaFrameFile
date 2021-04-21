package service;

import Dao.UserDao;

public interface UserService {
    void getUser();
    void setUserDao(UserDao dao);
}
