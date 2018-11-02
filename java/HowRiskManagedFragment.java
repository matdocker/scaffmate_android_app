package mathewdocker.com.saffoldingapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class HowRiskManagedFragment extends Fragment {

    final HowRiskManagedFragment context = this;



    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.listview_fragment, container, false);

        String risk_management[] = {"How Can Risk Be Managed",
                                    "Who Is Involved",
                                    "Designing The Scaffold",
                                    "Competancy And Licensing",
                                    "Documentation"};

        ListView listView = (ListView) view.findViewById(R.id.list_who_involve);

        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,risk_management);

        listView.setAdapter(listViewAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                if (position == 0) {


                } else if (position == 1){

                    HowRiskManagedFragment fragment = new HowRiskManagedFragment();
                    android.support.v4.app.FragmentTransaction fragmentTransaction =
                            ((MainActivity) getActivity()).getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.menu_fragment, fragment);

                    fragmentTransaction.commit();
                }

                Toast.makeText(getActivity(), "Item " + position + " was clicked", Toast.LENGTH_SHORT).show();
            }



        });



        return view;
        }

}




