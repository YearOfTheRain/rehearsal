package com.stackoverflow.pack1;

/**
 * @author LiShuLin
 * @version v1.0
 * @program rehearsal
 * @description 客户端
 * @date 2019-10-14 12:23
 */
public class Client {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        ByteBlock[] data = new ByteBlock[2 * 3 * 4 * 3 * 4];
        ByteBlock bytes = new ByteBlock();
        int counter = 0;
        for (byte a = 0; a < 2; a++) {
            bytes.a = a;
            for (byte b = 0; b < 3; b++) {
                bytes.b = b;
                for (byte c = 0; c < 4; c++) {
                    bytes.c = c;
                    for (byte d = 0; d < 3; d++) {
                        bytes.d = d;
                        for (byte e = 0; e < 4; e++) {
                            bytes.e = e;
                            data[counter++] = bytes;
                        }
                    }
                }
            }
        }
        for (ByteBlock byteBlock : data) {
            byteBlock.toString();
        }
        System.out.println("共花费 " + (System.currentTimeMillis() - start));
    }
}
