package com.example.news.api.weatherapi;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'\u00a8\u0006\b"}, d2 = {"Lcom/example/news/api/weatherapi/WeatherApiInterface;", "", "getWeather", "Lretrofit2/Call;", "Lcom/example/news/api/weatherapi/Weather;", "location", "", "apiKey", "app_debug"})
public abstract interface WeatherApiInterface {
    
    @retrofit2.http.GET(value = "weather/realtime")
    @org.jetbrains.annotations.NotNull
    public abstract retrofit2.Call<com.example.news.api.weatherapi.Weather> getWeather(@retrofit2.http.Query(value = "location")
    @org.jetbrains.annotations.NotNull
    java.lang.String location, @retrofit2.http.Query(value = "apikey")
    @org.jetbrains.annotations.NotNull
    java.lang.String apiKey);
}