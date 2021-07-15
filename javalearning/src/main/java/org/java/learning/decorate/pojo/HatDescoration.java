package org.java.learning.decorate.pojo;

/**
 * 帽子
 * @author : zhangpf
 * @date : 2021/7/15
 */
public class HatDescoration extends Decoration {

    @Override
    public void show() {
        System.out.println("hat");
        employee.show();
    }
}
