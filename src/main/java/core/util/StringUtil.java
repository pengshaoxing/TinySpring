package core.util;

/**
 * @author Vant
 * @version 2018/8/4 下午 1:50
 */
public class StringUtil {
    public static String firstCharUpper(String string) {
        StringBuilder sb = new StringBuilder(string.length());
        sb.append(Character.toUpperCase(string.substring(0, 1).charAt(0))).append(string.substring(1));
        return sb.toString();
    }
}