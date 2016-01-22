package net.alhazmy13.example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import net.alhazmy13.PrayerTimes.PrayerTime;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    TextView fajir,dhur,asr,maghrib,isha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        double latitude = 24.466667;
        double longitude = 39.6;
        double timezone = 3;
        // Test Prayer times here
        PrayerTime prayers = new PrayerTime();
        prayers.setTimeFormat(PrayerTime.TimeFormat.Time12);
        prayers.setCalcMethod(PrayerTime.Calculation.Makkah);
        prayers.setAsrJuristic(PrayerTime.Juristic.Shafii);
        prayers.setAdjustHighLats(PrayerTime.Adjusting.AngleBased);
        prayers.setOffsets(new int[]{0, 0, 0, 0, 0, 0, 0});

        ArrayList<String> prayerTimes = prayers.getPrayerTimes(Calendar.getInstance(),
                latitude, longitude, timezone);
        fajir.setText(prayerTimes.get(PrayerTime.Time.Fajr));
        dhur.setText(prayerTimes.get(PrayerTime.Time.Dhuhr));
        asr.setText(prayerTimes.get(PrayerTime.Time.Asr));
        maghrib.setText(prayerTimes.get(PrayerTime.Time.Maghrib));
        isha.setText(prayerTimes.get(PrayerTime.Time.Isha));



    }

    private void init() {
        fajir = (TextView) findViewById(R.id.fajir);
        dhur = (TextView) findViewById(R.id.duhr);
        asr = (TextView) findViewById(R.id.asr);
        maghrib = (TextView) findViewById(R.id.magrib);
        isha = (TextView) findViewById(R.id.isha);
    }
}
