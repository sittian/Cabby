package com.roadyo.passenger.pojo;

import java.io.Serializable;

/**
 * Created by rahul on 23/3/16.
 */

/* {
               "distance" : {
                  "text" : "9.9 km",
                  "value" : 9887
               },
               "duration" : {
                  "text" : "26 mins",
                  "value" : 1549
               },
               "status" : "OK"
            }*/
public class Elements implements Serializable
{
    DurationClass duration;

    DurationClass distance;

    public DurationClass getDistance() {
        return distance;
    }

    public void setDistance(DurationClass distance) {
        this.distance = distance;
    }

    public DurationClass getDuration() {
        return duration;
    }

    public void setDuration(DurationClass duration) {
        this.duration = duration;
    }
}
