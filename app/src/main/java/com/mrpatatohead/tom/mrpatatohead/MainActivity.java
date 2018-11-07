package com.mrpatatohead.tom.mrpatatohead;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        CheckBox check2 = (CheckBox) findViewById(R.id.checkBox2);
        outState.putBoolean("checkedBox2", check2.isChecked());

        CheckBox check3 = (CheckBox) findViewById(R.id.checkBox3);
        outState.putBoolean("checkedBox3", check3.isChecked());

        CheckBox check4 = (CheckBox) findViewById(R.id.checkBox4);
        outState.putBoolean("checkedBox4", check4.isChecked());

        CheckBox check5 = (CheckBox) findViewById(R.id.checkBox5);
        outState.putBoolean("checkedBox5", check5.isChecked());

        CheckBox check6 = (CheckBox) findViewById(R.id.checkBox6);
        outState.putBoolean("checkedBox6", check6.isChecked());

        CheckBox check7 = (CheckBox) findViewById(R.id.checkBox7);
        outState.putBoolean("checkedBox7", check7.isChecked());

        CheckBox check8 = (CheckBox) findViewById(R.id.checkBox8);
        outState.putBoolean("checkedBox8", check8.isChecked());

        CheckBox check9 = (CheckBox) findViewById(R.id.checkBox9);
        outState.putBoolean("checkedBox9", check9.isChecked());

        CheckBox check10 = (CheckBox) findViewById(R.id.checkBox10);
        outState.putBoolean("checkedBox10", check10.isChecked());

        CheckBox check11 = (CheckBox) findViewById(R.id.checkBox11);
        outState.putBoolean("checkedBox11", check11.isChecked());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        boolean checkBool2 = savedInstanceState.getBoolean("checkedBox2");
        CheckBox check2 = (CheckBox) findViewById(R.id.checkBox2);
        check2.setChecked(checkBool2);
        checkImage(check2);

        boolean checkBool3 = savedInstanceState.getBoolean("checkedBox3");
        CheckBox check3 = (CheckBox) findViewById(R.id.checkBox3);
        check3.setChecked(checkBool3);
        checkImage(check3);

        boolean checkBool4 = savedInstanceState.getBoolean("checkedBox4");
        CheckBox check4 = (CheckBox) findViewById(R.id.checkBox4);
        check4.setChecked(checkBool4);
        checkImage(check4);

        boolean checkBool5 = savedInstanceState.getBoolean("checkedBox5");
        CheckBox check5 = (CheckBox) findViewById(R.id.checkBox5);
        check5.setChecked(checkBool5);
        checkImage(check5);

        boolean checkBool6 = savedInstanceState.getBoolean("checkedBox6");
        CheckBox check6 = (CheckBox) findViewById(R.id.checkBox6);
        check6.setChecked(checkBool6);
        checkImage(check6);

        boolean checkBool7 = savedInstanceState.getBoolean("checkedBox7");
        CheckBox check7 = (CheckBox) findViewById(R.id.checkBox7);
        check7.setChecked(checkBool7);
        checkImage(check7);

        boolean checkBool8 = savedInstanceState.getBoolean("checkedBox8");
        CheckBox check8 = (CheckBox) findViewById(R.id.checkBox8);
        check8.setChecked(checkBool8);
        checkImage(check8);

        boolean checkBool9 = savedInstanceState.getBoolean("checkedBox9");
        CheckBox check9 = (CheckBox) findViewById(R.id.checkBox9);
        check9.setChecked(checkBool9);
        checkImage(check9);

        boolean checkBool10 = savedInstanceState.getBoolean("checkedBox10");
        CheckBox check10 = (CheckBox) findViewById(R.id.checkBox10);
        check10.setChecked(checkBool10);
        checkImage(check10);

        boolean checkBool11 = savedInstanceState.getBoolean("checkedBox11");
        CheckBox check11 = (CheckBox) findViewById(R.id.checkBox11);
        check11.setChecked(checkBool11);
        checkImage(check11);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }

    public void checkClicked(View v) {
//        Log.d("potato", "checkClicked: ");
        CheckBox checkbox = (CheckBox) v;
        String name = "image" + checkbox.getText().toString();
        Context context = this;
        int imgId = getResources().getIdentifier(name, "id", context.getPackageName());
        ImageView image = (ImageView) findViewById(imgId);
        if (image.getVisibility() == View.VISIBLE) {
            image.setVisibility(View.INVISIBLE);
        }
        else {
            image.setVisibility(View.VISIBLE);
        }
    }

    private void checkImage(CheckBox check) {
        if(check.isChecked()) {
            String name = "image" + check.getText().toString();
            Context context = this;
            int imgId = getResources().getIdentifier(name, "id", context.getPackageName());
            ImageView image = (ImageView) findViewById(imgId);
            image.setVisibility(View.VISIBLE);
        }

    }
}


