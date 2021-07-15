package org.java.learning.calculate.contants;

import lombok.Getter;
import org.java.learning.calculate.pojo.AddOperate;
import org.java.learning.calculate.pojo.Operate;
import org.java.learning.calculate.pojo.ReduceOperate;

/**
 *
 * @author : zhangpf
 * @date : 2021/7/14
 */
@Getter
public enum OpearteEnum {
    
    /**
     * 加法
     * @date : 2021/7/14
     */
    ADD("+", new AddOperate()),

    /**
     * 减法
     * @date : 2021/7/14
     */
    REDUCE("-", new ReduceOperate()),

    /**
     * 乘法
     * @date : 2021/7/14
     */
    MULTI("*", new AddOperate()),

    /**
     * 除法
     * @date : 2021/7/14
     */
    DIVIDE("/", new AddOperate())
    ;
    
    String sign;

    Operate instance;

    OpearteEnum(String sign, Operate instance) {
        this.sign = sign;
        this.instance = instance;
    }
}
