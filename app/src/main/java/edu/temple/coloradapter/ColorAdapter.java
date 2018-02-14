package edu.temple.coloradapter;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by Chris on 2/7/2018.
 */

public class ColorAdapter extends BaseAdapter {

    private String[] colors;
    private Context context;

    public ColorAdapter(Context context, String[] colors) {
        this.colors = colors;
        this.context = context;
    }

    @Override
    public int getCount() {
        return colors.length;
    }

    @Override
    public Object getItem(int position){
        return colors[position];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = new TextView(context);
        textView.setText(colors[i]);
        textView.setBackgroundColor(Color.parseColor(colors[i]));
        return textView;
    }
}
