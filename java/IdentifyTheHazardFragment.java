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


public class IdentifyTheHazardFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.riskman_layout, null);
        ExpandableListView elv = (ExpandableListView) v.findViewById(R.id.expandableListView);
        elv.setAdapter(new SavedTabsListAdapter());
        return v;
    }

    public class SavedTabsListAdapter extends BaseExpandableListAdapter {

        private String[] groups = { "1. Identify The Hazards", "2. Assess the Risks", "3. Control The Risks", "4. Review Controls" };

        private String[][] children = {

                //1. Identifying the Hazards
                { "Find out what could cause harm. The following can help you identify potential hazards:",
                        "Observe the workplace to identify areas where scaffolds are used or scaffolding work is" +
                                " performed and where there is interaction with vehicles, pedestrians and fixed structures.",
                        "Look at the environment in which the scaffold is to be used including checking ground conditions.",
                        "Identify the major functional requirements of the scaffold like the maximum live and dead loads and access requirements",
                        "Inspect the scaffolding before and after use.",
                "Ask your workers about any problems they encounter or anticipate at your workplace" +
                        " when constructing or interacting with scaffolds and scaffolding work–consider operation," +
                        " inspection, maintenance, repair, transport and storage requirements.",
                "Inspect the erected scaffold.",
                "Review your incident and injury records including near misses."},

                //2. Assess the Risks
                { "In many cases the risks and related control measures will be well known.",
                        " In other cases you may need to carry out a risk assessment to identify the likelihood" +
                        " of somebody being harmed by the hazard and how serious the harm could be.",
                        "A risk assessment can help you determine what action you should take to control the risk and" +
                                " how urgently the action needs to be taken."},

                //3. Control the Risks
                { "Take action to control the risk. The work health and safety laws require a business or" +
                        " undertaking do all that is reasonably practicable to eliminate or minimise risks.",
                "The ways of controlling risks are ranked from the highest level of protection and reliability" +
                        " to the lowest. This ranking is known as the hierarchy of risk control.",
                "You must work through this hierarchy to manage risks.",
                "The first thing to consider is whether hazards can be completely removed from the" +
                        " workplace.",
                        "For example, risks can be eliminated by carrying out work at ground level" +
                        " or on completed floors of a building.",
                "If it is not reasonably practicable to completely eliminate the risk then consider the following" +
                        " options in the order they appear below to minimise risks, so far as is reasonably practicable:",
                "substitute the hazard for something safer e.g. using mechanical aids like cranes, hoists," +
                        " pallet jacks or trolleys to move equipment and materials wherever possible instead of" +
                        " manually lifting scaffolding",
                "isolate the hazard from people e.g. install concrete barriers to separate pedestrians" +
                        " and powered mobile plant from scaffolds to minimise the risk of collision, and",
                "use engineering controls e.g. provide toeboards, perimeter containment sheeting" +
                        " or overhead protective structures to prevent objects falling hitting workers or other" +
                        " people below the work area.",
                "If after implementing the above control measures a risk still remains, consider the" +
                        " following controls in the order below to minimise the remaining risk, so far as is reasonably" +
                        " practicable:",
                "use administrative controls e.g. storing scaffolding as close as practical to the work area" +
                        " to minimise the distance over which loads are manually moved, and",
                "use personal protective equipment (PPE) e.g. hard hats, protective hand and footwear" +
                        " and high visibility vests.",
                "A combination of the controls set out above may be used if a single control is not enough" +
                        " to minimise the risks. You need to consider all possible control measures and make a decision about which" +
                        " are reasonably practicable for your workplace.",
                "Deciding what is reasonably practicable includes the availability and suitability of control measures, with a preference for using" +
                        " substitution, isolation or engineering controls to minimise risks before using administrative" +
                        " controls or PPE.",
                "Cost may also be relevant, but you can only consider this after all other" +
                        " factors have been taken into account"},

                //4. Review Controls
                { "Check your control measures regularly to ensure they are working as planned.",
                        "Control measures need to be regularly reviewed to make sure they remain effective, taking into" +
                                " consideration any changes, the nature and duration of work and that the system is working" }
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
            TextView textView = new TextView(IdentifyTheHazardFragment.this.getActivity());
            textView.setTextSize((float) 16);
            textView.setTextColor(Color.parseColor("#000000"));
            textView.setPadding(60,20,20,20);
            textView.setText(getGroup(i).toString());

            return textView;
        }

        @Override
        public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
            TextView textView = new TextView(IdentifyTheHazardFragment.this.getActivity());
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