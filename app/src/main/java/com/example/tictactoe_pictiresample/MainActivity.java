package com.example.tictactoe_pictiresample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
ImageView img1,img2,img3,img4,img5,img6,img7,img8,img9;
int flag=0;
    String b1, b2, b3, b4, b5,b6, b7, b8,b9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
img1=findViewById(R.id.img1);
img2=findViewById(R.id.img2);
        img3=findViewById(R.id.img3);
        img4=findViewById(R.id.img4);
        img5=findViewById(R.id.img5);
        img6=findViewById(R.id.img6);
        img7=findViewById(R.id.img7);
        img8=findViewById(R.id.img8);
        img9=findViewById(R.id.img9);
        img1.setTag("");
        img2.setTag("");
        img3.setTag("");
        img4.setTag("");
        img5.setTag("");
        img6.setTag("");
        img7.setTag("");
        img8.setTag("");
        img9.setTag("");


    }


    public void Check(View view){

//        switch(view.getId()){
//            case R.id.img1:
//                arr[0][0]=initial%2;
//        }
//        checkIfLineFormed();
//        inital ++;
        ImageView imCurrent=(ImageView) view;
        if (flag==0) {
            imCurrent.setImageResource(R.drawable.download);
            imCurrent.setTag("TOM");
            flag=1;
        } else {
            imCurrent.setImageResource(R.drawable.download1);
            imCurrent.setTag("JERRY");
            flag=0;
        }
        imCurrent.setEnabled(false);

        b1= String.valueOf(img1.getTag());
        b2=img2.getTag().toString();
        b3=img3.getTag().toString();
        b4=img4.getTag().toString();
        b5=img5.getTag().toString();
        b6=img6.getTag().toString();
        b7=img7.getTag().toString();
        b8=img8.getTag().toString();
        b9=img9.getTag().toString();

        if (b1.equals(b2) && b2.equals(b3) && !b3.equals("")){
            //1
            Toast.makeText(this, "Winner is: "+b1, Toast.LENGTH_LONG).show();
            Reset();
        } else if (b4.equals(b5) && b5.equals(b6) && !b6.equals("")){
            //2
            Toast.makeText(this, "Winner is: "+b4, Toast.LENGTH_LONG).show();
            Reset();
        } else if (b7.equals(b8) && b8.equals(b9) && !b9.equals("")){
            //3
            Toast.makeText(this, "Winner is: "+b7, Toast.LENGTH_LONG).show();
            Reset();
        } else if (b1.equals(b4) && b4.equals(b7) && !b7.equals("")){
            //4
            Toast.makeText(this, "Winner is: "+b1, Toast.LENGTH_LONG).show();
            Reset();
        } else if (b2.equals(b5) && b5.equals(b8) && !b8.equals("")){
            //5
            Toast.makeText(this, "Winner is: "+b2, Toast.LENGTH_LONG).show();
            Reset();
        } else if (b3.equals(b6) && b6.equals(b9) && !b9.equals("")){
            //6
            Toast.makeText(this, "Winner is: "+b3, Toast.LENGTH_LONG).show();
            Reset();
        } else if (b1.equals(b5) && b5.equals(b9) && !b9.equals("")){
            //7
            Toast.makeText(this, "Winner is: "+b1, Toast.LENGTH_LONG).show();
            Reset();
        } else if (b3.equals(b5) && b5.equals(b7) && !b7.equals("")){
            //8
            Toast.makeText(this, "Winner is: "+b3, Toast.LENGTH_LONG).show();
            Reset();
        } else if (!b1.equals("") && !b2.equals("") && !b3.equals("") &&
                !b4.equals("") && !b5.equals("") && !b6.equals("") &&
                !b7.equals("") && !b8.equals("") && !b9.equals("")){
            Toast.makeText(this, "Match is Drawn.", Toast.LENGTH_SHORT).show();
            Reset();
        }


    }
    public void Reset(){
        img1.setImageDrawable(null);
        img1.setTag("");
        img1.setEnabled(true);
        img2.setTag("");
        img2.setImageDrawable(null);
        img2.setEnabled(true);
        img3.setTag("");
        img3.setImageDrawable(null);
        img3.setEnabled(true);
        img4.setTag("");
        img4.setImageDrawable(null);
        img4.setEnabled(true);
        img5.setTag("");
        img5.setImageDrawable(null);
        img5.setEnabled(true);
        img6.setTag("");
        img6.setImageDrawable(null);
        img6.setEnabled(true);
        img7.setTag("");
        img7.setImageDrawable(null);
        img7.setEnabled(true);
        img8.setTag("");
        img8.setImageDrawable(null);
        img8.setEnabled(true);
        img9.setTag("");
        img9.setImageDrawable(null);
        img9.setEnabled(true);
    }


}
