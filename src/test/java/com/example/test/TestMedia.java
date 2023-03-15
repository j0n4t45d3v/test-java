package com.example.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TestMedia {

    @Autowired
    Media media;


    @Test
    public void testMedia(){
        double response = media.mediaDeDoisNumeros(2, 2);

        Assert.assertEquals(2.0, response, 0.0);
    }
}
