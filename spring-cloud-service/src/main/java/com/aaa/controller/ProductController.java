package com.aaa.controller;

import com.aaa.entity.productVO;
import com.aaa.entity.providerDB;
import com.aaa.service.ProductService;
import com.aaa.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 钱浩洋
 * @date 2020/2/26 - 15:48
 */
@Controller
public class ProductController {

    @Autowired
    ProviderService providerService;
    @Autowired
    ProductService productService;
    @RequestMapping("selectProvider")
    @ResponseBody
    public List<providerDB>  selectProvider(){
        return providerService.selectProvider();
    }
    @RequestMapping("selectProduct")
    @ResponseBody
    public List<productVO>  selectProduct(){
        return productService.selectProduct();
    }
    @PostMapping("save")
    @ResponseBody
    public int  save(@RequestBody productVO productVO){
        int add = productService.add(productVO);
        return add;
    }
    @PostMapping("selectproduct")
    @ResponseBody
    public productVO selectproduct(@RequestBody int productid){
        return productService.selectproduct(productid);
    }
    @PostMapping("updateproduct")
    @ResponseBody
    public int updateproduct(@RequestBody productVO productVO){
        int i=productService.updateproduct(productVO);
        return i;
    }
    @PostMapping("delproduct")
    @ResponseBody
    public int delproduct(@RequestBody Integer productid){
        int i=productService.delproduct(productid);
        return i;
    }
}
