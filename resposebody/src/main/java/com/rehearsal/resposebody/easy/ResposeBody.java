package com.rehearsal.resposebody.easy;

import java.util.HashMap;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description ResposeBody
 * @date 2019-08-30 10:06
 */
public class ResposeBody extends HashMap<String, Object> {

    private static final long serialVersionUID = -2956025407796580417L;

    public ResposeBody() {
        put("code", 0);
        put("msg", "success");
    }

    public static ResposeBody ok(){
        return new ResposeBody();
    }

    @Override
    public ResposeBody put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}
