import com.demo.config.UserConfig;
import com.demo.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        // �����ȫʹ���������෽ʽȥ�������Ǿ�ֻ��ͨ��AnnotationConfig����������ȡ������ͨ���������class������أ�
        ApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);

        User getUser = context.getBean("user", User.class);
        System.out.println(getUser.getName());
    }
}
