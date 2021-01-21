package com.sise.策略模式.present.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 营销对象实体类
 *
 * @author lenm
 */
@NoArgsConstructor
@Data
@Builder
@AllArgsConstructor
public class MarketingPO {

    /**
     * 主键id
     */
    private Integer id;

    /**
     * 营销手段名称 存储class的名称
     */
    private String marketingName;

    /**
     * 入参 多个可以逗号分割
     */
    private String inputVal;

    /**
     * 描述
     */
    private String des;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;


}
