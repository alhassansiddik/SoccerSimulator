package com.siddik.soccersimulator.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.siddik.soccersimulator.R;
import com.siddik.soccersimulator.adapter.ListNormalAdapter;

import java.util.ArrayList;

import butterknife.ButterKnife;

/**
 * Created by Sidleh on 7/12/2017.
 */

public class HomeFragment extends Fragment {

    private ListView listView;
    private final ArrayList<String> contentList;
    private final Context context;

    public HomeFragment(){
        context = getContext();
        contentList = new ArrayList<String>();
        contentList.add("TerStegen");
        contentList.add("Alba");
        contentList.add("Umtiti");
        contentList.add("Pique");
        contentList.add("Roberto");
        contentList.add("Inesta");
        contentList.add("Busquets");
        contentList.add("Rakitic");
        contentList.add("Messi");
        contentList.add("Suarez");
        contentList.add("Neymar");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        listView = (ListView)view.findViewById(R.id.fragment_demo_lv);

        ListNormalAdapter adapter = new ListNormalAdapter(this.getContext(), contentList);
        listView.setAdapter(adapter);
        return view;
    }
}
