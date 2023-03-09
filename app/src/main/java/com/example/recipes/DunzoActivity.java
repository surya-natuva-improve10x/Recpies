package com.example.recipes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class DunzoActivity extends AppCompatActivity {
    public  DunzoItem[] dunzoItems;
    public DunzoAdapter adapter;
    GridView dunzoGv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dunzo);
        initViews();
        createDunzoItem();
        setupAdapter();
        connectAdapter();
    }

    private void connectAdapter() {
        dunzoGv.setAdapter(adapter);
    }

    private void setupAdapter() {
        adapter = new DunzoAdapter(this, android.R.layout.simple_dropdown_item_1line,dunzoItems);
    }

    private void createDunzoItem() {
        dunzoItems = new DunzoItem[13];
        DunzoItem item1 = new DunzoItem();
        item1.discount = "Up To" +
                " 30% OFF";
        item1.imageUrlD ="https://www.modernfoods.co.in/wp-content/uploads/2021/04/bakers-loaf-milk-bread-main-product.png";
        item1.product = "BreakFast & " +
                "Dairy";
        dunzoItems[0]=item1;


        DunzoItem item2 = new DunzoItem();
        item2.discount = "Up To " +
                "30% OFF";
        item2.imageUrlD = "https://cdn.shopify.com/s/files/1/0038/9405/0868/products/Artichoke_GreenGlobe_Fruit_512x.jpg?v=1584556992";
        item2.product = "Vegtables &" +
                "Herbs";
        dunzoItems[1]=item2;

        DunzoItem item3 = new DunzoItem();
        item3.discount = "Up To " +
                "30% OFF";
        item3.imageUrlD = "https://cdn.shopify.com/s/files/1/0518/4618/5115/products/Fruit-box-square_6131w.jpg?v=1610341013";
        item3.product = "Fresh Fruits";
        dunzoItems[2]=item3;

        DunzoItem item4 = new DunzoItem();
        item4.discount = "Up To " +
                "30% OFF";
        item4.imageUrlD = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSPeNMkhbQswaTHBkko9Zhi4RqFdJJ28cMd-DsbjHRvd55GPa_vy7rvuexLrYTK88OCH5U&usqp=CAU";
        item4.product = "Provisions";
        dunzoItems[3]=item4;


        DunzoItem item5 = new DunzoItem();
        item5.discount = "Up To " +
                "30% OFF";
        item5.imageUrlD = "https://assets.production.decovostatic.com/cdn-cgi/image/format=auto,metadata=copyright,width=400/a0eb1b42-de07-43f6-a485-1c9c04c45740_family-favorites-stock-up.jpg";
        item5.product = "Snacks &" +
                "Bevarages";
        dunzoItems[4]=item5;

        DunzoItem item6 = new DunzoItem();
        item6.discount = "Up To " +
                "30% OFF";
        item6.imageUrlD = "https://www.alsothecrumbsplease.com/wp-content/uploads/2020/11/Banana-Bundt-Cake-24.jpg";
        item6.product = "Chocolates" +
                "& Desserts";
        dunzoItems[5]=item6;

        DunzoItem item7 = new DunzoItem();
        item7.discount = "Up To " +
                "30% OFF";
        item7.imageUrlD = "https://m.media-amazon.com/images/I/61HrvAWcstL._SX466_.jpg";
        item7.product = "Instant Foods";
        dunzoItems[6]=item7;

        DunzoItem item8 = new DunzoItem();
        item8.discount = "Up To " +
                "30% OFF";
        item8.imageUrlD = "https://hips.hearstapps.com/vader-prod.s3.amazonaws.com/1586165388-10281920.jpg";
        item8.product = "Baby & " +
                "Selfcare";
        dunzoItems[7]=item8;

        DunzoItem item9 = new DunzoItem();
        item9.discount = "Up To " +
                "30% OFF";
        item9.imageUrlD = "https://cdn.shopaccino.com/refresh/categories/toilet-cleaner-179125_s.jpg";
        item9.product ="Baby & " +
                "Selfcare";
        dunzoItems[8]=item9;

        DunzoItem item10 = new DunzoItem();
        item10.discount = "Up To " +
                "30% OFF";
        item10.imageUrlD = "https://hips.hearstapps.com/hmg-prod/images/gettyimages-645249428-1553633044.jpg?crop=0.699xw:1.00xh;0.260xw,0&resize=1200:*";
        item10.product = "Home Care";
        dunzoItems[9]=item10;

        DunzoItem item11 = new DunzoItem();
        item11.discount = "Up To " +
                "30% OFF";
        item11.imageUrlD = "https://m.media-amazon.com/images/I/81vauCbU5tL._AC_SS450_.jpg";
        item11.product = "Meat";
        dunzoItems[10]=item11;

        DunzoItem item12 = new DunzoItem();
        item12.discount = "Up To " +
                "30% OFF";
        item12.imageUrlD = "https://n4.sdlcdn.com/imgs/j/i/o/Rebel-Paan-Corner-Hard-Candies-SDL787389217-1-d3fba.png";
        item12.product = "Pet care";
        dunzoItems[11]=item12;

        DunzoItem item13 = new DunzoItem();
        item13.discount = "Up To " +
                "30% OFF";
        item13.imageUrlD = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR83oRRGxqvQHH2qe23zatZL7QTdz59FnusIjCD-EBLNDBDXfwR329XYRklWDyKD1nf-hA&usqp=CAU";
        item13.product = "Paan Corner";
        dunzoItems[12]=item13;
    }

    private void initViews() {
        dunzoGv = findViewById(R.id.dunzo_gv);
        dunzoGv.setNumColumns(4);
    }
}