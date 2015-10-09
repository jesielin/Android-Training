package com.shawn.gettingstarted;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.shawn.gettingstarted.fragment.ListDemoFragment;
import com.shawn.gettingstarted.fragment.SecondFragment;
import com.shawn.gettingstarted.fragment.ThirdFragment;
import com.shawn.tools.ToastUtils;


public class MultiFragmentActivity extends AppCompatActivity implements ListDemoFragment.OnFragmentInteractionListener {

    ListDemoFragment firstFragment = new ListDemoFragment();
    SecondFragment secondFragment = new SecondFragment();
    ThirdFragment thirdFragment = new ThirdFragment();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_fragment);

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, firstFragment, "first").commit();
    }

    @Override
    public void onFragmentInteraction(String id) {
        if (Integer.valueOf(id) == 0) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, secondFragment, "second").addToBackStack(null).commit();
        }
        if (Integer.valueOf(id) == 1) {
            //add 这diao方法慎用
            getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, thirdFragment, "third").addToBackStack(null).commit();
        }
        ToastUtils.getInstance().showToast(this, id);

    }
}
