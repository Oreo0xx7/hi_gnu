package com.example.hignu;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.BaseAdapter;

import java.util.List;

public class CalendarListAdapter  extends BaseAdapter {
    private Context context;
    private List<CalendarClass> calendarList;

    public CalendarListAdapter(Context context, List<CalendarClass> calendarList) {
        this.context = context;
        this.calendarList = calendarList;
    }

    @Override
    public int getCount() {
        return calendarList.size();
    }

    @Override
    public Object getItem(int i) {
        return calendarList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = View.inflate(context, R.layout.calendar_list, null);
        TextView title = (TextView) v.findViewById(R.id.notice_title);
        TextView date = (TextView) v.findViewById(R.id.dateText);

        title.setText(calendarList.get(i).getTitle());
        date.setText(calendarList.get(i).getDate());

        v.setTag(calendarList.get(i).getTitle());
        return v;
    }

}