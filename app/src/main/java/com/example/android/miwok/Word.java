package com.example.android.miwok;

/**
 * Created by Paul and Shae on 7/27/2016.
 * {@link Word} represents a vocabulary word to learn
 * contains the default and miwok translations for a word
 */
public class Word {

    //default translation for the word
    private String mDefaultTranslation;

    //miwok translation for the word
    private String mMiwokTranslation;

    /**
     * Creates a new Word object with
     * @param defaultTranslation is the default translation for the word
     * @param miwokTranslation is the miwok translation for the word
     *
     */
    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    //get the default translation
    public String getDefault(){
        return mDefaultTranslation;
    }

    //get the miwok translation
    public String getMiwok(){
        return mMiwokTranslation;
    }
}
