package com.example.contactrecycleview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    ArrayList aryImg,aryName,aryNum;
    Context context;

    public Adapter(ArrayList aryImg, ArrayList aryName, ArrayList aryNum, Context context) {
        this.aryImg = aryImg;
        this.aryName = aryName;
        this.aryNum = aryNum;
        this.context = context;
    }

    @NonNull
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        Adapter.ViewHolder viewHolder=new Adapter.ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, int position) {
        int r=(int) aryImg.get(position);
        holder.images.setImageResource(r);
        holder.text.setText((String) aryName.get(position));
        holder.num.setText((String) aryNum.get(position));
    }

    @Override
    public int getItemCount() {
        return aryImg.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        ImageView images;
        TextView text;
        TextView num;

        public ViewHolder(View view){
            super(view);
            images =(ImageView) view.findViewById(R.id.courseImg);
            text=(TextView) view.findViewById(R.id.courseName);
            num=(TextView) view.findViewById(R.id.courseNum);
        }
    }
}
