package silica.landtanin.trafficland;

import android.content.Context;

/**
 * Created by landtanin on 8/23/15 AD.
 */
public class MyAdapter {

    //Explicit
    private Context objContext;
    private int[] trafficInts;
    private String[] trafficStrings;

    public MyAdapter(Context objContext, int[] trafficInts, String[] trafficStrings) {
        this.objContext = objContext;
        this.trafficInts = trafficInts;
        this.trafficStrings = trafficStrings;
    }
} //Main class
