package com.lawlett.guessstudent.constants;

public enum Strings {
    LIST_LEVELS_KEY("levels_list"),
    QUESTION_KEY("question_key");
    private final String text;

    Strings(final String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return text;
    }

    public String getText() {
        return text;
    }
}