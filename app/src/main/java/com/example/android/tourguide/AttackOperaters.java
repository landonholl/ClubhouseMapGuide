package com.example.android.tourguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class AttackOperaters extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public AttackOperaters() {}

    // TODO: Rename and change types and number of parameters
    public static AttackOperaters newInstance(String param1, String param2) {
        AttackOperaters fragment = new AttackOperaters();
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
        operaters.add(new Operater(getString(R.string.thermite), getString(R.string.thermite_desc), R.drawable.thermite_icon));
        operaters.add(new Operater(getString(R.string.thatcher), getString(R.string.thatcher_desc), R.drawable.thatcher_icon));
        operaters.add(new Operater(getString(R.string.hibana), getString(R.string.hibana_desc), R.drawable.hibana_icon));
        operaters.add(new Operater(getString(R.string.zofia), getString(R.string.zofia_desc), R.drawable.zofia_icon));
        operaters.add(new Operater(getString(R.string.lion), getString(R.string.lion_desc), R.drawable.lion_icon));
        operaters.add(new Operater(getString(R.string.maverick), getString(R.string.maverick_desc), R.drawable.maverick_icon));
        operaters.add(new Operater(getString(R.string.ace), getString(R.string.ace_desc), R.drawable.ace_icon));
        operaters.add(new Operater(getString(R.string.blackbeard), getString(R.string.blackbeard_desc), R.drawable.blackbeard_icon));
        operaters.add(new Operater(getString(R.string.jackal), getString(R.string.jackal_desc), R.drawable.jackal_icon));
        operaters.add(new Operater(getString(R.string.finka), getString(R.string.finka_desc), R.drawable.finka_icon));

        OperaterAdapter adapter = new OperaterAdapter(getActivity(), operaters, R.drawable.smoke_icon);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;

    }
}