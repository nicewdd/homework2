package chapter.android.aweme.ss.com.homework;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import chapter.android.aweme.ss.com.homework.widget.CircleImageView;

/**
 * 大作业:实现一个抖音消息页面,所需资源已放在res下面
 */
public class Exercises3 extends AppCompatActivity {
    private ImageView imag1,imag2,imag3,imag4;
    private LinearLayout lin1,lin2,lin3,lin4,lin5,lin6,lin7;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercises3);
        lin1 = findViewById(R.id.lin1);
        lin2 = findViewById(R.id.lin2);
        lin3 = findViewById(R.id.lin3);
        lin4 = findViewById(R.id.lin4);
        lin5 = findViewById(R.id.lin5);
        lin6 = findViewById(R.id.lin6);
        lin7 = findViewById(R.id.lin7);
        imag1 = findViewById(R.id.imageView5);
        imag2 = findViewById(R.id.imageView9);
        imag3 = findViewById(R.id.imageView8);
        imag4 = findViewById(R.id.imageView4);
        imag1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Log.d("TAG","imag1");
                startActivity(new Intent(Exercises3.this, Message.class));
            }
        });
        imag2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Log.d("TAG","imag2");
                startActivity(new Intent(Exercises3.this, Message.class));
            }
        });
        imag3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Log.d("TAG","imag3");
                startActivity(new Intent(Exercises3.this, Message.class));
            }
        });
        imag4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Log.d("TAG","imag4");
                startActivity(new Intent(Exercises3.this, Message.class));
            }
        });
        lin1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(Exercises3.this,"First item", Toast.LENGTH_SHORT).show();
            }
        });
        lin2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(Exercises3.this,"Second item", Toast.LENGTH_SHORT).show();
            }
        });
        lin3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(Exercises3.this,"Third item", Toast.LENGTH_SHORT).show();
            }
        });
        lin4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(Exercises3.this,"Fourth item", Toast.LENGTH_SHORT).show();
            }
        });
        lin5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(Exercises3.this,"Fifth item", Toast.LENGTH_SHORT).show();
            }
        });
        lin6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(Exercises3.this,"Sixth item", Toast.LENGTH_SHORT).show();
            }
        });
        lin7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Toast.makeText(Exercises3.this,"Seventh item", Toast.LENGTH_SHORT).show();
            }
        });
//        button.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v){
//                Log.d("SA","SD");
//                Intent intent = new Intent(Exercises3.this,Message.class);
//                startActivity(intent);
////                startActivity(new Intent(Exercises3.this, Message.class));
//            }
//        });
    }

//    public void onClick(){
//        Log.d("HAHA","message");
//    }
}
