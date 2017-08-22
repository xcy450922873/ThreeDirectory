package com.example.magenta.threedirectory.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.magenta.threedirectory.R;

import java.util.List;

/**
 * Created by Magenta on 2017/8/22.
 */

public class FirstRecyclerViewAdapter extends RecyclerView.Adapter<FirstRecyclerViewAdapter.ViewHolder> {
    private Context mContext;
    private LayoutInflater mInflater;
    private List<String> mFirstList;

    public FirstRecyclerViewAdapter(Context mContext, List<String> mFirstList) {
        this.mContext = mContext;
        this.mFirstList = mFirstList;
        mInflater = LayoutInflater.from(mContext);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mView = mInflater.inflate(R.layout.recycler_first, parent, false);
        return new ViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.tv_first.setText(mFirstList.get(position));
    }

    @Override
    public int getItemCount() {
        return mFirstList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView tv_first;

        public ViewHolder(View itemView) {
            super(itemView);
            tv_first = ((TextView) itemView.findViewById(R.id.tv_first));
        }
    }
}
