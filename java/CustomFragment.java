package mathewdocker.com.saffoldingapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Mathew on 11/6/2016.
 */
public class CustomFragment extends Fragment {

    private final static String RESOURCE = "RESOURCE";

    private int resource;

    public static final CustomFragment newInstance(int resource) {
        CustomFragment fragment = new CustomFragment();
        Bundle bundle = new Bundle(1);
        bundle.putInt(RESOURCE, resource);
        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        resource = R.layout.overview_fragment;
        Bundle bundle = this.getArguments();
        if (bundle != null) {
            resource = bundle.getInt(RESOURCE);
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(resource, container, false);
        return view;

    }

}
