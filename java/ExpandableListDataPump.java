package mathewdocker.com.saffoldingapplication;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created by Mathew on 16/11/2016.
 */

    public class ExpandableListDataPump {
        public static LinkedHashMap<String, List<String>> getData() {
            LinkedHashMap<String, List<String>> expandableListDetail = new LinkedHashMap<String, List<String>>();

            List<String> riskone = new ArrayList<String>();
            riskone.add("Find out what could cause harm. The following can help you identify potential hazards:");
            riskone.add("Observe the workplace to identify areas where scaffolds are used or scaffolding work is " +
                    "performed and where there is interaction with vehicles, pedestrians and fixed structures.");

            riskone.add("Look at the environment in which the scaffold is to be used including checking ground conditions.");
            riskone.add("Identify the major functional requirements of the scaffold like the maximum live and dead loads and access requirements");
            riskone.add("Inspect the scaffolding before and after use.");
            riskone.add("Ask your workers about any problems they encounter or anticipate at your workplace " +
                    "when constructing or interacting with scaffolds and scaffolding work–consider operation, " +
                    "inspection, maintenance, repair, transport and storage requirements.");

            riskone.add("Inspect the erected scaffold.");
            riskone.add("Review your incident and injury records including near misses.");

            List<String> risktwo = new ArrayList<String>();
            risktwo.add("In many cases the risks and related control measures will be well known." +
                    " In other cases you may need to carry out a risk assessment to identify the likelihood" +
                    " of somebody being harmed by the hazard and how serious the harm could be.");
            risktwo.add("A risk assessment can help you determine what action you should take to control the risk and" +
                    " how urgently the action needs to be taken.");

            List<String> riskthree = new ArrayList<String>();
            riskthree.add("Take action to control the risk. The work health and safety laws require a business or" +
                    " undertaking do all that is reasonably practicable to eliminate or minimise risks.");
            riskthree.add("The ways of controlling risks are ranked from the highest level of protection and reliability" +
                    " to the lowest. This ranking is known as the hierarchy of risk control. You must work through" +
                    " this hierarchy to manage risks.");

            riskthree.add("The first thing to consider is whether hazards can be completely removed from the" +
                    " workplace. For example, risks can be eliminated by carrying out work at ground level" +
                    " or on completed floors of a building.");
            riskthree.add("If it is not reasonably practicable to completely eliminate the risk then consider the following" +
                    " options in the order they appear below to minimise risks, so far as is reasonably practicable:");

            riskthree.add("substitute the hazard for something safer e.g. using mechanical aids like cranes, hoists," +
                    " pallet jacks or trolleys to move equipment and materials wherever possible instead of" +
                    " manually lifting scaffolding");
            riskthree.add("isolate the hazard from people e.g. install concrete barriers to separate pedestrians" +
                    " and powered mobile plant from scaffolds to minimise the risk of collision, and");
            riskthree.add("use engineering controls e.g. provide toe boards, perimeter containment sheeting" +
                    " or overhead protective structures to prevent objects falling hitting workers or other" +
                    " people below the work area.");

            riskthree.add("If after implementing the above control measures a risk still remains, consider the" +
                    " following controls in the order below to minimise the remaining risk, so far as is reasonably" +
                    " practicable:");
            riskthree.add("use administrative controls e.g. storing scaffolding as close as practical to the work area" +
                    " to minimise the distance over which loads are manually moved, and");
            riskthree.add("use personal protective equipment (PPE) e.g. hard hats, protective hand and footwear" +
                    " and high visibility vests.");
            riskthree.add("A combination of the controls set out above may be used if a single control is not enough" +
                    " to minimise the risks. You need to consider all possible control measures and make a decision about which" +
                    " are reasonably practicable for your workplace.");
            riskthree.add("Deciding what is reasonably practicable includes the availability and suitability of control measures, with a preference for using" +
                    " substitution, isolation or engineering controls to minimise risks before using administrative" +
                    " controls or PPE.");
            riskthree.add("Cost may also be relevant, but you can only consider this after all other" +
                    " factors have been taken into account");

            List<String> riskfour = new ArrayList<String>();
            riskfour.add("Check your control measures regularly to ensure they are working as planned. Control" +
                    " measures need to be regularly reviewed to make sure they remain effective, taking into" +
                    " consideration any changes, the nature and duration of work and that the system is working");


            expandableListDetail.put(" 1. Identify The Hazards", riskone);
            expandableListDetail.put(" 2. Assess the Risks", risktwo);
            expandableListDetail.put(" 3. Control The Risks", riskthree);
            expandableListDetail.put(" 4. Review Controls", riskfour);

            return expandableListDetail;
        }
    }


