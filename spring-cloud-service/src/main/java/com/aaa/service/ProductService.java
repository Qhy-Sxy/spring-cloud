package com.aaa.service;

import com.aaa.entity.productVO;

import java.util.List;

/**
 * @author 钱浩洋
 * @date 2020/2/26 - 16:27
 */
public interface ProductService {
    List<productVO> selectProduct();

    int add(productVO productVO);


    productVO selectproduct(int productid);

    int updateproduct(productVO productVO);

    int delproduct(Integer productid);
}
