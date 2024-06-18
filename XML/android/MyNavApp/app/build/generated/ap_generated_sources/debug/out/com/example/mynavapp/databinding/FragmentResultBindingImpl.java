package com.example.mynavapp.databinding;
import com.example.mynavapp.R;
import com.example.mynavapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentResultBindingImpl extends FragmentResultBinding implements com.example.mynavapp.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraintLayout4, 2);
        sViewsWithIds.put(R.id.constraintLayout3, 3);
        sViewsWithIds.put(R.id.textView2, 4);
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentResultBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private FragmentResultBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[2]
            , (android.widget.TextView) bindings[4]
            );
        this.buttonBack.setTag(null);
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.example.mynavapp.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.resultViewModel == variableId) {
            setResultViewModel((com.example.mynavapp.screens.result.ResultViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setResultViewModel(@Nullable com.example.mynavapp.screens.result.ResultViewModel ResultViewModel) {
        this.mResultViewModel = ResultViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.resultViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.example.mynavapp.screens.result.ResultViewModel resultViewModel = mResultViewModel;
        // batch finished
        if ((dirtyFlags & 0x2L) != 0) {
            // api target 1

            this.buttonBack.setOnClickListener(mCallback1);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // resultViewModel
        com.example.mynavapp.screens.result.ResultViewModel resultViewModel = mResultViewModel;
        // resultViewModel != null
        boolean resultViewModelJavaLangObjectNull = false;



        resultViewModelJavaLangObjectNull = (resultViewModel) != (null);
        if (resultViewModelJavaLangObjectNull) {


            resultViewModel.onPlayAgain();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): resultViewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}