package com.example.continentcountry;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.continentcountry.databinding.FragmentContinentsBinding;

import java.util.ArrayList;

public class ContinentsFragment extends Fragment implements Onclick {
    private FragmentContinentsBinding binding;
    private ArrayList<ModelMix> arrayList;
    private AdapterMix adapterMix;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentContinentsBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        loadData();
        adapterMix = new AdapterMix(this, arrayList);
        binding.recyclerView.setAdapter(adapterMix);
    }

    private void loadData() {
        arrayList = new ArrayList<>();
        arrayList.add(new ModelMix(R.drawable.continent1, "Евразия"));
        arrayList.add(new ModelMix(R.drawable.continent2, "Северная Америка"));
        arrayList.add(new ModelMix(R.drawable.continent3, "Европа"));
        arrayList.add(new ModelMix(R.drawable.continent4, "Австралия"));
        arrayList.add(new ModelMix(R.drawable.continent5, "Антарктида"));
        arrayList.add(new ModelMix(R.drawable.continent6, "Азия"));
    }

    @Override
    public void click(ModelMix modelMix) {
        Bundle bundle = new Bundle();
        bundle.putString("key", modelMix.getNameMix());
        Fragment fragment = new CountryFragment();
        fragment.setArguments(bundle);
        requireActivity()
                .getSupportFragmentManager()
                .beginTransaction()
                .addToBackStack(null)
                .replace(R.id.container_main, fragment)
                .commit();
    }
}