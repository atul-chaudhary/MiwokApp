package com.chaudhary.atul.miwokapp;

class Word {
    private String vlanguage;
    private String venglish;
    int imageResId ;
    int NO_IMAGE_PROVIDED = -1;


    public Word(String vlanguage, String venglish, int imageResId) {
        this.vlanguage = vlanguage;
        this.venglish = venglish;
        this.imageResId = imageResId;

    }

    public Word(String s, String minto_wuksus) {

        venglish = s;
        vlanguage = minto_wuksus;



    }

    public String getVlanguage() {
        return vlanguage;
    }

    public void setVlanguage(String vlanguage) {
        this.vlanguage = vlanguage;
    }

    public String getVenglish() {
        return venglish;
    }

    public void setVenglish(String venglish) {
        this.venglish = venglish;
    }

    public int getImageResId() {
        return imageResId;
    }

    public void setImageResId(int imageResId) {
        this.imageResId = imageResId;
    }

    public boolean hasImage() {
        return imageResId != NO_IMAGE_PROVIDED;
    }
}
