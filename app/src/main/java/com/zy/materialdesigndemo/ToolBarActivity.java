package com.zy.materialdesigndemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * toolbar的基础使用
 */
public class ToolBarActivity extends AppCompatActivity {

    @BindView(R.id.tvTitle)
    TextView tvTitle;
    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tool_bar);
        ButterKnife.bind(this);

        tvTitle.setText("ToolBarActivity");

        toolbar.inflateMenu(R.menu.main_menu_layout);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.item_0:
                        Intent intent = new Intent(ToolBarActivity.this, TabLayoutActivity.class);
                        startActivity(intent);
                        break;
                    case R.id.item_1:
                        Intent intent1 = new Intent(ToolBarActivity.this, TabToolBarLayout.class);
                        startActivity(intent1);
                        break;
                    case R.id.item_2:
                        Toast.makeText(ToolBarActivity.this, "item_2", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.item_3:
                        Toast.makeText(ToolBarActivity.this, "item_3", Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });
    }
}
