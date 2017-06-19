package com.springjpa.service;

import com.springjpa.entity.Goods;

import java.util.List;

/**
 * Created by denis on 18.06.2017.
 */
public interface GoodsService {

    public Goods addGoods(Goods goods);
    public void delete(long id);
    public Goods editGoods(Goods goods);
    public Goods getGoodsByOne(Long id);
    public List<Goods> getAll();
}
