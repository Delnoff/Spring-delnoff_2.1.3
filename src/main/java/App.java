import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean1 = applicationContext.getBean("helloworld", HelloWorld.class);
        HelloWorld bean2 = applicationContext.getBean("helloworld", HelloWorld.class);
        System.out.println(bean1 == bean2);
        System.out.println(bean1.getMessage());

        var cat1 = applicationContext.getBean("cat", Cat.class);
        var cat2 = applicationContext.getBean("cat", Cat.class);
        System.out.println(cat1 == cat2);
        System.out.println(cat1.getSay());
    }
}