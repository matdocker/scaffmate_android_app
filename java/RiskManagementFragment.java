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
import android.widget.TextView;


public class RiskManagementFragment extends Fragment {

    final RiskManagementFragment context = this;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.listview_fragment, container, false);

        String risk_management[] = {"How Can Risk Be Managed",
                                    "Who Is Involved",
                                    "Designing The Scaffold",
                                    "Competency And Licensing",
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

                    IdentifyTheHazardFragment fragment = new IdentifyTheHazardFragment();
                    android.support.v4.app.FragmentTransaction fragmentTransaction =
                            getActivity().getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.menu_fragment, fragment);
                    // No need to set first to back
                    fragmentTransaction.addToBackStack("addExpand");
                    fragmentTransaction.commit();
                    TextView textView = (TextView) getActivity().findViewById(R.id.menu_title);
                    textView.setText("How Can Risk Be Managed");




                } else if (position == 1){

                    WhoIsInvolvedFragment fragment = new WhoIsInvolvedFragment();
                    android.support.v4.app.FragmentTransaction fragmentTransaction =
                            getActivity().getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.menu_fragment, fragment);
                    // No need to set first to back
                    fragmentTransaction.addToBackStack("addWhoInvlolved");
                    fragmentTransaction.commit();

                    TextView textView = (TextView) getActivity().findViewById(R.id.menu_title);
                    textView.setText("Who Is Involved");


                }else if (position == 2){

                    DesigningScaffoldFragment fragment = new DesigningScaffoldFragment();
                    android.support.v4.app.FragmentTransaction fragmentTransaction =
                            getActivity().getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.menu_fragment, fragment);
                    // No need to set first to back
                    fragmentTransaction.addToBackStack("addDesignScaffold");
                    fragmentTransaction.commit();

                    TextView textView = (TextView) getActivity().findViewById(R.id.menu_title);
                    textView.setText("Designing The Scaffold");



                }else if (position == 3){

                    CompetencyAndLicensingFragment fragment = new CompetencyAndLicensingFragment();
                    android.support.v4.app.FragmentTransaction fragmentTransaction =
                            getActivity().getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.menu_fragment, fragment);
                    // No need to set first to back
                    fragmentTransaction.addToBackStack("addExpand");
                    fragmentTransaction.commit();

                    TextView textView = (TextView) getActivity().findViewById(R.id.menu_title);
                    textView.setText("Competency And Licensing");



                }else if (position == 4){

                    DocumentationFragment fragment = new DocumentationFragment();
                    android.support.v4.app.FragmentTransaction fragmentTransaction =
                            getActivity().getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.menu_fragment, fragment);
                    // No need to set first to back
                    fragmentTransaction.addToBackStack("addExpand");
                    fragmentTransaction.commit();

                    TextView textView = (TextView) getActivity().findViewById(R.id.menu_title);
                    textView.setText("Documentation");



                }
            }



        });



        return view;
        }

}




