package chapter.android.aweme.ss.com.homework;

import android.os.Bundle;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * 作业2：一个抖音笔试题：统计页面所有view的个数
 * Tips：ViewGroup有两个API
 * {@link android.view.ViewGroup #getChildAt(int) #getChildCount()}
 * 用一个TextView展示出来
 */
public class Exercises2 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public static int getViewCount(View view) {
        //todo 补全你的代码
        int viewNum = 0;
        if(view != null){
            if(view instanceof ViewGroup){
                viewNum++;
                for(int i = 0;i < ((ViewGroup)view).getChildCount();i++){
                    View childView = ((ViewGroup)view).getChildAt(i);
                    if(childView instanceof ViewGroup){
                        viewNum += getViewCount(childView);
                    }
                    else{
                        viewNum++;
                    }
                }
            }
            else{
                viewNum++;
            }
            return viewNum;
        }
       return 0;
    }
}
