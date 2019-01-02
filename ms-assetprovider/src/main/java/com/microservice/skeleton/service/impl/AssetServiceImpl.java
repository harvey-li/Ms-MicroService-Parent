package com.microservice.skeleton.service.impl;

import com.microservice.skeleton.dao.AssetMapper;
import com.microservice.skeleton.service.AssetService;
import com.microservice.skeleton.vo.Asset;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2018/12/27.
 */
@Service
public class AssetServiceImpl implements AssetService{

    @Resource
    private AssetMapper assetMapper;
    @Override
    public Asset findById(Long id) {
        return assetMapper.fiindById(id);
    }

    @Override
    public List<Asset> findAll() {
        return assetMapper.findAll();
    }
}
