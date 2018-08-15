package com.zy.materialdesigndemo.adapter;

import android.widget.ImageView;
import android.widget.TextView;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;
import com.zy.materialdesigndemo.R;
import com.zy.materialdesigndemo.bean.TransitionBean;

/**
 * @author : Zeyo
 * e-mail : zengyongsun@163.com
 * date   : 2018/8/1416:04
 * desc   :
 * version: 1.0
 */
public class TransitionAdapter extends BaseQuickAdapter<TransitionBean, BaseViewHolder> {

    public TransitionAdapter() {
        super(R.layout.adapter_transition_layout);
    }

    @Override
    protected void convert(BaseViewHolder helper, TransitionBean item) {
        ImageView imageView = helper.getView(R.id.ivImage);
        imageView.setImageResource(item.imgSrc);
        TextView textView = helper.getView(R.id.tvDes);
        textView.setText(item.content);
    }
}
