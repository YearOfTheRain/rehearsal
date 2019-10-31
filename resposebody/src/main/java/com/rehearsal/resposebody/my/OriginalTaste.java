package com.rehearsal.resposebody.my;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description 原味手抓饼
 * @date 2019-08-28 11:19
 */
public class OriginalTaste implements ICook {

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
        return "原味";
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
        return 3.5;
    }
}
