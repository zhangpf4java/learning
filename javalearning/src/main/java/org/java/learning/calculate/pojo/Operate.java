package org.java.learning.calculate.pojo;

import lombok.Data;

/**
 * 计算操作
 * @author : zhangpf
 * @date : 2021/7/14
 */
@Data
public class Operate {

    private double firstNumber;

    private double secondNumber;

    public Operate() {
    }

    public Operate(double firstNumber, double secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    public double getResult() {
        return 0;
    }
}
