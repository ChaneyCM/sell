package com.imooc.sell.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
// 一个订单中关于某个产品的细节，包括其数量等等。一个订单由多种不同的产品构成。
public class OrderDetail {

    @Id
    private String detailId;

    // 订单id
    private String orderId;

    // 商品id
    private String productId;

    // 商品名称
    private String productName;

    // 当前价格
    private BigDecimal productPrice;

    // 商品数量
    private Integer ProductQuantity;

    // 商品小图
    private String productIcon;

    // 创建时间
    private Date createTime;

    // 修改时间
    private Date updateTime;
}
