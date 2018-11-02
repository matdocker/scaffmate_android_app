package mathewdocker.com.saffoldingapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class AdjacentBuildingsFragment extends Fragment {

    final AdjacentBuildingsFragment context = this;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.listview_fragment, container, false);

        String risk_management[] = {"\nNo part of the scaffolding work should adversely affect the structural integrity of other buildings.\n",
                "\nYou should ensure risks are controlled to prevent injury to people or damage to adjacent buildings or " +
                        "structures from the:\n",
                "\n• collapse of the scaffold onto an adjacent building or structure, and\n",
                "\n• collapse of an adjacent building or structure, or a part of a building or structure due " +
                        "to scaffolding work or related activities.\n",
        };

        ListView listView = (ListView) view.findViewById(R.id.list_who_involve);


        ArrayAdapter<String> listViewAdapter = new ArrayAdapter<String>(
                getActivity(),
                android.R.layout.simple_list_item_1, risk_management);

        listView.setAdapter(listViewAdapter);


        return view;
    }

}




