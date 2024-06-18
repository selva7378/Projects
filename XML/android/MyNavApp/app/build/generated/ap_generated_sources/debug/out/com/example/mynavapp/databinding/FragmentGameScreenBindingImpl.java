package com.example.mynavapp.databinding;
import com.example.mynavapp.R;
import com.example.mynavapp.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentGameScreenBindingImpl extends FragmentGameScreenBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.constraintLayout2, 1);
        sViewsWithIds.put(R.id.button_flames, 2);
        sViewsWithIds.put(R.id.constraintLayout, 3);
        sViewsWithIds.put(R.id.editTextText, 4);
        sViewsWithIds.put(R.id.editTextText2, 5);
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentGameScreenBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FragmentGameScreenBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.Button) bindings[2]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[3]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[1]
            , (android.widget.EditText) bindings[4]
            , (android.widget.EditText) bindings[5]
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
        if (BR.gameViewModel == variableId) {
            setGameViewModel((com.example.mynavapp.screens.game.GameViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setGameViewModel(@Nullable com.example.mynavapp.screens.game.GameViewModel GameViewModel) {
        this.mGameViewModel = GameViewModel;
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
        flag 0 (0x1L): gameViewModel
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}