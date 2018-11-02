package mathewdocker.com.saffoldingapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener, SearchView.OnQueryTextListener {

    private Fragment fragment;
    private View view;


    private LinkedList<String> searchableTexts;
    public static LinkedList<String> searchResults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        MenuFragment fragment = new MenuFragment();
        android.support.v4.app.FragmentTransaction fragmentTransaction =
                getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.container, fragment);
        fragmentTransaction.commit();

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        // Creates array of searchable strings from Strings.xml file
       // createSearchables();



    }

    /**
     * Creates array of searchable strings from Strings.xml file, using only 5+ words loong strings
     */
    private void createSearchables() {
        int minimumWords = 5;
        searchableTexts = new LinkedList<String>();

        Field[] fields = R.string.class.getFields();
        String tmpName = "";
        String tmp = "";
        int resId = 0;
        for(int i = 0; i < fields.length; i++) {
            tmpName = fields[i].getName();
            resId = this.getResources().getIdentifier(tmpName, "string", getPackageName());
            if(resId != 0) {
                tmp = this.getString(resId);
                String trimmed = tmp.trim();
                int words = trimmed.isEmpty() ? 0 : trimmed.split("\\s+").length;
                if(words > minimumWords) {
                    searchableTexts.add(tmp);
                }
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_search, menu);

        MenuItem searchItem = menu.findItem(R.id.search);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(searchItem);
        searchView.setOnQueryTextListener(this);
        searchView.setQueryHint("Ask Ottaway");
        
        return true;
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        String trimmed = query.trim();
        String[] keywords = trimmed.split("\\s+");
        searchResults = new LinkedList<String>();
        for(String searchable:searchableTexts) {
            String tmp = searchable.toUpperCase();
            boolean containsKeywords = true;
            for(String keyword:keywords) {
                if(!tmp.contains(keyword.toUpperCase())) {
                    containsKeywords = false;
                }
            }
            if(containsKeywords) {
                String result = new String(searchable.trim());
                for(String keyword:keywords) {
                    result = result.replaceAll("(?i)" + Pattern.quote(keyword), "<font color='blue'>" + keyword + "</font>");
                }
                searchResults.add(result);
            }
        }
        startSearch();
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        // User changed the text
        return false;
    }

    private void startSearch() {
        Intent intent = new Intent(this, SearchResultsActivity.class);
        this.startActivity(intent);
    }

    private void startMenu(int resource, String backStack) {
        CustomFragment fragment = CustomFragment.newInstance(resource);
        android.support.v4.app.FragmentTransaction fragmentTransaction =
                getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.container, fragment);
        fragmentTransaction.addToBackStack(backStack);
        fragmentTransaction.commit();
    }


    public void menuOne(View view) {
        startMenu(R.layout.fragment_menu, "addGenScaff");
    }

    public void menuOneOne(View view) {
        startMenu(R.layout.supervisors_menu, "addSupervisors");
    }

    public void menuOneTwo(View view) {
        startMenu(R.layout.leading_hand_menu, "addLeadHand");
    }

    public void menuOneThree(View view) {
        startMenu(R.layout.scaffolders_menu, "addScaffolders");
    }

    //PLANNING FOR SCAFFOLDING WORK
    public void menuTwo(View view) {
        startMenu(R.layout.planwork_fragment, "addPlanWork");
    }

    public void menuTwoSubOne(View view) {
        Intent menuActivity = new Intent(MainActivity.this, RiskManagementActivity.class);
        startActivity(menuActivity);
    }

    public void menuTwoSubOneOne(View view) {
        Intent riskManActivity = new Intent(MainActivity.this, IdentifyTheHazardFragment.class);
        startActivity(riskManActivity);
    }

    public void menuTwoSubOneTwo(View view) {
        Intent whoInvolvedActivity = new Intent(MainActivity.this, RiskManagementActivity.class);
        startActivity(whoInvolvedActivity);
    }

    public void menuTwoSubOneThree(View view) {
        startMenu(R.layout.b4_start_scaff_work_, "addDocument");
    }

    public void menuTwoSubOneFour(View view) {
        startMenu(R.layout.comp_lic_fragment, "addCompLic");
    }

    public void menuTwoSubOneFive(View view) {
        startMenu(R.layout.document, "addDocument");
    }

    public void menuTwoSubTwo(View view) {
        Intent menuActivity = new Intent(MainActivity.this, CommonHazardsActivity.class);
        startActivity(menuActivity);
    }

    public void menuTwoSubTwoOne(View view) {
        startMenu(R.layout.adj_build_fragment, "addAdjBuild");
    }

    public void menuTwoSubTwoTwo(View view) {
        startMenu(R.layout.elec_lines_fragment, "addElecLines");
    }

    public void menuTwoSubTwoThree(View view) {
        startMenu(R.layout.entry_exit_fragment, "addEntryExit");
    }

    public void menuTwoSubTwoFour(View view) {
        startMenu(R.layout.falls_fragment, "addFalls");
    }

    public void menuTwoSubTwoFive(View view) {
        startMenu(R.layout.fall_object_fragment, "addFallObject");
    }

    public void menuTwoSubTwoSix(View view) {
        startMenu(R.layout.ladders_fragment, "addLadders");
    }

    public void menuTwoSubTwoSeven(View view) {
        startMenu(R.layout.ground_con_fragment, "addGroundCon");
    }

    public void menuTwoSubTwoEight(View view) {
        startMenu(R.layout.loading_fragment, "addLoading");
    }

    public void menuTwoSubTwoNine(View view) {
        startMenu(R.layout.mix_scaff_fragment, "addMixScaff");
    }

    public void menuTwoSubTwoTen(View view) {
        startMenu(R.layout.powered_plant_fragment, "addPoweredPlant");
    }

    public void menuTwoSubTwoEleven(View view) {
        startMenu(R.layout.sup_structure_fragment, "addSupStruc");
    }

    public void menuTwoSubTwoTwelve(View view) {
        startMenu(R.layout.unauth_access_fragment, "addUnauthAcc");
    }

    public void menuTwoSubThree(View view) {
        startMenu(R.layout.gendes_fragment, "addGenDesz");
    }

    public void menuTwoSubThreeOne(View view) {
        startMenu(R.layout.des_principle_fragment, "addDesPrinc");
    }

    public void menuTwoSubThreeTwo(View view) {
        startMenu(R.layout.foundation_fragment, "addFoundation");
    }

    public void menuTwoSubThreeThree(View view) {
        startMenu(R.layout.loads_fragment, "addLoads");
    }

    public void loadImage(View view) {
        Intent loadsActivity = new Intent(MainActivity.this, LoadsActivity.class);
        startActivity(loadsActivity);}

    //menuTwoSubThreeFour Image zoomable
    public void contScreen1(View view) {
        Intent contScreenActivity = new Intent(MainActivity.this, ContScreenActivity.class);
        startActivity(contScreenActivity);}
    //menuTwoSubThreeFour Image zoomable
    public void contScreen2(View view) {
        Intent contScreen2Activity = new Intent(MainActivity.this, ContScreen2Activity.class);
        startActivity(contScreen2Activity);}

    public void menuTwoSubThreeFour(View view) {
        startMenu(R.layout.soleboard_fragment, "addSoleBoard");
    }

    public void menuTwoSubThreeFive(View view) {
        startMenu(R.layout.tying_anchor_fragment, "addTyingAnchor");
    }

    public void menuTwoSubThreeSix(View view) {
        startMenu(R.layout.work_plat_fragment, "addWorkPlatform");
    }

    public void menuTwoSubThreeSeven(View view) {
        startMenu(R.layout.fall_arrest_fragment, "addFallArrest");
    }

    public void menuTwoSubThreeEight(View view) {
        startMenu(R.layout.edge_protect_fragment, "addEdgeProtect");
    }

    public void menuTwoSubThreeNine(View view) {
        startMenu(R.layout.access_egress_fragment, "addAccessEgress");
    }

    public void menuTwoSubThreeTen(View view) {
        startMenu(R.layout.contain_screen_fragment, "addContainScreen");
    }

    // SCAFFOLDERS DUTIES

    public void menuThree(View view) {
        startMenu(R.layout.scafduty_fragment, "addScafDut");
    }

    public void menuThreeSubOne(View view) {
        startMenu(R.layout.basic_fragment, "addBasic");
    }

    public void menuThreeSubTwo(View view) {
        startMenu(R.layout.intermediate_fragment, "addIntermediate");
    }

    public void menuThreeSubThree(View view) {
        startMenu(R.layout.advance_fragment, "addAdvance");
    }

    //Types of Scaffold
    public void menuFour(View view) {
        startMenu(R.layout.scaftype_fragment, "addScafType");
    }

    public void menuFourSubOne(View view) {
        startMenu(R.layout.towermobile_fragment, "addTower");
    }

    public void menuFourSubTwo(View view) {
        startMenu(R.layout.birdcage_fragment, "addBirdcage");
    }

    public void menuFourSubThree(View view) {
        startMenu(R.layout.tubecoupler_fragment, "addTubeCouple");
    }

    public void menuFourSubFour(View view) {
        startMenu(R.layout.tubecoupler_fragment, "addHung");
    }

    public void menuFourSubFive(View view) {
        startMenu(R.layout.singlepole_fragment, "addSinglePole");
    }

    public void menuFourSubSix(View view) {
        startMenu(R.layout.suspend_fragment, "addSuspend");
    }

    public void swingStageLnk(View view){
        Intent swingStageIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.safeworkaustralia.gov.au/sites/SWA/about/Publications/Documents/865/Guide-Suspended-Swing-Stage-Scaffolds.pdf"));
        startActivity(swingStageIntent);
    }

    public void menuFourSubSeven(View view) {
        startMenu(R.layout.demo_fragment, "addDemo");
    }

    public void menuFourSubEight(View view) {
        startMenu(R.layout.special_fragment, "addSpecial");
    }

    public void menuFourSubNine(View view) {
        startMenu(R.layout.trestle_fragment, "addTrestle");
    }

    // Erecting and Dismantling Scaffold
    public void menuFive(View view) {
        startMenu(R.layout.erect_dis_fragment, "addErectDis");
    }

    public void menuFiveSubOne(View view) {
        startMenu(R.layout.erect_fragment, "addErect");
    }

    public void menuFiveSubTwo(View view) {
        startMenu(R.layout.tying_fragment, "addTying");
    }

    public void menuFiveSubThree(View view) {
        startMenu(R.layout.work_plat_fragment, "addWorkPlat");
    }

    public void menuFiveSubFour(View view) {
        startMenu(R.layout.dismantle_fragment, "addDismantle");
    }

    public void menuFiveSubFive(View view) {
        startMenu(R.layout.alter_fragment, "addAlter");
    }

    //Inpection and Maintenance
    public void menuSix(View view) {
        startMenu(R.layout.inspect_main_fragment, "addInpectMain");
    }

    public void menuSixSubOne(View view) {
        startMenu(R.layout.inspect_fragment, "addInspectScaff");
    }

    public void menuSixSubTwo(View view) {
        startMenu(R.layout.handover_fragment, "addHandover");
    }

    public void menuSixSubThree(View view) {
        startMenu(R.layout.post_handover_fragment, "addPostHandover");
    }

    public void menuSixSubFour(View view) {
        startMenu(R.layout.scaffolding_fragment, "addPostHandover");
    }

    public void menuSixSubFive(View view) {
        startMenu(R.layout.inspect_checklist_fragment, "addCompLic");
    }

    //Swms zoomable image
    public void swimsExample(View view) {
        Intent swmsActivity = new Intent(MainActivity.this, SwmsActivity.class);
        startActivity(swmsActivity);
}

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_complete_guide) {
            MenuFragment fragment = new MenuFragment();
            android.support.v4.app.FragmentTransaction fragmentTransaction =
                    getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.container,fragment);
            fragmentTransaction.commit();
            // Handle the camera action
        } else if (id == R.id.nav_supervisors) {
            SupervisorsFragment fragment = new SupervisorsFragment();
            android.support.v4.app.FragmentTransaction fragmentTransaction =
                    getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.container,fragment);
            fragmentTransaction.commit();

        } else if (id == R.id.nav_leading_hands) {
            LeadingHandFragment fragment = new LeadingHandFragment();
            android.support.v4.app.FragmentTransaction fragmentTransaction =
                    getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.container,fragment);
            fragmentTransaction.commit();

        } else if (id == R.id.nav_scaffolders) {
            ScaffoldersFragment fragment = new ScaffoldersFragment();
            android.support.v4.app.FragmentTransaction fragmentTransaction =
                    getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.container,fragment);
            fragmentTransaction.commit();

        } else if (id == R.id.nav_share) {
            AboutUsFragment fragment = new AboutUsFragment();
            android.support.v4.app.FragmentTransaction fragmentTransaction =
                    getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.container,fragment);
            fragmentTransaction.commit();

        } else if (id == R.id.nav_send) {
            Intent emailIntent = new Intent(Intent.ACTION_SEND);

            emailIntent.putExtra(Intent.EXTRA_EMAIL, new String[]{"mathew.docker@gmail.com"});

            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject");
            emailIntent.putExtra(Intent.EXTRA_TEXT, "Body");

            emailIntent.setType("message/rfc822");
            startActivity(Intent.createChooser(emailIntent, "Choose email client"));
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
