package com.example.mahmuda.mamafood.app;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.example.mahmuda.mamafood.app.food.FoodContent;

/**
 * A fragment representing a single Item detail screen.
 * This fragment is either contained in a {@link FoodListActivity}
 * in two-pane mode (on tablets) or a {@link FoodDetailActivity}
 * on handsets.
 */
public class FoodDetailFragment extends Fragment {
    /**
     * The fragment argument representing the item ID that this fragment
     * represents.
     */
    public static final String ARG_ITEM_ID = "item_id";

    /**
     * The food content this fragment is presenting.
     */
    private FoodContent.FoodItem mItem;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public FoodDetailFragment() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments().containsKey(ARG_ITEM_ID)) {
            // Load the food  content specified by the fragment
            // arguments. In a real-world scenario, use a Loader
            // to load content from a content provider.
            mItem = FoodContent.ITEM_MAP.get(getArguments().getString(ARG_ITEM_ID));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_item_detail, container, false);

        // Show the food content as text in a TextView.
        if (mItem != null) {
            ((TextView) rootView.findViewById(R.id.item_detail)).setText(mItem.content);
        }

        return rootView;
    }
}