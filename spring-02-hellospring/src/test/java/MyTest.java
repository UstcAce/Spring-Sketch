import com.demo.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        // ��ȡSpring�����Ķ���
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        // ���ǵĶ������ڶ���Spring�����й���
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());
    }
}
