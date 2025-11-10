package com.informatika.mobilecomponentfikri.roomdb;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Note {
    @PrimaryKey(autoGenerate = true)
    public int id;
    public String text;
}
