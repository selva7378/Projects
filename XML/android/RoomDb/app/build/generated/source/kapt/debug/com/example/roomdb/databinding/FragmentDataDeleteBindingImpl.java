package com.example.roomdb.databinding;
import com.example.roomdb.R;
import com.example.roomdb.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentDataDeleteBindingImpl extends FragmentDataDeleteBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.button_back, 2);
        sViewsWithIds.put(R.id.buttonDelete, 3);
    }
    // views
    @NonNull
    private final android.widget.FrameLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentDataDeleteBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private FragmentDataDeleteBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.Button) bindings[2]
            , (android.widget.Button) bindings[3]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (android.widget.FrameLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.textView.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
        if (BR.dataDeleteViewModel == variableId) {
            setDataDeleteViewModel((com.example.roomdb.viewmodel.CommonViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setDataDeleteViewModel(@Nullable com.example.roomdb.viewmodel.CommonViewModel DataDeleteViewModel) {
        this.mDataDeleteViewModel = DataDeleteViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.dataDeleteViewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeDataDeleteViewModelEmployeeGetValue((androidx.lifecycle.LiveData<com.example.roomdb.database.Employee>) object, fieldId);
            case 1 :
                return onChangeDataDeleteViewModelEmployee((androidx.lifecycle.LiveData<androidx.lifecycle.LiveData<com.example.roomdb.database.Employee>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeDataDeleteViewModelEmployeeGetValue(androidx.lifecycle.LiveData<com.example.roomdb.database.Employee> DataDeleteViewModelEmployeeGetValue, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeDataDeleteViewModelEmployee(androidx.lifecycle.LiveData<androidx.lifecycle.LiveData<com.example.roomdb.database.Employee>> DataDeleteViewModelEmployee, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
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
        java.lang.String javaLangStringNameDataDeleteViewModelEmployeeNameJavaLangStringNEmailDataDeleteViewModelEmployeeName = null;
        java.lang.String dataDeleteViewModelEmployeePhNumber = null;
        java.lang.String javaLangStringNameDataDeleteViewModelEmployeeNameJavaLangStringNEmail = null;
        com.example.roomdb.database.Employee dataDeleteViewModelEmployeeGetValueGetValue = null;
        androidx.lifecycle.LiveData<com.example.roomdb.database.Employee> dataDeleteViewModelEmployeeGetValue = null;
        java.lang.String dataDeleteViewModelEmployeeName = null;
        androidx.lifecycle.LiveData<androidx.lifecycle.LiveData<com.example.roomdb.database.Employee>> dataDeleteViewModelEmployee = null;
        java.lang.String javaLangStringNameDataDeleteViewModelEmployeeNameJavaLangStringNEmailDataDeleteViewModelEmployeeNameJavaLangStringNPhoneDataDeleteViewModelEmployeePhNumberJavaLangStringNOccupationDataDeleteViewModelEmployeeOccupation = null;
        java.lang.String javaLangStringNameDataDeleteViewModelEmployeeNameJavaLangStringNEmailDataDeleteViewModelEmployeeNameJavaLangStringNPhoneDataDeleteViewModelEmployeePhNumberJavaLangStringNOccupationDataDeleteViewModelEmployeeOccupationJavaLangStringNAddressDataDeleteViewModelEmployeeAddress = null;
        java.lang.String javaLangStringNameDataDeleteViewModelEmployeeNameJavaLangStringNEmailDataDeleteViewModelEmployeeNameJavaLangStringNPhoneDataDeleteViewModelEmployeePhNumberJavaLangStringNOccupation = null;
        java.lang.String javaLangStringNameDataDeleteViewModelEmployeeName = null;
        com.example.roomdb.viewmodel.CommonViewModel dataDeleteViewModel = mDataDeleteViewModel;
        java.lang.String dataDeleteViewModelEmployeeOccupation = null;
        java.lang.String javaLangStringNameDataDeleteViewModelEmployeeNameJavaLangStringNEmailDataDeleteViewModelEmployeeNameJavaLangStringNPhoneDataDeleteViewModelEmployeePhNumberJavaLangStringNOccupationDataDeleteViewModelEmployeeOccupationJavaLangStringNAddress = null;
        java.lang.String javaLangStringNameDataDeleteViewModelEmployeeNameJavaLangStringNEmailDataDeleteViewModelEmployeeNameJavaLangStringNPhone = null;
        java.lang.String javaLangStringNameDataDeleteViewModelEmployeeNameJavaLangStringNEmailDataDeleteViewModelEmployeeNameJavaLangStringNPhoneDataDeleteViewModelEmployeePhNumber = null;
        java.lang.String dataDeleteViewModelEmployeeAddress = null;

        if ((dirtyFlags & 0xfL) != 0) {



                if (dataDeleteViewModel != null) {
                    // read dataDeleteViewModel.employee
                    dataDeleteViewModelEmployee = dataDeleteViewModel.getEmployee();
                }
                updateLiveDataRegistration(1, dataDeleteViewModelEmployee);


                if (dataDeleteViewModelEmployee != null) {
                    // read dataDeleteViewModel.employee.getValue()
                    dataDeleteViewModelEmployeeGetValue = dataDeleteViewModelEmployee.getValue();
                }
                updateLiveDataRegistration(0, dataDeleteViewModelEmployeeGetValue);


                if (dataDeleteViewModelEmployeeGetValue != null) {
                    // read dataDeleteViewModel.employee.getValue().getValue()
                    dataDeleteViewModelEmployeeGetValueGetValue = dataDeleteViewModelEmployeeGetValue.getValue();
                }


                if (dataDeleteViewModelEmployeeGetValueGetValue != null) {
                    // read dataDeleteViewModel.employee.getValue().getValue().phNumber
                    dataDeleteViewModelEmployeePhNumber = dataDeleteViewModelEmployeeGetValueGetValue.getPhNumber();
                    // read dataDeleteViewModel.employee.getValue().getValue().name
                    dataDeleteViewModelEmployeeName = dataDeleteViewModelEmployeeGetValueGetValue.getName();
                    // read dataDeleteViewModel.employee.getValue().getValue().occupation
                    dataDeleteViewModelEmployeeOccupation = dataDeleteViewModelEmployeeGetValueGetValue.getOccupation();
                    // read dataDeleteViewModel.employee.getValue().getValue().address
                    dataDeleteViewModelEmployeeAddress = dataDeleteViewModelEmployeeGetValueGetValue.getAddress();
                }


                // read ("Name: ") + (dataDeleteViewModel.employee.getValue().getValue().name)
                javaLangStringNameDataDeleteViewModelEmployeeName = ("Name: ") + (dataDeleteViewModelEmployeeName);


                // read (("Name: ") + (dataDeleteViewModel.employee.getValue().getValue().name)) + ("\nEmail: ")
                javaLangStringNameDataDeleteViewModelEmployeeNameJavaLangStringNEmail = (javaLangStringNameDataDeleteViewModelEmployeeName) + ("\nEmail: ");


                // read ((("Name: ") + (dataDeleteViewModel.employee.getValue().getValue().name)) + ("\nEmail: ")) + (dataDeleteViewModel.employee.getValue().getValue().name)
                javaLangStringNameDataDeleteViewModelEmployeeNameJavaLangStringNEmailDataDeleteViewModelEmployeeName = (javaLangStringNameDataDeleteViewModelEmployeeNameJavaLangStringNEmail) + (dataDeleteViewModelEmployeeName);


                // read (((("Name: ") + (dataDeleteViewModel.employee.getValue().getValue().name)) + ("\nEmail: ")) + (dataDeleteViewModel.employee.getValue().getValue().name)) + ("\nPhone: ")
                javaLangStringNameDataDeleteViewModelEmployeeNameJavaLangStringNEmailDataDeleteViewModelEmployeeNameJavaLangStringNPhone = (javaLangStringNameDataDeleteViewModelEmployeeNameJavaLangStringNEmailDataDeleteViewModelEmployeeName) + ("\nPhone: ");


                // read ((((("Name: ") + (dataDeleteViewModel.employee.getValue().getValue().name)) + ("\nEmail: ")) + (dataDeleteViewModel.employee.getValue().getValue().name)) + ("\nPhone: ")) + (dataDeleteViewModel.employee.getValue().getValue().phNumber)
                javaLangStringNameDataDeleteViewModelEmployeeNameJavaLangStringNEmailDataDeleteViewModelEmployeeNameJavaLangStringNPhoneDataDeleteViewModelEmployeePhNumber = (javaLangStringNameDataDeleteViewModelEmployeeNameJavaLangStringNEmailDataDeleteViewModelEmployeeNameJavaLangStringNPhone) + (dataDeleteViewModelEmployeePhNumber);


                // read (((((("Name: ") + (dataDeleteViewModel.employee.getValue().getValue().name)) + ("\nEmail: ")) + (dataDeleteViewModel.employee.getValue().getValue().name)) + ("\nPhone: ")) + (dataDeleteViewModel.employee.getValue().getValue().phNumber)) + ("\nOccupation: ")
                javaLangStringNameDataDeleteViewModelEmployeeNameJavaLangStringNEmailDataDeleteViewModelEmployeeNameJavaLangStringNPhoneDataDeleteViewModelEmployeePhNumberJavaLangStringNOccupation = (javaLangStringNameDataDeleteViewModelEmployeeNameJavaLangStringNEmailDataDeleteViewModelEmployeeNameJavaLangStringNPhoneDataDeleteViewModelEmployeePhNumber) + ("\nOccupation: ");


                // read ((((((("Name: ") + (dataDeleteViewModel.employee.getValue().getValue().name)) + ("\nEmail: ")) + (dataDeleteViewModel.employee.getValue().getValue().name)) + ("\nPhone: ")) + (dataDeleteViewModel.employee.getValue().getValue().phNumber)) + ("\nOccupation: ")) + (dataDeleteViewModel.employee.getValue().getValue().occupation)
                javaLangStringNameDataDeleteViewModelEmployeeNameJavaLangStringNEmailDataDeleteViewModelEmployeeNameJavaLangStringNPhoneDataDeleteViewModelEmployeePhNumberJavaLangStringNOccupationDataDeleteViewModelEmployeeOccupation = (javaLangStringNameDataDeleteViewModelEmployeeNameJavaLangStringNEmailDataDeleteViewModelEmployeeNameJavaLangStringNPhoneDataDeleteViewModelEmployeePhNumberJavaLangStringNOccupation) + (dataDeleteViewModelEmployeeOccupation);


                // read (((((((("Name: ") + (dataDeleteViewModel.employee.getValue().getValue().name)) + ("\nEmail: ")) + (dataDeleteViewModel.employee.getValue().getValue().name)) + ("\nPhone: ")) + (dataDeleteViewModel.employee.getValue().getValue().phNumber)) + ("\nOccupation: ")) + (dataDeleteViewModel.employee.getValue().getValue().occupation)) + ("\nAddress: ")
                javaLangStringNameDataDeleteViewModelEmployeeNameJavaLangStringNEmailDataDeleteViewModelEmployeeNameJavaLangStringNPhoneDataDeleteViewModelEmployeePhNumberJavaLangStringNOccupationDataDeleteViewModelEmployeeOccupationJavaLangStringNAddress = (javaLangStringNameDataDeleteViewModelEmployeeNameJavaLangStringNEmailDataDeleteViewModelEmployeeNameJavaLangStringNPhoneDataDeleteViewModelEmployeePhNumberJavaLangStringNOccupationDataDeleteViewModelEmployeeOccupation) + ("\nAddress: ");


                // read ((((((((("Name: ") + (dataDeleteViewModel.employee.getValue().getValue().name)) + ("\nEmail: ")) + (dataDeleteViewModel.employee.getValue().getValue().name)) + ("\nPhone: ")) + (dataDeleteViewModel.employee.getValue().getValue().phNumber)) + ("\nOccupation: ")) + (dataDeleteViewModel.employee.getValue().getValue().occupation)) + ("\nAddress: ")) + (dataDeleteViewModel.employee.getValue().getValue().address)
                javaLangStringNameDataDeleteViewModelEmployeeNameJavaLangStringNEmailDataDeleteViewModelEmployeeNameJavaLangStringNPhoneDataDeleteViewModelEmployeePhNumberJavaLangStringNOccupationDataDeleteViewModelEmployeeOccupationJavaLangStringNAddressDataDeleteViewModelEmployeeAddress = (javaLangStringNameDataDeleteViewModelEmployeeNameJavaLangStringNEmailDataDeleteViewModelEmployeeNameJavaLangStringNPhoneDataDeleteViewModelEmployeePhNumberJavaLangStringNOccupationDataDeleteViewModelEmployeeOccupationJavaLangStringNAddress) + (dataDeleteViewModelEmployeeAddress);
        }
        // batch finished
        if ((dirtyFlags & 0xfL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.textView, javaLangStringNameDataDeleteViewModelEmployeeNameJavaLangStringNEmailDataDeleteViewModelEmployeeNameJavaLangStringNPhoneDataDeleteViewModelEmployeePhNumberJavaLangStringNOccupationDataDeleteViewModelEmployeeOccupationJavaLangStringNAddressDataDeleteViewModelEmployeeAddress);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): dataDeleteViewModel.employee.getValue()
        flag 1 (0x2L): dataDeleteViewModel.employee
        flag 2 (0x3L): dataDeleteViewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}