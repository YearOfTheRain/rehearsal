package com.rehearsal.designpatterns.Command.Invoker;

import com.rehearsal.designpatterns.Command.Command.AbstractCommand;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description Invoker
 * @date 2019-08-26 11:03
 */
public class Invoker {

    private AbstractCommand command;

    public void setCommand(AbstractCommand command) {
        this.command = command;
    }

    public void execute() {
        command.execute();
    }
}
