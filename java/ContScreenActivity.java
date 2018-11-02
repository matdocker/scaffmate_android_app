package mathewdocker.com.saffoldingapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Mathew on 4/11/2016.
 */

public class ContScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TouchImageView img = new TouchImageView(this);
        img.setImageResource(R.drawable.contain_screen1);
        img.setMaxZoom(4f);
        setContentView(img);


    }
}
