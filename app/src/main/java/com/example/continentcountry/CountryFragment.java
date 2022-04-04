package com.example.continentcountry;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.continentcountry.databinding.FragmentContinentsBinding;
import com.example.continentcountry.databinding.FragmentCountryBinding;

import java.util.ArrayList;

public class CountryFragment extends Fragment implements Onclick {
    private ArrayList<ModelMix> arrayList;
    private AdapterMix adapterMix;
    private FragmentCountryBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentCountryBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Bundle bundle = getArguments();
        String nameContinent = bundle.getString("key");
        loadData(nameContinent);
        adapterMix = new AdapterMix(this, arrayList);
        binding.recyclerView.setAdapter(adapterMix);
    }

    private void loadData(String nameContinent) {
        arrayList = new ArrayList<>();
        switch (nameContinent){
            case "Евразия":{
                arrayList.add(new ModelMix(R.drawable.kazakhstan, "Казахстан"));
                arrayList.add(new ModelMix(R.drawable.kyrgyzstan, "Кыргызстан"));
                arrayList.add(new ModelMix(R.drawable.koreya, "Корея"));
                arrayList.add(new ModelMix(R.drawable.no_name, "Без имени"));
                arrayList.add(new ModelMix(R.drawable.no_name_two, "Без имени"));
                break;
            }
            case "Северная Америка":{
                arrayList.add(new ModelMix(R.drawable.flag_1, "Без имени"));
                arrayList.add(new ModelMix(R.drawable.flag_2, "Без имени"));
                arrayList.add(new ModelMix(R.drawable.flag_3, "Без имени"));
                arrayList.add(new ModelMix(R.drawable.flag_4, "Без имени"));
                arrayList.add(new ModelMix(R.drawable.flag_5, "Без имени"));
                break;
            }
            case "Европа":{
                arrayList.add(new ModelMix(R.drawable.kazakhstan, "Казахстан"));
                arrayList.add(new ModelMix(R.drawable.kyrgyzstan, "Кыргызстан"));
                arrayList.add(new ModelMix(R.drawable.koreya, "Корея"));
                arrayList.add(new ModelMix(R.drawable.no_name, "Без имени"));
                arrayList.add(new ModelMix(R.drawable.no_name_two, "Без имени"));
                break;
            }
            case "Австралия":{
                arrayList.add(new ModelMix(R.drawable.kazakhstan, "Казахстан"));
                arrayList.add(new ModelMix(R.drawable.kyrgyzstan, "Кыргызстан"));
                arrayList.add(new ModelMix(R.drawable.koreya, "Корея"));
                arrayList.add(new ModelMix(R.drawable.no_name, "Без имени"));
                arrayList.add(new ModelMix(R.drawable.no_name_two, "Без имени"));
                break;

            }
            case "Антарктида":{
                Toast.makeText(requireContext(), "Нет стран!!!", Toast.LENGTH_SHORT).show();
                break;
            }
            case "Азия":{
                arrayList.add(new ModelMix(R.drawable.kazakhstan, "Казахстан"));
                arrayList.add(new ModelMix(R.drawable.kyrgyzstan, "Кыргызстан"));
                arrayList.add(new ModelMix(R.drawable.koreya, "Корея"));
                arrayList.add(new ModelMix(R.drawable.no_name, "Без имени"));
                arrayList.add(new ModelMix(R.drawable.no_name_two, "Без имени"));
                break;
            }
        }
    }

    @Override
    public void click(ModelMix modelMix) {

    }
}