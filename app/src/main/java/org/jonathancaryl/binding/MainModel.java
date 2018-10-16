package org.jonathancaryl.binding;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class MainModel extends BaseObservable {
    private final OtherModel otherModel = new OtherModel();

    @Bindable
    public OtherModel getOtherModel() {
        return otherModel;
    }

    @Bindable
    public String getFoo() {
        return "foo";
    }
}
