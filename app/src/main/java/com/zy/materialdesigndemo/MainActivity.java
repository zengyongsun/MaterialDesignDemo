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
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.toolbar) Toolbar toolbar;
    @BindView(R.id.appBarLayout) AppBarLayout appBarLayout;
    @BindView(R.id.drawerLayout) DrawerLayout drawerLayout;
    @BindView(R.id.floatingButton) FloatingActionButton floatingButton;
    @BindView(R.id.coordinatorLayout) CoordinatorLayout coordinatorLayout;
    @BindView(R.id.rootView) ConstraintLayout rootView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        toolbar.inflateMenu(R.menu.main_menu_layout);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.item_0:
                        Intent intent = new Intent(MainActivity.this, TabLayoutActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.item_1:
                        Intent intent1 = new Intent(MainActivity.this, TabToolBarLayout.class);
                        startActivity(intent1);
                        break;
                    case R.id.item_2:
                        Toast.makeText(MainActivity.this, "item_2", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.item_3:
                        Toast.makeText(MainActivity.this, "item_3", Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
            this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
        Log.d("MainActivity", "onCreate()调用");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity", "onStart()调用");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity", "onResume()调用");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity", "onStop()调用");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MainActivity", "onRestart()调用");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity", "onDestroy()调用");
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
}
