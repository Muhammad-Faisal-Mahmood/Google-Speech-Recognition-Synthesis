/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.libraries.speech.modelmanager.languagepack.ui;

import android.os.Bundle;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import com.google.protobuf.contrib.android.ProtoParsers$InternalDontUse;
import j$.util.Objects;

public final class DownloadActivity
extends fdb {
    public static final hei k = hei.m("com/google/android/libraries/speech/modelmanager/languagepack/ui/DownloadActivity");
    public hpr l;
    public long m;
    public jmm n;
    public AmbientModeSupport$AmbientController o;
    public bmu p;

    public final void D() {
        ((heg)((heg)k.f()).j("com/google/android/libraries/speech/modelmanager/languagepack/ui/DownloadActivity", "onCancelClicked", 97, "DownloadActivity.java")).r("#onCancelClicked");
        hyg hyg2 = fdj.a.l();
        long l2 = this.m;
        if (!hyg2.b.B()) {
            hyg2.u();
        }
        hwv hwv2 = hyg2.b;
        Object object = (fdj)hwv2;
        ((fdj)object).b |= 1;
        ((fdj)object).c = l2;
        if (!hwv2.B()) {
            hyg2.u();
        }
        object = (fdj)hyg2.b;
        ((fdj)object).d = 2;
        ((fdj)object).b = 2 | ((fdj)object).b;
        hyg2 = (fdj)hyg2.o();
        object = fxf.aj(this.n.b((fdj)hyg2), new dti(19), this.l);
        this.p.T(new cxt(object), this.o, new ProtoParsers$InternalDontUse(null, (hyf)hyg2));
    }

    @Override
    protected final void onCreate(Bundle object) {
        Object object2 = k;
        ((heg)((heg)((hdz)object2).f()).j("com/google/android/libraries/speech/modelmanager/languagepack/ui/DownloadActivity", "onCreate", 45, "DownloadActivity.java")).r("#onCreate");
        super.onCreate((Bundle)object);
        ds ds2 = this.bk();
        boolean bl2 = true;
        ds2.p(1);
        ds2 = this.getIntent();
        if (ds2.hasExtra("com.google.recognition.extra.DISPLAY_NAME") && ds2.hasExtra("com.google.recognition.extra.DOWNLOAD_SIZE") && ds2.hasExtra("com.google.recognition.extra.REQUEST_ID")) {
            if (object == null) {
                object = this.f;
                Objects.requireNonNull(this);
                this.p = new bmu((abb)object, new eyd(this, 9), fvd.ap(new eyd(this, 10)), gse.a);
                object = new AmbientModeSupport$AmbientController(this);
                this.o = object;
                object2 = this.p;
                fxf.r(true, "Use an R.id value as the callbackId");
                object2 = (gsi)((bmu)object2).a.a();
                gsi.f();
                fxf.B(((gsi)object2).f ^ true, "Callbacks must be registered in onCreate().");
                if (pc.a(((gsi)object2).a, 2131427672) != null) {
                    bl2 = false;
                }
                fxf.B(bl2, "Callback already registered.");
                object2 = ((gsi)object2).a;
                fxf.K(object);
                ((pb)object2).d(2131427672, object);
                this.m = ds2.getLongExtra("com.google.recognition.extra.REQUEST_ID", 0L);
                object = new fda();
                ds2 = ds2.getExtras();
                if (ds2 != null && !ds2.isEmpty()) {
                    ((be)object).setArguments((Bundle)ds2);
                }
                ((at)object).f(this.bb(), "DownloadDialogFragment");
                return;
            }
            ((heg)((heg)((hdz)object2).f()).j("com/google/android/libraries/speech/modelmanager/languagepack/ui/DownloadActivity", "onCreate", 60, "DownloadActivity.java")).r("Download dialog should have been created");
            return;
        }
        ((heg)((heg)((hdz)object2).g()).j("com/google/android/libraries/speech/modelmanager/languagepack/ui/DownloadActivity", "onCreate", 54, "DownloadActivity.java")).r("Display name, download size and request id must be specified");
        this.finish();
    }
}

