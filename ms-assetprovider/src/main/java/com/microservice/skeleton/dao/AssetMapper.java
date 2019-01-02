package com.microservice.skeleton.dao;

import com.microservice.skeleton.vo.Asset;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Administrator on 2018/12/27.
 */

public interface AssetMapper {
    @Select("select * from asset where id = #{id}")
    Asset fiindById(Long id);

    @Select("select * from asset")
    List<Asset> findAll();

}
