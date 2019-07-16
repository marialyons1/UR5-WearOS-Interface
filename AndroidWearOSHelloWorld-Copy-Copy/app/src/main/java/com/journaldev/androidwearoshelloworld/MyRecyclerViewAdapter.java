//package com.journaldev.androidwearoshelloworld;
//
//import android.content.Context;
//import android.support.v7.widget.RecyclerView;
//import android.support.wear.widget.WearableRecyclerView;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.ScrollView;
//import android.widget.TextView;
//
//import java.util.List;
//
//public class MyAdapter extends WearableRecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder> {
//
//    private String[] mDataset;
//
//    public static class MyViewHolder extends RecyclerView.ViewHolder {
//
//        public TextView textView;
//        public ScrollView scrollView;
//        public MyViewHolder(TextView v) {
//            super(v);
//            textView = v;
//        }
//
//    }
//
//    public MyAdapter(String[] myDataset) {
//
//        mDataset = myDataset;
//
//    }
//
//
//    @Override
//    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//
//        TextView v = (TextView) LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main_subunit, parent, false);
//        MyViewHolder vh = new MyViewHolder(v);
//        return vh;
//
//    }
//
//    // Replace the contents of a view (invoked by the layout manager)
//    @Override
//    public void onBindViewHolder(MyViewHolder holder, int position) {
//        // - get element from your dataset at this position
//        // - replace the contents of the view with that element
//        holder.textView.setText(mDataset[position]);
//
//    }
//
//    // total number of rows
//    @Override
//    public int getItemCount() {
//        return mDataset.length();
//    }
//
//
//
//
//
//}
//
//
//
//
//
//
