package org.dylangraham.criminalintent;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.UUID;

public class Crime {
    private UUID id;
    private String title;
    private Date date;
    private boolean solved;
    private SimpleDateFormat sdfDate = new SimpleDateFormat("EEEE, MMM d, yyyy", Locale.getDefault());
    private SimpleDateFormat sdfTime = new SimpleDateFormat("h':'mm a", Locale.getDefault());

    public Crime() {
        this.id = UUID.randomUUID();
        this.date = new Date();
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDateString() {
        return sdfDate.format(date);
    }

    public String getTimeString() {
        return sdfTime.format(date);
    }

    public boolean isSolved() {
        return solved;
    }

    public void setSolved(boolean solved) {
        this.solved = solved;
    }
}
