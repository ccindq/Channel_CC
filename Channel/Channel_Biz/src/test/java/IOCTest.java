import com.cc.channel.entities.Log;
import com.cc.channel.entities.Product;
import com.cc.channel.entities.User;
import com.cc.channel.service.LogService;
import com.cc.channel.service.ProductService;
import com.cc.channel.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author changcheng
 * @version 2017/6/8
 * @description
 */
public class IOCTest {
    private ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring-ioc.xml");

    @Test
    public void LogTest() {
        LogService service = ctx.getBean(LogService.class);
        Log log = new Log();
//        log.setMethodName("testMethod");
//        service.save(log);
        log = service.select(1);
        System.out.println(log);
    }

    @Test
    public void registTest() {
        UserService service = ctx.getBean(UserService.class);
        User user = new User();
        user.setUserName("changcheng");
        user.setPhoneNum("15652474030");
        user.setEmail("cc199236@163.com");
        service.regist(user);
        System.out.println(user.getUserName() + "手机号:" + user.getPhoneNum());
    }

    @Test
    public void productTest() {
        ProductService service = ctx.getBean(ProductService.class);
        System.out.println(service.countProductByName("testproduct"));
    }
}
