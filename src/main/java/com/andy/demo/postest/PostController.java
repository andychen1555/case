package com.andy.demo.postest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: weipeng
 * @create: 2020-04-03 16:17
 * @description:
 */
@Controller
@RequestMapping("/postTest")
@Slf4j
public class PostController {


    @PostMapping("/complexJson")
    public String testPost(@RequestBody ComplexVo complexVo){
      log.info("ComplexVo============>{}",complexVo.toString());
      return "SUCCESS";
    }

    @PostMapping("/simpleJson")
    public String simpleJson(@RequestBody SimpleVo simpleVo){
        log.info("SimpleVo============>{}",simpleVo.toString());
        return "SUCCESS";
    }
}
