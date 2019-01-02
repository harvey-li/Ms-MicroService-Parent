package com.microservice.skeleton.controller;

import com.microservice.skeleton.service.AssetService;
import com.microservice.skeleton.vo.Asset;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/12/27.
 */
@RestController
@RequestMapping("/provider/asset")
public class AssetController {
    @Resource
    private AssetService assetService;

    @GetMapping("/get/{id}")
    public Asset getById(@PathVariable Long id){
       return assetService.findById(id);
    }

    @GetMapping("get/list")
    public List<Asset> getAll(){
        return assetService.findAll();
    }
}
