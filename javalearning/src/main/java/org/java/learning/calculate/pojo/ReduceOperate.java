package org.java.learning.calculate.pojo;

/**
 * 减法
 * @author : zhangpf
 * @date : 2021/7/14
 */
public class ReduceOperate extends Operate {

    @Override
    public double getResult() {
        return getFirstNumber() - getSecondNumber();
    }
}
