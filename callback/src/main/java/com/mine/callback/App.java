package com.mine.callback;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Optional;

/**
 * @program: rehearsal
 * @description: 客户端
 * @author: LiShuLin
 * @create: 2019-07-12 15:24
 **/
public class App {

    public static void main(String[] args) {
        /*Task task = new SimpleTask();
        ICallBack callBack = (parameter) -> {
            String result = "我不信";
            System.out.println(result);
            return result;
        };
        task.executeWith(callBack);*/
        /*Node node1 = new Node("node1","1");
        Node node2 = new Node("node2","2");
        Node node3 = new Node("node3","3");
        Node node4 = new Node("node4","4");
        Node node5 = new Node("node4","5");
        node1.buildNode(null,node2);
        node2.buildNode(node1,node3);
        node3.buildNode(node2,node4);
        node4.buildNode(node3,node5);
        node5.buildNode(node4,null);
        System.out.println(node1.toString());*/

//        for(int i=0;i<15;i++){
            long a= System.currentTimeMillis();//获取当前系统时间(毫秒)
        HashMap<String,Object> hashMap = new HashMap<String,Object>(256);
            for(int j=0;j<100;j++){
                hashMap.put(j+"",j);
            }
            Integer ii =new Integer(123213);
        Integer aaaai =new Integer(123213);

        if(130 < 129.99d){
            System.out.println("相等");
        }
            System.out.print("程序执行时间为：");
            System.out.println(System.currentTimeMillis()-a+"毫秒");
        }

//    }
}
