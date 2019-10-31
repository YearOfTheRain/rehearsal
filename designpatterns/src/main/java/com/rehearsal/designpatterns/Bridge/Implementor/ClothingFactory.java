package com.rehearsal.designpatterns.Bridge.Implementor;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description ClothingFactory
 * @date 2019-08-20 17:24
 */
public class ClothingFactory {

    private Clothing clothing;

    public ClothingFactory(Clothing clothing) {
        this.clothing = clothing;
    }

    public Clothing getClothing() {
        return clothing;
    }
}
