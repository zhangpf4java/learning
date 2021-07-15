package org.java.learning.cash.pojo;

/**
 * 策略模式 ：不同情况应用不同算法
 * @author : zhangpf
 * @date : 2021/7/14
 */
public class RuleContext {

    private CashSuper cashSuper;

    private double money;

    public RuleContext(String type, double money) {
        this.cashSuper = getCaseInstance(type);
        this.money = money;
    }

    public static CashSuper getCaseInstance(String type) {
        CashSuper instance;
        switch (type) {
            case "percent" : instance = new CashPercent(); break;
            case "reduce" : instance = new CashReduce(); break;
            default: instance = new CashNormal();
        }
        return instance;
    }
}
