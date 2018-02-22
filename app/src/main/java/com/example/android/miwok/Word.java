package com.example.android.miwok;

/**
 * Created by seb on 22/02/18.
 */

public class Word {

    private String mDefaultTranslation, mMiwokTranslation;

    public Word(String defaultTranslation, String miwokTranslation) {

        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;

    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;

    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

}
