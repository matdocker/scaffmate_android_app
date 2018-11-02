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
public class FallingObjectsFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.riskman_layout, null);
        ExpandableListView elv = (ExpandableListView) v.findViewById(R.id.expandableListView);
        elv.setAdapter(new SavedTabsListAdapter());
        return v;
    }

    public class SavedTabsListAdapter extends BaseExpandableListAdapter {

        private String[] groups = {
                "Falling object risk control measures",
                "Perimeter containment screens",
                "The scaffold design",
                };

        private String[][] children = {

                //Falling object risk control measures
                {"Falling object risk control measures include fall arrest platforms, overhead protective " +
                        "structures, perimeter containment screens and exclusion zones to eliminate or minimise " +
                        "the risk of falling objects."

                },

                //Perimeter containment screens
                {"Perimeter containment screens can be made of mesh, high quality shade cloth, timber, plywood, metal sheeting or other suitable material. ",
                        "Before using perimeter containment screening, consider other risks like conductivity of electricity and additional dead and live loads. ",
                        "For example, the extra wind loading on the scaffold should be considered when selecting a screening material and the framework " +
                                "supporting a screen must be able to support loads resulting from the screen.",

                        "Perimeter containment screens should be located inside the standards on working platforms or in accordance with the manufacturer’s specifications. ",
                        "Where used, the lining should be attached to the inside of the mesh."
                },

                //The scaffold design
                {"The scaffold design and its ties fitted with containment sheeting should be approved " +
                        "by a competent person, for example an engineer with experience in structural design."
                }
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
            TextView textView = new TextView(FallingObjectsFragment.this.getActivity());
            textView.setTextSize((float) 16);
            textView.setTextColor(Color.parseColor("#000000"));
            textView.setPadding(100,20,20,20);
            textView.setText(getGroup(i).toString());

            return textView;
        }

        @Override
        public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
            TextView textView = new TextView(FallingObjectsFragment.this.getActivity());
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
