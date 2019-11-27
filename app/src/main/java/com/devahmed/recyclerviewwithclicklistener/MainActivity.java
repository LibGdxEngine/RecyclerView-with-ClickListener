package com.devahmed.recyclerviewwithclicklistener;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //recyclerView object
    RecyclerView recyclerView;

    //Object of my adapter
    AnimalsAdapter animalsAdapter;

    //list of animal to send it to adapter
    List<Animal> animalList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //initialize every thing first
        animalList = new ArrayList<>();
        //add animals to our animalsList
        animalList.add(new Animal("Elephant" , R.drawable._1));
        animalList.add(new Animal("Panda" , R.drawable._2));
        animalList.add(new Animal("Cow" , R.drawable._3));
        animalList.add(new Animal("Frog" , R.drawable._4));
        animalList.add(new Animal("Sheep" , R.drawable._5));
        animalList.add(new Animal("Tiger" , R.drawable._6));
        animalList.add(new Animal("Bamboo" , R.drawable._7));
        animalList.add(new Animal("Monkey" , R.drawable._8));
        animalList.add(new Animal("Lion" , R.drawable._9));
        animalList.add(new Animal("Dog" , R.drawable._10));
        animalList.add(new Animal("Cat" , R.drawable._11));
        animalList.add(new Animal("Zebra" , R.drawable._12));

        //initialize the adapter with list of animals
        animalsAdapter = new AnimalsAdapter(animalList);

        recyclerView = findViewById(R.id.recycler);
        //set recycler layout manager to decide it will scroll vertically or horizontally
        //add linear layout  manager to make it vertical
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //add our adapter to the recyclerView to start showing items
        recyclerView.setAdapter(animalsAdapter);




    }
}
