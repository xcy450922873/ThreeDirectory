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

public class SecondRecyclerViewAdapter extends RecyclerView.Adapter<SecondRecyclerViewAdapter.ViewHolder> {
    private Context mContext;
    private LayoutInflater mInflater;
    private List<String> mSecondList;

    public SecondRecyclerViewAdapter(Context mContext, List<String> mSecondList) {
        this.mContext = mContext;
        this.mSecondList = mSecondList;
        mInflater = LayoutInflater.from(mContext);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mView = mInflater.inflate(R.layout.recycler_second, parent, false);
        return new ViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.tv_second.setText(mSecondList.get(position));
    }

    @Override
    public int getItemCount() {
        return mSecondList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView tv_second;

        public ViewHolder(View itemView) {
            super(itemView);
            tv_second = ((TextView) itemView.findViewById(R.id.tv_second));
        }
    }
}
