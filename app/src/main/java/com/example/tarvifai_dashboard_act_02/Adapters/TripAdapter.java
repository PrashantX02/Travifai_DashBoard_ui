package com.example.tarvifai_dashboard_act_02.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tarvifai_dashboard_act_02.Models.TripModel;
import com.example.tarvifai_dashboard_act_02.R;

import java.util.List;

public class TripAdapter extends RecyclerView.Adapter<TripAdapter.TripViewHolder> {
    private Context context;
    private List<TripModel> tripList;

    public TripAdapter(Context context, List<TripModel> tripList) {
        this.context = context;
        this.tripList = tripList;
    }

    @NonNull
    @Override
    public TripViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.mytripcard, parent, false);
        return new TripViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TripViewHolder holder, int position) {
        TripModel trip = tripList.get(position);

        holder.yearText.setText(trip.getYear());
        holder.imageView.setImageResource(trip.getImage());
        holder.titleText.setText(trip.getTitle());
        holder.destinationText.setText(trip.getDestination());
        holder.dateText.setText(trip.getDateRange());
    }

    @Override
    public int getItemCount() {
        return tripList.size();
    }

    public static class TripViewHolder extends RecyclerView.ViewHolder {
        TextView yearText, titleText, destinationText, dateText;
        ImageView imageView;

        public TripViewHolder(@NonNull View itemView) {
            super(itemView);
            yearText = itemView.findViewById(R.id.textView29);
            imageView = itemView.findViewById(R.id.cardView5);
            titleText = itemView.findViewById(R.id.textView30);
            destinationText = itemView.findViewById(R.id.textView31);
            dateText = itemView.findViewById(R.id.textView33);
        }
    }
}
