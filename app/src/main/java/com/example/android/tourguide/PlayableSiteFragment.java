package com.example.android.tourguide;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;

public class PlayableSiteFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public PlayableSiteFragment() {
        // Required empty public constructor
    }

    public static PlayableSiteFragment newInstance(String param1, String param2) {
        PlayableSiteFragment fragment = new PlayableSiteFragment();
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
        operaters.add(new Operater(getString(R.string.cash_desc), R.drawable.cash_and_cctv));
        operaters.add(new Operater(getString(R.string.church_desc), R.drawable.church_and_armory));
        operaters.add(new Operater(getString(R.string.gym_desc), R.drawable.gym_and_bedroom));

        LargeAdapter adapter = new LargeAdapter(getActivity(), operaters, R.drawable.smoke_icon);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;

    }
}