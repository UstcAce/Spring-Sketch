import com.demo.dao.UserDaoMySqlImpl;
import com.demo.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
//        // 用户实际调用的是业务层，DAO层用户不需要接触！
//        UserServiceImpl userService = new UserServiceImpl();
//
//        userService.setUserDao(new UserDaoMySqlImpl());
//        userService.getUser();
        // 获取Spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userService = (UserServiceImpl) context.getBean("userServiceImpl");
        userService.getUser();
    }
}
