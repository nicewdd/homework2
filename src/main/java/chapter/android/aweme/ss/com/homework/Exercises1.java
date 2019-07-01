package chapter.android.aweme.ss.com.homework;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * 作业1：
 * 打印出Activity屏幕切换 Activity会执行什么生命周期？
 */
public class Exercises1 extends AppCompatActivity {
    private final String TAG = "MyApplication";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onDestroy(){
        Log.d(TAG,"onDestroy");
        super.onDestroy();
    }

    @Override
    protected void onStop(){
        Log.d(TAG,"onStop");
        super.onStop();
    }

    @Override
    protected void onResume(){
        Log.d(TAG,"onResume");
        super.onResume();
    }

    @Override
    protected void onStart(){
        Log.d(TAG,"onStart");
        super.onStart();
    }

    @Override
    protected void onPause(){
        Log.d(TAG,"onPause");
        super.onPause();
    }
}
