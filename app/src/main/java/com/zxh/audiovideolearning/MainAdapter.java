package com.zxh.audiovideolearning;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.MainViewHolder> {
    private ArrayList<String> datas;
    private ItemClickListener listener;
    public MainAdapter(ArrayList<String> datas) {
        this.datas = datas;
    }

    @NonNull
    @Override
    public MainViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_main, parent, false);
        return new MainViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainViewHolder holder, final int position) {
        holder.tvContent.setText(datas.get(position));
        holder.tvContent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (listener != null){
                    listener.itemClick(position);
                }
            }
        });
    }


    @Override
    public int getItemCount() {
        return datas.size();
    }


    static class MainViewHolder extends RecyclerView.ViewHolder {
        TextView tvContent;

        public MainViewHolder(@NonNull View itemView) {
            super(itemView);
            tvContent = itemView.findViewById(R.id.tv_content);
        }
    }

    interface ItemClickListener {
        void itemClick(int position);
    }

    public void setOnItemClickListener(ItemClickListener listener){
        this.listener = listener;
    }
}
