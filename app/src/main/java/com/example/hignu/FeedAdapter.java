package com.example.hignu;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class FeedAdapter extends BaseAdapter {

    private Context context;
    private List<FeedViewClass> feedList;

    public FeedAdapter(Context context, List<FeedViewClass> feedList) {
        this.context = context;
        this.feedList = feedList;
    }

    @Override
    public int getCount() {
        return feedList.size();
    }

    @Override
    public Object getItem(int i) {
        return feedList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View v = View.inflate(context, R.layout.feedback_list_view, null);
        TextView title = (TextView) v.findViewById(R.id.feed_title);
        TextView name = (TextView) v.findViewById(R.id.nameText);
        TextView date = (TextView) v.findViewById(R.id.dateText);

        title.setText(feedList.get(i).getTitle());
        name.setText(feedList.get(i).getName());
        date.setText(feedList.get(i).getDate());

        v.setTag(feedList.get(i).getTitle());
        return v;
    }

}
