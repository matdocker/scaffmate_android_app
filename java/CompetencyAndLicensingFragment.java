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


public class CompetencyAndLicensingFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.riskman_layout, null);
        ExpandableListView elv = (ExpandableListView) v.findViewById(R.id.expandableListView);
        elv.setAdapter(new SavedTabsListAdapter());
        return v;
    }

    public class SavedTabsListAdapter extends BaseExpandableListAdapter {

        private String[] groups = { "Competency and licensing", "Basic Scaffolding", "Intermediate Scaffolding", "Advance Scaffolding" };

        private String[][] children = {

                //Competency and licensing
                {       "A person who erects, alters or dismantles any scaffold must be competent to do the work safely.",

                        "Where a person undertakes construction work they must have successfully completed general construction induction training.",

                        "A person who erects, alters or dismantles a scaffold where there is a risk of a person or " +
                                "object falling four metres or less from the platform or structure does not require a high risk work licence.",

                        "This sort of work may involve tasks like erecting a small frame scaffold to repair the eaves of a house or to paint a ceiling. " +
                                "These types of scaffolds are not generally used to provide a work platform at a height in excess of one storey or for " +
                                "use by many workers at once.",

                        "A person undertaking scaffolding work must hold the relevant class of scaffolding high risk " +
                                "work licence as required by the WHS Regulations. The scaffolding high risk work licence classes are listed bellow",

                },

                //Basic Scaffolding
                {       "Required for scaffolding work involving:",

                        "• modular or prefabricated scaffolds",

                        "• cantilevered materials hoists with a maximum working load of 500 kilograms",

                        "• ropes",

                        "• gin wheels",

                        "• fall arrest systems including safety nets and static lines, and",

                        "• bracket scaffolds (tank and formwork)."},

                //Intermediate Scaffolding
                {       "Required for scaffolding work involving:",

                        "• cantilevered crane loading platforms",

                        "• cantilevered scaffolds",

                        "• spur scaffolds",

                        "• barrow ramps and sloping platforms",

                        "• scaffolding associated with perimeter safety screens and shutters",

                        "• mast climbing work platforms, and",

                        "• tube and coupler scaffolds including tube and coupler covered ways and gantries."},

                //Advance Scaffolding
                {       "required for scaffolding work involving:",

                        "cantilevered hoists",

                        "hung scaffolds including scaffolds hung from tubes, wire ropes or chains, and",

                        "suspended scaffolds"}
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
            TextView textView = new TextView(CompetencyAndLicensingFragment.this.getActivity());
            textView.setTextSize((float) 16);
            textView.setTextColor(Color.parseColor("#000000"));
            textView.setPadding(100,20,20,20);
            textView.setText(getGroup(i).toString());

            return textView;
        }

        @Override
        public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
            TextView textView = new TextView(CompetencyAndLicensingFragment.this.getActivity());
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