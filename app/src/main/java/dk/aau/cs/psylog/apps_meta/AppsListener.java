package dk.aau.cs.psylog.apps_meta;

import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

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
