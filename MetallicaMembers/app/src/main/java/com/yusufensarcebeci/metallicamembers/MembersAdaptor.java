package com.yusufensarcebeci.metallicamembers;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.yusufensarcebeci.metallicamembers.databinding.RecyclerRowBinding;

import java.util.ArrayList;

public class MembersAdaptor extends RecyclerView.Adapter<MembersAdaptor.MembersHolder> {
    ArrayList<Members> membersArrayList;

    public MembersAdaptor(ArrayList<Members> membersArrayList) {
        this.membersArrayList = membersArrayList;
    }

    @NonNull
    @Override
    public MembersHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        RecyclerRowBinding recyclerRowBinding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.getContext()),parent,false);
        return new MembersHolder(recyclerRowBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull MembersHolder holder, int position) {

        holder.binding.recyclerViewTextView.setText(membersArrayList.get(position).name);
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(),DetailsActivity.class);

                Singleton singleton =  Singleton.getInstance();
                singleton.setSelectedMembers(membersArrayList.get(position));
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                holder.itemView.getContext().startActivity(intent);

            }
        });
    }

    @Override
    public int getItemCount() {
        return membersArrayList.size();
    }

    public class MembersHolder extends RecyclerView.ViewHolder{

        private RecyclerRowBinding binding;

        public MembersHolder(RecyclerRowBinding binding) {
            super(binding.getRoot());
            this.binding=binding;
        }
    }
}
