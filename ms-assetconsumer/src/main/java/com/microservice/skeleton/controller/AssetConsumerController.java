package com.microservice.skeleton.controller;

import com.microservice.skeleton.vo.Asset;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * 订单消费服务
 * @author shengwu ni
 */
@RestController
@RequestMapping("/consumer/asset")
public class AssetConsumerController {

    /**
     * 订单服务提供者模块的 url 前缀
     */
    private static final String ORDER_PROVIDER_URL_PREFIX = "http://localhost:8001";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/get/{id}")
    public Asset getOrder(@PathVariable Long id) {

        return restTemplate.getForObject(ORDER_PROVIDER_URL_PREFIX + "/provider/asset/get/" + id, Asset.class);
    }

    @SuppressWarnings("unchecked")
    @GetMapping("/get/list")
    public List<Asset> getAll() {
        return restTemplate.getForObject(ORDER_PROVIDER_URL_PREFIX + "/provider/asset/get/list", List.class);
    }

}
