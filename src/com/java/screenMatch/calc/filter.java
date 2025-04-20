package com.java.screenMatch.calc;

import com.java.screenMatch.models.Series;

public class filter {


   public void filter(classification classification){
        if (classification.getClassification() >= 4) {
            System.out.println("Title is recommended");
        } else if (classification.getClassification() == 3) {
            System.out.println("Title so so recommended");
        } else {
            System.out.println("Title is not recommended");
        }
    }


}
