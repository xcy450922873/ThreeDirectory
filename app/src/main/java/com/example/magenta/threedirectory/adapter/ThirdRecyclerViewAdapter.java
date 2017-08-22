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

public class ThirdRecyclerViewAdapter extends RecyclerView.Adapter<ThirdRecyclerViewAdapter.ViewHolder> {
    private List<String> mThirdList;
    private Context mContext;
    private LayoutInflater mInflater;

    public ThirdRecyclerViewAdapter(List<String> mThirdList, Context mContext) {
        this.mThirdList = mThirdList;
        this.mContext = mContext;
        mInflater = LayoutInflater.from(mContext);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mView = mInflater.inflate(R.layout.recycler_third, parent, false);
        return new ViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.tv_third.setText(mThirdList.get(position));
    }

    @Override
    public int getItemCount() {
        return mThirdList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView tv_third;

        public ViewHolder(View itemView) {
            super(itemView);
            tv_third = ((TextView) itemView.findViewById(R.id.tv_third));
        }

    }
}
