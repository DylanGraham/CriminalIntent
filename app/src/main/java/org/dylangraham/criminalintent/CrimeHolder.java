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
    private TextView titleTextView;
    private TextView dateTextView;
    private TextView timeTextView;
    private CheckBox solvedCheckBox;

    public CrimeHolder(ListItemCrimeBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
        itemView.setOnClickListener(this);

        titleTextView = (TextView) itemView.findViewById(R.id.list_item_crime_title_text_view);
        dateTextView = (TextView) itemView.findViewById(R.id.list_item_crime_date_text_view);
        timeTextView = (TextView) itemView.findViewById(R.id.list_item_crime_time_text_view);
        solvedCheckBox = (CheckBox) itemView.findViewById(R.id.list_item_crime_solved_checkbox);
    }

    @Override
    public void onClick(View v) {
        Intent intent = CrimePagerActivity.newIntent(v.getContext(), crime.getId());
        v.getContext().startActivity(intent);
    }

    public void bindCrime(Crime crime) {
        this.crime = crime;
        titleTextView.setText(crime.getTitle());
        dateTextView.setText(crime.getDateString());
        timeTextView.setText(crime.getTimeString());
        solvedCheckBox.setChecked(crime.isSolved());
    }
}