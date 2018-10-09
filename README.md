<p align="center">
  <img src="https://cloud.githubusercontent.com/assets/4659608/12700363/37218668-c7f0-11e5-9edf-944176e4019f.png">
</p>
</br>

# Prayer Times
![](https://img.shields.io/badge/Platform-Android-brightgreen.svg)
![](https://img.shields.io/crates/l/rustc-serialize.svg)
![](https://img.shields.io/badge/version-1.0.1_beta-blue.svg)

------ 
Prayer Times provides a set of handy functions to calculate prayer times for any location around the world, based on a variety of calculation methods currently used in Muslim communities.

You can report any issue on issues page. **Note: If you speak Arabic, you can submit issues with Arabic language and I will check them. :)**


## Installation
------ 
**Maven**
```xml
<dependency>
<groupId>net.alhazmy13.PrayerTimes</groupId>
<artifactId>library</artifactId>
<version>1.0.1-beta</version>
</dependency>
```


**Gradle**
```gradle
dependencies {
	compile 'net.alhazmy13.PrayerTimes:library:1.0.1-beta'
	}
```

# Usage
------ 

### Create an `PrayerTime`
You will need to create a new instance of `PrayerTime`. Once the instance are configured, you can call `getPrayerTimes()`.
```java
		PrayerTime prayers = new PrayerTime();
        prayers.setTimeFormat(PrayerTime.TimeFormat.Time12);
        prayers.setCalcMethod(PrayerTime.Calculation.Makkah);
        prayers.setAsrJuristic(PrayerTime.Juristic.Shafii);
        prayers.setAdjustHighLats(PrayerTime.Adjusting.AngleBased);
        prayers.setOffsets(new int[]{0, 0, 0, 0, 0, 0, 0});
        ArrayList<String> prayerTimes = prayers.getPrayerTimes(Calendar.getInstance(),
                latitude, longitude, timezone);
```


### Configurations
* `setTimeFormat` To change the time format to:
	* `Time24`  24-hour format
	* `Time12`  12-hour format
	* `Time12NS`  12-hour format with no suffix
	* `Floating`  floating point number
```java
prayers.setTimeFormat(PrayerTime.TimeFormat.Time12);
```
* `setCalcMethod` To change the Calculation Methods.
	* `Karachi`  University of Islamic Sciences, Karachi
	* `ISNA`  Islamic Society of North America (ISNA)
	* `MWL`  Muslim World League (MWL)
	* `Makkah`  Umm al-Qura, Makkah
	* `Egypt`  Egyptian General Authority of Survey
	* `Jafari`  Ithna Ashari
	* `Tehran`  Institute of Geophysics, University of Tehran
	* `Custom`  Custom Setting
```java
 prayers.setCalcMethod(PrayerTime.Calculation.Makkah);
```
* `setAsrJuristic` To change Juristic Method for Asr
	* `Shafii`  Shafii (standard)
	* `Hanafi`  Hanafi
```java
prayers.setAsrJuristic(PrayerTime.Juristic.Shafii);
```
* `setAdjustHighLats` Adjusting Methods for Higher Latitudes
	* `None`  No adjustment
	* `MidNight`  middle of night
	* `OneSeventh`  1/7th of night
	* `AngleBased`  angle/60th of night
```java
prayers.setAdjustHighLats(PrayerTime.Adjusting.AngleBased);
```
* `setOffsets` Tune timings for adjustments
```java
prayers.setOffsets(new int[]{0, 0, 0, 0, 0, 0, 0});
```


## License
------ 
    Copyright 2016 alhazmy

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
    

