package com.example.continentcountry;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.continentcountry.databinding.ItemMixBinding;

import java.util.ArrayList;

public class AdapterMix extends RecyclerView.Adapter<AdapterMix.MixViewHolder> {
    private Onclick onclick;
    private ArrayList<ModelMix> arrayList;

    public AdapterMix(Onclick onclick, ArrayList<ModelMix> arrayList) {
        this.onclick = onclick;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public MixViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemMixBinding binding = ItemMixBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new MixViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MixViewHolder holder, int position) {
        holder.bind(arrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    protected class MixViewHolder extends RecyclerView.ViewHolder{
        private ItemMixBinding binding;
        public MixViewHolder(@NonNull ItemMixBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

        public void bind(ModelMix modelMix) {
            binding.flagMix.setImageResource(modelMix.getImageMIx());
            binding.nameMix.setText(modelMix.getNameMix());
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    onclick.click(modelMix);
                }
            });
        }
    }
}
