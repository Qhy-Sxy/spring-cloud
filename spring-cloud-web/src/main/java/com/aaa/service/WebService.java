package com.aaa.service;

import com.aaa.entity.productVO;
import com.aaa.entity.providerDB;
import com.aaa.service.hystrix.WebServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author 钱浩洋
 * @date 2020/2/26 - 17:09
 */
@FeignClient(value = "spring-cloud-service")
public interface WebService {
    @RequestMapping("selectProvider")
    List<providerDB> selectProvider();

    @RequestMapping("selectProduct")
    List<productVO>  selectProduct();
    @PostMapping(value = "save")
    int save(@RequestBody productVO productVO);
    @PostMapping("selectproduct")
    productVO selectproduct(@RequestBody int productid);
    @PostMapping("updateproduct")
    int updateproduct(@RequestBody productVO productVO);
    @PostMapping("delproduct")
    int delproduct(@RequestBody Integer productid);
}
