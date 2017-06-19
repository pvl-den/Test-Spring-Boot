package com.springjpa.service.impl;

import com.springjpa.entity.Goods;
import com.springjpa.repositories.GoodsRepository;
import com.springjpa.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by denis on 18.06.2017.
 */
@Service
public class GoodsServiceImpl implements GoodsService{

    @Autowired
    private GoodsRepository goodsRepository;

    @Override
    public Goods addGoods(Goods goods) {
        Goods saveGoods = goodsRepository.saveAndFlush(goods);
        return saveGoods;
    }

    @Override
    public void delete(long id) {
        goodsRepository.delete(id);
    }


    @Override
    public Goods editGoods(Goods goods) {
        return goodsRepository.saveAndFlush(goods);
    }

    @Override
    public Goods getGoodsByOne(Long id) {
        return goodsRepository.findOne(id);
    }

    @Override
    public List<Goods> getAll() {
        return goodsRepository.findAll();
    }
}
