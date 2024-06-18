package com.example.news.viewmodels.weatherviewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0015\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u0005R\u0016\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00128F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006\u0017"}, d2 = {"Lcom/example/news/viewmodels/weatherviewmodel/WeatherViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_temperature", "Landroidx/lifecycle/MutableLiveData;", "", "doubleTemperature", "", "getDoubleTemperature", "()D", "setDoubleTemperature", "(D)V", "location", "getLocation", "()Ljava/lang/String;", "setLocation", "(Ljava/lang/String;)V", "temperature", "Landroidx/lifecycle/LiveData;", "getTemperature", "()Landroidx/lifecycle/LiveData;", "getMyWeatherData", "", "app_debug"})
public final class WeatherViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> _temperature = null;
    private double doubleTemperature = 0.0;
    @org.jetbrains.annotations.NotNull
    private java.lang.String location = "";
    
    public WeatherViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.lang.String> getTemperature() {
        return null;
    }
    
    public final double getDoubleTemperature() {
        return 0.0;
    }
    
    public final void setDoubleTemperature(double p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLocation() {
        return null;
    }
    
    public final void setLocation(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final void getMyWeatherData(@org.jetbrains.annotations.NotNull
    java.lang.String location) {
    }
}