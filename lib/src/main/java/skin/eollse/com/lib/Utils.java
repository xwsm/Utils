package skin.eollse.com.lib;

/**
 * 2019 重庆指讯科技股份有限公司
 *
 * @author: Wsm
 * @date: 2019/7/10 11:31
 * @description:
 */
public class Utils {


    /**
     * 1.身份证的前17位 分别乘以 bs数组   然后相加
     * 2.  结果%11 看余数
     * 3. 余数 取  checkCode[余数]
     *
     * @param idcard 身份证号码
     * @return
     */
    public static boolean isIdCard(String idcard) {
        try {
            int[] bs = {7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2};
            String[] checkCode = {"1", "0", "X", "9", "8", "7", "6", "5", "4", "3", "2"};
            if (idcard.length() == 18) {
                String[] data = idcard.toUpperCase().split("");
                int tempNum = 0;
                for (int i = 0; i < 17; i++) {
                    tempNum += bs[i] * Integer.valueOf(data[i]);
                }
                if (checkCode[tempNum % 11].equals(data[17])) {
                    System.out.println("正确");
                    return true;
                } else {
                    System.out.println("错误");
                    return false;
                }
            }

        } catch (Exception e) {

        }
        return false;
    }
}
