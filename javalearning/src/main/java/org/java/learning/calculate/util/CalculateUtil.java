package org.java.learning.calculate.util;

import org.java.learning.calculate.pojo.Operate;

/**
 * 计算工具
 * @author : zhangpf
 * @date : 2021/7/14
 */
public class CalculateUtil {

    public static double calculate(double firstNumber, double secondNumber, String sign) {
        Operate operate = CalculateFactory.getOperateInstance(sign);
        operate.setFirstNumber(firstNumber);
        operate.setSecondNumber(secondNumber);
        return operate.getResult();
    }

}
