package br.com.boracay.niff;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MyViewHolder extends RecyclerView.ViewHolder {
    private TextView text;
    private ImageView image;
    public MyViewHolder(View itemView) {
        super(itemView);
        text = (TextView) itemView. findViewById(R.id.post_text);
        image = (ImageView) itemView. findViewById(R.id.post_icon);
    }

    public ImageView getImage() {
        return image;
    }

    public TextView getText() {
        return text;
    }

}