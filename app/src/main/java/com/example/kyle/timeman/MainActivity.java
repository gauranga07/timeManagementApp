package com.example.kyle.timeman;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;


public class MainActivity extends AppCompatActivity {

    private TextView tv;
    private UserSessionActivity session;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String text="";
        try{
            FileInputStream i= openFileInput("name.txt");
            int size=i.available();
            byte[] buffer= new  byte[size];
            i.read(buffer);
            i.close();
            text=new  String(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        tv=(TextView)findViewById(R.id.textView);
        tv.setText("Welcome "+ text);
        session = new UserSessionActivity(getApplicationContext());







    }
}
