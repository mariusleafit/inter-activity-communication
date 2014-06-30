package ch.leafit.iac;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;

public class HelloAndroidActivity extends Activity {

    /**
     * Called when the activity is first created.
     * @param savedInstanceState If the activity is being re-initialized after 
     * previously being shut down then this Bundle contains the data it most 
     * recently supplied in onSaveInstanceState(Bundle). <b>Note: Otherwise it is null.</b>
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showSecondActivity(View v) {
        SecondActivityIntentDatastore datastore = new SecondActivityIntentDatastore("Marius","Rigiblick");
        Intent secondActivityIntent = datastore.getIntent(this,SecondActivity.class);
        startActivity(secondActivityIntent);
        //startActivityForResult(secondActivityIntent,identifierID);
    }
}

