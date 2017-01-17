package com.belatrix.android.classandroidlesson2;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by Flavio Franco Tunqui (VLEIX) on 1/16/17.
 * GOOODK
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> implements View.OnClickListener  {

    private View.OnClickListener listener;

    int[] images;
    private Context context;

    public RecyclerAdapter(Context context, int[] images) {
        this.images = images;
        this.context = context;
    }

    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_image_gallery, viewGroup, false);

        view.setOnClickListener(this);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerAdapter.ViewHolder viewHolder, int i) {
        viewHolder.imgItem.setImageResource(images[i]);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public void setOnClickListener(View.OnClickListener listener) {
        this.listener = listener;
    }

    @Override
    public void onClick(View view) {
        if(listener != null)
            listener.onClick(view);
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private ImageView imgItem;
        public ViewHolder(View view) {
            super(view);
            imgItem = (ImageView) view.findViewById(R.id.imgItem);
        }
    }
}
