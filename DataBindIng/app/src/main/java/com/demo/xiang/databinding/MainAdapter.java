package com.demo.xiang.databinding;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.demo.xiang.databinding.databinding.ItemMainBinding;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/8/2.
 */
public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {
    private ItemMainBinding itemMainBinding;
    private List<String> mList = new ArrayList<>();
    private itemClickListener onItemClickListener;

    public void setOnItemClickListener(itemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        itemMainBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_main, parent, true);
        return new ViewHolder(itemMainBinding.getRoot());
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        itemMainBinding.setItem(mList.get(position));
    }

    public void refresh(List<String> list){
        this.mList = list;
        this.notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ViewHolder(View itemBindIng) {
            super(itemBindIng);
            itemBindIng.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (onItemClickListener!=null){
                        onItemClickListener.onClick(getLayoutPosition());
                    }
                }
            });

        }
    }
    public interface itemClickListener{
        void onClick(int position);
    }
}
