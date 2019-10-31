package com.rehearsal.designpatterns.Command.Command;

import com.rehearsal.designpatterns.Command.Receiver.Receiver;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description AbstractCommand
 * @date 2019-08-26 10:59
 */
public abstract class AbstractCommand {

    protected Receiver receiver;

    public AbstractCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    /**
     * @title execute
     * @description execute
     * @param
     * @return void
     * @author LiShuLin
     * @date 2019/8/26
     */
    public abstract void execute();

}
