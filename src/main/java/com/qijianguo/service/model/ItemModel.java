package com.qijianguo.service.model;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

/**
 * @author Angus
 * @version 1.0
 * @Title: ItemModel 商品模型
 * @Description: TODO
 * @date 2019/2/20 9:18
 */
@Data
public class ItemModel {

    private int id;
    @NotBlank(message = "标题不能为空")
    private String title;

    @NotNull(message = "价格不能为空")
    @Min(value = 0, message = "价格必须大于0元")
    private BigDecimal price;

    @NotNull(message = "库存不能为空")
    private Integer stock;

    private Integer sales;
    @NotNull(message = "商品图片地址不能为空")
    private String imgUrl;
    @NotNull(message = "商品描述不能为空")
    private String description;

    private PromoModel promoModel;

}
