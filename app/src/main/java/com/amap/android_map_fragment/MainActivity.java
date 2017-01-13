package com.amap.android_map_fragment;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends FragmentActivity implements View.OnClickListener {
    private FragmentA fragmentA;
    private FragmentB fragmentB;
    private FragmentC fragmentC;
    private FragmentTransaction fragmentTransaction;
    private FragmentManager fragmentManager;
    private TextView textView1, textView2,textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initFragment();
    }

    private void initView() {
        findViewById(R.id.tab1).setOnClickListener(this);
        findViewById(R.id.tab2).setOnClickListener(this);
        findViewById(R.id.tab3).setOnClickListener(this);
//        textView1 = (TextView)findViewById(R.id.tv1);
//        textView2 = (TextView)findViewById(R.id.tv2);
//        textView3 = (TextView)findViewById(R.id.tv3);
    }

    private void initFragment() {
        fragmentA = new FragmentA();
        fragmentB = new FragmentB();
        fragmentC = new FragmentC();
        fragmentManager = getSupportFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.content_container, fragmentA, fragmentA.getClass().getName());
        fragmentTransaction.commit();
    }

    private void replaceFragment(Fragment fragment) {

        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setCustomAnimations(
                R.anim.slide_in_bottom,
                R.anim.slide_out_bottom);
        fragmentTransaction.replace(R.id.content_container, fragment, fragment.getClass().getName());
//        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.tab1 :
                replaceFragment(fragmentA);
//                resetTab();
//                textView1.setTextColor(Color.BLUE);
                break;
            case R.id.tab2 :
                replaceFragment(fragmentB);
//                resetTab();
//                textView2.setTextColor(Color.BLUE);
                break;
            case R.id.tab3 :
                replaceFragment(fragmentC);
//                resetTab();
//                textView3.setTextColor(Color.BLUE);
                break;
        }
    }
//    private void resetTab() {
//        textView1.setTextColor(Color.BLACK);
//        textView2.setTextColor(Color.BLACK);
//        textView3.setTextColor(Color.BLACK);
//    }
}
