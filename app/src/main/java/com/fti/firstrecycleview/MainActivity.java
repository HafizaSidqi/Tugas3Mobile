package com.fti.firstrecycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btnShare, btnReview;
    private RecyclerView rvMember;
    private ArrayList<MemberModel> listMember = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvMember = findViewById(R.id.rv_member);
        rvMember.setHasFixedSize(true);
        listMember.addAll(BangtanData.getListData());
        btnShare = findViewById(R.id.share);
        btnReview = findViewById(R.id.review);
        btnReview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveWithDataIntent = new Intent(MainActivity.this, Tujuan.class);
                startActivity(moveWithDataIntent);
            }
        });


        showRecyclerList();
    }

    private void showRecyclerList() {
        rvMember.setLayoutManager(new LinearLayoutManager(this));
        BangtanAdapter bangtanAdapter = new BangtanAdapter(this);
        bangtanAdapter.setMemberModels(listMember);
        rvMember.setAdapter(bangtanAdapter);
    }


}