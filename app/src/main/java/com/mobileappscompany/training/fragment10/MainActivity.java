package com.mobileappscompany.training.fragment10;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements F1.IF1{
    F1 f1;
    F2 f2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();

//        f1 = (F1) fm.findFragmentById(R.id.forF1);

        if(savedInstanceState != null) return;

       // if(f1 == null){
            FragmentTransaction ft = fm.beginTransaction();
            f1 = new F1();
            ft.add(R.id.forF1, f1);
//            f2 = new F2();
//            ft.add(R.id.forF2, f2);
            ft.commit();
      //  }


    }

    @Override
    public void switch2F2() {
        if(f2 == null){
            f2 = new F2();
        }
        Contact ct   = new Contact("001", "Fernando", "Toro");

        Bundle  bl = new Bundle();
        bl.putParcelable("K", ct);
        f2.setArguments(bl);

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.forF1, f2);
        ft.commit();
    }
}
