package com.training.mynewsapp.ui.fragments;

import androidx.fragment.app.Fragment;

import com.training.mynewsapp.R;

public class BreakingNewsFragment extends Fragment {

    public BreakingNewsFragment(){
        super(R.layout.fragment_breaking_news);
    }

/*
    Sometimes weirdly behaving when i comment the below method. I think i have to use layout inflater
    instead of passing layout id
    have to find why it is happening?
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_breaking_news, container, false);
    }
 */
}
