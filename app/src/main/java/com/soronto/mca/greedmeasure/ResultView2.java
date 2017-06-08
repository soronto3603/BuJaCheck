package com.soronto.mca.greedmeasure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by soronto on 5/4/2017.
 */

public class ResultView2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_view);

        Intent intent=new Intent(this.getIntent());
        String data=intent.getStringExtra("Data");

        final int maxWidth=358;

        LinearLayout a=(LinearLayout)findViewById(R.id.graph);
        int temp=Integer.parseInt(data);
        a.getLayoutParams().width=((int)(temp*100*3/120));

        TextView result=(TextView)findViewById(R.id.result);
        result.setText("당신의 성공지수는 "+data+"점 입니다.");
    }
}
