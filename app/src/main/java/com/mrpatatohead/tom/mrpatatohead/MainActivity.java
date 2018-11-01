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
}


