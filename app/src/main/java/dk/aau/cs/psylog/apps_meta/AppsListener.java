package dk.aau.cs.psylog.apps_meta;

import android.app.usage.UsageStats;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

import java.util.Calendar;
import java.util.List;

import dk.aau.cs.psylog.module_lib.ISensor;

public class AppsListener implements SensorEventListener, ISensor {

    private Context context;

    public AppsListener(Context context)
    {
        this.context = context;
    }

    public void dostuff()
        {

            //UsageStatsManager usageStatsManager = new UsageStatsManager(context, context.getSystemService("USAGE_STATS_SERVICE"));
            //context.getSystemService(Context.USAGE_STATS_SERVICE);
            //final UsageStatsManager usageStatsManager=(UsageStatsManager)context.getSystemService(Context.USAGE_STATS_SERVICE);
            /*final Calendar beginCal=Calendar.getInstance();
            beginCal.set(Calendar.DATE,1);
            beginCal.set(Calendar.MONTH,0);
            beginCal.set(Calendar.YEAR,2012);
            final Calendar endCal=Calendar.getInstance();
            endCal.set(Calendar.DATE,1);
            endCal.set(Calendar.MONTH,0);
            endCal.set(Calendar.YEAR,2014);
            final UsageStatsManager usageStatsManager=(UsageStatsManager)context.getSystemService("usagestats");// Context.USAGE_STATS_SERVICE);
            final List<UsageStats> queryUsageStats=usageStatsManager.queryUsageStats(UsageStatsManager.INTERVAL_YEARLY,beginCal.getTimeInMillis(),endCal.getTimeInMillis());
            */

        }

    @Override
    public void startSensor() {

    }

    @Override
    public void stopSensor() {

    }

    @Override
    public void sensorParameters(Intent intent) {

    }

    @Override
    public void onSensorChanged(SensorEvent event) {

    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}
