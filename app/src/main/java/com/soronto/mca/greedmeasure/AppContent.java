package com.soronto.mca.greedmeasure;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by soronto on 5/4/2017.
 */

public class AppContent extends AppCompatActivity {
    public Data usingData=new Data();
    public int[] selectedRadioNumber={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_content);
        Intent intent=new Intent(this.getIntent());
        this.setRadioButton();
    }
    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();
        int currentPage=this.usingData.getCurrentPage();
        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio1:
                if (checked){
                    this.selectedRadioNumber[currentPage]=1;
                    Toast.makeText(getApplicationContext(),currentPage+":1", Toast.LENGTH_SHORT).show();
                    break;
                }
            case R.id.radio2:
                if (checked){
                    this.selectedRadioNumber[currentPage]=2;
                    Toast.makeText(getApplicationContext(),currentPage+":2", Toast.LENGTH_SHORT).show();
                    break;
                }
            case R.id.radio3:
                if (checked){
                    this.selectedRadioNumber[currentPage]=3;
                    Toast.makeText(getApplicationContext(),currentPage+":3", Toast.LENGTH_SHORT).show();
                    break;
                }
            case R.id.radio4:
                if (checked){
                    this.selectedRadioNumber[currentPage]=4;
                    Toast.makeText(getApplicationContext(),currentPage+":4", Toast.LENGTH_SHORT).show();
                    break;
                }

        }
    }
    public void setRadioButton(){
        RadioButton radio1=(RadioButton)findViewById(R.id.radio1);
        RadioButton radio2=(RadioButton)findViewById(R.id.radio2);
        RadioButton radio3=(RadioButton)findViewById(R.id.radio3);
        RadioButton radio4=(RadioButton)findViewById(R.id.radio4);


        radio1.setChecked(false);
        radio2.setChecked(false);
        radio3.setChecked(false);
        radio4.setChecked(false);


        TextView title=(TextView)findViewById(R.id.title);

        String[] temp=this.usingData.getCurrentStrings();

        title.setText(temp[0]);

        radio1.setText(temp[1]);
        radio2.setText(temp[2]);
        radio3.setText(temp[3]);
        radio4.setText(temp[4]);
    }
    public void nextPage(View v){
        if(this.usingData.getCurrentPage()==15){
            Intent intent2=new Intent(AppContent.this,ResultView2.class);
            int result=0;
            for(int i:this.selectedRadioNumber){
                //Log.d("iteratit",Integer.toString(this.selectedRadioNumber[i]));
                result=result+this.selectedRadioNumber[i]*3;
            }
            //int result=this.selectedRadioNumber[0]*2+this.selectedRadioNumber[1]*3+this.selectedRadioNumber[2]*4+this.selectedRadioNumber[3]*1;
            intent2.putExtra("Data",""+result);
            startActivity(intent2);
        }else{
            this.usingData.setNextPage();
            this.setRadioButton();
        }
    }

}