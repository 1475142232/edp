import com.alibaba.fastjson.JSON;
import com.edp.common.jedis.JedisUtils;
import redis.clients.jedis.Jedis;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by changer on 16/8/9.
 */
public class JedisTest {
    public static void main(String[] args){
        Jedis client = JedisUtils.getJedis();
//        client.del("CHANGE_NODE","NORMAL_NODE");
        client.set("mytest","changer");
        Set<String> keys = client.keys("*");
        for(String key :keys){
            System.out.println("key=="+key);
        }
        String n=client.get("NORMAL_NODE");
        String c=client.get("CHANGE_NODE");
        System.out.println(n);
        System.out.println(c);
    }
}
