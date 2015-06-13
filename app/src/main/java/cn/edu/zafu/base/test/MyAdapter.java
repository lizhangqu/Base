package cn.edu.zafu.base.test;

import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import cn.edu.zafu.base.R;
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
        if (item.getType() == 1) {
            myViewHolder.setBackgroundResource(R.id.img, R.mipmap.ic_launcher);
            myViewHolder.setText(R.id.title1, item.getTitle());
            myViewHolder.setText(R.id.title2, item.getDescription());
            myViewHolder.setText(R.id.title3, item.getTitle() + item.getDescription());
        } else {
            myViewHolder.setBackgroundResource(R.id.img, R.mipmap.ic_launcher);
            myViewHolder.setText(R.id.title, item.getTitle());
            myViewHolder.setText(R.id.description, item.getDescription());
        }
       /* myViewHolder.setBackgroundResource(R.id.img,R.mipmap.ic_launcher);
        myViewHolder.setText(R.id.title,item.getTitle());
        myViewHolder.setText(R.id.description,item.getDescription());*/
     /*   myViewHolder.img.setBackgroundResource(mipmap.ic_launcher);
        myViewHolder.title.setText(item.getTitle());
        myViewHolder.description.setText(item.getDescription());*/
    }

    @Override
    public int getItemViewType(int position) {
        return getItem(position).getType();
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int type) {
        if (type == 1) {
            return new MyViewHolder(inflateItemView(viewGroup, cn.edu.zafu.base.R.layout.item1));
        } else {
            return new MyViewHolder(inflateItemView(viewGroup, cn.edu.zafu.base.R.layout.item));
        }

    }

    public class MyViewHolder extends BaseRecyclerViewAdapter.SparseArrayViewHolder {

        public MyViewHolder(View itemView) {
            super(itemView);
        }


    }

}
