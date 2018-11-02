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
public class ElectricLinesFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.riskman_layout, null);
        ExpandableListView elv = (ExpandableListView) v.findViewById(R.id.expandableListView);
        elv.setAdapter(new SavedTabsListAdapter());
        return v;
    }

    public class SavedTabsListAdapter extends BaseExpandableListAdapter {

        private String[] groups = {
                "Overview",
                "What are the risks?",
                "What do I need to do?",
                "Approach distances",
                "How do I control the risks?",
                "Extra control measures for electrical wires passing through a scaffold",
                "Erected scaffolding using a hoarding and enclosure for reduced safety clearances",
                "Safe work method statements (SWMS)"};

        private String[][] children = {

                //Overview
                { "This Information Sheet provides advice on managing the risks of erecting, dismantling " +
                        "and using fixed scaffolding near overhead electric lines and associated " +
                        "electrical equipment with an operating voltage up to and including 33,000 volts.",

                        "Where the operating voltage of the overhead electric lines is above 33,000 volts you should " +
                                "consult the Electricity Supply Authority and comply with all special conditions imposed by them.",

                },

                //What are the risks?
                { "Contact with energised overhead electric lines by erecting, dismantling and using " +
                        "fixed scaffolding can cause death, electric shock or other injury to plant operators and workers.",

                        "This can be caused directly or indirectly by electricity—a close approach to line conductors " +
                                "may allow a ‘flashover’ to occur.",

                        "The risk of flashover increases as the ine voltage increases."
                },

                //What do I need to do?
                { "You must manage the risks associated with scaffolding work near energised overhead electric lines " +
                        "and associated electrical equipment by:",

                        "• identifying potential hazards",

                        "• consulting workers and asset owners e.g. the Electricity Supply Authority or the " +
                                "person with management or control of the electric line or premises, and",

                        "• deciding what work zones and approach distances are required for safe operations.",

                        "When assessing the risks consider:",

                        "the location, height, arrangement and visibility of overhead electric lines and supporting " +
                                "structures e.g. poles, towers and stay wires",

                        "the voltage of electric lines and exposed energised parts and whether they are insulated or bare",

                        "possible sway or sag of the electric lines",

                        "the scaffold’s dimensions and operating characteristics including inherent stability",

                        "conductivity if the scaffolds are earthed",

                        "the minimum clearance distance from the closest part of the scaffold or plant being used to the electric lines",

                        "erecting and dismantling scaffolding",

                        "the type of work activities required and the frequency of work tasks",

                        "qualifications, competency, skill and experience of people doing the work, and",

                        "safe work practices and procedures e.g. a safety observer and ‘permit to work’."},

                //Approach distances
                { "AS/NZS 4576:1995: Guidelines for scaffolding sets a 4 metre approach distance for metallic scaffolding " +
                        "used near overhead electric lines.",

                        "When planning scaffolding work you should use 4 metres initially and then consider other factors " +
                                "that may require a greater approach distance including:",

                        "• the proximity of overhead electric lines",

                        "• the proximity and operating radius of vehicles, cranes and other moving plant",

                        "• environmental conditions e.g. storm activity, wind strength and direction, heavy rain, ice, hail " +
                                "and lightning, and",

                        "• entry and exit for workers, materials and plant.",

                        "The 4 metre or greater approach distance applies in any direction where metallic scaffold is erected," +
                                " used or dismantled near overhead electric lines.",

                        "If there is a risk the 4 metre approach (See above image) distance cannot be maintained you should " +
                                "contact the Electricity Supply Authority to determine a safe system of work for the erection, " +
                                "use and dismantling of the scaffolding.",

                        "Electric lines should always be treated as energised unless you have:",

                        "an access authority confirming the electric lines have been de-energised, or",

                        "another written document from the Electricity Supply Authority which allows people to work in the No Go Zone.",

                        "The presence, location, type and operating voltage of all overhead electric lines should be " +
                                "verified by a competent person, for example an electrical engineer."
                },

                //How do I control the risks?
                {
                        "The best way to eliminate the hazard is by preventing people, plant, equipment " +
                                "and materials from coming close enough to energised overhead electric lines for direct " +
                                "contact or ‘flashover’ to occur. Consider:",

                        "• de-energising the electric line",

                        "• isolating and earthing the line for the duration of the work",

                        "• re-routing the electric line away from the scaffolding after consultation and " +
                                "agreement of the Electricity Supply Authority, or",

                        "• replacing existing overhead electric lines with underground electric cables.",

                        "De-energising or moving electric lines should be arranged with the Electricity Supply Authority as soon as possible.",

                        "Where elimination is not reasonably practicable, minimise the risks by substituting " +
                                "the hazard or work practice with something safer, for example by:",

                        "• using alternative plant that cannot enter an unsafe zone, or",

                        "• using non-conductive tools.",

                        "Consider isolating the hazard from people by erecting a physical barrier on the scaffold to " +
                                "prevent a person, anything attached to the person or anything held by the person from " +
                                "entering the specified approach distance or:",

                        "1. Use engineering controls like:",

                        "• substituting the scaffold with an elevated work platform, or",

                        "• using an insulated fibreglass handle on a paint roller instead of a conductive aluminium extension " +
                                "handle when standing on scaffolding.",

                        "2. If a risk still remains use administrative controls like:",

                        "• a safety observer to warn people before they enter the 4 metre approach distance",

                        "• arranging for the Electricity Supply Authority to identify exposed energised low voltage " +
                                "conductors, up to and including 1000 volts and fitting them with approved visual indicators",

                        "• making hazards more visible by using approved visual indicators e.g. tiger tails. In this situation:",

                            "(a) tiger tails should be installed for the full length of the scaffolding plus a " +
                                    "minimum distance of 5 metres beyond each end of the scaffolding",

                            "(b) a competent person should visually inspect the tiger tails each day before starting scaffolding operations, and",

                            "(c) if the tiger tails have moved or have been damaged, the Electricity Supply " +
                                    "Authority should be contacted so they are replaced or relocated in the correct position.",

                        "Consultation with the Electricity Supply Authority will confirm the owner of the electric " +
                                "line and costs associated with the installation and application of tiger tails.",

                        "Note: Tiger tails do not provide protection against mechanical interference " +
                                "or electrical hazards. Using tiger tails does not " +
                                "allow workers to enter the 4 metre approach distance.",

                        "Also consider the use of personal protective equipment (PPE) including:",

                        "• electrically tested insulating gloves, rubber soled boots and safety helmets",

                        "• rubber insulating mats or on an equipotential conductive mat for workers to stand on, and",

                        "• dry clothes especially in wet or humid conditions.",

                        "A combination of the above controls can be used if a single control is not " +
                                "enough to minimise the risks.",
        },

                //Extra control measures for electrical wires passing through a scaffold
                {
                        "Where low voltage electrical wires or equipment pass through a scaffold they should be:",

                        "de-energised for the duration of the work, or",

                        "fully enclosed to meet the Electricity Supply Authority’s requirements (see above image) " +
                                "using a non-conductive material e.g. moisture resistant flooring grade particleboard, " +
                                "dry timber, dry plywood or similar material or plastic piping approved by the Electricity " +
                                "Supply Authority.",

                },

                //Erected scaffolding using a hoarding and enclosure for reduced safety clearances
                {
                        "A hoarding is containment sheeting fixed to the external face of a scaffold to form a physical" +
                                "barrier between workers and overhead electric lines and associated electrical equipment.",

                        "Image above shows the horizontal safety distances (A) and vertical mechanical clearances (B) from" +
                                "electrical conductors required by Electricity Supply Authorities.",

                        "You should check the clearance distances before erecting any scaffolding near overhead" +
                                "electric lines.",

                        "An electrical engineer can provide the safety clearance distances used to design" +
                                "the scaffolding and control the risks. Clearance distances must be maintained.",

                        "The following installation conditions apply:",

                        "• gaps between fitted sheets of plywood do not exceed 3 mm",

                        "• no exposed cut or drilled holes in the sheets of plywood",

                        "• the scaffolder uses non-conductive means to attach the plywood to the scaffold and" +
                                " ensures the arrangement can withstand the wind load, and",

                        "• signs should be attached to the safe side of the hoarding warning of the electrical" +
                                "hazard and that the hoarding must not be removed.",

                        "Ensure a competent person visually inspects the hoarding and the enclosure daily to" +
                                "ensure they are in a satisfactory condition and remain impenetrable."
                },

                //Safe work method statements(SWMS)
                {
                        "A SWMS is required for energised electrical work and high risk construction work " +
                                "carried out on or near energised electrical installations or services.",

                        "A written SWMS should be based on a risk assessment. The SWMS and risk assessment should be" +
                                "available to workers on site for the duration of the work.",
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
            TextView textView = new TextView(ElectricLinesFragment.this.getActivity());
            textView.setTextSize((float) 16);
            textView.setTextColor(Color.parseColor("#000000"));
            textView.setPadding(100,20,20,20);
            textView.setText(getGroup(i).toString());

            return textView;
        }

        @Override
        public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
            TextView textView = new TextView(ElectricLinesFragment.this.getActivity());
            textView.setTextSize((float) 15);
            textView.setPadding(20,20,20,20);
            textView.setText(getChild(i, i1).toString());

            return textView;
        }

        @Override
        public void onGroupExpanded(int groupPosition) {

            if (groupPosition == 0){

                ImageView iv = (ImageView)getActivity().findViewById(R.id.menu_image);

                iv.setImageResource(R.drawable.general_scaffolding1);



            }if (groupPosition == 1){

                ImageView iv = (ImageView)getActivity().findViewById(R.id.menu_image);

                iv.setImageResource(R.drawable.general_scaffolding1);



            }if (groupPosition == 2){

                ImageView iv = (ImageView)getActivity().findViewById(R.id.menu_image);

                iv.setImageResource(R.drawable.general_scaffolding1);



            }if (groupPosition == 3){

                ImageView iv = (ImageView)getActivity().findViewById(R.id.menu_image);

                iv.setImageResource(R.drawable.electric_powerlines);



            }if (groupPosition == 4){

                ImageView iv = (ImageView)getActivity().findViewById(R.id.menu_image);

                iv.setImageResource(R.drawable.general_scaffolding1);



            }if (groupPosition == 5){

                ImageView iv = (ImageView)getActivity().findViewById(R.id.menu_image);

                iv.setImageResource(R.drawable.elec_powerlines);



            }if (groupPosition == 6){

                ImageView iv = (ImageView)getActivity().findViewById(R.id.menu_image);

                iv.setImageResource(R.drawable.elec_powerlines);



            }if (groupPosition == 7){

                ImageView iv = (ImageView)getActivity().findViewById(R.id.menu_image);

                iv.setImageResource(R.drawable.general_scaffolding1);



            }

            return;
        }

        @Override
        public boolean isChildSelectable(int i, int i1) {
            return true;
        }


    }

}
