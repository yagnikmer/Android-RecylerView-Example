package com.mer.recylerviewex;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MyRecylerAdapter extends RecyclerView.Adapter<MyRecylerAdapter.MyViewHolder> {

    ArrayList<String> list;

    public MyRecylerAdapter(ArrayList<String> list) {
        this.list = list;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());
        View view = inflater.inflate(R.layout.items, viewGroup, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder myViewHolder, int i) {
        myViewHolder.tvview.setText(list.get(i));
        Log.d("AppFlow", list.get(i));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder {
        TextView tvview;

        public MyViewHolder(View itemView) {
            super(itemView);
            tvview = itemView.findViewById(R.id.tvview);
        }
    }
}
