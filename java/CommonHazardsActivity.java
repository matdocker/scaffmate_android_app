package mathewdocker.com.saffoldingapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;


public class CommonHazardsActivity extends AppCompatActivity {

    @Override
    public void onBackPressed() {
        TextView textView = (TextView)findViewById(R.id.menu_title);
        textView.setText("Common Hazards and Risk Controls");

        ImageView iv = (ImageView)findViewById(R.id.menu_image);
        iv.setImageResource(R.drawable.general_scaffolding1);

        super.onBackPressed();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_layout);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TextView textView = (TextView)findViewById(R.id.menu_title);
        textView.setText("Common Hazards and Risk Controls");

        CommonHazardsFragment fragment = new CommonHazardsFragment();
        android.support.v4.app.FragmentTransaction fragmentTransaction =
                getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.menu_fragment, fragment);

        fragmentTransaction.commit();




    }
}




