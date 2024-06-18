package com.example.roomdb.viewmodel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u0014\u001a\u00020\u0015H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u0019\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0002J\u0019\u0010\u0019\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\nH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u0015H\u0014J\u0006\u0010\u001c\u001a\u00020\u0015J.\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u001fR\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001f\u0010\r\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t0\t8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006$"}, d2 = {"Lcom/example/roomdb/viewmodel/CommonViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "database", "Lcom/example/roomdb/database/EmployeeDatabaseDao;", "application", "Landroid/app/Application;", "(Lcom/example/roomdb/database/EmployeeDatabaseDao;Landroid/app/Application;)V", "_employee", "Landroidx/lifecycle/MutableLiveData;", "Landroidx/lifecycle/LiveData;", "Lcom/example/roomdb/database/Employee;", "getDatabase", "()Lcom/example/roomdb/database/EmployeeDatabaseDao;", "employee", "getEmployee", "()Landroidx/lifecycle/LiveData;", "uiScope", "Lkotlinx/coroutines/CoroutineScope;", "viewModelJob", "Lkotlinx/coroutines/CompletableJob;", "delete", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getEmployeeFromDatabase", "initializeEmployee", "insert", "(Lcom/example/roomdb/database/Employee;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onCleared", "onDelete", "onGo", "name", "", "email", "phoneNo", "occupation", "address", "app_debug"})
public final class CommonViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.roomdb.database.EmployeeDatabaseDao database = null;
    @org.jetbrains.annotations.NotNull
    private kotlinx.coroutines.CompletableJob viewModelJob;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.CoroutineScope uiScope = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<androidx.lifecycle.LiveData<com.example.roomdb.database.Employee>> _employee = null;
    
    public CommonViewModel(@org.jetbrains.annotations.NotNull
    com.example.roomdb.database.EmployeeDatabaseDao database, @org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.roomdb.database.EmployeeDatabaseDao getDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<androidx.lifecycle.LiveData<com.example.roomdb.database.Employee>> getEmployee() {
        return null;
    }
    
    private final void initializeEmployee() {
    }
    
    private final java.lang.Object getEmployeeFromDatabase(kotlin.coroutines.Continuation<? super androidx.lifecycle.LiveData<com.example.roomdb.database.Employee>> $completion) {
        return null;
    }
    
    public final void onGo(@org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String phoneNo, @org.jetbrains.annotations.NotNull
    java.lang.String occupation, @org.jetbrains.annotations.NotNull
    java.lang.String address) {
    }
    
    private final java.lang.Object insert(com.example.roomdb.database.Employee employee, kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    public final void onDelete() {
    }
    
    private final java.lang.Object delete(kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @java.lang.Override
    protected void onCleared() {
    }
}