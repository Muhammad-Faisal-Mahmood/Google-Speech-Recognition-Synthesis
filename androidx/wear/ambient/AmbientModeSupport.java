/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.util.Log
 */
package androidx.wear.ambient;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.wear.ambient.AmbientDelegate;
import androidx.wear.ambient.AmbientDelegate$AmbientCallback;
import androidx.wear.ambient.AmbientModeSupport$1;
import androidx.wear.ambient.AmbientModeSupport$AmbientCallback;
import androidx.wear.ambient.AmbientModeSupport$AmbientCallbackProvider;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import java.io.FileDescriptor;
import java.io.PrintWriter;

@Deprecated
public final class AmbientModeSupport
extends be {
    public static final String EXTRA_BURN_IN_PROTECTION = "com.google.android.wearable.compat.extra.BURN_IN_PROTECTION";
    public static final String EXTRA_LOWBIT_AMBIENT = "com.google.android.wearable.compat.extra.LOWBIT_AMBIENT";
    public static final String FRAGMENT_TAG = "android.support.wearable.ambient.AmbientMode";
    AmbientDelegate a;
    AmbientModeSupport$AmbientCallback b;
    private final AmbientDelegate$AmbientCallback c = new AmbientModeSupport$1();
    private final AmbientModeSupport$AmbientController d = new AmbientModeSupport$AmbientController(this);

    public static AmbientModeSupport$AmbientController attach(bh aco2) {
        by by2 = aco2.bb();
        Object object = (AmbientModeSupport)by2.e(FRAGMENT_TAG);
        aco2 = object;
        if (object == null) {
            aco2 = new AmbientModeSupport();
            object = new y(by2);
            ((ce)object).m((be)aco2, FRAGMENT_TAG);
            ((ce)object).h();
        }
        return ((AmbientModeSupport)aco2).d;
    }

    @Override
    public final void dump(String string, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] stringArray) {
        AmbientDelegate ambientDelegate = this.a;
        if (ambientDelegate != null) {
            ambientDelegate.a(string, fileDescriptor, printWriter, stringArray);
        }
    }

    @Override
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.a = new AmbientDelegate(this.getActivity(), this.c);
        if (context instanceof AmbientModeSupport$AmbientCallbackProvider) {
            this.b = ((AmbientModeSupport$AmbientCallbackProvider)context).getAmbientCallback();
            return;
        }
        Log.w((String)"AmbientModeSupport", (String)"No callback provided - enabling only smart resume");
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a.b();
        if (this.b != null) {
            this.a.g();
        }
    }

    @Override
    public final void onDestroy() {
        this.a.c();
        super.onDestroy();
    }

    @Override
    public final void onDetach() {
        this.a = null;
        super.onDetach();
    }

    @Override
    public final void onPause() {
        this.a.d();
        super.onPause();
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.a.e();
    }

    @Override
    public final void onStop() {
        this.a.f();
        super.onStop();
    }
}

