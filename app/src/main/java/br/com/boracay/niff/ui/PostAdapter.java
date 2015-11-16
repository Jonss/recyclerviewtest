package br.com.boracay.niff.ui;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Collections;
import java.util.List;

import br.com.boracay.niff.R;
import br.com.boracay.niff.MyViewHolder;
import br.com.boracay.niff.model.Post;

public class PostAdapter extends RecyclerView.Adapter<MyViewHolder>{

    private final LayoutInflater inflater;
    private List<Post> posts = Collections.emptyList();

    public PostAdapter(Context context, List<Post> posts){
        this.posts = posts;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.post_row, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Post currentPost = posts.get(position);
        holder.getText().setText(currentPost.getTitle());
        holder.getImage().setImageResource(currentPost.getIdImage());
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }
}
