/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Fragment
 *  android.app.FragmentManager
 *  android.content.Context
 *  android.os.Bundle
 *  android.util.Log
 */
package androidx.wear.ambient;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.wear.ambient.AmbientDelegate;
import androidx.wear.ambient.AmbientDelegate$AmbientCallback;
import androidx.wear.ambient.AmbientMode$1;
import androidx.wear.ambient.AmbientMode$AmbientCallback;
import androidx.wear.ambient.AmbientMode$AmbientCallbackProvider;
import androidx.wear.ambient.AmbientMode$AmbientController;
import java.io.FileDescriptor;
import java.io.PrintWriter;

@Deprecated
public final class AmbientMode
extends Fragment {
    public static final String EXTRA_BURN_IN_PROTECTION = "com.google.android.wearable.compat.extra.BURN_IN_PROTECTION";
    public static final String EXTRA_LOWBIT_AMBIENT = "com.google.android.wearable.compat.extra.LOWBIT_AMBIENT";
    public static final String FRAGMENT_TAG = "android.support.wearable.ambient.AmbientMode";
    AmbientDelegate a;
    AmbientMode$AmbientCallback b;
    private final AmbientDelegate$AmbientCallback c = new AmbientMode$1();
    private final AmbientMode$AmbientController d = new AmbientMode$AmbientController((Object)this);

    public static AmbientMode$AmbientController attachAmbientSupport(Activity object) {
        FragmentManager fragmentManager = object.getFragmentManager();
        AmbientMode ambientMode = (AmbientMode)fragmentManager.findFragmentByTag(FRAGMENT_TAG);
        object = ambientMode;
        if (ambientMode == null) {
            object = new AmbientMode();
            fragmentManager.beginTransaction().add((Fragment)object, FRAGMENT_TAG).commit();
        }
        return object.d;
    }

    public final void dump(String string, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] stringArray) {
        AmbientDelegate ambientDelegate = this.a;
        if (ambientDelegate != null) {
            ambientDelegate.a(string, fileDescriptor, printWriter, stringArray);
        }
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        this.a = new AmbientDelegate(this.getActivity(), this.c);
        if (context instanceof AmbientMode$AmbientCallbackProvider) {
            this.b = ((AmbientMode$AmbientCallbackProvider)context).getAmbientCallback();
            return;
        }
        Log.w((String)"AmbientMode", (String)"No callback provided - enabling only smart resume");
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a.b();
        if (this.b != null) {
            this.a.g();
        }
    }

    public final void onDestroy() {
        this.a.c();
        super.onDestroy();
    }

    public final void onDetach() {
        this.a = null;
        super.onDetach();
    }

    public final void onPause() {
        this.a.d();
        super.onPause();
    }

    public final void onResume() {
        super.onResume();
        this.a.e();
    }

    public final void onStop() {
        this.a.f();
        super.onStop();
    }
}

