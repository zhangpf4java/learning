package org.java.learning.calculate.util;

import org.java.learning.calculate.contants.OpearteEnum;
import org.java.learning.calculate.pojo.Operate;

/**
 * 计算工厂
 * @author : zhangpf
 * @date : 2021/7/14
 */
public class CalculateFactory {
    
    /**
     * 获取计算对象
     * @author : zhangpf
     * @tag 1.0.0
     * @date : 2021/7/14
     * @param sign 
     * @return 
     */
    public static Operate getOperateInstance(String sign) {
        for (OpearteEnum opearteEnum : OpearteEnum.values()) {
            if (opearteEnum.getSign().equals(sign)) {
                return opearteEnum.getInstance();
            }
        }
        throw new RuntimeException("can not get this sign:" + sign);
    }

}
