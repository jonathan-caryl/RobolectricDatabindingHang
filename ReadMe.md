A simple app using databinding, which causes Robolectric tests to hang — but only when we upgrade from the databinding that comes with com.android.tools.build:gradle:2.1.3 to the one that comes with 3.1.4. The app works fine outside Robolectric in both versions.


Obviously this isn't a 'real' app, there's no reason to use databinding like this, but this is the smallest app I could get to recreate the problem.