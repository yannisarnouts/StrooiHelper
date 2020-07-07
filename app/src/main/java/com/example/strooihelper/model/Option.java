package com.example.strooihelper.model;

import com.example.strooihelper.R;

public class Option {
    public static Option[] options = {
            new Option("Instructies", R.drawable.instructie1),
            new Option("Dosering", R.drawable.instructie2),
            new Option("Veld beëindigen", R.drawable.instructie3),
            new Option("Fouten", R.drawable.instructie4),
    };
    public static Option[] mestOptions = {
            new Option("Meststof keuze + Werbreedte", R.drawable.instructie1),
            new Option("Dosering", R.drawable.instructie2),
            new Option("Van de kantstrooien", R.drawable.instructie1),
            new Option("Naar de kantstrooien", R.drawable.instructie1),
            new Option("Restant nog te strooien", R.drawable.instructie1),
            new Option("Snel lossen/leegmaken", R.drawable.instructie1),
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
