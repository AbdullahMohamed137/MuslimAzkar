package com.example.muslimazkar;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

public class MainActivity extends AppCompatActivity {
    Fragment selectedFragment ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //BottomNavigationView bottomNav = findViewById(R.id.botton_navigation);
        //bottomNav.setOnNavigationItemSelectedListener(navListener);


        final TextView T_seb7a = findViewById(R.id.textView_seb7a);
        final TextView T_azkar = findViewById(R.id.textView_azkar);
        final TextView T_azkary = findViewById(R.id.textView_azkary);

        final CardView C_seb7a = findViewById(R.id.card_seb7a);
        final CardView C_azkar = findViewById(R.id.card_azkar);
        final CardView C_azkary = findViewById(R.id.card_azkary);


        selectedFragment = new SebhaFregment();
        getSupportFragmentManager().beginTransaction()
                .setCustomAnimations(
                        R.anim.slide_in,
                        R.anim.fade_out,
                        R.anim.fade_in,
                        R.anim.slid_out
                )
                .replace(R.id.fragment_container,selectedFragment).commit();

        //animator = (AnimatorSet) AnimatorInflater.loadAnimator(this,R.animator.button_animation);

        //Animation animation = AnimationUtils.loadAnimation(this,R.anim.button_anim);

        final Animation animZoomIn = AnimationUtils.loadAnimation(this,R.anim.button_anim);
        final Animation resetAnimation = AnimationUtils.loadAnimation(this,R.anim.reset_anim);
        final Animation startAnimation = AnimationUtils.loadAnimation(this,R.anim.start_anim);

        C_seb7a.setAnimation(animZoomIn);
        C_azkar.startAnimation(startAnimation);
        C_azkary.startAnimation(startAnimation);

        C_seb7a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                T_seb7a.setVisibility(View.VISIBLE);
                T_azkar.setVisibility(View.GONE);
                T_azkary.setVisibility(View.GONE);
                C_seb7a.setCardBackgroundColor(0xff76d275);
                C_azkar.setCardBackgroundColor(0xffffffff);
                C_azkary.setCardBackgroundColor(0xffffffff);
                selectedFragment = new SebhaFregment();
                getSupportFragmentManager().beginTransaction()
                        .setCustomAnimations(
                                R.anim.slide_in,
                                R.anim.fade_out,
                                R.anim.fade_in,
                                R.anim.slid_out
                        )
                        .replace(R.id.fragment_container,selectedFragment).commit();
                C_seb7a.setVisibility(View.VISIBLE);
                C_seb7a.startAnimation(animZoomIn);
                C_azkar.startAnimation(resetAnimation);
                C_azkary.startAnimation(resetAnimation);

                //animator.cancel();
                //animator.setTarget(C_seb7a);
                //animator.start();
            }
        });
        C_azkar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                T_azkar.setVisibility(View.VISIBLE);
                T_seb7a.setVisibility(View.GONE);
                T_azkary.setVisibility(View.GONE);
                C_azkar.setCardBackgroundColor(0xff76d275);
                C_seb7a.setCardBackgroundColor(0xffffffff);
                C_azkary.setCardBackgroundColor(0xffffffff);
                selectedFragment = new AzkarFragment();
                getSupportFragmentManager().beginTransaction()
                        .setCustomAnimations(
                                R.anim.slide_in,
                                R.anim.fade_out,
                                R.anim.fade_in,
                                R.anim.slid_out
                        )
                        .replace(R.id.fragment_container,selectedFragment).commit();
                //animator.cancel();
                //animator.setTarget(C_azkar);
                //animator.start();

                C_azkar.setVisibility(View.VISIBLE);
                C_azkar.startAnimation(animZoomIn);
                C_seb7a.startAnimation(resetAnimation);
                C_azkary.startAnimation(resetAnimation);

            }
        });
        C_azkary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                T_azkary.setVisibility(View.VISIBLE);
                T_seb7a.setVisibility(View.GONE);
                T_azkar.setVisibility(View.GONE);
                C_azkary.setCardBackgroundColor(0xff76d275);
                C_seb7a.setCardBackgroundColor(0xffffffff);
                C_azkar.setCardBackgroundColor(0xffffffff);
                selectedFragment = new AzkaryFragment();
                getSupportFragmentManager().beginTransaction()
                        .setCustomAnimations(
                                R.anim.slide_in,
                                R.anim.fade_out,
                                R.anim.fade_in,
                                R.anim.slid_out
                        )
                        .replace(R.id.fragment_container,selectedFragment).commit();
                //animator.cancel();
                //animator.setTarget(C_azkary);
                //animator.start();

                C_azkary.setVisibility(View.VISIBLE);
                C_azkary.startAnimation(animZoomIn);
                C_seb7a.startAnimation(resetAnimation);
                C_azkar.startAnimation(resetAnimation);
            }
        });


    }

    /*private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                    switch (item.getItemId()){
                        case R.id.sebha:
                            break;
                        case R.id.azkar:
                            break;
                        case R.id.azkary:
                            break;
                    }
                    return true;
                }
            };

     */
}