package com.example.control.roomdatabase;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = {UserRegistration.class},version = 1,exportSchema = false)

public abstract class DatabaseConfig extends RoomDatabase {

    private static final Object LOCK = new Object();
    private static final String DATABASE_NAME = "control";
    private static DatabaseConfig databaseInstance;

    public static DatabaseConfig databaseGetInstance(Context context) {
        if(databaseInstance == null ){
            synchronized (LOCK){
                databaseInstance = Room.databaseBuilder(context.getApplicationContext(),
                        DatabaseConfig.class, DatabaseConfig.DATABASE_NAME).allowMainThreadQueries().build();
            }
        }
        return databaseInstance;
    }

    public abstract UserRegistrationDao userRegistrationDao();

}
