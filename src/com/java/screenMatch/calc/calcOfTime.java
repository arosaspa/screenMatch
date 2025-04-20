package com.java.screenMatch.calc;
import com.java.screenMatch.models.Movies;
import com.java.screenMatch.models.Series;
import com.java.screenMatch.models.Title;

public class calcOfTime {

    private int totalTime;

    //*********************************************************************\\
    // Constructor get

    public int getTotalTime() {
        return totalTime;
    }
//*********************************************************************\\
    //methods

    public void include(Title title) {
        this.totalTime += title.getDurationInMinutes();
    }


}
