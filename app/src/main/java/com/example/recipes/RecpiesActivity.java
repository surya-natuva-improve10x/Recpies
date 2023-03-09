package com.example.recipes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class RecpiesActivity extends AppCompatActivity {
    public RecipeItem[] recipeItems;
    ListView recipeLv;
    public RecpieItemAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recpies);
        initViews();
        createRecpieData();
        setupAdapter();
        connectAdapter();
    }

    private void connectAdapter() {
        recipeLv.setAdapter(adapter);
    }

    private void setupAdapter() {
        adapter = new RecpieItemAdapter(this, android.R.layout.simple_dropdown_item_1line,recipeItems);
    }

    private void createRecpieData() {
        recipeItems = new RecipeItem[6];
        RecipeItem item1 = new RecipeItem();
        item1.name ="Crunchy Croissants";
        item1.imageUrl ="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRJIgdbzKGF_AT0In3EY8sBiAEFOapytpBOYg&usqp=CAU";
        item1.descripation = "Buttery, flaky pastry named for its crescent shape.";
        item1.serialNo = "01";
        recipeItems[0] = item1;

        RecipeItem item2 = new RecipeItem();
        item2.name = "Grilled Eggplant";
        item2.imageUrl = "https://cookingontheweekends.com/wp-content/uploads/2014/06/June-1-Herb-Grilled-Elephant-Garlic-Recipe1.jpg";
        item2.descripation = "Tender with a rich, complex flavor when cooked";
        item2.serialNo = "02";
        recipeItems[1]=item2;

        RecipeItem item3 = new RecipeItem();
        item3.name = "Flour from scratch";
        item3.imageUrl = "https://www.sufficientself.com/attachments/immo-wegmann-8cyl4wgzsq4-unsplash-jpg.18697/";
        item3.descripation = "Grind grains, nuts, or beans in your coffeegrinder";
        item3.serialNo = "03";
        recipeItems[2]=item3;

        RecipeItem item4 = new RecipeItem();
        item4.name = "Tangerine Salad";
        item4.imageUrl = "https://thedinnerbell.recipes/wp-content/uploads/2020/06/Spinach-Salad-with-Mandarin-Oranges-4.jpg";
        item4.descripation = "Peak tangerine season lasts from autumn to spring";
        item4.serialNo = "04";
        recipeItems[3]=item4;

        RecipeItem item5 = new RecipeItem();
        item5.name = "Pomegranate Juice";
        item5.imageUrl = "https://www.verywellhealth.com/thmb/ma6xLUqQNYhLJkn9ut40Z2madrM=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc()/pomegranate-2cb572289dc44d08a97e33b32df8b967.jpg";
        item5.descripation = "A superfood for good skin, hair, and health";
        item5.serialNo = "05";
        recipeItems[4]=item5;

        RecipeItem item6 = new RecipeItem();
        item6.name = "Chili Salsa";
        item6.imageUrl = "https://www.muydelish.com/wp-content/uploads/2022/01/easy-salsa-recipe-480x270.jpg";
        item6.descripation = "Heat up any taco night with minimal preparation";
        item6.serialNo = "06";
        recipeItems[5]=item6;
    }

    private void initViews() {
        recipeLv = findViewById(R.id.recipe_lv);
    }
}