package ch.leafit.iac;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by marius on 26/06/14.
 */
public class SecondActivity extends Activity {

    private TextView mTxtName;
    private TextView mTxtStreet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);

        mTxtName = (TextView)findViewById(R.id.txtName);
        mTxtStreet = (TextView)findViewById(R.id.txtStreet);

        SecondActivityIntentDatastore datastore = new SecondActivityIntentDatastore(getIntent());

        mTxtName.setText(datastore.mName);
        mTxtStreet.setText(datastore.mStreet);
    }
}
