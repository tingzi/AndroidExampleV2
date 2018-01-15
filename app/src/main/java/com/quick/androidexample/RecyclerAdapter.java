package com.quick.androidexample;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.quick.androidexample.databinding.OneRowLayoutBinding;
import com.quick.androidexample.databinding.TwoRowLayoutBinding;

import java.util.List;

/**
 * Created by beike on 2018/1/11.
 */

public class RecyclerAdapter<User> extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private List<User> list;

    public RecyclerAdapter(List<User> list) {
        this.list = list;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == 0) {
            return new OneRowViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.one_row_layout, parent));
        } else {
            return new TwoRowViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.two_row_layout, parent));
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        switch (holder.getItemViewType()) {
            case 0:
                OneRowViewHolder oneRowViewHolder = (OneRowViewHolder) holder;
                oneRowViewHolder.binding.setUser((com.quick.androidexample.User) list.get(position));
                break;
            case 1:
                TwoRowViewHolder twoRowViewHolder = (TwoRowViewHolder) holder;
                twoRowViewHolder.binding.setUser((com.quick.androidexample.User) list.get(position));
                break;
            default:
        }

    }

    @Override
    public int getItemCount() {
        if (null == list) {
            return 0;
        } else {
            return list.size();
        }
    }

    @Override
    public int getItemViewType(int position) {
        if (position % 2 == 1) {
            return 0;
        } else {
            return 1;
        }
    }

    class OneRowViewHolder extends RecyclerView.ViewHolder {

        OneRowLayoutBinding binding;

        public OneRowViewHolder(View itemView) {
            super(itemView);
            binding = OneRowLayoutBinding.bind(itemView);
        }
    }

    class TwoRowViewHolder extends RecyclerView.ViewHolder {

        TwoRowLayoutBinding binding;

        public TwoRowViewHolder(View itemView) {
            super(itemView);
            binding = TwoRowLayoutBinding.bind(itemView);
        }
    }
}
