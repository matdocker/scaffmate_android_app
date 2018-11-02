package mathewdocker.com.saffoldingapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;


public class RiskManagementActivity extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        TextView textView = (TextView)findViewById(R.id.menu_title);
        textView.setText("Risk Management");

        super.onBackPressed();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView textView = (TextView)findViewById(R.id.menu_title);
        textView.setText("Risk Management");

        RiskManagementFragment fragment = new RiskManagementFragment();
        android.support.v4.app.FragmentTransaction fragmentTransaction =
                getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.menu_fragment, fragment);
        // No need to set first to back
        //fragmentTransaction.addToBackStack("addMenu");
        fragmentTransaction.commit();




    }
}




