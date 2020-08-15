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

    public AttackOperaters() {
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
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.misc_list, text_container , false);

        // Create a list of words
        final ArrayList<Operater> operaters = new ArrayList<Operater>();
        operaters.add(new Operater("Thermite", "Hard Breacher, Good for getting into site.", R.drawable.thermite_icon));
        operaters.add(new Operater("Thatcher", "Hands down the best Operater for attacking.", R.drawable.thatcher_icon));
        operaters.add(new Operater("Hibana", "Hard Breacher, better for Armory and Church.", R.drawable.hibana_icon));
        operaters.add(new Operater("Zofia", "Fragger, good for getting picks.", R.drawable.zofia_icon));
        operaters.add(new Operater("Lion", "Intel Operater, good for seeing enemy positions.", R.drawable.lion_icon));
        operaters.add(new Operater("Maverick", "Second best Operater for any map.", R.drawable.maverick_icon));
        operaters.add(new Operater("Ace", "Hard Breacher, good for any situation.", R.drawable.ace_icon));
        operaters.add(new Operater("Blackbeard", "Fragging Operater, has a shield in front of his face.", R.drawable.blackbeard_icon));
        operaters.add(new Operater("Jackal", "Fragging Intel Operater, good for finding roamers.", R.drawable.jackal_icon));
        operaters.add(new Operater("Finka", "Healer Fragger Operater, good for making pushes.", R.drawable.finka_icon));

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