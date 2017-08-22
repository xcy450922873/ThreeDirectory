package com.example.magenta.threedirectory;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import com.example.magenta.threedirectory.adapter.FirstRecyclerViewAdapter;
import com.example.magenta.threedirectory.adapter.SecondRecyclerViewAdapter;
import com.example.magenta.threedirectory.adapter.ThirdRecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;


/*
* 使用RecyclerVie实现三级目录
* 可用于商品选择
* */
public class MainActivity extends AppCompatActivity {
    private RecyclerView recycler_first;
    private RecyclerView recycler_second;
    private RecyclerView recycler_third;
    private List<String> mDataList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //初始化视图
        initView();
        //初始化数据
        initData();

        //一级目录布局管理器(设置为垂直)
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
        mLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recycler_first.setLayoutManager(mLayoutManager);
        recycler_first.setAdapter(new FirstRecyclerViewAdapter(this, mDataList));

        //二级目录布局管理器
        StaggeredGridLayoutManager mLayoutManager1 = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.HORIZONTAL);
        recycler_second.setLayoutManager(mLayoutManager1);
        recycler_second.setAdapter(new SecondRecyclerViewAdapter(this, mDataList));

        //三级目录布局管理器
        GridLayoutManager mLayoutManager2 = new GridLayoutManager(this, 2);
        recycler_third.setLayoutManager(mLayoutManager2);
        recycler_third.setAdapter(new ThirdRecyclerViewAdapter(mDataList, this));
    }

    private void initData() {
        for (int i = 0; i < 40; i++) {
            mDataList.add("数据" + i);
        }
    }

    private void initView() {
        recycler_first = ((RecyclerView) findViewById(R.id.recycler_first));
        recycler_second = ((RecyclerView) findViewById(R.id.recycler_second));
        recycler_third = ((RecyclerView) findViewById(R.id.recycler_third));
    }
}
