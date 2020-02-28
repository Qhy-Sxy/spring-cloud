package com.aaa.mapper;

import com.aaa.entity.productVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author 钱浩洋
 * @date 2020/2/26 - 16:29
 */
@Mapper
public interface ProductMapper {
    List<productVO> selectProduct();

    int add(productVO productVO);

    productVO selectproduct(int productid);

    int updateproduct(productVO productVO);

    int delproduct(Integer productid);
}
