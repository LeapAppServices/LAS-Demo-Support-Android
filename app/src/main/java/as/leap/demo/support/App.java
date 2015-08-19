package as.leap.demo.support;

import android.app.Application;

import as.leap.LCHelpCenter;
import as.leap.LeapCloud;


public class App extends Application {

    public static final String APP_ID = "Replace this with your App Id";
    public static final String API_KEY = "Replace this with your Rest Key";

    @Override
    public void onCreate() {
        super.onCreate();

        if (APP_ID.startsWith("Replace") || API_KEY.startsWith("Replace")) {
            throw new IllegalArgumentException("Please replace with your app id and api key first before" +
                    "using LeapCloud SDK.");
        }

        LeapCloud.setLogLevel(LeapCloud.LOG_LEVEL_VERBOSE);
        LeapCloud.initialize(this, APP_ID, API_KEY);

        LCHelpCenter.allowAlertNewMessage(false);
    }
}