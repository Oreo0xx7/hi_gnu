package com.example.hignu;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CalendarFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class CalendarFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public CalendarFragment() {

    }

//    private ListView calendarListView;
//    private CalendarListAdapter calendar_adapter;
//    private List<CalendarClass> calendarClassList;


    public static CalendarFragment newInstance(String param1, String param2) {
        CalendarFragment fragment = new CalendarFragment();
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_calendar, container, false);

//        calendarListView = (ListView)v.findViewById(R.id.calendarListView);
//        calendarClassList = new ArrayList<CalendarClass>();
//        calendarClassList.add(new CalendarClass("Labor Day (Holiday)", "2022-05-01"));
//        calendarClassList.add(new CalendarClass("Teaching practice for 4 week", "2022-05-02 ~ 2022-05-27"));
//        calendarClassList.add(new CalendarClass("Three quarters of 1st semester", "2022-05-20"));
//        calendarClassList.add(new CalendarClass("Club festival", "2022-05-26 ~ 2022-05-26"));
//        calendar_adapter = new CalendarListAdapter(getContext().getApplicationContext(), calendarClassList);
//        calendarListView.setAdapter(calendar_adapter);



        return inflater.inflate(R.layout.fragment_calendar, container, false);
    }

    @Override
    public void onPause() {
        super.onPause();
    }
}