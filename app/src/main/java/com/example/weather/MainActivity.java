package com.example.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    static TextView cityName;
    static TextView temp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cityName=(TextView)findViewById(R.id.place);
        temp=(TextView)findViewById(R.id.temp);
        String cName=cityName.getText().toString();
        weather getData= new weather();
        getData.execute("http://api.openweathermap.org/data/2.5/weather?q="+cName+"&units=metric&appid=74a16a8c56f5be6affd326d66470ce65");
    }
}