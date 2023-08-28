package com.rs.springfeatures;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("po")
public class Laptop implements Provider{
    public void get(){
        System.out.println("laptop");
    }
}
