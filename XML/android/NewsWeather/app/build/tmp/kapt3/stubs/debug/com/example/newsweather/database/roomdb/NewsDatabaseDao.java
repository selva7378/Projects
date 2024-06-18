package com.example.newsweather.database.roomdb;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\'J \u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\'J(\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\'J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0006H\'J(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\'\u00a8\u0006\u0011"}, d2 = {"Lcom/example/newsweather/database/roomdb/NewsDatabaseDao;", "", "clear", "", "getAll", "", "Lcom/example/newsweather/database/roomdb/News;", "pageSize", "", "offset", "getAllByCategory", "category", "", "insert", "news", "search", "query", "app_debug"})
@androidx.room.Dao
public abstract interface NewsDatabaseDao {
    
    @androidx.room.Insert
    public abstract void insert(@org.jetbrains.annotations.NotNull
    com.example.newsweather.database.roomdb.News news);
    
    @androidx.room.Query(value = "SELECT * FROM News")
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.example.newsweather.database.roomdb.News> getAll();
    
    @androidx.room.Query(value = "DELETE FROM News")
    public abstract void clear();
    
    @androidx.room.Query(value = "SELECT * FROM News WHERE category = :category LIMIT :pageSize OFFSET :offset")
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.example.newsweather.database.roomdb.News> getAllByCategory(@org.jetbrains.annotations.NotNull
    java.lang.String category, int pageSize, int offset);
    
    @androidx.room.Query(value = "SELECT * FROM News LIMIT :pageSize OFFSET :offset")
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.example.newsweather.database.roomdb.News> getAll(int pageSize, int offset);
    
    @androidx.room.Query(value = "SELECT * FROM News WHERE title LIKE \'%\' || :query || \'%\' LIMIT :pageSize OFFSET :offset")
    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<com.example.newsweather.database.roomdb.News> search(@org.jetbrains.annotations.Nullable
    java.lang.String query, int pageSize, int offset);
}