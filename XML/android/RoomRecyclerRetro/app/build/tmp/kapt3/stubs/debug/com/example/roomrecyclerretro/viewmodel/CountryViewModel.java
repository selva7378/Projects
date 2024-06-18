package com.example.roomrecyclerretro.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bJ\u0006\u0010\u001d\u001a\u00020\u0019J\u0011\u0010\u001e\u001a\u00020\u0019H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\u0006\u0010 \u001a\u00020\u0019J\u0019\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020\u000fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#J\b\u0010$\u001a\u00020\u0019H\u0014R\"\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006%"}, d2 = {"Lcom/example/roomrecyclerretro/viewmodel/CountryViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "database", "Lcom/example/roomrecyclerretro/database/CountriesDatabaseDao;", "application", "Landroid/app/Application;", "(Lcom/example/roomrecyclerretro/database/CountriesDatabaseDao;Landroid/app/Application;)V", "dataListFromApi", "", "Lcom/example/roomrecyclerretro/networklayer/CountriesItem;", "getDataListFromApi", "()Ljava/util/List;", "setDataListFromApi", "(Ljava/util/List;)V", "dataListFromRoom", "Lcom/example/roomrecyclerretro/database/Countries;", "getDataListFromRoom", "setDataListFromRoom", "getDatabase", "()Lcom/example/roomrecyclerretro/database/CountriesDatabaseDao;", "uiScope", "Lkotlinx/coroutines/CoroutineScope;", "viewModelJob", "Lkotlinx/coroutines/CompletableJob;", "dbInsert", "", "name", "", "flag", "dbRetrieve", "get", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMyData", "insert", "country", "(Lcom/example/roomrecyclerretro/database/Countries;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCleared", "app_debug"})
public final class CountryViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.roomrecyclerretro.database.CountriesDatabaseDao database = null;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.CompletableJob viewModelJob;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.CoroutineScope uiScope = null;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.example.roomrecyclerretro.networklayer.CountriesItem> dataListFromApi;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.example.roomrecyclerretro.database.Countries> dataListFromRoom;
    
    public CountryViewModel(@org.jetbrains.annotations.NotNull
    com.example.roomrecyclerretro.database.CountriesDatabaseDao database, @org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.roomrecyclerretro.database.CountriesDatabaseDao getDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.roomrecyclerretro.networklayer.CountriesItem> getDataListFromApi() {
        return null;
    }
    
    public final void setDataListFromApi(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.roomrecyclerretro.networklayer.CountriesItem> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.roomrecyclerretro.database.Countries> getDataListFromRoom() {
        return null;
    }
    
    public final void setDataListFromRoom(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.roomrecyclerretro.database.Countries> p0) {
    }
    
    public final void getMyData() {
    }
    
    public final void dbInsert(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String flag) {
    }
    
    private final java.lang.Object insert(com.example.roomrecyclerretro.database.Countries country, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    public final void dbRetrieve() {
    }
    
    private final java.lang.Object get(kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
}