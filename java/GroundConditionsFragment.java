package mathewdocker.com.saffoldingapplication;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Mathew on 1/10/2016.
 */
public class GroundConditionsFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.riskman_layout, null);
        ExpandableListView elv = (ExpandableListView) v.findViewById(R.id.expandableListView);
        elv.setAdapter(new SavedTabsListAdapter());
        return v;
    }

    public class SavedTabsListAdapter extends BaseExpandableListAdapter {

        private String[] groups = {
                "Falls",
                "Poor environmental conditions",
                "Materials, equipment or protruding objects below or in adjoining work areas",
                "Other hazards that may increase the risk of falls",
                "Engineering controls",};

        private String[][] children = {

                //Falls
                { "Safe entry and exit is required for workers when erecting, using and dismantling a scaffold. Common means of entry and exit include:",

                        "• temporary stairs or ladder access systems installed at the start of erection and progressed with the scaffold",

                        "• permanently installed platforms or ramps e.g. part of an adjacent building",

                        "• personnel hoists—non-mechanical forms of exit e.g. a ladder or stair tower should be provided in case of emergency, and",

                        "• the existing floor level of a building if entry from there is safe.",

                },

                //Poor environmental conditions
                {       "• strong winds that may cause workers to lose balance",
                        "• rain causing slippery work surfaces",
                        "• glare emitted from work surfaces or poor lighting affecting visibility"
                },

                //Materials, equipment or protruding objects below or in adjoining work areas
                {       "• pallets of construction materials",
                        "• vertical reinforcing steel",
                        "• rubbish skips",
                        "• exposed starter bars",
                        "• large tools"
                },

                //Other hazards that may increase the risk of falls
                {       "• void areas not identified or protected e.g. ladder access voids",
                        "• incomplete scaffolds or loose scaffolding in areas where work is being done or is likely to be done, and",
                        "• inadequate training, instruction and supervision of scaffold workers."

                },

                //Engineering controls
                {"Passive engineering controls like handrails and edge protection can minimise " +
                        "the risk of a fall during work at height. ",

                        "Catch platforms can be used to minimise the distance a person " +
                        "could fall during work at height and also to catch falling objects."}

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
            TextView textView = new TextView(GroundConditionsFragment.this.getActivity());
            textView.setTextSize((float) 16);
            textView.setTextColor(Color.parseColor("#000000"));
            textView.setPadding(100,20,20,20);
            textView.setText(getGroup(i).toString());

            return textView;
        }

        @Override
        public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
            TextView textView = new TextView(GroundConditionsFragment.this.getActivity());
            textView.setTextSize((float) 15);
            textView.setPadding(20,20,20,20);
            textView.setText(getChild(i, i1).toString());

            return textView;
        }

        @Override
        public void onGroupExpanded(int groupPosition) {

            if (groupPosition == 0){

                ImageView iv = (ImageView)getActivity().findViewById(R.id.menu_image);

                iv.setImageResource(R.drawable.general_scaffolding);



            }if (groupPosition == 1){

                ImageView iv = (ImageView)getActivity().findViewById(R.id.menu_image);

                iv.setImageResource(R.drawable.general_scaffolding);



            }if (groupPosition == 2){

                ImageView iv = (ImageView)getActivity().findViewById(R.id.menu_image);

                iv.setImageResource(R.drawable.general_scaffolding);



            }if (groupPosition == 3){

                ImageView iv = (ImageView)getActivity().findViewById(R.id.menu_image);

                iv.setImageResource(R.drawable.electric_powerlines);



            }if (groupPosition == 4){

                ImageView iv = (ImageView)getActivity().findViewById(R.id.menu_image);

                iv.setImageResource(R.drawable.general_scaffolding);



            }if (groupPosition == 5){

                ImageView iv = (ImageView)getActivity().findViewById(R.id.menu_image);

                iv.setImageResource(R.drawable.elec_powerlines);



            }if (groupPosition == 6){

                ImageView iv = (ImageView)getActivity().findViewById(R.id.menu_image);

                iv.setImageResource(R.drawable.elec_powerlines);



            }if (groupPosition == 7){

                ImageView iv = (ImageView)getActivity().findViewById(R.id.menu_image);

                iv.setImageResource(R.drawable.general_scaffolding);



            }

            return;
        }

        @Override
        public boolean isChildSelectable(int i, int i1) {
            return true;
        }


    }

}
