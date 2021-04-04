package com.lawlett.guessstudent.fragments;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.lawlett.guessstudent.R;
import com.lawlett.guessstudent.constants.Strings;

import java.util.ArrayList;

public class StartFragment extends GeneralFragment {
    Button start, exit;


    public StartFragment() {
        super(R.layout.fragment_start);
    }

    private ArrayList<String> getLevels() {
        ArrayList<String> levelList = new ArrayList<>();
        levelList.add("1");
        levelList.add("2");
        return levelList;
    }

    private void sendLevel() {
        LevelFragment levelFragment = new LevelFragment();
        Bundle bundle = new Bundle();
        bundle.putStringArrayList(Strings.LIST_LEVELS_KEY.getText(), getLevels());
        levelFragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container_fragment, levelFragment).commit();
    }

    @Override
    protected void initClickers() {
        start.setOnClickListener(view -> sendLevel());
    }

    @Override
    protected void initViews(View view) {
        start = view.findViewById(R.id.start_btn);
        exit = view.findViewById(R.id.exit_btn);
    }
}