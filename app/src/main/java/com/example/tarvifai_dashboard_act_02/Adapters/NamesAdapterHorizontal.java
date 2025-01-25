package com.example.tarvifai_dashboard_act_02.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tarvifai_dashboard_act_02.R;

import java.util.List;

public class NamesAdapterHorizontal extends RecyclerView.Adapter<NamesAdapterHorizontal.namesViewHolder> {

    private List<String> nameList;

    public NamesAdapterHorizontal(List<String> imageList) {
        this.nameList = imageList;
    }

    @Override
    public namesViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.tags, parent, false);
        return new NamesAdapterHorizontal.namesViewHolder(view);
    }



    @Override
    public void onBindViewHolder(NamesAdapterHorizontal.namesViewHolder holder, int position) {
        holder.name.setText(nameList.get(position));
    }

    @Override
    public int getItemCount() {
        return nameList.size();
    }

    public static class namesViewHolder extends RecyclerView.ViewHolder {
        TextView name;
        public namesViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.tags);
        }
    }
}
