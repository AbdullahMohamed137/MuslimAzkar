package com.example.muslimazkar;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.TextView;

import com.onurkaganaldemir.ktoastlib.KToast;

import java.util.ArrayList;

class BaseAdapter2 extends BaseAdapter {
    ArrayList<String> E ;
    Context context;
    Activity A;

    public BaseAdapter2(ArrayList<String> e, Context context, Activity A) {
        E = e;
        this.context = context;
        this.A=A;
    }

    @Override
    public int getCount() {
        return E.size();
    }

    @Override
    public Object getItem(int i) {
        return E.get(i);
    }

    @Override
    public long getItemId(int i) {
        return (long) i;
    }


    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final int index = i;
        View inflater = LayoutInflater.from(context).inflate(R.layout.azkarview,null);
        ((TextView)inflater.findViewById(R.id.azkarText)).setText(E.get(i));
        //((ImageButton)inflater.findViewById(R.id.fav)).setColorFilter(Color.rgb(255,0,0));
        final ImageButton fav = inflater.findViewById(R.id.fav);

        final sql SQL = new sql(context);


        if (SQL.iscontainetAzkar(E.get(index))){
            fav.setColorFilter(Color.rgb(255,0,0));
        }
        else {
            fav.setColorFilter(Color.rgb(0,0,0));
        }


        fav.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View view) {
                SQL.iscontainetAzkar(E.get(index));
                if (!SQL.iscontainetAzkar(E.get(index))){
                    fav.setColorFilter(Color.rgb(255,0,0));
                    SQL.write_data(E.get(index));
                    KToast.successToast(A, "تم إضافة الذكر إلى أذكارى", Gravity.TOP, KToast.LENGTH_SHORT);

                }
                else {
                    fav.setColorFilter(Color.rgb(0,0,0));
                    SQL.delete_data(E.get(index));
                    KToast.warningToast(A, "تم إزالة الذكر من أذكارى", Gravity.TOP, KToast.LENGTH_SHORT);

                }
            }
        });

        final ImageButton SHARE = inflater.findViewById(R.id.share);
        SHARE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                //intent.putExtra(Intent.EXTRA_SUBJECT,"Muslim Azkar");
                intent.putExtra(Intent.EXTRA_TEXT,E.get(index));
                context.startActivity(Intent.createChooser(intent,"اختر التطبيق"));

            }
        });

        return inflater;
    }
}
