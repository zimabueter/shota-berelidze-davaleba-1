package com.example.shota.berelidze.weather.controller;

import com.example.shota.berelidze.weather.model.Weather;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/weather-controller")
public class WeatherController {

    public List<Weather> generateWeathers() {
        List<Weather> weatherList=new ArrayList<>();
        weatherList.add(new Weather(23,"tbilisi",88,10,14));
        weatherList.add(new Weather(5,"batumi",1,25,2));
        return weatherList;
    }

    @GET
    @Path("/weather")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Weather> getWeathers() {
        return generateWeathers();
    }

    @GET
    @Path("/getCity/{cityName}")
    @Produces(MediaType.APPLICATION_JSON)
    public Weather getStudent(@PathParam("cityName") int cityName) {
        Weather weatherForReturn = null;
        for(Weather city: getWeathers()) {
            weatherForReturn =  new Weather(0, "NOT FOUND", 0, 0, 0);
        }
        return weatherForReturn;
    }

    @POST
    @Path("addWeather")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public void addWeather(Weather weather) {
        System.out.println(weather.toString());
    }



    @GET
    @Path("/getWeather/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Weather getWeather(@PathParam("id") int id) {
        System.out.println(id);
        return new Weather(id,"TBILISI",25,80,71);
    }
}