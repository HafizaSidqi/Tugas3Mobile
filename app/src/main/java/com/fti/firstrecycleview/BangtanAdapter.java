package com.fti.firstrecycleview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class BangtanAdapter extends RecyclerView.Adapter<BangtanAdapter.ViewHolder> {

    private MainActivity context;
    private ArrayList<MemberModel> memberModels;

    public BangtanAdapter(MainActivity context) {
        this.context = context;
    }
    public ArrayList<MemberModel> getMemberModels() {
        return memberModels;
    }

    public void setMemberModels(ArrayList<MemberModel> memberModels) {
        this.memberModels = memberModels;
    }


    @NonNull
    @Override
    public BangtanAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View itemRow = LayoutInflater.from(viewGroup.getContext()) .
                inflate(R.layout.member, viewGroup, false);
        return new ViewHolder(itemRow);
    }

    @Override
    public void onBindViewHolder(@NonNull BangtanAdapter.ViewHolder viewHolder, int i) {
        Glide.with(context).load(getMemberModels() .get(i).getFotoMember()) . into(viewHolder.ivFotoMember);
    }

    @Override
    public int getItemCount() {
        return getMemberModels().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView ivFotoMember;
        private TextView tvNamaMember;
        public ViewHolder (@NonNull View itemView) {
            super(itemView);
            ivFotoMember = itemView.findViewById(R.id.foto);
            tvNamaMember = itemView.findViewById(R.id.nama);
        }
    }
}
