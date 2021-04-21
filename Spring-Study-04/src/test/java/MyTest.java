import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //User user = new User();
        //该语句会调用类的无参构造
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = (User) context.getBean("user");//拿到容器后对容器中存放的对象进行操作
//        User user2 = (User) context.getBean("user");//拿到容器后对容器中存放的对象进行操作
//        System.out.println(user==user2);
        System.out.println(user.toString());

    }
}
