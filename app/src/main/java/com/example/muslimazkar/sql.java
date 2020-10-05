package com.example.muslimazkar;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class sql extends SQLiteOpenHelper {
    public sql(Context context){
        super(context,"fav",null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String f = "CREATE TABLE FAV (" +
                "NAME VARCHAR)";
        db.execSQL(f);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public ArrayList<String> read_data(){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c =db.rawQuery("SELECT * FROM FAV ",null);
        ArrayList<String> myfav = new ArrayList<>();
        while (c.moveToNext()){
            String name = c.getString(c.getColumnIndex("NAME"));
            myfav.add(name);
        }
        return myfav;
    }

    public void write_data(String A){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues h = new ContentValues();
        h.put("NAME",A);
        db.insert("FAV",null,h);
    }

    public void delete_data(String name){
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete("FAV","NAME LIKE ?",new String[]{name});

    }

    public boolean iscontainetAzkar(String name){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM FAV WHERE NAME LIKE ? " , new String[]{name});
        return  c.getCount()>0;
    }
}
