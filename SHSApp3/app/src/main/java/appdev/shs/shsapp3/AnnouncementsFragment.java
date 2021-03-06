package appdev.shs.shsapp3;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class AnnouncementsFragment extends Fragment {

    private static final String ARG_POS = "position";

    private int mPosition;


    public static AnnouncementsFragment newInstance(int position) {
        AnnouncementsFragment fragment = new AnnouncementsFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_POS, position);
        fragment.setArguments(args);
        return fragment;
    }

    public AnnouncementsFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mPosition = getArguments().getInt(ARG_POS);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_announcements, container, false);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        Log.d("MainActivity", "Announcements fragment attatched.");
        ((MainActivity) activity).onSectionAttached(
                getArguments().getInt(ARG_POS));
    }


}
