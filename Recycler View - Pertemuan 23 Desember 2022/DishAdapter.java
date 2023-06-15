package com.aguspribadi.gelato;

import android.media.Image;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DishAdapter extends RecyclerView.Adapter {

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class DishViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView nameTextView, quantityTextView;
        Button addButton, subsButton;

        public DishViewHolder() {@NonNull View itemView;{
            super(itemView);
            imageView = itemView.findViewById(R.id.imageView);
            nameTextView = itemView.findViewById(R.id.nameTextView);
            quantityTextView = itemView.findViewById(R.id.quantityTextView);
            subsButton = itemView.findViewById(R.id.subs_button);
            addButton = itemView.findViewById(R.id.add_button);

        }
        }
    }
}
