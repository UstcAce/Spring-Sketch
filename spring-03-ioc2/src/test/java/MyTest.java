import com.demo.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        // Spring�����ڼ��������ļ���ʱ�������й���Ķ�����Ѿ���ʼ���ˣ�����User2�Ĺ��캯��Ҳ�ᱻ����
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) context.getBean("user-alias6");
        user.show();

        User user2 = (User) context.getBean("user");
        System.out.println(user == user2);
    }
}
