package com.example.ug.viewpagerfragmentexample;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn[] = new Button[3];
    ViewPager viewPager = null;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //viewPager
        viewPager = (ViewPager)findViewById(R.id.viewPager);
        MyViewPagerAdapter adapter = new MyViewPagerAdapter(getSupportFragmentManager());

        viewPager.setAdapter(adapter);

        btn[0] = (Button)findViewById(R.id.btn_a);
        btn[1] = (Button)findViewById(R.id.btn_b);
        btn[2] = (Button)findViewById(R.id.btn_c);

        for(int i=0;i<btn.length; i++){
            btn[i].setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.btn_a:
                viewPager.setCurrentItem(0);
                Toast.makeText(this, "A버튼", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_b:
                viewPager.setCurrentItem(1);
                Toast.makeText(this,"B버튼", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_c:
                viewPager.setCurrentItem(2);
                Toast.makeText(this,"C버튼", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;

        }

    }
}
