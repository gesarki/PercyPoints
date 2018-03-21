package com.example.edgar.percypoints;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    // Database Version
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "tracker";


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    // Creating Tables
    @Override
    public void onCreate(SQLiteDatabase db) {
        // create notes table
        db.execSQL(PointTracker.CREATE_TABLE);
    }

    // Upgrading database
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + PointTracker.TABLE_NAME);

        // Create tables again
        onCreate(db);
    }

    public long insertPoint(int count) {
        // get writable database as we want to write data
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        // `id` and `timestamp` will be inserted automatically.
        // no need to add them
        values.put(PointTracker.COLUMN_POINT, count);

        // insert row
        long id = db.insert(PointTracker.TABLE_NAME, null, values);

        // close db connection
        db.close();

        // return newly inserted row id
        return id;
    }

    public PointTracker getPoint(long id) {
        // get readable database as we are not inserting anything
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(PointTracker.TABLE_NAME,
                new String[]{PointTracker.COLUMN_ID, PointTracker.COLUMN_POINT},
                PointTracker.COLUMN_ID + "=?",
                new String[]{String.valueOf(id)}, null, null, null, null);

        if (cursor != null)
            cursor.moveToFirst();

        // prepare note object
        PointTracker pointTracker = new PointTracker(
                cursor.getInt(cursor.getColumnIndex(PointTracker.COLUMN_ID)),
                cursor.getInt(cursor.getColumnIndex(PointTracker.COLUMN_POINT)));

        // close the db connection
        cursor.close();

        return pointTracker;
    }


    public int updatePoints(PointTracker pointTracker) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(PointTracker.COLUMN_ID, pointTracker.getCount());

        // updating row
        return db.update(PointTracker.TABLE_NAME, values, PointTracker.COLUMN_ID + " = ?",
                new String[]{String.valueOf(pointTracker.getId())});
    }
}