package com.sise.策略模式.present.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 通过产品id和营销手段做关联
 *
 * @author lenm
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MarketingProductPO {

    /**
     * 主键id
     */
    private Integer id;

    /**
     * 营销工具id
     */
    private Integer marketingId;

    /**
     * 产品编号
     */
    private String productNo;

    /**
     * 描述
     */
    private String des;

    /**
     * 是否有效
     */
    private Integer validStatus;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}
