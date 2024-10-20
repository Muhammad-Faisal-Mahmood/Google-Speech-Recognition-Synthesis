/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.accounts.Account
 *  android.content.Intent
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.text.TextUtils
 *  android.util.Log
 */
import android.accounts.Account;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.feedback.ErrorReport;
import java.util.Locale;

public final class chr
extends cdl {
    final cht a;
    final long e;

    public chr(ccv ccv2, cht cht2, long l2) {
        this.a = cht2;
        this.e = l2;
        super(ccv2);
    }

    @Override
    protected final /* synthetic */ void b(cck object) {
        Object object2;
        int n2;
        Object object3 = (cic)object;
        boolean bl2 = (Boolean)cie.c.a();
        Object object4 = this.a;
        if (bl2) {
            object = Parcel.obtain();
            chu.a((cht)object4, (Parcel)object, 0);
            n2 = object.dataSize();
            object.recycle();
            if (n2 > (Integer)cie.b.a()) {
                object = cie.b.a().toString();
                object3 = new StringBuilder("Max allowed feedback options size of ");
                ((StringBuilder)object3).append((String)object);
                ((StringBuilder)object3).append(" exceeded, you are passing in feedback options of ");
                ((StringBuilder)object3).append(n2);
                ((StringBuilder)object3).append(" size.");
                throw new IllegalStateException(((StringBuilder)object3).toString());
            }
        }
        hyg hyg2 = cif.a.l();
        object = ((cht)object4).g;
        if (!TextUtils.isEmpty((CharSequence)object)) {
            if (!((hwp)hyg2).b.B()) {
                ((hwp)hyg2).u();
            }
            object2 = (cif)((hwp)hyg2).b;
            object.getClass();
            ((cif)object2).b |= 2;
            ((cif)object2).d = object;
        } else {
            object = ((cic)object3).t.getApplicationContext().getPackageName();
            if (!((hwp)hyg2).b.B()) {
                ((hwp)hyg2).u();
            }
            object2 = (cif)((hwp)hyg2).b;
            object.getClass();
            ((cif)object2).b |= 2;
            ((cif)object2).d = object;
        }
        object = ((cif)((hwp)hyg2).b).d;
        try {
            object = ((cic)object3).t.getPackageManager().getPackageInfo((String)object, (int)0).versionName;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            object = null;
        }
        if (object != null) {
            if (!((hwp)hyg2).b.B()) {
                ((hwp)hyg2).u();
            }
            object2 = (cif)((hwp)hyg2).b;
            ((cif)object2).c |= 2;
            ((cif)object2).k = object;
        }
        if (!TextUtils.isEmpty((CharSequence)(object = ((cht)object4).a)) && !((String)object).equals("anonymous")) {
            object2 = Integer.toString(new Account((String)object, (String)"com.google").name.toLowerCase(Locale.ENGLISH).hashCode());
            if (!((hwp)hyg2).b.B()) {
                ((hwp)hyg2).u();
            }
            object = (cif)((hwp)hyg2).b;
            object2.getClass();
            ((cif)object).b |= 4;
            ((cif)object).e = object2;
        }
        if ((object2 = ((cht)object4).n) != null) {
            if (!((hwp)hyg2).b.B()) {
                ((hwp)hyg2).u();
            }
            object = (cif)((hwp)hyg2).b;
            ((cif)object).b |= 0x40;
            ((cif)object).g = object2;
        }
        if (!((hwp)hyg2).b.B()) {
            ((hwp)hyg2).u();
        }
        object = (cif)((hwp)hyg2).b;
        ((cif)object).b |= 0x10;
        ((cif)object).f = "feedback.android";
        n2 = cbo.b;
        if (!((hwp)hyg2).b.B()) {
            ((hwp)hyg2).u();
        }
        object = (cif)((hwp)hyg2).b;
        ((cif)object).b |= 0x40000000;
        ((cif)object).j = n2;
        long l2 = System.currentTimeMillis();
        if (!((hwp)hyg2).b.B()) {
            ((hwp)hyg2).u();
        }
        object2 = ((hwp)hyg2).b;
        object = (cif)object2;
        ((cif)object).b |= 0x1000000;
        ((cif)object).i = l2;
        if (((cht)object4).m != null || ((cht)object4).f != null) {
            if (!((hwv)object2).B()) {
                ((hwp)hyg2).u();
            }
            object = (cif)((hwp)hyg2).b;
            ((cif)object).c |= 0x10;
            ((cif)object).n = true;
        }
        if ((object = ((cht)object4).b) != null && !object.isEmpty()) {
            n2 = ((cht)object4).b.size();
            if (!((hwp)hyg2).b.B()) {
                ((hwp)hyg2).u();
            }
            object = (cif)((hwp)hyg2).b;
            ((cif)object).c |= 4;
            ((cif)object).l = n2;
        }
        if ((object = ((cht)object4).h) != null && !object.isEmpty()) {
            n2 = ((cht)object4).h.size();
            if (!((hwp)hyg2).b.B()) {
                ((hwp)hyg2).u();
            }
            object = (cif)((hwp)hyg2).b;
            ((cif)object).c |= 8;
            ((cif)object).m = n2;
        }
        hyg2 = (cif)((hwp)hyg2).o();
        object = (hwp)((hwv)hyg2).C(5);
        ((hwp)object).x((hwv)hyg2);
        if (!((hwp)object).b.B()) {
            ((hwp)object).u();
        }
        hyg2 = (cif)((hwp)object).b;
        ((cif)hyg2).h = 164;
        ((cif)hyg2).b |= 0x100;
        hyg2 = (cif)((hwp)object).o();
        object = ((cic)object3).t;
        if (((cif)hyg2).d.isEmpty()) {
            Log.e((String)"gF_BaseMetricsLogger", (String)"MetricsData requires appPackageName to be set");
        }
        if (((cif)hyg2).g.isEmpty()) {
            Log.e((String)"gF_BaseMetricsLogger", (String)"MetricsData requires sessionId to be set");
        }
        if (((cif)hyg2).f.isEmpty()) {
            Log.e((String)"gF_BaseMetricsLogger", (String)"MetricsData requires flow to be set");
        }
        if (((cif)hyg2).j <= 0) {
            Log.e((String)"gF_BaseMetricsLogger", (String)"MetricsData requires clientVersion to be set");
        }
        if (((cif)hyg2).i <= 0L) {
            Log.e((String)"gF_BaseMetricsLogger", (String)"MetricsData requires timestamp to be set");
        }
        if ((n2 = idi.f(((cif)hyg2).h)) == 0 || n2 == 1) {
            Log.e((String)"gF_BaseMetricsLogger", (String)"MetricsData requires user action type to be set");
        }
        l2 = this.e;
        object.sendBroadcast(new Intent().setClassName("com.google.android.gms", "com.google.android.gms.chimera.GmsIntentOperationService$GmsExternalReceiver").setAction("com.google.android.gms.googlehelp.metrics.MetricsIntentOperation.LOG_METRIC").putExtra("EXTRA_METRIC_DATA", ((hvd)hyg2).g()));
        object = new ErrorReport((cht)object4, ((cic)object3).t.getCacheDir());
        object4 = (cid)((cfc)object3).t();
        object3 = ((bov)object4).a();
        box.c((Parcel)object3, (Parcelable)object);
        object3.writeLong(l2);
        ((bov)object4).d(6, (Parcel)object3);
        this.j(Status.a);
    }
}

