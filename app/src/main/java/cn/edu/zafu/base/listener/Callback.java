package cn.edu.zafu.base.listener;

/**
 * Created by lizhangqu on 2015/6/4.
 */
public interface Callback<T> {
    void onSuccess(T t);

    void onFailure(T t);
}
