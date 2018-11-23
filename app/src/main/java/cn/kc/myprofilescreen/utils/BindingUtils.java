package cn.kc.myprofilescreen.utils;

/**
 * 作者： 张卓嘉  .
 * 日期： 2018/11/23
 * 版本： V1.0
 * 说明：
 */
public class BindingUtils {

    public static String convertToSuffix(long count) {
        if (count < 1000) {
            return "" + count;
        }
        int exp = (int) (Math.log(count) / Math.log(1000));
        return String.format("%.1f%c", count / Math.pow(1000, exp), "kmgtpe".charAt(exp - 1));
    }
}
