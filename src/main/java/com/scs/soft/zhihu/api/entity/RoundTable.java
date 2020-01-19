package com.scs.soft.zhihu.api.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @author Zeng
 * @ClassName RoundTable
 * @Description 圆桌实体
 * @Date 2020/1/18
 * @Version 1.0
 **/
@Data
@Builder
public class RoundTable {
    private Integer id;
    private String name;
    private String banner;
    private String urlToken;
    private Integer visitsCount;
    private Integer includeCount;
}
