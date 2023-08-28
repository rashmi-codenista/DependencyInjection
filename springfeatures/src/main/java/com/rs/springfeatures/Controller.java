package com.rs.springfeatures;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Controller {

    Provider p;

//    @Autowired
//    @Qualifier("o")
//    public void setP(Provider t) {
//        this.p = t;
//    }
        @Autowired
    Controller(@Qualifier("o") Provider t)
    {
       this.p=t;
    }

    public void Con(){
        p.get();
    }
	//reviewed
}
