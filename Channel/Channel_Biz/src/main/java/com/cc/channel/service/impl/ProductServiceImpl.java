package com.cc.channel.service.impl;

import com.cc.channel.e.ProductException;
import com.cc.channel.mappers.ProductMapper;
import com.cc.channel.service.ProductService;
import com.cc.channel.util.GlobalMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author changcheng
 * @version 2017/6/15
 * @description
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductMapper productMapper;

    public int countProductByName(String productName) {
        int amount = productMapper.countProductByName(productName);
        if (amount < 0) {
            throw new ProductException(GlobalMessage.PRODUCT_AMOUNT_UNDERZERO);
        }
        return amount;
    }
}
