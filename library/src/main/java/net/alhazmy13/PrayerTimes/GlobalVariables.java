package net.alhazmy13.PrayerTimes;

/**
 * Created by Alhazmy13 on 1/22/16.
 */
interface GlobalVariables {
    // ------------------------------------------------------------
    // Calculation Methods
    final class Calculation {
        public static final int Jafari = 0; // Ithna Ashari
        public static final int Karachi = 1; // University of Islamic Sciences, Karachi
        public static final int ISNA = 2; // Islamic Society of North America (ISNA)
        public static final int MWL = 3; // Muslim World League (MWL)
        public static final int Makkah = 4; // Umm al-Qura, Makkah
        public static final int Egypt = 5; // Egyptian General Authority of Survey
        public static final int Custom = 6; // Custom Setting
        public static final int Tehran = 7; // Institute of Geophysics, University of Tehran
    }
    final class Juristic{
        // Juristic Methods
        public static final int Shafii = 0; // Shafii (standard)
        public static final int Hanafi = 1; // Hanafi
    }

    // Adjusting Methods for Higher Latitudes
     final class Adjusting{
        public static final int None = 0; // No adjustment
        public static final int MidNight = 1; // middle of night
        public static final int OneSeventh = 2; // 1/7th of night
        public static final int AngleBased = 3; // angle/60th of night
    }

    // Time Formats
    final class TimeFormat{
        public static final int Time24 = 0; // 24-hour format
        public static final int Time12 = 1; // 12-hour format
        public static final int Time12NS = 2; // 12-hour format with no suffix
        public static final int Floating = 3; // floating point number
    }
    final class Time{
        public static final int Fajr = 0;
        public static final int Sunrise = 1;
        public static final int Dhuhr = 2;
        public  static final int Asr = 3;
        public static final int Sunset = 4;
        public static final int Maghrib = 5;
        public static final int Isha = 6;
    }

}
