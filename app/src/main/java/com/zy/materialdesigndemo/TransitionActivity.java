package com.zy.materialdesigndemo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.transition.Explode;
import android.transition.Fade;
import android.view.View;

import com.chad.library.adapter.base.BaseQuickAdapter;
import com.zy.materialdesigndemo.adapter.TransitionAdapter;
import com.zy.materialdesigndemo.bean.TransitionBean;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TransitionActivity extends AppCompatActivity {

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    @BindView(R.id.rootView)
    ConstraintLayout rootView;
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transition);
        ButterKnife.bind(this);
        mContext = this;
        initView();
    }

    private void initView() {
        getWindow().setEnterTransition(new Fade());
        getWindow().setEnterTransition(new Fade());
        recyclerView.setLayoutManager(new GridLayoutManager(mContext, 2));
        TransitionAdapter adapter = new TransitionAdapter();
        recyclerView.setAdapter(adapter);
        adapter.setNewData(initData());
        adapter.setOnItemClickListener(new BaseQuickAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(BaseQuickAdapter adapter, View view, int position) {
                TransitionBean transitionBean = (TransitionBean) adapter.getItem(position);
                Intent intent = new Intent(mContext, TransitionDetailActivity.class);
                intent.putExtra("data", transitionBean);

                ActivityOptionsCompat optionsCompat = ActivityOptionsCompat
                        .makeSceneTransitionAnimation(TransitionActivity.this, view.findViewById(R.id.ivImage),
                                "image");
                startActivity(intent, optionsCompat.toBundle());
            }
        });
    }

    private List<TransitionBean> initData() {
        List<TransitionBean> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new TransitionBean(R.mipmap.ic_launcher,
                    "不同活动或片段的过渡是进入和退出动画,视图层次结构彼此独立的转换" + i));
        }
        return list;
    }

}
