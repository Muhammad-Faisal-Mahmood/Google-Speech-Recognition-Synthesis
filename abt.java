/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Fragment
 *  android.os.Build$VERSION
 *  android.os.Bundle
 */
import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

public class abt
extends Fragment {
    public static final int a = 0;

    private final void a(aaz aaz2) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = this.getActivity();
            jse.d(activity, "activity");
            wd.l(activity, aaz2);
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.a(aaz.ON_CREATE);
    }

    public final void onDestroy() {
        super.onDestroy();
        this.a(aaz.ON_DESTROY);
    }

    public final void onPause() {
        super.onPause();
        this.a(aaz.ON_PAUSE);
    }

    public final void onResume() {
        super.onResume();
        this.a(aaz.ON_RESUME);
    }

    public final void onStart() {
        super.onStart();
        this.a(aaz.ON_START);
    }

    public final void onStop() {
        super.onStop();
        this.a(aaz.ON_STOP);
    }
}

