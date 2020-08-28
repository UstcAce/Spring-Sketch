import com.demo.pojo.Student;
import com.demo.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());
    }

    @Test
    public void testCase01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user =context.getBean("user", User.class);
        System.out.println(user);

        User user2 =context.getBean("user2", User.class);
        System.out.println(user2);
    }
}
