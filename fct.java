/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Intent
 *  android.os.Bundle
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public final class fct {
    public static final hei a = hei.m("com/google/android/libraries/speech/modelmanager/languagepack/legacy/DownloadDialogFragmentPeer");
    public final Activity b;
    public final fcn c;
    public final hwj d;
    public final gbu e;
    public final fcj f;
    public final fbt g;
    public final dxi h;
    public final gpm i;
    public final fch j;
    public boolean k = false;
    public String l = "";
    public Long m = 0L;
    public String n = "-1";
    public final geg o = new fcq(this);
    public final geg p = new fcr(this);
    public final gbv q = new fcs(this);
    public final goi r;
    public final hth s;

    public fct(Activity activity, fcn fcn2, hwj hwj2, gbu gbu2, fcj fcj2, goi goi2, fbt fbt2, dxi dxi2, gpm gpm2, fch fch2, hth hth2) {
        this.b = activity;
        this.c = fcn2;
        this.d = hwj2;
        this.e = gbu2;
        this.f = fcj2;
        this.r = goi2;
        this.g = fbt2;
        this.h = dxi2;
        this.i = gpm2;
        this.j = fch2;
        this.s = hth2;
    }

    public final String a() {
        Bundle bundle = this.c.l;
        if (bundle != null && bundle.containsKey("android.speech.extra.LANGUAGE")) {
            return bundle.getString("android.speech.extra.LANGUAGE");
        }
        return null;
    }

    public final void b() {
        this.c.c();
        this.b.finish();
    }

    public final void c(bql bql2) {
        this.c.c();
        Intent intent = new Intent();
        hwp hwp2 = bqm.a.l();
        if (!hwp2.b.B()) {
            hwp2.u();
        }
        bqm bqm2 = (bqm)hwp2.b;
        bqm2.c = bql2.f;
        bqm2.b |= 1;
        intent.putExtra("com.google.recognition.extra.ENQUEUE_STATUS", ((bqm)hwp2.o()).g());
        this.b.setResult(-1, intent);
        this.b.finish();
    }
}

