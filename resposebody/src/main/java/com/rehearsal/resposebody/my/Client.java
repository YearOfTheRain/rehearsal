package com.rehearsal.resposebody.my;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description 客户端
 * @date 2019-08-28 11:54
 */
public class Client {

    public static void main(String[] args) {
        ICook originalTaste = new OriginalTaste();
        printMessage("名称为：", originalTaste.description());
        printMessage("售价为：", originalTaste.price());

        ICook eggTaste = new EggTaste(originalTaste);
        printMessage("名称为：", eggTaste.description());
        printMessage("售价为：", eggTaste.price());

        ICook doubleEggTaste = new EggTaste(eggTaste);
        printMessage("名称为：", doubleEggTaste.description());
        printMessage("售价为：", doubleEggTaste.price());
    }

    private static void printMessage(String message, Object value) {
        System.out.println(message + value);
    }


}
