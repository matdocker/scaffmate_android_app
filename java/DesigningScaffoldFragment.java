package mathewdocker.com.saffoldingapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.TextView;


public class DesigningScaffoldFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.riskman_layout, null);
        ExpandableListView elv = (ExpandableListView) v.findViewById(R.id.expandableListView);
        elv.setAdapter(new SavedTabsListAdapter());
        return v;
    }

    public class SavedTabsListAdapter extends BaseExpandableListAdapter {

        private String[] groups = { "Workplace Specifics", "Scaffold Types and Use", "Eliminate Risk Through Good Design"};

        private String[][] children = {

                //Workers and their Safety Representative
                {       "This may involve discussing workplace-specific requirements including the type of scaffold " +
                        "to be erected, the scaffolding to be used and what training is required for workers " +
                        "particularly if a scaffolding high risk work licence is not required."
                },

                //Businesses or Undertaking involved
                {       "Managing the risks associated with scaffolds and scaffolding work begins when you first " +
                        "start making decisions about how scaffolds are going to be used at a workplace and what " +
                        "type of scaffold will be best and safest for the job."

                },

                //The Discussion
                {       "The first step in controlling the identified risks should be at the design stage where the " +
                        "focus is on eliminating risks through good design of:",

                        "• scaffolding — the Act classifies these individual components as “plant",

                        "• the scaffold — the Act classifies this as a “structure” that is covered by both Parts 5 and 6 of the WHS Regulations, and",

                        "• work systems and processes for the safe erection, alteration and dismantling of the scaffold."
                },

        };

        @Override
        public int getGroupCount() {
            return groups.length;
        }

        @Override
        public int getChildrenCount(int i) {
            return children[i].length;
        }

        @Override
        public Object getGroup(int i) {
            return groups[i];
        }

        @Override
        public Object getChild(int i, int i1) {
            return children[i][i1];
        }

        @Override
        public long getGroupId(int i) {
            return i;
        }

        @Override
        public long getChildId(int i, int i1) {
            return i1;
        }

        @Override
        public boolean hasStableIds() {
            return true;
        }

        @Override
        public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
            TextView textView = new TextView(DesigningScaffoldFragment.this.getActivity());
            textView.setTextSize((float) 16);
            textView.setTextColor(Color.parseColor("#000000"));
            textView.setPadding(100,20,20,20);
            textView.setText(getGroup(i).toString());

            return textView;
        }

        @Override
        public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
            TextView textView = new TextView(DesigningScaffoldFragment.this.getActivity());
            textView.setTextSize((float) 15);
            textView.setPadding(20,20,20,20);
            textView.setText(getChild(i, i1).toString());

            return textView;
        }

        @Override
        public boolean isChildSelectable(int i, int i1) {
            return true;
        }

    }

}