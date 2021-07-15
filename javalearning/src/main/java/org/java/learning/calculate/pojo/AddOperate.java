package org.java.learning.calculate.pojo;

/**
 * 加法
 * @author : zhangpf
 * @date : 2021/7/14
 */
public class AddOperate extends Operate {

    @Override
    public double getResult() {
        return getFirstNumber() + getSecondNumber();
    }
}
