package com.demo.capcha;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class capchaTest {
    @Test
    public void firstPattenLeftOperanShouldBe1(){
        Capcha capcha = new Capcha(1,1,1,1);
        Assert.assertEquals("1 + One",capcha.toString());
    }
    @Test
    public void firstPattenLeftOperanShouldBe2(){
        Capcha capcha = new Capcha(1,2,1,1);
        Assert.assertEquals("2 + One",capcha.toString());

    }

}