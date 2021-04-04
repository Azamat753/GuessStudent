package com.lawlett.guessstudent.fragments;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.lawlett.guessstudent.R;
import com.lawlett.guessstudent.constants.Strings;
import com.lawlett.guessstudent.model.QuestionModel;

public class GameFragment extends GeneralFragment{
    public GameFragment() {
        super(R.layout.fragment_game);
    }

    private void getQuestion(){
        if (getArguments()!=null){
            QuestionModel questionModel= (QuestionModel) getArguments().getSerializable(Strings.QUESTION_KEY.getText());
        }
    }
    @Override
    protected void initClickers() {

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        getQuestion();
    }

    @Override
    protected void initViews(View view) {

    }
}
