package com.rehearsal.resposebody.my;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description Cook抽象类
 * @date 2019-08-28 11:32
 */
public abstract class AbstractCook implements ICook {

    private ICook cook;


    public AbstractCook(ICook cook) {
        this.cook = cook;
    }

    /**
     * 方法描述见 @description
     *
     * @return void
     * @description 描述方法
     * @author LiShuLin
     * @date 2019/8/28
     */
    @Override
    public String description() {
        return cook.description();
    }

    /**
     * 方法描述见 @description
     *
     * @return void
     * @description 销售价格
     * @author LiShuLin
     * @date 2019/8/28
     */
    @Override
    public Double price() {
        return cook.price();
    }
}
