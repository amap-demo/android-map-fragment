package com.amap.android_map_fragment;

import android.graphics.PixelFormat;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

public class MainActivity extends FragmentActivity implements View.OnClickListener {
    private FragmentA fragmentA;
    private FragmentB fragmentB;
    private FragmentC fragmentC;
    private FragmentTransaction fragmentTransaction;
    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFormat(PixelFormat.TRANSLUCENT);
        setContentView(R.layout.activity_main);
        initView();
        initFragment();

    }

    private void initView() {
        findViewById(R.id.tab1).setOnClickListener(this);
        findViewById(R.id.tab2).setOnClickListener(this);
        findViewById(R.id.tab3).setOnClickListener(this);
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

                break;
            case R.id.tab2 :
                replaceFragment(fragmentB);

                break;
            case R.id.tab3 :
                replaceFragment(fragmentC);
                break;
        }
    }

    private void hideFragment(FragmentTransaction fragmentTransaction) {
        if(fragmentA != null){
            fragmentTransaction.hide(fragmentA);
        }
        if(fragmentB != null){
            fragmentTransaction.hide(fragmentB);
        }
        if(fragmentC != null){
            fragmentTransaction.hide(fragmentC);
        }
    }

}
