package com.rehearsal.designpatterns.Command.ConcreteCommand;

import com.rehearsal.designpatterns.Command.Command.AbstractCommand;
import com.rehearsal.designpatterns.Command.Receiver.Receiver;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description CommandImpl
 * @date 2019-08-26 11:01
 */
public class CommandImpl extends AbstractCommand {

    public CommandImpl(Receiver receiver) {
        super(receiver);
    }

    /**
     * @return void
     * @title execute
     * @description execute
     * @author LiShuLin
     * @date 2019/8/26
     */
    @Override
    public void execute() {
        receiver.receive();
    }
}
