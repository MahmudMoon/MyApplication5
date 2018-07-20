package com.sms.demo.myapplication;

import android.os.Build;
import android.renderscript.ScriptGroup;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {


    Switch aSwitch;

    EditText pass;
    Button btn;
    ImageButton imageButton;
    CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        aSwitch = (Switch)findViewById(R.id.switch1);
        pass = (EditText)findViewById(R.id.editText2);
        btn = (Button)findViewById(R.id.btn);
        imageButton = (ImageButton)findViewById(R.id.imageButton);
        checkBox = (CheckBox)findViewById(R.id.checkBox);


          aSwitch.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {

                  if (aSwitch.isChecked()) {
                      Toast.makeText(getApplicationContext(), "On", Toast.LENGTH_SHORT).show();
                  } else
                      Toast.makeText(getApplicationContext(), "Off", Toast.LENGTH_SHORT).show();

              }


          });


          btn.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                 String pas =  pass.getText().toString();
                 Toast.makeText(getApplicationContext(),pas,Toast.LENGTH_SHORT).show();
                 pass.setInputType(InputType.TYPE_CLASS_TEXT);
                 pass.setText(pas);
                 pass.setInputType(InputType.TYPE_TEXT_VARIATION_PASSWORD);
              }
          });


          imageButton.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View v) {
                  imageButton.setImageResource(R.drawable.abc);
                  if(checkBox.isChecked()){
                      Toast.makeText(getApplicationContext(),"Checked",Toast.LENGTH_SHORT).show();
                  }else
                      Toast.makeText(getApplicationContext(),"UnChecked",Toast.LENGTH_SHORT).show();
              }
          });

    }
}
