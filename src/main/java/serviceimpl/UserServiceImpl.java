package serviceimpl;

import dao.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.User;
import service.IUserService;

import javax.annotation.Resource;

/**
 * Created by Lembre on 2018.9.8
 */
@Service("userService")
public class UserServiceImpl implements IUserService {
    @Resource
    private UserMapper userDao;

    public User getUserById(int userId) {
        // TODO Auto-generated method stub
        return this.userDao.selectByPrimaryKey(userId);
    }

}