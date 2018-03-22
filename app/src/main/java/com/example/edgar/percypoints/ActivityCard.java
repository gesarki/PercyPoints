package com.example.edgar.percypoints;

import android.content.Intent;
import android.support.annotation.Nullable;

/**
 * Created by edgar on 2018-03-21.
 */

public class ActivityCard {
    private int backgroundColor;
    private String imgUrl;
    private String activityName;
    private String activityType;
    private int pts;
    private Class<?> intentClass;

    public ActivityCard(int backgroundColor, String imgUrl, String activityName, String activityType, int pts, Class<?> intentClass) {
        this.backgroundColor = backgroundColor;
        this.imgUrl = imgUrl;
        this.activityName = activityName;
        this.activityType = activityType;
        this.pts = pts;
        this.intentClass = intentClass;
    }

    public int getBackgroundColor() {
        return backgroundColor;
    }

    public void setBackgroundColor(int backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public String getActivityType() {
        return activityType;
    }

    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }

    public int getPts() {
        return pts;
    }

    public void setPts(int pts) {
        this.pts = pts;
    }
    public Class<?> getIntentClass() {
        return intentClass;
    }

    public void setIntentClass(Class<?> intentClass) {
        this.intentClass = intentClass;
    }


}
