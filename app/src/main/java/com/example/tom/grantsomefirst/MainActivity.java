package com.example.tom.grantsomefirst;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PhoneSignInButton = (Button)findViewById(R.id.phone_sign_in_button);
        PhoneSignInButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent i = new Intent(MainActivity.this,Sign_in_Activity.class);
                startActivity(i);
            }
        });
        if(savedInstanceState !=null){

        }

    }

    private Button PhoneSignInButton;


}
