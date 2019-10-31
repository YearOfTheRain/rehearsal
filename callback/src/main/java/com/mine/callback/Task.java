package com.mine.callback;

/**
 * @program: rehearsal
 * @description: 执行回调任务的抽象类
 * @author: LiShuLin
 * @create: 2019-07-12 15:13
 **/
public abstract class Task {

    /**
    * @Description:  外部调用启动回调方法
    * @Param: [callBack]
    * @return: void
    * @Author: LiShuLin
    * @Date: 2019/7/12
    */
    public final void executeWith(ICallBack callBack){
        execute();
        if(callBack!=null){
            callBack.call("");
        }
    }

    /**
    * @Description:  需要执行的主体方法
    * @Param: []
    * @return: java.lang.String
    * @Author: LiShuLin
    * @Date: 2019/7/12
    */
    public abstract String execute();
}
