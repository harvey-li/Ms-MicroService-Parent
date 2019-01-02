package com.microservice.skeleton.service;

import com.microservice.skeleton.vo.Asset;

import java.util.List;

/**
 * Created by Administrator on 2018/12/27.
 */
public interface AssetService {
    Asset findById(Long id);

    List<Asset> findAll();
}
