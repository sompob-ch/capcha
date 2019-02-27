package com.demo.capcha;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class capchaTest {
    @Test
    public void firstPattenLeftOperanShouldBe1(){
    Capcha capcha =new Capcha();
        Assert.assertEquals("1 + One",capcha.toString());
    }

}