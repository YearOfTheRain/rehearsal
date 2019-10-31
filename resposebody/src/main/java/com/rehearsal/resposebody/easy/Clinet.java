package com.rehearsal.resposebody.easy;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description 测试客户端
 * @date 2019-08-30 12:21
 */
public class Clinet {

    public static void main(String[] args) {
        System.out.println(ResposeBody.ok().put("123", 123).put("456", 456).toString());

    }
}
