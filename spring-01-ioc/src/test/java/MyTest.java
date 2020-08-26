import demo.dao.UserDaoMySqlImpl;
import demo.service.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {
        // 用户实际调用的是业务层，DAO层用户不需要接触！
        UserServiceImpl userService = new UserServiceImpl();

        userService.setUserDao(new UserDaoMySqlImpl());
        userService.getUser();
    }
}
