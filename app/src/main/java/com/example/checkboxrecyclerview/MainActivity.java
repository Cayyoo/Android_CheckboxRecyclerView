package com.example.checkboxrecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * RecycleView中CheckBox全选、反选、单选效果
 */
public class MainActivity extends AppCompatActivity {

    private MyAdapter myAdapter;
    private LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化控件
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        //在加载数据之前配置
        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        //创建一个适配器
        myAdapter = new MyAdapter();
        recyclerView.setAdapter(myAdapter);
    }

    /**
     * 全选
     * @param view
     */
    public void btnAll(View view) {
        myAdapter.selectAll();
    }

    /**
     * 单选
     * @param view
     */
    public void btnner(View view) {
        myAdapter.neverAll();
    }
}
