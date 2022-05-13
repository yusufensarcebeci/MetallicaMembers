package com.yusufensarcebeci.metallicamembers;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.yusufensarcebeci.metallicamembers.databinding.ActivityDetailsBinding;
import com.yusufensarcebeci.metallicamembers.databinding.ActivityMainBinding;

public class DetailsActivity extends AppCompatActivity {

    private ActivityDetailsBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Singleton singleton = Singleton.getInstance();
        Members selectedMembers = singleton.getSelectedMembers();

        binding.nameText.setText(selectedMembers.name);
        binding.positionText.setText(selectedMembers.position);
        binding.yearText.setText(selectedMembers.born);
        binding.personalText.setText(selectedMembers.info);
        binding.imageView.setImageResource(selectedMembers.image);
    }
}