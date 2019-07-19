package com.imooc.sell.service;

import com.imooc.sell.dataobject.ProductCategory;

import java.util.List;

public interface CategoryService {

    // 卖家端
    ProductCategory findOne(Integer categoryId);

    List<ProductCategory> findAll();

    ProductCategory save(ProductCategory productCategory);

    // 买家端
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);


}
