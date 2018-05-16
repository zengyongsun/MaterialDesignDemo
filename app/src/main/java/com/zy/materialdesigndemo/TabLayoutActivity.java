package com.zy.materialdesigndemo;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * https://blog.csdn.net/u013378580/article/details/51555561
 *
 * app:tabMode="fixed" 单独的显示，tab过多的时候需要用 app:tabMode="scrollable" 滚动
 * <p>
 * app:layout_scrollFlags="scroll|enterAlways"  CoordinatorLayout 的关联滚动
 * <p>
 * 选择手动控制 TabLayout，或者让它和 ViewPager 一起工作，自动调用 setupWithViewPager(...)
 * <p>
 * ScrollView 没有被设计成与 CoordinatorLayout 协同工作(又来)。你需要另一个 view：NestedScrollView
 * <p>
 * ListView 类也是和 CoordinatorLayout 不能协同工作的。只有 RecyclerView 可以
 */
public class TabLayoutActivity extends AppCompatActivity {

    @BindView(R.id.toolbar) Toolbar toolbar;
    @BindView(R.id.tabLayout) TabLayout tabLayout;
    @BindView(R.id.appBarLayout) AppBarLayout appBarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);
        ButterKnife.bind(this);
        initUI();
    }

    private void initUI() {
        tabLayout.addTab(tabLayout.newTab().setText("tab 1"));
        tabLayout.addTab(tabLayout.newTab().setText("tab 2"));
        tabLayout.addTab(tabLayout.newTab().setText("tab 3"));

    }
}
