package com.thenewboston.contactmanagementusingsqlitedatabase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by Rahul on 20-11-2016.
 */

public class databaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "contact.db";
    private static final String TABLE_NAME = "contacts";
    public databaseHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);

        SQLiteDatabase db = this.getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
    db.execSQL("CREATE TABLE "+TABLE_NAME+"(ID INTEGER PRIMARY KEY AUTOINCREMENT NAME TEXT,MOBILE_NUMBER INTEGER,EMAIL TEXT)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXITS " + TABLE_NAME);
         onCreate(db);
    }
}
