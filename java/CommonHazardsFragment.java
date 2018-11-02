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


public class CommonHazardsFragment extends Fragment {

    final CommonHazardsFragment context = this;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.listview_fragment, container, false);

        String risk_management[] = {"1. Adjacent Buildings & Structures",
                                    "2. Electric Power Lines",
                                    "3. Entry & Exits",
                                    "4. Falls",
                                    "5. Falling Objects",
                                    "6. Ladders",
                                    "7. Ground Conditions",
                                    "8. Loading",
                                    "9. Mixing Scaffold Components from Other Scaffold Systems",
                                    "10. Powered Mobile Plant & Traffic",
                                    "11. Supporting Structures"
        };

        ListView listView = (ListView) view.findViewById(R.id.list_who_involve);


        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1,risk_management);

        listView.setAdapter(listViewAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {



            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {



                if (position == 0) {

                    AdjacentBuildingsFragment fragment = new AdjacentBuildingsFragment();
                    android.support.v4.app.FragmentTransaction fragmentTransaction =
                            getActivity().getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.menu_fragment, fragment);
                    fragmentTransaction.addToBackStack("addElectLines");
                    fragmentTransaction.commit();
                    TextView textView = (TextView) getActivity().findViewById(R.id.menu_title);
                    textView.setText("1. Adjacent Buildings & Structures");


                } else if (position == 1){

                    ElectricLinesFragment fragment = new ElectricLinesFragment();
                    android.support.v4.app.FragmentTransaction fragmentTransaction =
                            getActivity().getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.menu_fragment, fragment);
                    fragmentTransaction.addToBackStack("addElectLines");
                    fragmentTransaction.commit();

                    TextView textView = (TextView) getActivity().findViewById(R.id.menu_title);
                    textView.setText("2. Electric Power Lines");

                }else if (position == 2){

                    EntryAndExitsFragment fragment = new EntryAndExitsFragment();
                    android.support.v4.app.FragmentTransaction fragmentTransaction =
                            getActivity().getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.menu_fragment, fragment);
                    fragmentTransaction.addToBackStack("addEntryExit");
                    fragmentTransaction.commit();

                    TextView textView = (TextView) getActivity().findViewById(R.id.menu_title);
                    textView.setText("3. Entry & Exits");



                }else if (position == 3){

                    FallsFragment fragment = new FallsFragment();
                    android.support.v4.app.FragmentTransaction fragmentTransaction =
                            getActivity().getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.menu_fragment, fragment);
                    fragmentTransaction.addToBackStack("addFalls");
                    fragmentTransaction.commit();

                    TextView textView = (TextView) getActivity().findViewById(R.id.menu_title);
                    textView.setText("4. Falls");

                }else if (position == 4){

                    FallingObjectsFragment fragment = new FallingObjectsFragment();
                    android.support.v4.app.FragmentTransaction fragmentTransaction =
                            getActivity().getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.menu_fragment, fragment);
                    fragmentTransaction.addToBackStack("addFallingObj");
                    fragmentTransaction.commit();

                    TextView textView = (TextView) getActivity().findViewById(R.id.menu_title);
                    textView.setText("5. Falling Objects");

                }else if (position == 5){

                    LaddersFragment fragment = new LaddersFragment();
                    android.support.v4.app.FragmentTransaction fragmentTransaction =
                            getActivity().getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.menu_fragment, fragment);
                    fragmentTransaction.addToBackStack("addLadders");
                    fragmentTransaction.commit();

                    TextView textView = (TextView) getActivity().findViewById(R.id.menu_title);
                    textView.setText("6. Ladders");

                }else if (position == 6){

                    GroundConditionsFragment fragment = new GroundConditionsFragment();
                    android.support.v4.app.FragmentTransaction fragmentTransaction =
                            getActivity().getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.menu_fragment, fragment);
                    fragmentTransaction.addToBackStack("addGroundCond");
                    fragmentTransaction.commit();

                    TextView textView = (TextView) getActivity().findViewById(R.id.menu_title);
                    textView.setText("7. Ground Conditions");

                }else if (position == 7){

                    LoadingFragment fragment = new LoadingFragment();
                    android.support.v4.app.FragmentTransaction fragmentTransaction =
                            getActivity().getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.menu_fragment, fragment);
                    fragmentTransaction.addToBackStack("addLoading");
                    fragmentTransaction.commit();

                    TextView textView = (TextView) getActivity().findViewById(R.id.menu_title);
                    textView.setText("8. Loading");

                }else if (position == 8){

                    MixingComponentsFragment fragment = new MixingComponentsFragment();
                    android.support.v4.app.FragmentTransaction fragmentTransaction =
                            getActivity().getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.menu_fragment, fragment);
                    fragmentTransaction.addToBackStack("addMixingComponents");
                    fragmentTransaction.commit();

                    TextView textView = (TextView) getActivity().findViewById(R.id.menu_title);
                    textView.setText("9. Mixing Scaffold Components from Other Scaffold Systems");

                }else if (position == 9){

                    MobilePlantFragment fragment = new MobilePlantFragment();
                    android.support.v4.app.FragmentTransaction fragmentTransaction =
                            getActivity().getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.menu_fragment, fragment);
                    fragmentTransaction.addToBackStack("addMobilePlant");
                    fragmentTransaction.commit();

                    TextView textView = (TextView) getActivity().findViewById(R.id.menu_title);
                    textView.setText("10. Powered Mobile Plant & Traffic");

                }else if (position == 10){

                    SupportStructureFragment fragment = new SupportStructureFragment();
                    android.support.v4.app.FragmentTransaction fragmentTransaction =
                            getActivity().getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.menu_fragment, fragment);
                    fragmentTransaction.addToBackStack("addSupStructure");
                    fragmentTransaction.commit();

                    TextView textView = (TextView) getActivity().findViewById(R.id.menu_title);
                    textView.setText("11. Supporting Structures");

                }
            }



        });



        return view;
        }

}




