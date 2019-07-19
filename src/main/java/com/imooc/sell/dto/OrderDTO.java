package com.imooc.sell.dto;

import com.imooc.sell.dataobject.OrderDetail;
import com.imooc.sell.enums.OrderStatusEnum;
import com.imooc.sell.enums.PayStatusEnum;
import lombok.Data;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Data
public class OrderDTO {
    // 订单id
    @Id
    private String orderId;

    // 买家名字
    private String buyerName;

    // 买家电话
    private String buyerPhone;

    // 买家地址
    private String buyerAddress;

    // 买家微信openid
    private String buyerOpenid;

    // 订单状态，默认为新下单
    private Integer orderStatus = OrderStatusEnum.NEW.getCode();

    // 支付状态，默认为未支付
    private Integer payStatus = PayStatusEnum.WAIT.getCode();

    // 订单总金额
    private BigDecimal orderAmount;

    // 创建时间
    private Date createTime;

    // 更新时间
    private Date updateTime;

    List<OrderDetail> orderDetailList;
}
