package com.rehearsal.resposebody.my;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description 加鸡蛋
 * @date 2019-08-28 11:39
 */
public class EggTaste extends AbstractCook {


    public EggTaste(ICook cook) {
        super(cook);
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
        return "鸡蛋" + super.description();
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
        return 2 + super.price();
    }
}
