package org.java.learning.decorate.pojo; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 
import lombok.extern.log4j.Log4j2;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

/** 
* Decoration Tester. 
* 
* @author zhangpf 
* @since <pre>07/15/2021</pre> 
* @version 1.0 
*/ 
@Log4j2
@RunWith(SpringRunner.class)
public class DecorationTest { 

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
    *
    * Method: show()
    *
    */
    @Test
    public void testShow() throws Exception {
        Employee employee = new Employee();
        employee.setName("LiSi");
        SuiteDecoration suite = new SuiteDecoration();
        HatDescoration hat = new HatDescoration();
        ShoesDecoration shoes = new ShoesDecoration();
        suite.decoration(employee);
        hat.decoration(suite);
        shoes.decoration(hat);
    }


} 
