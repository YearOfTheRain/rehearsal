package com.example.demo.package11;

import com.algorithm.通用工具.工具类.CommonUtil;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description collections 工具类 的练习使用
 * @date 2019-11-04 14:13
 */
public class ClientCollections {

    public static void main(String[] args) {
        List<Integer> integerList = CommonUtil.buildTestList(10000);

        Collections.sort(integerList);
        System.out.println(integerList.toString());
    }

}
