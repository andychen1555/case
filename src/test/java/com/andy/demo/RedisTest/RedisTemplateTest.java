package com.andy.demo.RedisTest;

import com.andy.demo.CaseApplication;
import lombok.extern.slf4j.Slf4j;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author: weipeng
 * @create: 2020-04-20 15:46
 * @description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes= CaseApplication.class)
@Slf4j
public class RedisTemplateTest {
//    @Autowired
//    RedisTemplate redisTemplate;
//
////    String rsmap = redisClientTemplate.hget(BaseConstants.BASEINFO, "13340113733");
////    baseinfo = JacksonUtil.toBean(rsmap, Baseinfo.class);
////        return baseinfo;
//    @Test
//    public  void aaa() {
////        System.out.println(JSONUtil.toJsonStr(redisTemplate));
//        String o = (String) redisTemplate.opsForHash().get("baseinfo", "13340113733");
////        redisTemplate.opsForHash().put("baseinfo", "13621707111","1111");
//        BaseInfo baseinfo = JSONUtil.toBean(o, BaseInfo.class);
//        System.out.println(baseinfo.toString());
//    }
//
//
//    @Autowired
//    private StringRedisTemplate stringRedisTemplate;
//
//    @Test
//    public void t1(){
//        ValueOperations<String, String> stringStringValueOperations = stringRedisTemplate.opsForValue();
//        stringStringValueOperations.set("testkey","testkeyxxxsfa");
//        String testkey = stringStringValueOperations.get("testkey");
//        log.info(testkey);
//    }
//
//
//    @Test
//    public void demo2() {
//        //putAll方法
////        Map<String, String> data = new HashMap<>();
////        data.put("name", "jack ma");
////        data.put("company", "alibaba");
////        data.put("age", "500");
////        redisTemplate.opsForHash().putAll("k2", data);
//
//        //put方法
//        redisTemplate.opsForHash().put("k1", "name", "baipengfei");
//        redisTemplate.opsForHash().put("k1", "name1", "qtt");
//
//        //get方法，根据key和hashkey找出对应的值
//        System.out.println(redisTemplate.opsForHash().get("k1", "name"));
//    }
}
