package org.dylangraham.criminalintent;


import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.dylangraham.criminalintent.databinding.ListItemCrimeBinding;

import java.util.List;

public class CrimeAdapter extends RecyclerView.Adapter<CrimeHolder> {

    private List<Crime> crimes;

    public CrimeAdapter(List<Crime> crimes) {
        this.crimes = crimes;
    }

    @Override
    public CrimeHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ListItemCrimeBinding binding = DataBindingUtil.inflate(layoutInflater, R.layout.list_item_crime, parent, false);

        return new CrimeHolder(binding);
    }

    @Override
    public void onBindViewHolder(CrimeHolder holder, int position) {
        Crime crime = crimes.get(position);
        holder.bindCrime(crime);
    }

    @Override
    public int getItemCount() {
        return crimes.size();
    }
}