package com.example.onlyexit;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MainAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater inflater;
    private String [] itemtype;
    private int [] itemImage;

    public MainAdapter(Context c, String[] itemtype, int[] itemImage){
        context = c;
        this.itemtype = itemtype;
        this.itemImage = itemImage;



    }


    @Override
    public int getCount() {
        return itemtype.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (inflater == null){
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }
        if (view == null){
            view = inflater.inflate(R.layout.row_item, null);
        }

        ImageView imageView = view.findViewById(R.id.ivItemHome);
        TextView textView = view.findViewById(R.id.tvPrice);

        imageView.setImageResource(itemImage[i]);
        textView.setText(itemtype[i]);
        return view;
    }
}
