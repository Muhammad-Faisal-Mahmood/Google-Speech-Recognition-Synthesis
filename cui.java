/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.NotificationChannel
 *  android.app.NotificationManager
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.content.Intent
 *  android.net.Uri
 *  android.os.Bundle
 */
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.concurrent.Callable;

public final class cui
implements hny {
    public final cuq a;
    public final csu b;

    public /* synthetic */ cui(cuq cuq2, csu csu2) {
        this.a = cuq2;
        this.b = csu2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final hpn a(Object object) {
        int n2;
        int n3 = ((cvn)(object = (cvn)object)).b() - 1;
        if (n3 == 1) {
            return ((cvn)object).c();
        }
        if (n3 == 2) {
            return hhk.K(((cvn)object).a());
        }
        csu csu2 = this.b;
        cuq cuq2 = this.a;
        object = ((cvn)object).d();
        Object object2 = cuq2.a;
        Object object3 = new NotificationChannel("download-notification-channel-id", (CharSequence)object2.getResources().getString(2132017357), 3);
        ag$$ExternalSyntheticApiModelOutline0.m((NotificationManager)object2.getSystemService(NotificationManager.class), (NotificationChannel)object3);
        object2 = ctq.a.l();
        if (!((hwp)object2).b.B()) {
            ((hwp)object2).u();
        }
        object3 = csu2.a;
        Object object4 = (ctq)((hwp)object2).b;
        object3.getClass();
        ((ctq)object4).b |= 1;
        ((ctq)object4).c = object3;
        object4 = cuq2.a.getPackageName();
        if (!((hwp)object2).b.B()) {
            ((hwp)object2).u();
        }
        Object object5 = (ctq)((hwp)object2).b;
        object4.getClass();
        ((ctq)object5).b |= 2;
        ((ctq)object5).d = object4;
        object4 = (ctq)((hwp)object2).o();
        object2 = cvg.a((String)object3);
        object = object3 = ((cth)object).m;
        if (object3 == null) {
            object = ctj.a;
        }
        n3 = n2 = a.t(((ctj)object).d);
        if (n2 == 0) {
            n3 = 1;
        }
        n2 = n3;
        if (csu2.f.g()) {
            try {
                int n4;
                n2 = n4 = a.t(cqq.P((csp)((csp)csu2.f.c())).d);
                if (n4 == 0) {
                    n2 = 1;
                }
            }
            catch (hxn hxn2) {
                n2 = n3;
            }
        }
        object = (n3 = n2 - 1) != 0 && n3 != 2 ? cuq2.a.getResources().getString(2132017361) : cuq2.a.getResources().getString(2132017362);
        sp sp2 = new sp(cuq2.a);
        String string = csu2.a;
        object3 = cuq2.a;
        n3 = csu2.h;
        Object object6 = csu2.d;
        object5 = cvg.a(string);
        string = (String)((gto)object6).e(string);
        Object object7 = (String)csu2.e.e(csu2.a);
        object6 = cqq.d((Context)object3);
        ((sk)object6).f(string);
        ((sk)object6).e((CharSequence)object7);
        ((sk)object6).g = null;
        ((sk)object6).i(0x1080081);
        ((sk)object6).g(true);
        ((sk)object6).h(n3, 0, false);
        object3 = csu2.a;
        n2 = csu2.j;
        n3 = ((String)object3).hashCode();
        if (n2 == 2) {
            object3 = cuq2.a;
            object7 = cuq2.f;
            string = ((cvg)object5).a;
            object7 = new Intent((Context)object3, (Class)((gto)object7).c());
            object7.setPackage(object3.getPackageName());
            object7.putExtra("cancel-action", n3);
            object7.putExtra("key", string);
            fxf.r(true, "Cannot set any dangerous parts of intent to be mutable.");
            fxf.r(true, "Cannot use Intent.FILL_IN_ACTION unless the action is marked as mutable.");
            fxf.r(true, "Cannot use Intent.FILL_IN_DATA unless the data is marked as mutable.");
            fxf.r(true, "Cannot use Intent.FILL_IN_CATEGORIES unless the category is marked as mutable.");
            fxf.r(true, "Cannot use Intent.FILL_IN_CLIP_DATA unless the clip data is marked as mutable.");
            boolean bl2 = object7.getComponent() != null;
            fxf.r(bl2, "Must set component on Intent.");
            if (eyi.a(0, 1)) {
                fxf.r(eyi.a(0x44000000, 0x4000000) ^ true, "Cannot set mutability flags if PendingIntent.FLAG_IMMUTABLE is set.");
            } else {
                fxf.r(eyi.a(0x44000000, 0x4000000), "Must set PendingIntent.FLAG_IMMUTABLE for SDK >= 23 if no parts of intent are mutable.");
            }
            string = new Intent((Intent)object7);
            if (!eyi.a(0x44000000, 0x4000000)) {
                if (string.getPackage() == null) {
                    string.setPackage(string.getComponent().getPackageName());
                }
                if (!eyi.a(0, 3) && string.getAction() == null) {
                    string.setAction("");
                }
                if (!eyi.a(0, 9) && string.getCategories() == null) {
                    string.addCategory("");
                }
                if (!eyi.a(0, 5) && string.getData() == null) {
                    string.setDataAndType(Uri.EMPTY, "*/*");
                }
                if (!eyi.a(0, 17) && string.getClipData() == null) {
                    string.setClipData(eyi.a);
                }
            }
            string = ag$$ExternalSyntheticApiModelOutline0.m((Context)object3, n3, (Intent)string, 0x44000000);
            object3 = object3.getResources().getString(2132017359);
            fxf.K(string);
            IconCompat iconCompat = IconCompat.c(17301642);
            object7 = new Bundle();
            CharSequence charSequence = sk.c((CharSequence)object3);
            kl[] klArray = new ArrayList();
            object3 = new ArrayList();
            if (!klArray.isEmpty()) {
                klArray = klArray.toArray(new kl[klArray.size()]);
            }
            object3 = object3.isEmpty() ? null : object3.toArray(new kl[object3.size()]);
            object3 = new si(iconCompat, charSequence, (PendingIntent)string, (Bundle)object7, (kl[])object3);
            ((sk)object6).b.add(object3);
            sp2.a(n3, ((sk)object6).a());
        }
        object3 = new cun(cuq2, (cvg)object5, csu2, (sk)object6, sp2, n3, (String)object);
        ((daa)cuq2.e.c()).g(csu2.a, (csv)object3);
        try {
            object = csu2.f.g() ? gto.i(cqq.P((csp)csu2.f.c())) : gsl.a;
            object5 = new hpo((Callable)new cuh(0));
            object = dah.e((hpn)object5).g(new btb(cuq2, object4, object, 4, null), cuq2.d).g(new btb((Object)cuq2, (ctq)object4, (Object)csu2, 5), cuq2.d).f(new ain(12), cuq2.d);
        }
        catch (hxn hxn3) {
            return hhk.J(hxn3);
        }
        object = fxf.ak(cuq2.i.f(((cvg)object2).a, (hpn)object), new bpu(object5, object, 10, null), cuq2.d);
        fxf.al((hpn)object, new cmr(object3, 2), cuq2.d);
        return object;
    }
}

