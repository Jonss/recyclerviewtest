package br.com.boracay.niff;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import br.com.boracay.niff.model.Post;
import br.com.boracay.niff.ui.PostAdapter;

import static br.com.boracay.niff.R.drawable.ic_launcher;


public class TimelineActivityFragment extends Fragment {


    private RecyclerView timeline;
    private PostAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View layout = inflater.inflate(R.layout.fragment_timeline, container, false);

        timeline = (RecyclerView) layout.findViewById(R.id.timeline_recyclerview);
        adapter = new PostAdapter(getActivity(), getData());
        timeline.setAdapter(adapter);
        timeline.setLayoutManager(new LinearLayoutManager(getActivity()));

        return layout;
    }

    public List<Post> getData() {
        List<Post> posts = new ArrayList<>();

        posts.add(new Post(ic_launcher, "Primeiro"));
        posts.add(new Post(ic_launcher, "Segundo"));
        posts.add(new Post(ic_launcher, "Terceiro"));
        posts.add(new Post(ic_launcher, "Quarto"));
        posts.add(new Post(ic_launcher, "Quinto"));
        posts.add(new Post(ic_launcher, "Sexto"));
        posts.add(new Post(ic_launcher, "Sétimo"));
        posts.add(new Post(ic_launcher, "Oitavo"));
        posts.add(new Post(ic_launcher, "Nono"));
        posts.add(new Post(ic_launcher, "Décimo"));

        return posts;
    }
}
