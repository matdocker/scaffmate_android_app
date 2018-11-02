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

/**
 * Created by Mathew on 1/10/2016.
 */
public class LaddersFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.riskman_layout, null);
        ExpandableListView elv = (ExpandableListView) v.findViewById(R.id.expandableListView);
        elv.setAdapter(new SavedTabsListAdapter());
        return v;
    }

    public class SavedTabsListAdapter extends BaseExpandableListAdapter {

        private String[] groups = {
                "Ladders",
                "Ladders used for entry or exit",
                "Access bay",
                "Inappropriate use"};

        private String[][] children = {

                //Ladders
                { "Ladders may be used where entry to the working platform is needed by only a few people and where tools and equipment can be delivered separately to the working platform,",
                        "for example by materials hoist, crane or a rope and gin wheel.",
                },

                //Ladders used for entry or exit
                {       "Ladders used for entry to or exit from a scaffold should be:",
                        "• fixed industrial single ladders—not extensions ladders",
                        "• located within a separate ladder access bay of the scaffold wherever space permits, and",
                        "• set up on a firm, level surface, be securely fixed and not used on scaffold bays to gain extra height above the scaffold structure."
                },

                //Access bay
                {       "If the access bay is part of the working platform a trap door should be provided. ",
                        "Ladder entry should be far enough away from the working platform where possible to prevent people falling through openings. ",
                        "Engineering controls and safe work procedures should" +
                        "be implemented so that the trap door remains closed while working from the platform. ",
                        "Platforms should also allow correct use of ladders, for example a person passing through the trap door should not need to hold it open. ",
                        "Gates should be self-closing and not open away from the platform."
                },

                //Inappropriate use
                {       "Ladders should not be used as a work platform or to gain extra height to carry out work from a scaffold."
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
            TextView textView = new TextView(LaddersFragment.this.getActivity());
            textView.setTextSize((float) 16);
            textView.setTextColor(Color.parseColor("#000000"));
            textView.setPadding(100,20,20,20);
            textView.setText(getGroup(i).toString());

            return textView;
        }

        @Override
        public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
            TextView textView = new TextView(LaddersFragment.this.getActivity());
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
