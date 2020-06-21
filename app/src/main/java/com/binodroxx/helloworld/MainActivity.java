package com.binodroxx.helloworld;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

   public void buttonIsClicked(View buttonView){
       // int result=5*7;
       //Log.i("OPERATION",result+"");

       // TextView text=findViewById(R.id.text);
     //  Log.i("TAG", text.getText().toString());

//       EditText edtName = findViewById(R.id.edtName);
//     //  Log.i("name", edtName.getText().toString());
//
//       EditText edtphn=findViewById(R.id.edtPhn);
//     //  Log.i("Phone",edtphn.getText().toString());
//
//       Toast.makeText(MainActivity.this,
//               "your name is:"+edtName.getEditableText()+"\n"+" your phone no. is:"+edtphn.getEditableText().toString(),
//               Toast.LENGTH_LONG).show();

       ImageView myImage =findViewById(R.id.img);
       myImage.setImageResource(R.drawable.hamburg);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
