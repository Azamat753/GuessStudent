package com.lawlett.guessstudent.fragments;

import android.os.Bundle;
import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

import com.lawlett.guessstudent.R;
import com.lawlett.guessstudent.adapter.LevelAdapter;
import com.lawlett.guessstudent.constants.Strings;
import com.lawlett.guessstudent.model.QuestionModel;

import java.util.ArrayList;

public class LevelFragment extends GeneralFragment implements LevelAdapter.ChooseLevelClick {
    ArrayList<String> levelList = new ArrayList<>();

    public LevelFragment() {
        super(R.layout.fragment_level);
    }

    private ArrayList<String> getLevels() {
        if (getArguments() != null) {
            levelList.addAll(getArguments().getStringArrayList(Strings.LIST_LEVELS_KEY.toString()));
        }
        return levelList;
    }

    private void sendQuestion(int position) {
        Bundle bundle = new Bundle();
        GameFragment gameFragment = new GameFragment();
        bundle.putSerializable(Strings.QUESTION_KEY.getText(), getQuestion(position));
        gameFragment.setArguments(bundle);
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container_fragment, gameFragment).commit();
    }

    private QuestionModel getQuestion(int position) {
        QuestionModel questionModel;
        switch (position) {
            case 0:
                questionModel = new QuestionModel("1 Уровень", "https://chto-takoe-lyubov.net/wp-content/uploads/2015/03/nachalstvo-podchinennyye-tsitaty.jpg", "https://upload-ca0451ed212bdd32f8d9e1cd64bf8c77.hb.bizmrg.com/iblock/ffb/ffb3516b5ee77a881043681f4c0b64db/7cb7a61f20fb5d6e87b47229405759e8.jpg", "https://upload.wikimedia.org/wikipedia/ru/thumb/8/8e/%D0%9E%D0%B1%D0%BB%D0%BE%D0%B6%D0%BA%D0%B0_Dota_2.jpg/266px-%D0%9E%D0%B1%D0%BB%D0%BE%D0%B6%D0%BA%D0%B0_Dota_2.jpg", "https://avatars.mds.yandex.net/get-zen_doc/1645803/pub_5e4faabd9f3ad148f415a09b_5e4facab6617c37cfdda148e/scale_1200");
                break;
            default:
                questionModel = new QuestionModel();
        }
        return questionModel;
    }

    @Override
    protected void initClickers() {

    }

    @Override
    protected void initViews(View view) {
        RecyclerView recyclerView = view.findViewById(R.id.level_recycler);
        LevelAdapter adapter = new LevelAdapter(getLevels(), this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(int position) {
        sendQuestion(position);
    }
}
