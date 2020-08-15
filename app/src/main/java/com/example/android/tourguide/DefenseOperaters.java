package com.example.android.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
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

    public DefenseOperaters() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment PracticalOperators.
     */
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
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.misc_list, text_container , false);

        // Create a list of words
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

        // Create an {@link WordAdapter}, whose data source is a list of {@link Word}s. The
        // adapter knows how to create list items for each item in the list.
        OperaterAdapter adapter = new OperaterAdapter(getActivity(), operaters, R.drawable.smoke_icon);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // misc_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Word} in the list.
        listView.setAdapter(adapter);

        return rootView;

    }
}