package org.java.learning.decorate.pojo;

/**
 * 衬衫
 * @author : zhangpf
 * @date : 2021/7/15
 */
public class SuiteDecoration extends Decoration {

    @Override
    public void show() {
        System.out.println("suite");
        employee.show();
    }
}
