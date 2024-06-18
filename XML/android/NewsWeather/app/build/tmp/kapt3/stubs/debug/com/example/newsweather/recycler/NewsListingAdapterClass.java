package com.example.newsweather.recycler;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010\t\u001a\u00020\n2\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\fJ\u0006\u0010\r\u001a\u00020\nJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0016R\u0018\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/newsweather/recycler/NewsListingAdapterClass;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/newsweather/recycler/NewsListingAdapterClass$ViewHolderClass;", "navController", "Landroidx/navigation/NavController;", "(Landroidx/navigation/NavController;)V", "dataList", "", "Lcom/example/newsweather/database/roomdb/News;", "addData", "", "newData", "", "clearData", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolderClass", "app_debug"})
public final class NewsListingAdapterClass extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.newsweather.recycler.NewsListingAdapterClass.ViewHolderClass> {
    @org.jetbrains.annotations.NotNull
    private final androidx.navigation.NavController navController = null;
    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.example.newsweather.database.roomdb.News> dataList = null;
    
    public NewsListingAdapterClass(@org.jetbrains.annotations.NotNull
    androidx.navigation.NavController navController) {
        super();
    }
    
    public final void addData(@org.jetbrains.annotations.Nullable
    java.util.List<com.example.newsweather.database.roomdb.News> newData) {
    }
    
    public final void clearData() {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.example.newsweather.recycler.NewsListingAdapterClass.ViewHolderClass onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.newsweather.recycler.NewsListingAdapterClass.ViewHolderClass holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\b\u00a8\u0006\u000f"}, d2 = {"Lcom/example/newsweather/recycler/NewsListingAdapterClass$ViewHolderClass;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "rvDescription", "Landroid/widget/TextView;", "getRvDescription", "()Landroid/widget/TextView;", "rvImage", "Landroid/widget/ImageView;", "getRvImage", "()Landroid/widget/ImageView;", "rvTitle", "getRvTitle", "app_debug"})
    public static final class ViewHolderClass extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final android.widget.ImageView rvImage = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView rvTitle = null;
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView rvDescription = null;
        
        public ViewHolderClass(@org.jetbrains.annotations.NotNull
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.ImageView getRvImage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getRvTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getRvDescription() {
            return null;
        }
    }
}