package com.example.strooihelper.model;

import com.example.strooihelper.R;
public class Soort {
    public static Soort[] opts = {
            new Soort("Kalk", R.drawable.tractor, "Klik hier voor verdere handelingen over kalk"),
            new Soort("Meststoffen", R.drawable.tractor, "Klik hier voor verdere handelingen over mest")
    };

    private String option;
    private int img;
    private String uitleg;

    public Soort(String option, int img, String uitleg) {
        this.option = option;
        this.img = img;
        this.uitleg = uitleg;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getUitleg() {
        return uitleg;
    }

    public void setUitleg(String uitleg) {
        this.uitleg = uitleg;
    }

    @Override
    public String toString() {
        return option;
    }
}
