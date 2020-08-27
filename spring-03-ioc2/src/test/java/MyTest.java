import com.demo.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        // Spring容器在加载配置文件的时候，容器中管理的对象就已经初始化了，所以User2的构造函数也会被调用
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) context.getBean("user-alias6");
        user.show();

        User user2 = (User) context.getBean("user");
        System.out.println(user == user2);
    }
}
