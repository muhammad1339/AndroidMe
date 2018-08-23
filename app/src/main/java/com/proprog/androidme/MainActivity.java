package com.proprog.androidme;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            BodyPartFragment headFragment = new BodyPartFragment();
            headFragment.setPartList(AndroidImageAssets.getHeads());
            headFragment.setPartIndex(1);
            fragmentManager.beginTransaction()
                    .add(R.id.fragment_head_holder, headFragment)
                    .commit();

            BodyPartFragment bodyFragment = new BodyPartFragment();
            bodyFragment.setPartList(AndroidImageAssets.getBodies());
            bodyFragment.setPartIndex(1);
            fragmentManager.beginTransaction()
                    .add(R.id.fragment_body_holder, bodyFragment)
                    .commit();

            BodyPartFragment legFragment = new BodyPartFragment();
            legFragment.setPartList(AndroidImageAssets.getLegs());
            legFragment.setPartIndex(1);
            fragmentManager.beginTransaction()
                    .add(R.id.fragment_leg_holder, legFragment)
                    .commit();
        }
    }
}
