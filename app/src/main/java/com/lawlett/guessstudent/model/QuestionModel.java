package com.lawlett.guessstudent.model;

import android.net.Uri;

import java.io.Serializable;
import java.net.URL;

public class QuestionModel implements Serializable {
    String currentLevel;
    String firstImage,secondImage,thirdImage,fourImage;

    public QuestionModel(String currentLevel, String firstImage, String secondImage, String thirdImage, String fourImage) {
        this.currentLevel = currentLevel;
        this.firstImage = firstImage;
        this.secondImage = secondImage;
        this.thirdImage = thirdImage;
        this.fourImage = fourImage;
    }

    public QuestionModel() {
    }

    public String getCurrentLevel() {
        return currentLevel;
    }

}
