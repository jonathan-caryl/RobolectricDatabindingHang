package org.jonathancaryl.binding;

import android.databinding.BindingAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;

import org.jonathancaryl.binding.databinding.SomePageBinding;

public class BindingAdapters {
    @BindingAdapter({"dummy"})
    public static void setPage(final FrameLayout pageContainer, final String dummy) {
        final SomePageBinding binding = SomePageBinding.inflate(LayoutInflater.from(pageContainer.getContext()));
        binding.setViewModel(new SomePageViewModel());
        final View newView = binding.getRoot();

        pageContainer.addView(newView);
    }
}
