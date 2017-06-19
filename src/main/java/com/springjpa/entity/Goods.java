package com.springjpa.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Класс категорий товаров
 * Created by denis on 17.06.2017.
 */

@ToString(exclude = "id")
@EqualsAndHashCode(exclude = "id")
@Entity
@Table(name = "Goods")
public class Goods implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Getter
    @Setter
    @Column(name = "goodsbrand")
    private String goodsBrand;

    @Getter
    @Setter
    @Column(name = "goodscategory")
    private String goodsCategory;

    public Goods(){
    }

    public Goods(String goodsBrand, String goodsCategory) {
        this.goodsBrand = goodsBrand;
        this.goodsCategory = goodsCategory;

    }
}
