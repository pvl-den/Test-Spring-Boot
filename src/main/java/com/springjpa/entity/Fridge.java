package com.springjpa.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by denis on 18.06.2017.
 * Холодильники
 */
@ToString(exclude = "id")
@Entity
@Table(name = "Fridge")
public class Fridge implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Getter
    @Setter
    @Column(name = "modelfridge")
    private String modelFridge;

    @Getter
    @Setter
    @Column (name = "typefridge")
    private String typeFridge;

    @Getter
    @Setter
    @Column(name = "quantityfridge")
    private int quantityFridge;

    @Getter
    @Setter
    @Column(name = "pricefridge")
    private int priceFridge;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "goods_id")
    private Goods goods;

    public Fridge(String modelFridge, String typeFridge, int quantityFridge, int priceFridge) {
        this.modelFridge = modelFridge;
        this.typeFridge = typeFridge;
        this.quantityFridge = quantityFridge;
        this.priceFridge = priceFridge;
    }
}
