package as.leap.demo.support;

import android.app.Application;

import as.leap.LASConfig;
import as.leap.LASHelpCenter;

public class App extends Application {

    public static final String APP_ID = "Replace this with your App Id";
    public static final String API_KEY = "Replace this with your Rest Key";

    @Override
    public void onCreate() {
        super.onCreate();

        if (APP_ID.startsWith("Replace") || API_KEY.startsWith("Replace")) {
            throw new IllegalArgumentException("Please replace with your app id and api key first before" +
                    "using LAS SDK.");
        }

        LASConfig.setLogLevel(LASConfig.LOG_LEVEL_VERBOSE);
        LASConfig.initialize(this, APP_ID, API_KEY);

        LASHelpCenter.allowAlertNewMessage(false);
    }
}