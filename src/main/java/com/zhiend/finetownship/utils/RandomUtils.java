package com.zhiend.finetownship.utils;

import java.util.UUID;

public class RandomUtils {

    public static String getRandomFileName(String fileName){
        int index=fileName.lastIndexOf(".");
        String houzhui=fileName.substring(index);//获取后缀名
        String uuidFileName=UUID.randomUUID().toString().replace("-","")+houzhui;
        return uuidFileName;
    }

    public static void main(String[] args) {
        System.out.println(getRandomFileName("aaa.jpg"));
    }
}
