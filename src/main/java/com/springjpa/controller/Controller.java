package com.springjpa.controller;

import com.springjpa.entity.Goods;
import com.springjpa.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by ingener-PK on 19.06.2017.
 */
@RestController
public class Controller {

    @Autowired
    private GoodsService service;


}
