package org.java.learning.calculate.util; 

import org.junit.Assert;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 
import lombok.extern.log4j.Log4j2;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

/** 
* CalculateUtil Tester. 
* 
* @author zhangpf 
* @since <pre>07/14/2021</pre> 
* @version 1.0 
*/ 
@Log4j2
@RunWith(SpringRunner.class)
public class CalculateUtilTest { 

    @Before
    public void before() throws Exception {
    }

    @After
    public void after() throws Exception {
    }

    /**
    *
    * Method: calculate(double firstNumber, double secondNumber, String sign)
    *
    */
    @Test
    public void testCalculate() throws Exception {
        double a = 10;
        double b = 21;
        System.out.println(CalculateUtil.calculate(a, b, "+"));

        Assert.assertEquals(CalculateUtil.calculate(a, b, "+"), 31, 0);

        System.out.println(CalculateUtil.calculate(a, b, "-"));

        Assert.assertEquals(CalculateUtil.calculate(a, b, "-"), -11, 0);
    }


} 
