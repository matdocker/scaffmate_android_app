package mathewdocker.com.saffoldingapplication;

import android.content.Context;
import android.text.Html;
import android.text.Spannable;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.LinkedList;

public class SearchAdapter extends BaseAdapter {

    private LinkedList<String> search;

    public void setData(LinkedList<String> search) {
        this.search = search;
    }

    @Override
    public int getCount() {
        if (search != null)
            return search.size();
        else
            return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        LayoutInflater inflater = (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (view == null) {
            view = inflater.inflate(R.layout.search_part, parent, false);
        }
        TextView textView = (TextView) view.findViewById(R.id.text1);
        String text = search.get(position);
        int ks = text.indexOf("<font color='blue'>");
        int start = ks - 100;
        int end = ks + 100;
        if(start < 0) start = 0;
        if(end > text.length()) end = text.length();
        start = text.substring(0, start).lastIndexOf(" ");
        if(start < 0) start = 0;
        int tmp = text.substring(end, text.length()).indexOf(" ");
        if(tmp > 0) end = tmp + end;
        if(end > text.length()) end = text.length();
        textView.setText(Html.fromHtml("..." + text.substring(start, end) + "..."), TextView.BufferType.SPANNABLE);
        return view;
    }

}

