package com.baizhi.util;

import com.baizhi.util.SnowflakeIdWorker;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;
import java.util.UUID;

public class Utils {
    //获取随机盐
    public static String getsalt() {
        Random random = new Random();
        char[] c = "qwertyuioplkjmnhgbfvvdfccsdsazxxsABCDRDCFGHIOKVSU1234556".toCharArray();

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 4; i++) {
            sb.append(c[random.nextInt(c.length)]);
        }
        return sb.toString();
    }

    //获取UUID
    public static String getUUID() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString();
    }

    //获取snowflakeld
    public static String getSnowFlake() {
        SnowflakeIdWorker sw = new SnowflakeIdWorker(0, 0);
        Long lid = sw.nextId();
        return lid.toString();
    }

    //md5 加密
    public static String md5(String paw) {
        try {
            MessageDigest md = MessageDigest.getInstance("md5");
            byte[] newpaw = md.digest(paw.getBytes());
            StringBuilder sb = new StringBuilder();
            for (Byte b : newpaw) {
                int c = b & 0xff;
                if (c < 16) {
                    sb.append("0");
                }
                sb.append(Integer.toHexString(c));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

}
