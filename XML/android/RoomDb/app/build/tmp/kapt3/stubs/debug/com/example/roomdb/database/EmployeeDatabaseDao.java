package com.example.roomdb.database;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0010\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005H\'J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H\'\u00a8\u0006\t"}, d2 = {"Lcom/example/roomdb/database/EmployeeDatabaseDao;", "", "clear", "", "get", "Landroidx/lifecycle/LiveData;", "Lcom/example/roomdb/database/Employee;", "insert", "employee", "app_debug"})
@androidx.room.Dao
public abstract interface EmployeeDatabaseDao {
    
    @androidx.room.Insert
    public abstract void insert(@org.jetbrains.annotations.NotNull
    com.example.roomdb.database.Employee employee);
    
    @androidx.room.Query(value = "SELECT * FROM employees ORDER BY employeeId DESC LIMIT 1")
    @org.jetbrains.annotations.NotNull
    public abstract androidx.lifecycle.LiveData<com.example.roomdb.database.Employee> get();
    
    @androidx.room.Query(value = "DELETE FROM employees")
    public abstract void clear();
}