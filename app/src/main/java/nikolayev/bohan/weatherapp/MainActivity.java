package nikolayev.bohan.weatherapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    boolean isOrientationPortrait = getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT;

        Button setCity = (Button) findViewById(R.id.citySetBtn);

    if(isOrientationPortrait){
        Fragment fragmentWeather = new WeatherFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.MainActivityLayout,fragmentWeather)
                .commit();




    }

    if(!isOrientationPortrait){
        Fragment fragmentWeather = new WeatherFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.LeftFrameLayout,fragmentWeather)
                .commit();

        Fragment fragmentCitySettings = new CitySettingsFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.rightFrameLayout,fragmentCitySettings)
                .commit();


    }



    }
}