package com.aaa.service.hystrix;

import com.aaa.entity.productVO;
import com.aaa.entity.providerDB;
import com.aaa.service.WebService;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author 钱浩洋
 * @date 2020/2/26 - 17:10
 */
//@Component
public class WebServiceHystrix  implements WebService {


    @Override
    public List<providerDB> selectProvider() {
        return null;
    }

    @Override
    public List<productVO> selectProduct() {
        return null;
    }

    @Override
    public int save(productVO productVO) {
             return 0;
    }

    @Override
    public productVO selectproduct(int productid) {
        return null;
    }

    @Override
    public int updateproduct(productVO productVO) {
        return 0;
    }

    @Override
    public int delproduct(Integer productid) {
        return 0;
    }
}