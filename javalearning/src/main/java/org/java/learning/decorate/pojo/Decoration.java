package org.java.learning.decorate.pojo;

/**
 *
 * @author : zhangpf
 * @date : 2021/7/15
 */
public class Decoration extends Employee {

    protected Employee employee;

    public Decoration() {

    }

    public void decoration(Employee e1) {
        this.employee = e1;
        this.employee.show();
    }

    @Override
    public void show() {
    }

}
