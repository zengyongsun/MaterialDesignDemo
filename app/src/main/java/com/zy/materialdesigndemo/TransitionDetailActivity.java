package com.zy.materialdesigndemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.zy.materialdesigndemo.bean.TransitionBean;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TransitionDetailActivity extends AppCompatActivity {

    @BindView(R.id.ivDetail)
    ImageView ivDetail;
    @BindView(R.id.tvDesDetail)
    TextView tvDesDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition_detail);
        ButterKnife.bind(this);

        initView();
    }

    private void initView() {
        TransitionBean transitionBean = (TransitionBean) getIntent().getSerializableExtra("data");
        ivDetail.setImageResource(transitionBean.imgSrc);
        tvDesDetail.setText(transitionBean.content);
    }
}
