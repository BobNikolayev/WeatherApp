package nikolayev.bohan.weatherapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

public class CitySettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_settings);

        Fragment fragmentCitySettings = new CitySettingsFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.citySetActivityLayout,fragmentCitySettings)
                .commit();
    }
}