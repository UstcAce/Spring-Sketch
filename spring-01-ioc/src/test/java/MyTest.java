import demo.dao.UserDaoMySqlImpl;
import demo.service.UserServiceImpl;

public class MyTest {
    public static void main(String[] args) {
        // �û�ʵ�ʵ��õ���ҵ��㣬DAO���û�����Ҫ�Ӵ���
        UserServiceImpl userService = new UserServiceImpl();

        userService.setUserDao(new UserDaoMySqlImpl());
        userService.getUser();
    }
}
