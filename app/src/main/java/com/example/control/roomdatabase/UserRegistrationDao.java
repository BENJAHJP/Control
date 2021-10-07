package com.example.control.roomdatabase;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface UserRegistrationDao {

    @Insert
    void insertData(UserRegistration userRegistration);

    @Query("SELECT * FROM users")
    List<UserRegistration> users ();

}
