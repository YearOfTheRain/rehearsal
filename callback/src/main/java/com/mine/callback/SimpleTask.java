package com.mine.callback;

/**
 * @program: rehearsal
 * @description: 一般任务回调
 * @author: LiShuLin
 * @create: 2019-07-12 15:21
 **/
public class SimpleTask extends Task {

    /**
    * @Description:  一般任务中需要执行方法
    * @Param: []
    * @return: java.lang.String
    * @Author: LiShuLin
    * @Date: 2019/7/12
    */
    @Override
    public String execute() {
        return "我已经在一般任务方法中调用了";
    }
}
