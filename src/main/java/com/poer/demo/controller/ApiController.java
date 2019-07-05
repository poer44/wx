package com.poer.demo.controller;

import com.poer.demo.entity.Product;
import com.poer.demo.mapper.ProductMapper;
import com.poer.demo.utils.JedisUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author xuebw
 */
@RestController()
@RequestMapping("/api")
public class ApiController {
    private static final Logger LOG = LoggerFactory.getLogger(ApiController.class);
    public static final String HELLO_TEXT = "Hello from Spring Boot Backend!";
    @Autowired
    private ProductMapper productMapper;
    @RequestMapping(path = "/hello")
    public @ResponseBody
    String sayHello() {
        LOG.info("GET called on /hello resource");
        return HELLO_TEXT;
    }

    @RequestMapping(path = "/test")
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<Product> productList = productMapper.selectList(null);
        productList.forEach(System.out::println);
    }
    @RequestMapping(path = "/redistest")
    public void redistest() {
        JedisUtil.set("666","888");
        System.out.println(JedisUtil.get("666"));
    }
}
