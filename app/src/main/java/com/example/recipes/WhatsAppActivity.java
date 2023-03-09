package com.example.recipes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class WhatsAppActivity extends AppCompatActivity {
    public WhatsappItem[] whatsappItems;
    ListView whatsappLv;
    public WhatsAppAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whats_app);
        initViews();
        createWhatsAppData();
        setupAdapter();
        connectAdapter();
    }

    private void connectAdapter() {
        whatsappLv.setAdapter(adapter);
    }

    private void setupAdapter() {
        adapter = new WhatsAppAdapter(whatsappItems);
    }

    private void createWhatsAppData() {
        whatsappItems = new WhatsappItem[6];
        WhatsappItem item1 = new WhatsappItem();
        item1.imageUrl1="https://cdn-icons-png.flaticon.com/256/4825/4825112.png";
        item1.heading1="bhemma";
        item1.disc="had your lunch";
        item1.timeAndDay="2:00pm";
        item1.unReadMessage ="hii";
        whatsappItems[0]=item1;


        WhatsappItem item2 = new WhatsappItem();
        item2.imageUrl1="https://cdn-icons-png.flaticon.com/256/4825/4825112.png";
        item2.heading1="Whitmans Chat";
        item2.disc="Ned: Yeah,I think I know what....";
        item2.timeAndDay="11:45 AM";
        item2.unReadMessage ="3";
        whatsappItems[1]=item2;


        WhatsappItem item3 = new WhatsappItem();
        item3.imageUrl1="https://cdn-icons-png.flaticon.com/256/4825/4825112.png";
        item3.heading1="jhon ";
        item3.disc="thanks you";
        item3.timeAndDay="1:00Am";
        item3.unReadMessage ="1";
        whatsappItems[2]=item3;


        WhatsappItem item4 = new WhatsappItem();
        item4.imageUrl1="https://cdn-icons-png.flaticon.com/256/4825/4825112.png";
        item4.heading1="willams";
        item4.disc="hey whats app";
        item4.timeAndDay="12:45Pm";
        item4.unReadMessage ="4";
        whatsappItems[3]=item4;


        WhatsappItem item5 = new WhatsappItem();
        item5.imageUrl1="https://cdn-icons-png.flaticon.com/256/4825/4825112.png";
        item5.heading1="alice";
        item5.disc="how are you dude";
        item5.timeAndDay="11:45Am";
        item5.unReadMessage ="3";
        whatsappItems[4]=item5;


        WhatsappItem item6 = new WhatsappItem();
        item6.imageUrl1="https://cdn-icons-png.flaticon.com/256/4825/4825112.png";
        item6.heading1="jack";
        item6.disc="where are you man";
        item6.timeAndDay="Yesterday";
        item6.unReadMessage ="4";
        whatsappItems[5]=item6;
    }

    private void initViews() {
        whatsappLv = findViewById(R.id.whatsapp_lv);
    }
}