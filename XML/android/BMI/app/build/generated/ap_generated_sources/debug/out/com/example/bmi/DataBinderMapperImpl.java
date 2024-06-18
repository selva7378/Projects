package com.example.bmi;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.bmi.databinding.ActivityMainBindingImpl;
import com.example.bmi.databinding.ActivitySplashBindingImpl;
import com.example.bmi.databinding.FragmentCheckYourHealthBindingImpl;
import com.example.bmi.databinding.FragmentMainBindingImpl;
import com.example.bmi.databinding.FragmentResultBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_ACTIVITYSPLASH = 2;

  private static final int LAYOUT_FRAGMENTCHECKYOURHEALTH = 3;

  private static final int LAYOUT_FRAGMENTMAIN = 4;

  private static final int LAYOUT_FRAGMENTRESULT = 5;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(5);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.bmi.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.bmi.R.layout.activity_splash, LAYOUT_ACTIVITYSPLASH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.bmi.R.layout.fragment_check_your_health, LAYOUT_FRAGMENTCHECKYOURHEALTH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.bmi.R.layout.fragment_main, LAYOUT_FRAGMENTMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.bmi.R.layout.fragment_result, LAYOUT_FRAGMENTRESULT);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYSPLASH: {
          if ("layout/activity_splash_0".equals(tag)) {
            return new ActivitySplashBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_splash is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCHECKYOURHEALTH: {
          if ("layout/fragment_check_your_health_0".equals(tag)) {
            return new FragmentCheckYourHealthBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_check_your_health is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMAIN: {
          if ("layout/fragment_main_0".equals(tag)) {
            return new FragmentMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTRESULT: {
          if ("layout/fragment_result_0".equals(tag)) {
            return new FragmentResultBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_result is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(5);

    static {
      sKeys.put("layout/activity_main_0", com.example.bmi.R.layout.activity_main);
      sKeys.put("layout/activity_splash_0", com.example.bmi.R.layout.activity_splash);
      sKeys.put("layout/fragment_check_your_health_0", com.example.bmi.R.layout.fragment_check_your_health);
      sKeys.put("layout/fragment_main_0", com.example.bmi.R.layout.fragment_main);
      sKeys.put("layout/fragment_result_0", com.example.bmi.R.layout.fragment_result);
    }
  }
}
