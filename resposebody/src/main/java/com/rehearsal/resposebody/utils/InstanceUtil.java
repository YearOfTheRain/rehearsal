package com.rehearsal.resposebody.utils;

import java.util.LinkedHashMap;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description 实例化工具类
 * @date 2019-08-21 14:26
 */
public class InstanceUtil {

    /**
     * @title LinkedHashMap构建
     * @description 构建一个空的LinkedHashMap
     * @param
     * @return java.util.LinkedHashMap<k,v>
     * @author LiShuLin
     * @date 2019/8/21
     */
    public static final <k, v> LinkedHashMap<k, v> newLinkedHashMap() {
        return new LinkedHashMap<k, v>();
    }
}
