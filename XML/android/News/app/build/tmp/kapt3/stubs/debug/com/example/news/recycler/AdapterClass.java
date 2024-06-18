package com.example.news.recycler;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/news/recycler/AdapterClass;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/news/recycler/AdapterClass$ViewHolderClass;", "dataList", "", "", "newsViewModel", "Lcom/example/news/viewmodels/newsviewmodel/NewsViewModel;", "(Ljava/util/List;Lcom/example/news/viewmodels/newsviewmodel/NewsViewModel;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolderClass", "app_debug"})
public final class AdapterClass extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.news.recycler.AdapterClass.ViewHolderClass> {
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> dataList = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.news.viewmodels.newsviewmodel.NewsViewModel newsViewModel = null;
    
    public AdapterClass(@org.jetbrains.annotations.NotNull
    java.util.List<java.lang.String> dataList, @org.jetbrains.annotations.NotNull
    com.example.news.viewmodels.newsviewmodel.NewsViewModel newsViewModel) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.example.news.recycler.AdapterClass.ViewHolderClass onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.news.recycler.AdapterClass.ViewHolderClass holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/example/news/recycler/AdapterClass$ViewHolderClass;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "rvTitle", "Landroid/widget/TextView;", "getRvTitle", "()Landroid/widget/TextView;", "app_debug"})
    public static final class ViewHolderClass extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final android.widget.TextView rvTitle = null;
        
        public ViewHolderClass(@org.jetbrains.annotations.NotNull
        android.view.View itemView) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.widget.TextView getRvTitle() {
            return null;
        }
    }
}