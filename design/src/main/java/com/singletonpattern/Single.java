package com.singletonpattern;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.metadata.WriteSheet;

/**
 * 嵌套模式
 */
public class Single {

    private Single() { }

    public static Single newInstance() {
        return SingleClass.single;
//        ExcelWriter excelWriter = EasyExcel.write("fileName").build();


    }

    private static class SingleClass {
        private static Single single = new Single();
    }
}
