package org.dylangraham.criminalintent;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class CrimeHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private Crime crime;
    private TextView titleTextView;
    private TextView dateTextView;
    private CheckBox solvedCheckBox;

    public CrimeHolder(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);

        titleTextView = (TextView) itemView.findViewById(R.id.list_item_crime_title_text_view);
        dateTextView = (TextView) itemView.findViewById(R.id.list_item_crime_date_text_view);
        solvedCheckBox = (CheckBox) itemView.findViewById(R.id.list_item_crime_solved_checkbox);
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(itemView.getContext(), crime.getTitle() + " clicked!", Toast.LENGTH_SHORT).show();
    }

    public void bindCrime(Crime crime) {
        this.crime = crime;
        titleTextView.setText(crime.getTitle());
        dateTextView.setText(crime.getDate());
        solvedCheckBox.setChecked(crime.isSolved());
    }
}