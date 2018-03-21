package com.example.edgar.percypoints;

public class PointTracker {
    public static final String TABLE_NAME = "tracker";
    public static final String COLUMN_ID = "id";
    public static final String COLUMN_POINT = "points";


    private int id;
    private int count;


    // Create table SQL query
    public static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + COLUMN_POINT + " INTEGER"
                    + ")";

    public PointTracker() {
    }

    public PointTracker(int id, int count) {
        this.id = id;
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
