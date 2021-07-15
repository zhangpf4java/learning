package org.java.learning.decorate.pojo;

import lombok.Data;

/**
 *
 * @author : zhangpf
 * @date : 2021/7/14
 */
@Data
public class Employee {

    private String name;

    public void show() {
        System.out.println(this.getName());
    }

}
