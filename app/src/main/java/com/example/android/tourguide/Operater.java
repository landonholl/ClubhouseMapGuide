package com.example.android.tourguide;

public class Operater {

    private static final int NO_IMAGE_PROVIDED = -1;

    private int mImageId = NO_IMAGE_PROVIDED;

    private String mOperater;

    private String mDescription;

    public Operater(String operater, String description) {
        mOperater = operater;
        mDescription = description;
    }

    public Operater(String operater, String description, int imageId) {
        mOperater = operater;
        mDescription = description;
        mImageId = imageId;
    }

    public String getOperater() {
        return mOperater;
    }

    public String getDescription() {
        return mDescription;
    }

    public int getImage(){ return mImageId; }

    public boolean hasImage(){ return mImageId != NO_IMAGE_PROVIDED; }

}