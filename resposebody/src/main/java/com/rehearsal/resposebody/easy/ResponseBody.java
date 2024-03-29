package com.rehearsal.resposebody.easy;

import java.util.HashMap;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description ResponseBody
 * @date 2019-08-30 10:06
 */
public class ResponseBody extends HashMap<String, Object> {

    private static final long serialVersionUID = -2956025407796580417L;

    private ResponseBody() {
        put("code", 0);
        put("msg", "success");
    }

    public static ResponseBody ok(){
        return new ResponseBody();
    }

    @Override
    public ResponseBody put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}
