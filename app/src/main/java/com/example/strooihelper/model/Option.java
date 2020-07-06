package com.example.strooihelper.model;

import com.example.strooihelper.R;

public class Option {
    public static Option[] options = {
            new Option("Instructies", R.drawable.instructie1),
            new Option("Dosering", R.drawable.instructie2),
            new Option("Veld beëindigen", R.drawable.instructie3),
            new Option("Fouten", R.drawable.instructie4)
    };

    private String option;
    private int img;

    public Option(String option, int img) {
        this.option = option;
        this.img = img;
    }

    public String getOption() {
        return option;
    }

    public int getImg() {
        return img;
    }

    @Override
    public String toString() {
        return option;
    }
}
