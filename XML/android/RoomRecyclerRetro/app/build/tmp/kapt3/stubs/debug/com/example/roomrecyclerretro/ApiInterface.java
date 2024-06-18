package com.example.roomrecyclerretro;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00040\u0003H\'\u00a8\u0006\u0006"}, d2 = {"Lcom/example/roomrecyclerretro/ApiInterface;", "", "getData", "Lretrofit2/Call;", "", "Lcom/example/roomrecyclerretro/networklayer/CountriesItem;", "app_debug"})
public abstract interface ApiInterface {
    
    @retrofit2.http.GET(value = "all?fields=name,flags")
    @org.jetbrains.annotations.NotNull
    public abstract retrofit2.Call<java.util.List<com.example.roomrecyclerretro.networklayer.CountriesItem>> getData();
}