package com.springjpa.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Стиральные машины
 * Created by denis on 18.06.2017.
 */
@ToString(exclude = "id")
@Entity
@Table(name = "Washer")
public class Washer implements Serializable {

    // id первичный ключ
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    //модель стиральной машины
    @Getter
    @Setter
    @Column(name = "modelWasher")
    private String modelWasher;

    //тип стиральной машины
    @Getter
    @Setter
    @Column (name = "typeWasher")
    private String typeWasher;

    //количество стиральных машин
    @Getter
    @Setter
    @Column(name = "quantityWasher")
    private int quantityWasher;

    //стоимость стиральной машины
    @Getter
    @Setter
    @Column(name = "priceWasher")
    private int priceWasher;


    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "goods_id")
    private Goods goods;

    //конструктор
    public Washer(String modelWasher, String typeWasher, int quantityWasher, int priceWasher) {
        this.modelWasher = modelWasher;
        this.typeWasher = typeWasher;
        this.quantityWasher = quantityWasher;
        this.priceWasher = priceWasher;
    }
}
