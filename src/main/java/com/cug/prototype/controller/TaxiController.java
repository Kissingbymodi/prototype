package com.cug.prototype.controller;

import com.cug.prototype.entity.TaxiEntity;
import com.cug.prototype.service.TaxiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("taxi")
public class TaxiController {

    @Autowired
    private TaxiService taxiService;

    @RequestMapping("queryAll")
    @ResponseBody
    public List<TaxiEntity> queryAllTaxi() {
        System.out.println("hello");
        return taxiService.queryAllTaxi();

    }


}
