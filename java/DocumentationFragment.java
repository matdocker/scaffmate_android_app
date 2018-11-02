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


public class DocumentationFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.riskman_layout, null);
        ExpandableListView elv = (ExpandableListView) v.findViewById(R.id.expandableListView);
        elv.setAdapter(new SavedTabsListAdapter());
        return v;
    }

    public class SavedTabsListAdapter extends BaseExpandableListAdapter {

        private String[] groups = { "Documentation", "Designer’s safety report for construction work",
                "Safe work method statements for construction work", "Scaffolding plan", "WHS management plan for a construction project",
        "Emergency plan", "Plant design registration"};

        private String[][] children = {

                //Documentation
                {       "A range of documentation may be required depending on the scaffolding and scaffold. For example, prefabricated scaffolding " +
                        "requires plant design registration.",

                        "The construction of a scaffold where a person can fall more than two metres will generally require a Safe" +
                                "Work Method Statement (SWMS) for construction work.",

                },

                //Designer’s safety report for construction work
                {       "Most erecting and dismantling of a scaffold is construction work as it involves the " +
                        "construction of a structure or is undertaken at a construction workplace.",

                        "A designer must prepare a safety report for a specific or unusual scaffold designs but not" +
                                " for common scaffold designs where the risks are already known.",

                        "For example, a design specifying an unusual base structure that has to be erected to support the scaffold may " +
                                "introduce unique hazards and risk controls.",

                        "The person commissioning the construction work must consult with the designer of the " +
                                "whole or any part of the structure about eliminating and controlling risks.",

                        "The general duty to provide information under the WHS Act may be met through the designer’s safety report " +
                                "prepared under Chapter 6 of the WHS Regulations for construction work.",

                        "A designer’s written safety report may include proprietary documentation setting out " +
                                "how to use the scaffolding or scaffolding system to safely erect a scaffold.",

                        "Where there is a principal contractor for a construction project, the person who commissioned the scaffold " +
                                "design must give a copy of the relevant designer’s safety report to the principal contractor."},

                //Safe work method statements for construction work
                {       "Erecting a scaffold or work on a scaffold may involve activities defined as high risk " +
                        "construction work under the WHS Regulations.",

                        "High risk construction work includes any construction work where there is a risk of " +
                                "a person falling more than two metres. Scaffolding work is defined with a four metre " +
                                "threshold for licensing purposes.",

                        "This means in some cases a high risk work licence may not be required to erect a scaffold—because " +
                                "it is less than four metres—but there may still be need for a SWMS because it is more than two metres.",

                        "High risk construction work also includes work which:",

                        "• involves structural alterations or repairs that require temporary support to prevent collapse",

                        "• is carried out on or near energised electrical installations or services, and",

                        "• is carried out in an area at a workplace in which there is movement of powered mobile plant.",

                        "A SWMS must be prepared for high risk construction work before the work starts. The SWMS must:",

                        "• identify the type of high risk construction work being done",

                        "• specify the health and safety hazards and risks arising from the work",

                        "• describe how the risks will be controlled, and",

                        "• describe how the control measures are to be implemented, monitored and reviewed.",

                        "The SWMS must be developed in consultation with workers and their representatives " +
                                "who are carrying out the high risk construction work.",

                },

                //Scaffolding plan
                {       "Where required, a SWMS will set out the work method to safely erect, use and dismantle " +
                        "a scaffold. Where a SWMS is not required a scaffolding plan will help identify ways to protect people who are:",

                        "• erecting, using, maintaining, altering and dismantling the scaffold, and",

                        "• near the scaffold or scaffolding work e.g. other workers and members of the public.",

                        "For more complex scaffolds a scaffolding plan should be prepared by a competent person.",

                        "In preparing a scaffolding plan the person should consult with a range of other people " +
                                "relevant to the work and workplace, for example:",

                        "• the scaffold designer e.g. to discuss the design loads and the capability of the structure " +
                                "to support extra loadings",

                        "• the scaffolding contractor or builder—this may be the person conducting a business or undertaking or " +
                                "a principal contractor—e.g. to assess where underground drains or pits and underground services " +
                                "are located. The work should be planned to avoid excavating service trenches under, through " +
                                "or adjacent to scaffolds",

                        "• workers, work health and safety committees and health and safety representatives regarding erecting, " +
                                "maintaining, altering and dismantling the scaffold",

                        "• other competent people familiar with similar structures e.g. an engineer or a person holding an " +
                                "intermediate or advanced scaffolding high risk work licence, and",

                        "• the electricity supply authority if the scaffold is being erected near overhead electric lines.",

                        "The scaffolding plan should include a site layout plan and detail the elevations and sections of the scaffold.",

                        "It should be kept at the workplace if reasonably practicable, or be readily accessible near " +
                                "the scaffold should it be required. The scaffolding plan should address:",

                        "• basis of design",

                        "• type of scaffold",

                        "• foundations including ground conditions",

                        "• the weight bearing capacity of the surface where the scaffold is to be erected",

                        "• dead loads e.g. resulting from the size and weight of the scaffold",

                        "• live and environmental loads e.g. wind loads",

                        "• containment sheeting",

                        "• supporting structures",

                        "• entry and exit",

                        "• tying and anchors—where anchors will be placed on the supporting structure and types of anchors to be used",

                        "• bracing, and",

                        "• edge protection.",
                },

                //WHS management plan for a construction project
                {       "Where the cost of the construction work is $250 000 or more a principal contractor for a construction project must:",

                        "• take all reasonable steps to obtain a copy of the SWMS relating to the work from each " +
                                "person conducting a business or undertaking carrying out the high risk construction " +
                                "work before the work starts, and",

                        "• prepare a written WHS management plan for the workplace before work on the construction project starts.",

                        "A WHS management plan must include:",

                        "• a list of people who have health and safety responsibilities, and",

                        "• arrangements for consulting workers, managing incidents that occur and any site specific health and safety rules."

                },

                //Emergency plan
                {       "An emergency plan must be prepared and maintained so it remains effective for the workplace.",

                        "The emergency plan should provide for emergency response, evacuation procedures, medical " +
                                "treatment and assistance, and communication with emergency service organisations and others at the workplace.",

                        "For example, emergency contact numbers should be displayed where they can be easily seen.",

                        "Workers must be provided with information and training on the emergency procedures for " +
                                "the workplace and the procedures must be tested.",

                        "Responses to an emergency should be coordinated. The scaffolding contractor should consult " +
                                "with the principal contractor who prepares the broader workplace emergency plan, so unexpected incidents, " +
                                "for example scaffold collapse or people falling from height are included in the broader emergency plan.",

                        "Emergency arrangements for evacuating an injured worker from, for example a multilevel perimeter screened " +
                                "scaffold should consider how to safely remove an immobilised or unconscious person. This may " +
                                "include creating emergency access points through screens and decks."

                },

                //Plant design registration
                {       "Prefabricated scaffolding is defined as an integrated system of prefabricated components manufactured in " +
                        "such a way that the geometry of assembled scaffolds is pre-determined.",

                        "Prefabricated scaffolding can include modular, tower, cantilever, hung and suspended (swing-stage) scaffolds.",

                        "Prefabricated scaffolding must be design registered as required under Part 1 of Schedule 5 of the WHS Regulations.",

                        "The person with management or control of the prefabricated scaffolding must ensure " +
                                "the design registration number is kept where it is readily accessible.",

                        "If you are hiring prefabricated scaffolding, the supplier must provide the design registration number, usually " +
                                "on the supply docket or agreement."

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
            TextView textView = new TextView(DocumentationFragment.this.getActivity());
            textView.setTextSize((float) 16);
            textView.setTextColor(Color.parseColor("#000000"));
            textView.setPadding(100,20,20,20);
            textView.setText(getGroup(i).toString());

            return textView;
        }

        @Override
        public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
            TextView textView = new TextView(DocumentationFragment.this.getActivity());
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