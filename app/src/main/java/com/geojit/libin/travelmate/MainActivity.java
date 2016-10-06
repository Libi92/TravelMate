package com.geojit.libin.travelmate;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.geojit.libin.travelmate.adapters.MenuAdapter;
import com.geojit.libin.travelmate.decorators.DividerItemDecoration;
import com.geojit.libin.travelmate.models.MenuModel;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();
        initMenu();
    }

    private void initComponents() {
        recyclerViewMenu = (RecyclerView) findViewById(R.id.recyclerViewActivities);
    }

    private void initMenu() {
        MainActivity context = MainActivity.this;
        MenuAdapter adapter = new MenuAdapter(MenuModel.getMenu(context));

        GridLayoutManager layoutManager = new GridLayoutManager(context, 3);
        recyclerViewMenu.setLayoutManager(layoutManager);

        recyclerViewMenu.addItemDecoration(new DividerItemDecoration(context, DividerItemDecoration.VERTICAL_LIST, R.drawable.main_grid_horizontal_divider));
        recyclerViewMenu.addItemDecoration(new DividerItemDecoration(context, DividerItemDecoration.HORIZONTAL_LIST, R.drawable.main_grid_horizontal_divider));

        recyclerViewMenu.setAdapter(adapter);
    }


}
