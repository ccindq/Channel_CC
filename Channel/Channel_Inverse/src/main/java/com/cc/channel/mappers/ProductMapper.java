package com.cc.channel.mappers;

import com.cc.channel.entities.Product;
import java.util.List;

public interface ProductMapper {
    int deleteByPrimaryKey(Integer productId);

    int insert(Product record);

    Product selectByPrimaryKey(Integer productId);

    List<Product> selectAll();

    int updateByPrimaryKey(Product record);
}