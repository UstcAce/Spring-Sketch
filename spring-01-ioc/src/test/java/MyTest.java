import com.demo.dao.UserDaoMySqlImpl;
import com.demo.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
//        // �û�ʵ�ʵ��õ���ҵ��㣬DAO���û�����Ҫ�Ӵ���
//        UserServiceImpl userService = new UserServiceImpl();
//
//        userService.setUserDao(new UserDaoMySqlImpl());
//        userService.getUser();
        // ��ȡSpring����
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userService = (UserServiceImpl) context.getBean("userServiceImpl");
        userService.getUser();
    }
}
