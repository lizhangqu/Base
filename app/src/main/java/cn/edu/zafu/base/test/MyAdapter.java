package cn.edu.zafu.base.test;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import cn.edu.zafu.base.adapter.BaseRecyclerViewAdapter;

/**
 * Created by lizhangqu on 2015/6/3.
 */
public class MyAdapter extends BaseRecyclerViewAdapter<News, MyAdapter.MyViewHolder> {

    public MyAdapter(List<News> list) {
        super(list);
    }

    @Override
    protected void bindDataToItemView(MyViewHolder myViewHolder, News item) {
        myViewHolder.img.setBackgroundResource(cn.edu.zafu.base.R.mipmap.ic_launcher);
        myViewHolder.title.setText(item.getTitle());
        myViewHolder.description.setText(item.getDescription());
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int type) {
        return new MyViewHolder(inflateItemView(viewGroup, cn.edu.zafu.base.R.layout.item));
    }

    public class MyViewHolder extends BaseRecyclerViewAdapter.BaseViewHolder {
        ImageView img;
        TextView title;
        TextView description;

        public MyViewHolder(View itemView) {
            super(itemView);
        }

        @Override
        protected void findView() {
            img = findViewById(cn.edu.zafu.base.R.id.img);
            title = findViewById(cn.edu.zafu.base.R.id.title);
            description = findViewById(cn.edu.zafu.base.R.id.description);
        }
    }

}
