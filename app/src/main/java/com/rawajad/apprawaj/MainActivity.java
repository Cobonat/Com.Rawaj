package com.rawajad.apprawaj;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.rawajad.apprawaj.R;

public class MainActivity extends AppCompatActivity {

    private static Button mNextBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnClickNextListner ();
    }

    public void OnClickNextListner (){
        mNextBtn = (Button)findViewById(R.id.next);
        mNextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.rawajad.apprawaj.User_InterFace");
                startActivity(intent);
            }
        });
    }


}