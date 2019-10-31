package com.example.demo.package3;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import java.util.Objects;
import java.util.Random;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description 客户端校验
 * @date 2019-09-05 17:04
 */
public class ClientTest {

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            int num = new Random().nextInt(10);
            test1(num);
            test2(num);
        }
    }

    /**
     * 方法描述: if 嵌套
     *
     * @param num 10 以内的随机数
     * @return void
     * @author LiShuLin
     * @date 2019/9/5
     */
    private static void test1(int num) {
        if (num < 3) {
            System.out.print("num < 3 :");
            System.out.println(num);
        } else if (num < 5) {
            System.out.print("num < 5 :");
            System.out.println(num);
        } else if (num > 8) {
            System.out.print("num > 8 :");
            System.out.println(num);
        } else {
            System.out.print("else :");
            System.out.println(num);
        }
    }

    /**
     * 方法描述: 优化if
     *
     * @param num 10 以内的随机数
     * @return void
     * @author LiShuLin
     * @date 2019/9/5
     */
    private static void test2(int num) {
        if (num < 3) {
            System.out.print("num < 3 :");
            System.out.println(num);
            return;
        }
        if (num < 5) {
            System.out.print("num < 5 :");
            System.out.println(num);
            return;
        }
        if (num > 8) {
            System.out.print("num > 8 :");
            System.out.println(num);
            return;
        }
        System.out.print("else :");
        System.out.println(num);
        return;
    }

}
