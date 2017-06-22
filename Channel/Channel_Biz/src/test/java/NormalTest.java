import org.junit.Test;
import redis.clients.jedis.Jedis;

/**
 * @author changcheng
 * @version 2017/6/10
 * @description
 */
public class NormalTest {

    @Test
    public void jedisTest() {
        Jedis jedis = new Jedis("192.168.146.133", 6379);
        String x=jedis.ping();
        System.out.println(x);
    }

    @Test
    public void DataStructureTest() {
        DataStructure dataStructure=new DataStructure();
        DataStructure.Node node = new DataStructure().Node();
        dataStructure.addNode();
    }

}
