import org.junit.Test;
import redis.clients.jedis.Jedis;

/**
 * @author changcheng
 * @version 2017/6/13
 * @description
 */
public class NormalTest {
    @Test
    public void testRedis() {
        Jedis jedis = new Jedis("192.168.146.130",6379);
        System.out.println(jedis.ping());
        jedis.set("key1", "changcheng");
        System.out.println(jedis.get("key1"));
    }
}
