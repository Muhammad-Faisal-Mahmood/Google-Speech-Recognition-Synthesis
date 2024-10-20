/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.AlertDialog$Builder
 *  android.app.Dialog
 *  android.app.FragmentManager
 *  android.app.Notification
 *  android.app.NotificationChannel
 *  android.app.NotificationManager
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.content.DialogInterface$OnCancelListener
 *  android.content.DialogInterface$OnClickListener
 *  android.content.res.Resources
 *  android.os.Bundle
 *  android.util.Log
 *  android.util.TypedValue
 */
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import androidx.core.graphics.drawable.IconCompat;

public final class cbo
extends cbp {
    public static final cbo a;
    public static final int b;
    private static final Object e;

    static {
        e = new Object();
        a = new cbo();
        b = cbp.c;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(Activity object, Dialog dialog, String string, DialogInterface.OnCancelListener onCancelListener) {
        block2: {
            by by2;
            try {
                boolean bl2 = object instanceof bh;
                if (!bl2) break block2;
                by2 = ((bh)object).bb();
                object = new cci();
            }
            catch (NoClassDefFoundError noClassDefFoundError) {
                break block2;
            }
            a.s(dialog, "Cannot display null dialog");
            dialog.setOnCancelListener(null);
            dialog.setOnDismissListener(null);
            ((cci)object).ag = dialog;
            ((cci)object).ah = onCancelListener;
            ((at)object).e(by2, string);
            return;
        }
        FragmentManager fragmentManager = object.getFragmentManager();
        object = new cbl();
        a.s(dialog, "Cannot display null dialog");
        dialog.setOnCancelListener(null);
        dialog.setOnDismissListener(null);
        ((cbl)((Object)object)).a = dialog;
        ((cbl)((Object)object)).b = onCancelListener;
        object.show(fragmentManager, string);
    }

    public final void b(Context context, int n2) {
        this.d(context, n2, this.h(context, n2, "n"));
    }

    public final Dialog c(Context object, int n2, cfk cfk2, DialogInterface.OnCancelListener object2) {
        AlertDialog.Builder builder = null;
        if (n2 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        object.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(object.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(object, 5);
        }
        typedValue = builder;
        if (builder == null) {
            typedValue = new AlertDialog.Builder(object);
        }
        typedValue.setMessage((CharSequence)cff.b(object, n2));
        typedValue.setOnCancelListener(object2);
        object2 = object.getResources();
        object2 = n2 != 1 ? (n2 != 2 ? (n2 != 3 ? object2.getString(17039370) : object2.getString(2132017241)) : object2.getString(2132017251)) : object2.getString(2132017244);
        if (object2 != null) {
            typedValue.setPositiveButton((CharSequence)object2, (DialogInterface.OnClickListener)cfk2);
        }
        if ((object = cff.c(object, n2)) != null) {
            typedValue.setTitle((CharSequence)object);
        }
        Log.w((String)"GoogleApiAvailability", (String)String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", n2), (Throwable)new IllegalArgumentException());
        return typedValue.create();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void d(Context object, int n2, PendingIntent object2) {
        String string;
        Log.w((String)"GoogleApiAvailability", (String)String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", n2, null), (Throwable)new IllegalArgumentException());
        if (n2 == 18) {
            new cbn(this, (Context)object).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (object2 == null) {
            if (n2 != 6) return;
            Log.w((String)"GoogleApiAvailability", (String)"Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
            return;
        }
        if (n2 == 6) {
            string = cff.e((Context)object, "common_google_play_services_resolution_required_title");
            n2 = 6;
        } else {
            string = cff.c((Context)object, n2);
        }
        Object object3 = string;
        if (string == null) {
            object3 = object.getResources().getString(2132017248);
        }
        string = n2 != 6 && n2 != 19 ? cff.b((Context)object, n2) : cff.d((Context)object, "common_google_play_services_resolution_required_text", cff.a((Context)object));
        Resources resources = object.getResources();
        Object object4 = object.getSystemService("notification");
        kl.at(object4);
        object4 = (NotificationManager)object4;
        sk sk2 = new sk((Context)object, null);
        sk2.m = true;
        sk2.d(16, true);
        sk2.f((CharSequence)object3);
        object3 = new sj();
        ((sj)object3).a = sk.c(string);
        sk2.j((sl)object3);
        boolean bl2 = cgt.a((Context)object);
        int n3 = 17301642;
        if (bl2) {
            int n4 = object.getApplicationInfo().icon;
            if (n4 != 0) {
                n3 = n4;
            }
            sk2.i(n3);
            sk2.h = 2;
            if (cgt.c((Context)object)) {
                string = resources.getString(2132017256);
                sk2.b.add(new si(IconCompat.c(2131230967), string, (PendingIntent)object2, new Bundle(), null));
            } else {
                sk2.g = object2;
            }
        } else {
            sk2.i(17301642);
            object3 = resources.getString(2132017248);
            sk2.q.tickerText = sk.c((CharSequence)object3);
            sk2.q.when = System.currentTimeMillis();
            sk2.g = object2;
            sk2.e(string);
        }
        object2 = e;
        // MONITORENTER : object2
        // MONITOREXIT : object2
        object2 = ag$$ExternalSyntheticApiModelOutline0.m((NotificationManager)object4, "com.google.android.gms.availability");
        object = object.getResources().getString(2132017247);
        if (object2 == null) {
            ag$$ExternalSyntheticApiModelOutline0.m((NotificationManager)object4, new NotificationChannel("com.google.android.gms.availability", (CharSequence)object, 4));
        } else if (!((String)object).contentEquals(ag$$ExternalSyntheticApiModelOutline0.m((NotificationChannel)object2))) {
            ag$$ExternalSyntheticApiModelOutline0.m((NotificationChannel)object2, (CharSequence)object);
            ag$$ExternalSyntheticApiModelOutline0.m((NotificationManager)object4, (NotificationChannel)object2);
        }
        sk2.p = "com.google.android.gms.availability";
        object = sk2.a();
        if (n2 != 1 && n2 != 2 && n2 != 3) {
            n2 = 39789;
        } else {
            ccg.b.set(false);
            n2 = 10436;
        }
        object4.notify(n2, (Notification)object);
    }
}

