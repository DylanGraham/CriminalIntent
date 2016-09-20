package org.dylangraham.criminalintent;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import org.dylangraham.criminalintent.databinding.ListItemCrimeBinding;

public class CrimeHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private final ListItemCrimeBinding binding;
    private Crime crime;

    public CrimeHolder(ListItemCrimeBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = CrimePagerActivity.newIntent(v.getContext(), crime.getId());
        v.getContext().startActivity(intent);
    }

    public void bindCrime(Crime crime) {
        this.crime = crime;
        binding.listItemCrimeTitleTextView.setText(crime.getTitle());
        binding.listItemCrimeDateTextView.setText(crime.getDateString());
        binding.listItemCrimeTimeTextView.setText(crime.getTimeString());
        binding.listItemCrimeSolvedCheckbox.setChecked(crime.isSolved());
    }
}