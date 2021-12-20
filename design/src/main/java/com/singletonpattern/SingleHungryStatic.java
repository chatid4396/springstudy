package com.singletonpattern;

import java.io.IOException;
import java.util.Properties;

public class SingleHungryStatic {
    private String info;
    public static final SingleHungryStatic NEWINSTANCE;
    static {
        Properties properties = new Properties();
        try {
            properties.load(SingleHungryStatic.class.getClassLoader().getResourceAsStream("hungrystatic.properties"));
            String info = (String) properties.get("info");
            NEWINSTANCE = new SingleHungryStatic(info);

        } catch (IOException e) {
            throw new RuntimeException("读取文件出现异常");
        }
    }

    private SingleHungryStatic(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
