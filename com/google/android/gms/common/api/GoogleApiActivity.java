/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Dialog
 *  android.app.PendingIntent
 *  android.content.ActivityNotFoundException
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnCancelListener
 *  android.content.Intent
 *  android.content.IntentSender$SendIntentException
 *  android.os.Build
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.util.Log
 */
package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;

public class GoogleApiActivity
extends Activity
implements DialogInterface.OnCancelListener {
    protected int a = 0;

    public static Intent a(Context context, PendingIntent pendingIntent, int n2, boolean bl2) {
        context = new Intent(context, GoogleApiActivity.class);
        context.putExtra("pending_intent", (Parcelable)pendingIntent);
        context.putExtra("failing_client_id", n2);
        context.putExtra("notify_manager", bl2);
        return context;
    }

    private final void b() {
        Object object = this.getIntent().getExtras();
        if (object == null) {
            Log.e((String)"GoogleApiActivity", (String)"Activity started without extras");
            this.finish();
            return;
        }
        Object object2 = (PendingIntent)object.get("pending_intent");
        Integer n2 = (Integer)object.get("error_code");
        if (object2 == null && n2 == null) {
            Log.e((String)"GoogleApiActivity", (String)"Activity started without resolution");
            this.finish();
            return;
        }
        if (object2 != null) {
            try {
                this.startIntentSenderForResult(object2.getIntentSender(), 1, null, 0, 0, 0);
                this.a = 1;
                return;
            }
            catch (IntentSender.SendIntentException sendIntentException) {
                Log.e((String)"GoogleApiActivity", (String)"Failed to launch pendingIntent", (Throwable)sendIntentException);
                this.finish();
                return;
            }
            catch (ActivityNotFoundException activityNotFoundException) {
                if (object.getBoolean("notify_manager", true)) {
                    cea.c((Context)this).d(new cbk(22, null), this.getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    object = object2 = a.ar(object2, "Activity not found while launching ", ".");
                    if (Build.FINGERPRINT.contains("generic")) {
                        object = ((String)object2).concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    Log.e((String)"GoogleApiActivity", (String)object, (Throwable)activityNotFoundException);
                }
                this.a = 1;
                this.finish();
                return;
            }
        }
        kl.at(n2);
        int n3 = n2;
        object = cbo.a;
        object2 = ((cbo)object).c((Context)this, n3, new cfi(((cbp)object).g((Context)this, n3, "d"), this), this);
        if (object2 != null) {
            ((cbo)object).a(this, (Dialog)object2, "GooglePlayServicesErrorDialog", this);
        }
        this.a = 1;
    }

    protected final void onActivityResult(int n2, int n3, Intent object) {
        super.onActivityResult(n2, n3, (Intent)object);
        if (n2 == 1) {
            boolean bl2 = this.getIntent().getBooleanExtra("notify_manager", true);
            this.a = 0;
            this.setResult(n3, (Intent)object);
            if (bl2) {
                object = cea.c((Context)this);
                if (n3 != -1) {
                    if (n3 == 0) {
                        ((cea)object).d(new cbk(13, null), this.getIntent().getIntExtra("failing_client_id", -1));
                    }
                } else {
                    ((cea)object).e();
                }
            }
        } else if (n2 == 2) {
            this.a = 0;
            this.setResult(n3, (Intent)object);
        }
        this.finish();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.a = 0;
        this.setResult(0);
        this.finish();
    }

    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.a = bundle.getInt("resolution");
        }
        if (this.a != 1) {
            this.b();
        }
    }

    protected final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.a);
        super.onSaveInstanceState(bundle);
    }
}

