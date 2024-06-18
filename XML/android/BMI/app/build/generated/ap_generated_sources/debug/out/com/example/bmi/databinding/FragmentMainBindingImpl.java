package com.example.bmi.databinding;
import com.example.bmi.R;
import com.example.bmi.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentMainBindingImpl extends FragmentMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraintLayout, 1);
        sViewsWithIds.put(R.id.textView2, 2);
        sViewsWithIds.put(R.id.constraintLayout3, 3);
        sViewsWithIds.put(R.id.textField1, 4);
        sViewsWithIds.put(R.id.editText_weight, 5);
        sViewsWithIds.put(R.id.imageView_weight, 6);
        sViewsWithIds.put(R.id.imageView6, 7);
        sViewsWithIds.put(R.id.textField, 8);
        sViewsWithIds.put(R.id.editTextHeight, 9);
        sViewsWithIds.put(R.id.constraintLayout2, 10);
        sViewsWithIds.put(R.id.button_calculate, 11);
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private FragmentMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[11]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[10]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (com.google.android.material.textfield.TextInputEditText) bindings[9]
            , (com.google.android.material.textfield.TextInputEditText) bindings[5]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[6]
            , (com.google.android.material.textfield.TextInputLayout) bindings[8]
            , (com.google.android.material.textfield.TextInputLayout) bindings[4]
            , (android.widget.TextView) bindings[2]
            );
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
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
            return variableSet;
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
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}