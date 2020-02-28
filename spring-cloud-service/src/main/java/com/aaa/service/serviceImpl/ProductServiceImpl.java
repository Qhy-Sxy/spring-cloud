package com.aaa.service.serviceImpl;

import com.aaa.entity.productVO;
import com.aaa.mapper.ProductMapper;
import com.aaa.service.ProductService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 钱浩洋
 * @date 2020/2/26 - 16:27
 */
@Service
public class ProductServiceImpl implements ProductService {
    @Resource
    ProductMapper productMapper;
    @Override
    public List<productVO> selectProduct() {
        return productMapper.selectProduct();
    }

    @Override
    public int add(productVO productVO) {
        int add = productMapper.add(productVO);
        return add;
    }

    @Override
    public productVO selectproduct(int productid) {
        return productMapper.selectproduct(productid);
    }

    @Override
    public int updateproduct(productVO productVO) {
        int updateproduct = productMapper.updateproduct(productVO);
        return updateproduct;
    }

    @Override
    public int delproduct(Integer productid) {
        int i=productMapper.delproduct(productid);
        return i;
    }
}
