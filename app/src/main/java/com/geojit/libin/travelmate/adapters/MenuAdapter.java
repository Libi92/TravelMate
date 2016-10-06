package com.geojit.libin.travelmate.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.geojit.libin.travelmate.R;
import com.geojit.libin.travelmate.components.TMTextView;
import com.geojit.libin.travelmate.models.MenuModel;

import java.util.List;

/**
 * Created by 10945 on 10/6/2016.
 */

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder> {

    List<MenuModel> data;

    public MenuAdapter(List<MenuModel> data) {
        this.data = data;
    }

    @Override
    public MenuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_menu, parent, false);
        return new MenuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MenuViewHolder holder, int position) {
        MenuModel model = data.get(position);

        holder.textViewItem.setText(model.getTitle());
        holder.imageViewItem.setImageDrawable(model.getImage());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MenuViewHolder extends RecyclerView.ViewHolder {

        private TMTextView textViewItem;
        private ImageView imageViewItem;

        public MenuViewHolder(View itemView) {
            super(itemView);
            textViewItem = (TMTextView) itemView.findViewById(R.id.textViewItem);
            imageViewItem = (ImageView) itemView.findViewById(R.id.imageViewItem);
        }
    }
}
