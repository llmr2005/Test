package com.ynap.wcs.models;


import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

@Data
@FieldDefaults(level= AccessLevel.PRIVATE)
public class CityTemp {
    String city;
    String temperature;
    String humidity;
    String weatherDescription;
    String windSpeed;
    String windDirectionDegree;
}
