package mathewdocker.com.saffoldingapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link SupervisorsFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link SupervisorsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class SupervisorsFragment extends Fragment {


    final SupervisorsFragment context = this;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.supervisors_menu, container, false);
        return view;
    }



}
