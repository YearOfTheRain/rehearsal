package com.algorithm.插入排序;

import com.algorithm.拓展数组二进制加法.ClientArray2Add;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class ClientMergeInsertTest {

    @Test
    void sum() {
        Assertions.assertEquals("[0, 1, 1, 0, 1, 1, 0]", Arrays.asList(ClientArray2Add.sum(new Integer[]{1, 0, 0, 1, 1, 1}, new Integer[]{0, 0, 1, 1, 1, 1})).toString());
        Assertions.assertEquals("[1, 1, 1, 1, 1, 1, 0]", Arrays.asList(ClientArray2Add.sum(new Integer[]{1, 1, 1, 1, 1, 1}, new Integer[]{1, 1, 1, 1, 1, 1})).toString());
        Assertions.assertEquals("[1, 1, 0, 0, 0, 1, 1]", Arrays.asList(ClientArray2Add.sum(new Integer[]{1, 0, 1, 1, 0, 1}, new Integer[]{1, 1, 0, 1, 1, 0})).toString());

    }
}