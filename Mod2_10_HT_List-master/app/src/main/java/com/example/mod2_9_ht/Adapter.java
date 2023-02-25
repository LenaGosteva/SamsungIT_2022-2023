package com.example.mod2_9_ht;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

class New{
    public String likes;
    public String text;
    public int idImage, l;


    public New(String text, int idImage, int likes){
        this.text = text;
        this.idImage = idImage;
        l = likes;
        this.likes = String.valueOf(likes);
    }
}
public class Adapter extends RecyclerView.Adapter<Adapter.NewViewHolder>{
    ArrayList<New> list;
    Context context;


    public Adapter(ArrayList<New> news, Context context) {
        this.list = news;
        this.context = context;
    }

    @NonNull
    @Override
    public Adapter.NewViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,  parent, false);
        NewViewHolder c = new NewViewHolder(view);
        return c;
    }

    @Override
    public void onBindViewHolder(Adapter.NewViewHolder holder, int position) {
        holder.textView.setText(list.get(position).text);
        holder.imageView.setImageResource(list.get(position).idImage);
        holder.count.setText(list.get(position).likes);
        holder.like.setOnClickListener(n -> {

            if (holder.like.isChecked()) {
                list.get(position).l += 1;
                list.get(position).likes = String.valueOf(list.get(position).l);
                holder.count.setText(list.get(position).likes);
            }
            if (!holder.like.isChecked()) {
                list.get(position).l -= 1;
                list.get(position).likes = String.valueOf(list.get(position).l);
                holder.count.setText(list.get(position).likes);
            }
        });

        holder.comm.setOnClickListener(co -> {
            if (holder.comm.isClickable()) {
                Intent intent = new Intent(context, Comment.class);
                intent.putExtra("NAME", holder.textView.getText());
                context.startActivity(intent);
            }
        });

        holder.take.setOnClickListener(t -> {
            Toast.makeText(context, "Вы поделились с вселенной новостью '" + list.get(position).text + "'", Toast.LENGTH_SHORT).show();
        });

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class NewViewHolder extends RecyclerView.ViewHolder{
        ImageView imageView;
        TextView textView, count;
        Button comm, take;
        ToggleButton like;
        public NewViewHolder(View itemView) {
            super(itemView);
            like = itemView.findViewById(R.id.like);
            comm = itemView.findViewById(R.id.putComm);
            take = itemView.findViewById(R.id.take);
            count = itemView.findViewById(R.id.count);
            textView = itemView.findViewById(R.id.name);
            imageView = itemView.findViewById(R.id.image);
        }
    }

}
