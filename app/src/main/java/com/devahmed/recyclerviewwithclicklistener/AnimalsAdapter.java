package com.devahmed.recyclerviewwithclicklistener;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AnimalsAdapter extends RecyclerView.Adapter<AnimalsAdapter.ViewHolder> {

    private List<Animal> AnimalsList;

    //adapter constructor that takes list of animals to show it
    public AnimalsAdapter(List<Animal> AnimalsList) {
        this.AnimalsList = AnimalsList;
    }

    //creating each row by inflating (convert from XML to java ) the views and return a viewHolder object of this row
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.animal_row_item, parent, false);

        return new ViewHolder(itemView);
    }

    //binding (Adding) data to views
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Animal animal = AnimalsList.get(position);
        holder.animalImageView.setImageResource(animal.getImage());
        holder.animalName.setText(animal.getName());
    }

    //Return the number of items that recycler has to show is very important
    @Override
    public int getItemCount() {
        return AnimalsList.size();
    }

    //viewHolder is just responsible on holding Views and linking it to its XML by findViewById() Fn
    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView animalImageView;
        TextView animalName;
        LinearLayout container;
        public ViewHolder(View view) {
            super(view);
            container = view.findViewById(R.id.container);
            animalImageView = view.findViewById(R.id.animalImageView);
            animalName = view.findViewById(R.id.animalName);

            //Add the onClickListeners here in the ViewHolder constructor
            container.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(v.getContext() , Main2Activity.class);
                    Toast.makeText(v.getContext(), "You clicked on " + AnimalsList.get(getLayoutPosition()).getName() , Toast.LENGTH_SHORT).show();
                    v.getContext().startActivity(intent);
                }
            });
        }
    }
}