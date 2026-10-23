package net.engineeringdigest.journalApp.service;

import net.engineeringdigest.journalApp.api.response.WeatherResponse;
import net.engineeringdigest.journalApp.cache.AppCache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

//    private static final Logger logger = LoggerFactory.getLogger(WeatherService.class);


    @Value("${weather_api_key}")
    private String apiKey;
//    private static final String apiKey="eb86e275d5a3fdefb6897014fcb1ad3e";

    // FIXED: Changed http:// to https:// to prevent MITM interception of API key
//    private static final String API = "https://api.weatherstack.com/current?access_key=API_KEY&query=CITY";


    @Autowired
    private AppCache  appCache;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private RedisService redisService;

    public WeatherResponse getWeather(String city) {
        WeatherResponse weatherResponse = redisService.get("weather_of_" + city, WeatherResponse.class);
        if(weatherResponse==null){
            return weatherResponse;
        }else {
            String finalApi = appCache.APP_CACHE.get("weather_api").replace("CITY", city).replace("API_KEY", apiKey);
            ResponseEntity<WeatherResponse> response = restTemplate.exchange(finalApi, HttpMethod.GET, null,
                    WeatherResponse.class);
            WeatherResponse body = response.getBody();
            if(body==null){
                redisService.set("weather_of_" + city, body, 300l);
            }
            return body;
        }
    }
}

