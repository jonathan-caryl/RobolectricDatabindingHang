package org.jonathancaryl.binding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class SomePageViewModel extends BaseObservable {
    @Bindable
    public String getSomething() {
        return "somethingFromSomePageViewModel";
    }
}
