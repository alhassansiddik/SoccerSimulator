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

/**
 * Created by Sidleh on 7/12/2017.
 */

public class AwayFragment extends Fragment {

    private ListView listView;
    private final ArrayList<String> contentList;
    private final Context context;

    public AwayFragment(){
        context = getContext();
        contentList = new ArrayList<String>();
        contentList.add("Cech");
        contentList.add("Bellerin");
        contentList.add("Koscielny");
        contentList.add("Mustafi");
        contentList.add("Monreal");
        contentList.add("Ramsey");
        contentList.add("Cazorla");
        contentList.add("Xhaka");
        contentList.add("Ozil");
        contentList.add("Lacazette");
        contentList.add("Sanchez");
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
