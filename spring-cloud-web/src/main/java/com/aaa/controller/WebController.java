package com.aaa.controller;

import com.aaa.entity.productVO;
import com.aaa.entity.providerDB;
import com.aaa.service.WebService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 钱浩洋
 * @date 2020/2/26 - 17:14
 */
@Controller
public class WebController {
    @Autowired
    WebService webService;

    @RequestMapping("findAll")
    public String findAll(Model model){
        List<productVO> productVOS = webService.selectProduct();
        model.addAttribute("productVOS",productVOS);
        return "index";
    }
    //添加
    @RequestMapping("addproduct")
    public String add(Model model){
        List<providerDB> providerDBS = webService.selectProvider();
        model.addAttribute("providerDBS",providerDBS);
        return "add";
    }

    @PostMapping(value = "save")
    public String add_do(productVO productVO){
        webService.save(productVO);
        return "redirect:findAll";
    }

    //修改
    @RequestMapping("updproduct")
    public String updproduct(Integer productid, Model model){
        List<providerDB> providerDBS = webService.selectProvider();
        productVO productVO=webService.selectproduct(productid);
        model.addAttribute("productVO",productVO);
        model.addAttribute("providerDBS",providerDBS);
        return "updateProduct";
    }
    @RequestMapping("upd_do")
    public String upd_do(productVO productVO){
        webService.updateproduct(productVO);
        return "redirect:findAll";
    }

    //删除
    @RequestMapping("delproduct")
    public String delproduct(Integer productid){
        System.out.println("dsafsadfsdf"+productid);
        webService.delproduct(productid);
        return "redirect:findAll";
    }
}
