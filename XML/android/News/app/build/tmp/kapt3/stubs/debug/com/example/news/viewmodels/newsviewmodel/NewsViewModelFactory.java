package com.example.news.viewmodels.newsviewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J%\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\b0\u000bH\u0016\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/news/viewmodels/newsviewmodel/NewsViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "dataSource", "Lcom/example/news/roomdb/news/NewsDatabaseDao;", "application", "Landroid/app/Application;", "(Lcom/example/news/roomdb/news/NewsDatabaseDao;Landroid/app/Application;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
public final class NewsViewModelFactory implements androidx.lifecycle.ViewModelProvider.Factory {
    @org.jetbrains.annotations.NotNull
    private final com.example.news.roomdb.news.NewsDatabaseDao dataSource = null;
    @org.jetbrains.annotations.NotNull
    private final android.app.Application application = null;
    
    public NewsViewModelFactory(@org.jetbrains.annotations.NotNull
    com.example.news.roomdb.news.NewsDatabaseDao dataSource, @org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super();
    }
    
    @java.lang.Override
    @kotlin.Suppress(names = {"unchecked cast"})
    @org.jetbrains.annotations.NotNull
    public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull
    java.lang.Class<T> modelClass) {
        return null;
    }
}