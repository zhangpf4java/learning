package org.java.learning.decorate.pojo;

/**
 * 鞋子
 * @author : zhangpf
 * @date : 2021/7/15
 */
public class ShoesDecoration extends Decoration {

    @Override
    public void show() {
        System.out.println("shoes");
        employee.show();
    }
}
