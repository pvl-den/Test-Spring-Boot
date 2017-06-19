package com.springjpa.controller;

import com.springjpa.entity.Goods;
import com.springjpa.entity.TV;
import com.springjpa.repositories.GoodsRepository;
import com.springjpa.repositories.TVRepository;
import com.springjpa.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by denis on 17.06.2017.
 */
@RestController
public class WebController {

    @Autowired
    private GoodsService service;




    //вывести все категории товаров
    @RequestMapping(value = "/goods", method = RequestMethod.GET)
    @ResponseBody
    private List<Goods> getGoodsService() {
        List<Goods> list = service.getAll();
        return list;
    }


    //удалить категорию товара по id
    @RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
    @ResponseBody
    private List<Goods> delGoodsService(@PathVariable long id) {
             service.delete(id);
            List<Goods> list = service.getAll();
        return list;
    }

    //вывод категории товарапо id
    @RequestMapping(value = "/goods/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Goods getGoodsServiceByOne(@PathVariable Long id) {
        Goods list = service.getGoodsByOne(id);
        return list;
    }
    //добавить категорию товара
    @RequestMapping(value = "/goodsAdd/{brand},{nameCategory}",method = RequestMethod.GET)
    public String addGoodsServiceByOne(@PathVariable String brand, @PathVariable String nameCategory) {
        service.addGoods(new Goods(brand,nameCategory));
        return "Done";
    }


}
