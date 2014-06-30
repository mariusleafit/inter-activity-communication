package ch.leafit.iac;

import android.content.Context;
import android.content.Intent;

/**
 * Created by marius on 26/06/14.
 */
public class SecondActivityIntentDatastore extends IntentDatastore {
    /*
	 * data-ids
	 */
    private static final String name_id = "name";
    private static final String street_id = "street";

    /*
     * data members
     */
    public String mName;
    public String mStreet;

    public SecondActivityIntentDatastore(String name, String street) {
        mName = name;
        mStreet = street;
    }

    public SecondActivityIntentDatastore(Intent i){
        super(i);
        getExtra(i);
    }

    @Override
    public Intent getIntent(Context context, Class<?> cls) {
        Intent intent = new Intent(context, cls);
        putExtra(intent);
        return intent;
    }

    @Override
    public Intent getIntent(Intent out) {
        putExtra(out);
        return out;
    }

    @Override
    protected void putExtra(Intent out) {
        if(out != null) {
            out.putExtra(name_id, mName);
            out.putExtra(street_id, mStreet);
        }
    }

    @SuppressWarnings("unchecked")
    @Override
    protected void getExtra(Intent in) {
        if(in != null) {
            mName = in.getStringExtra(name_id);
            mStreet = in.getStringExtra(street_id);
        }
    }
}
