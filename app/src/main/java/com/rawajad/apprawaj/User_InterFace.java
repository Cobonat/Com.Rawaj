package com.rawajad.apprawaj;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.rawajad.apprawaj.R;


public class User_InterFace extends AppCompatActivity {

    Toolbar mtoolbar ;
    Button mButton ;

    private View.OnClickListener mBtnStartListner= new View.OnClickListener(){

        @Override
        public void onClick(View v) {
            Intent intent = new Intent("com.rawajad.apprawaj.Items_View");
            startActivity(intent);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user__inter_face);

        mtoolbar=(Toolbar)findViewById(R.id.tool_bar);
        mButton =(Button) findViewById(R.id.btn_Start);
        mButton.setOnClickListener(mBtnStartListner);
        setSupportActionBar(mtoolbar);
    }
}
