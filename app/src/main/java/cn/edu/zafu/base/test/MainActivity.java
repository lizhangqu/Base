package cn.edu.zafu.base.test;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import cn.edu.zafu.base.R;
import cn.edu.zafu.base.activity.BaseActivity;
import cn.edu.zafu.base.adapter.listener.OnItemClickListener;
import cn.edu.zafu.base.adapter.listener.OnItemLongClickListener;

public class MainActivity extends BaseActivity {
    private List<News> list = new ArrayList<>();
    private RecyclerView mRecyclerView;
    private MyAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(cn.edu.zafu.base.R.layout.activity_main);
        showToolbar("我的");
        initData();
        initView();
    }

    private void initView() {
        mRecyclerView = (RecyclerView) findViewById(cn.edu.zafu.base.R.id.recyclerview);
        mAdapter = new MyAdapter(list);
        mAdapter.setOnItemClickListener(new OnItemClickListener<News>() {

            @Override
            public void onClick(View view, News item) {
                Toast.makeText(getApplicationContext(), "短" + item.getDescription(), Toast.LENGTH_SHORT).show();
            }
        });
        mAdapter.setOnItemLongClickListener(new OnItemLongClickListener<News>() {
            @Override
            public void onLongClick(View view, News item) {
                Toast.makeText(getApplicationContext(), "长按" + item.getTitle(), Toast.LENGTH_SHORT).show();
            }
        });
        mRecyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        mRecyclerView.setAdapter(mAdapter);
    }

    private void initData() {
        News news = new News();
        news.setTitle("11111111111111");
        news.setDescription("aaaaaaaaaaaaaaa");

        list.add(news);
        news = new News();
        news.setTitle("222222222222");
        news.setDescription("bbbbbbbbbbb");

        list.add(news);
        news = new News();
        news.setTitle("33333333333");
        news.setDescription("ccccccccccc");

        list.add(news);
        news = new News();
        news.setTitle("444444444444");
        news.setDescription("ddddddd");
        list.add(news);
    }

    @Override
    protected boolean showNavigationIcon() {
        return false;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

}
