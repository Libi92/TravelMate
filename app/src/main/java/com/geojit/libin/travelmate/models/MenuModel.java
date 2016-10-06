package com.geojit.libin.travelmate.models;

import android.content.Context;
import android.graphics.drawable.Drawable;

import com.geojit.libin.travelmate.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 10945 on 10/6/2016.
 */

public class MenuModel {
    private static Context mContext;
    private String title;
    private Drawable image;

    private MenuModel(String title, String icon) {
        this.title = title;
        if (mContext != null) {
            int id = mContext.getResources().getIdentifier(icon, "mipmap", mContext.getPackageName());
            this.image = mContext.getResources().getDrawable(id);
        }
    }

    public static List<MenuModel> getMenu(Context context) {
        mContext = context;

        String[] menu = mContext.getResources().getStringArray(R.array.menu);
        String[] menu_icon = mContext.getResources().getStringArray(R.array.menu_icon);

        return createList(menu, menu_icon);
    }

    private static List<MenuModel> createList(String[] menu, String[] menuIcons) {
        List<MenuModel> menulList = new ArrayList<>();

        int limit = menu.length > menuIcons.length ? menuIcons.length : menu.length;

        for (int i = 0; i < limit; i++) {
            menulList.add(new MenuModel(menu[i], menuIcons[i]));
        }

        return menulList;
    }

    public String getTitle() {
        return title;
    }

    public Drawable getImage() {
        return image;
    }
}
