package com.lawlett.guessstudent.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.lawlett.guessstudent.R;

import java.util.ArrayList;

public class LevelAdapter extends RecyclerView.Adapter<LevelAdapter.LevelViewHolder> {
    ArrayList<String> levelList;
    ChooseLevelClick listener;

    public LevelAdapter(ArrayList<String> levelList,ChooseLevelClick listener) {
        this.levelList = levelList;
        this.listener=listener;
    }

    @NonNull
    @Override
    public LevelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new LevelViewHolder(LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_level, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull LevelViewHolder holder, int position) {
        holder.onBind(levelList.get(position));
    }

    @Override
    public int getItemCount() {
        return levelList.size();
    }

    public class LevelViewHolder extends RecyclerView.ViewHolder {
        Button button;

        public LevelViewHolder(@NonNull View itemView) {
            super(itemView);
            button = itemView.findViewById(R.id.level_btn);
            button.setOnClickListener(view -> listener.onItemClick(getAdapterPosition()));
        }

        public void onBind(String level) {
            button.setText(level);
        }
    }

   public interface ChooseLevelClick {
        void onItemClick(int position);
    }
}
