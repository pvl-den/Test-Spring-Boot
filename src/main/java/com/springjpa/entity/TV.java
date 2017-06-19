package com.springjpa.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Телевизоры
 * Created by denis on 17.06.2017.
 */

@ToString(exclude = "id")
@Entity
@Table(name = "TV")
public class TV implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;


    @Getter
    @Setter
    @Column(name = "modeltv")
    private String modelTV;

    @Getter
    @Setter
    @Column(name = "diagonaltv")
    private long diagonalTV;

    @Getter
    @Setter
    @Column (name = "typetv")
    private String typeTV;

    @Getter
    @Setter
    @Column(name = "quantitytv")
    private int quantityTV;

    @Getter
    @Setter
    @Column(name = "pricetv")
    private int priceTV;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "goods_id")
    private Goods goods;

    public TV(){}

    public TV(String modelTV, long diagonalTV, String typeTV, int quantityTV, int priceTV) {
        this.modelTV = modelTV;
        this.diagonalTV = diagonalTV;
        this.typeTV = typeTV;
        this.quantityTV = quantityTV;
        this.priceTV = priceTV;
    }
}
