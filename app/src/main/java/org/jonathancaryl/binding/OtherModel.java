package org.jonathancaryl.binding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class OtherModel extends BaseObservable {
    @Bindable
    public String getBar() {
        return "bar";
    }
}
