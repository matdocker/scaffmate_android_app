package mathewdocker.com.saffoldingapplication;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Mathew on 31/10/2016.
 */
public class SwmsActivity extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_bar_main);

        TouchImageView img = new TouchImageView(this);
        img.setImageResource(R.drawable.swms_example);
        img.setMaxZoom(4f);
        setContentView(img);


    }
}


