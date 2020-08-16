package com.example.android.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ScopesFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ScopesFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public ScopesFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment BestAttachments.
     */
    // TODO: Rename and change types and number of parameters
    public static ScopesFragment newInstance(String param1, String param2) {
        ScopesFragment fragment = new ScopesFragment();
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
        operaters.add(new Operater(getString(R.string.acog_desc), R.drawable.acog));
        operaters.add(new Operater(getString(R.string.holo_desc), R.drawable.holo));
        operaters.add(new Operater(getString(R.string.red_dot_desc), R.drawable.red_dot));
        operaters.add(new Operater(getString(R.string.reflex_desc), R.drawable.reflex));

        LargeAdapter adapter = new LargeAdapter(getActivity(), operaters, R.drawable.smoke_icon);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;

    }
}