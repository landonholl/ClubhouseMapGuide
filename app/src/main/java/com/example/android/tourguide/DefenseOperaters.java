package com.example.android.tourguide;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class DefenseOperaters extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public DefenseOperaters() {}

    // TODO: Rename and change types and number of parameters
    public static DefenseOperaters newInstance(String param1, String param2) {
        DefenseOperaters fragment = new DefenseOperaters();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);


        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup text_container ,
                             Bundle saveInstanceState){

        View rootView = inflater.inflate(R.layout.misc_list, text_container , false);

        final ArrayList<Operater> operaters = new ArrayList<Operater>();
        operaters.add(new Operater(getString(R.string.smoke), getString(R.string.smoke_desc), R.drawable.smoke_icon));
        operaters.add(new Operater(getString(R.string.mute), getString(R.string.mute_desc), R.drawable.mute_icon));
        operaters.add(new Operater(getString(R.string.vigil), getString(R.string.vigil_desc), R.drawable.vigil_icon));
        operaters.add(new Operater(getString(R.string.bandit), getString(R.string.bandit_desc), R.drawable.bandit_icon));
        operaters.add(new Operater(getString(R.string.jager), getString(R.string.jager_desc), R.drawable.jager_icon));
        operaters.add(new Operater(getString(R.string.valkyrie), getString(R.string.vlakyrie_desc), R.drawable.valkyrie_icon));
        operaters.add(new Operater(getString(R.string.doc), getString(R.string.doc_desc), R.drawable.doc_icon));
        operaters.add(new Operater(getString(R.string.kaid), getString(R.string.kaid_desc), R.drawable.kaid_icon));
        operaters.add(new Operater(getString(R.string.kapkan), getString(R.string.kapkan_desc), R.drawable.kapkan_icon));
        operaters.add(new Operater(getString(R.string.pulse), getString(R.string.pulse_desc), R.drawable.pulse_icon));

        OperaterAdapter adapter = new OperaterAdapter(getActivity(), operaters, R.drawable.smoke_icon);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;

    }
}