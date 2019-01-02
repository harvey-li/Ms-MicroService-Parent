package com.microservice.skeleton.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by Administrator on 2018/12/25.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Asset {
    private Long id;
    private String name;
}
