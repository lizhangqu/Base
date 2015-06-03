package cn.edu.zafu.base.adapter.listener;

import android.view.View;

/**
 * Created by lizhangqu on 2015/6/3.
 */
public interface OnItemLongClickListener<T> {
    void onLongClick(View view, T item);
}
