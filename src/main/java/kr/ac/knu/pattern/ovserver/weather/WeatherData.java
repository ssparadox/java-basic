package kr.ac.knu.pattern.ovserver.weather;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by rokim on 2017. 5. 28..
 */
@Data
@AllArgsConstructor
public class WeatherData {
    // 온도
    private float temperature;
    // 습도
    private float humidity;
    // 기압
    private float pressure;
}
