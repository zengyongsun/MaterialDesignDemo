package com.zy.materialdesigndemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Toolbar + DrawerLayout 的组合使用
 */
public class MainActivity extends AppCompatActivity {

    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.appBarLayout)
    AppBarLayout appBarLayout;
    @BindView(R.id.drawerLayout)
    DrawerLayout drawerLayout;
    @BindView(R.id.floatingButton)
    FloatingActionButton floatingButton;
    @BindView(R.id.coordinatorLayout)
    CoordinatorLayout coordinatorLayout;
    @BindView(R.id.rootView)
    ConstraintLayout rootView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawerLayout, toolbar, R.string.navigation_drawer_open,
                R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

    }

    @OnClick(R.id.floatingButton)
    public void onClick() {
        Snackbar.make(rootView, "Hello,I am SnackBar!", Snackbar.LENGTH_SHORT)
                .setAction("撤销", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "点击了撤销", Toast.LENGTH_SHORT).show();
                    }
                }).show();

    }


    @OnClick(R.id.goToToolbar)
    public void onGoToToolbarClicked() {
        Intent intent = new Intent(MainActivity.this, ToolBarActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.goToTransition)
    public void onGoToTransitionClicked() {
        Intent intent = new Intent(MainActivity.this, TransitionActivity.class);
        startActivity(intent);
    }
}
