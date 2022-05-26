package com.example.hignu;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class NoticeAdapter extends BaseAdapter {

    private Context context;
    private List<NoticeClass> noticeList;

    public NoticeAdapter(Context context, List<NoticeClass> noticeList) {
        this.context = context;
        this.noticeList = noticeList;
    }

    @Override
    public int getCount() {
        return noticeList.size();
    }

    @Override
    public Object getItem(int i) {
        return noticeList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = View.inflate(context, R.layout.notice, null);
        TextView title = (TextView) v.findViewById(R.id.notice_title);
        TextView name = (TextView) v.findViewById(R.id.nameText);
        TextView date = (TextView) v.findViewById(R.id.dateText);

        title.setText(noticeList.get(i).getTitle());
        name.setText(noticeList.get(i).getName());
        date.setText(noticeList.get(i).getDate());

        v.setTag(noticeList.get(i).getTitle());
        return v;
    }

}
