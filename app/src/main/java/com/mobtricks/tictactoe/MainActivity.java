package com.mobtricks.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private ImageView img1,img2,img3,img4,img5,img6,img7,img8,img9;
private Button  playAgain;

int container  = 0;

// 0 for circle
// 1 for cross

int [] box = new int[9];

// Todo come back and write winner's codes your own


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);

        final int circle = R.drawable.ic_circle;
        final int cross = R.drawable.ic_close;


        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        img4 = findViewById(R.id.img4);
        img5 = findViewById(R.id.img5);
        img6 = findViewById(R.id.img6);
        img7 = findViewById(R.id.img7);
        img8 = findViewById(R.id.img8);
        img9 = findViewById(R.id.img9);

        playAgain  = findViewById(R.id.play_again);

        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


               if (box[0]==1){
                 Toast.makeText(MainActivity.this,"Already clicked",Toast.LENGTH_SHORT).show();

               }else {
                   if (container==0){
                       img1.setImageResource(circle);
                       container = 1;
                   }else {
                       img1.setImageResource(cross);
                       container = 0;
                   }

                  box[0] = 1;

               }




            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (box[1]==2){
                    Toast.makeText(MainActivity.this, "Already clicked", Toast.LENGTH_SHORT).show();
                }else {
                    if (container==0){
                        img2.setImageResource(circle);
                        container = 1;
                    }else {
                        img2.setImageResource(cross);
                        container = 0;
                    }

                    box[1] = 2;
                }




            }
        });
        img3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (box[2]==3){
                    Toast.makeText(MainActivity.this, "Already clicked", Toast.LENGTH_SHORT).show();
                }else {
                    if (container==0){
                        img3.setImageResource(circle);
                        container = 1;
                    }else {
                        img3.setImageResource(cross);
                        container = 0;
                    }

                    box[2] = 3;
                }





            }
        });
        img4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (box[3]==4){
                    Toast.makeText(MainActivity.this, "Already clicked", Toast.LENGTH_SHORT).show();

                }else {
                    if (container==0){
                        img4.setImageResource(circle);
                        container = 1;
                    }else {
                        img4.setImageResource(cross);
                        container = 0;
                    }


                    box[3] = 4;

                }






            }
        });
        img5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (box[4]==5){
                    Toast.makeText(MainActivity.this, "Already clicked", Toast.LENGTH_SHORT).show();

                }else {
                    if (container==0){
                        img5.setImageResource(circle);
                        container = 1;
                    }else {
                        img5.setImageResource(cross);
                        container = 0;
                    }

                    box[4] = 5;
                }




            }
        });
        img6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (box[5]==6){
                    Toast.makeText(MainActivity.this, "Already clicked", Toast.LENGTH_SHORT).show();

                }else {
                    if (container==0){
                        img6.setImageResource(circle);
                        container = 1;
                    }else {
                        img6.setImageResource(cross);
                        container = 0;
                    }

                    box[5] = 6;
                }



            }
        });
        img7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (box[6]==7){
                    Toast.makeText(MainActivity.this, "Already clicked", Toast.LENGTH_SHORT).show();

                }else {
                    if (container==0){
                        img7.setImageResource(circle);
                        container = 1;
                    }else {
                        img7.setImageResource(cross);
                        container = 0;
                    }

                    box[6] = 7;
                }




            }
        });
        img8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (box[7]==8){
                    Toast.makeText(MainActivity.this, "Already clicked", Toast.LENGTH_SHORT).show();

                }else {
                    if (container==0){
                        img8.setImageResource(circle);
                        container = 1;
                    }else {
                        img8.setImageResource(cross);
                        container = 0;
                    }

                    box[7] = 8;
                }







            }
        });

        img9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (box[8]==9){
                    Toast.makeText(MainActivity.this, "Already clicked", Toast.LENGTH_SHORT).show();

                }else {
                    if (container==0){
                        img9.setImageResource(circle);
                        container = 1;
                    }else {
                        img9.setImageResource(cross);
                        container = 0;
                    }
                    box[8] = 9;
                }






            }
        });



        playAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               img1.setImageResource(R.mipmap.ic_launcher);
               img2.setImageResource(R.mipmap.ic_launcher);
               img3.setImageResource(R.mipmap.ic_launcher);
               img4.setImageResource(R.mipmap.ic_launcher);
               img5.setImageResource(R.mipmap.ic_launcher);
               img6.setImageResource(R.mipmap.ic_launcher);
               img7.setImageResource(R.mipmap.ic_launcher);
               img8.setImageResource(R.mipmap.ic_launcher);
               img9.setImageResource(R.mipmap.ic_launcher);

                container = 0;
                box = new int[9];

            }
        });



    }
}
