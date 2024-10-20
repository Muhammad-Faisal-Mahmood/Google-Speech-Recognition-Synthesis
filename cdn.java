/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.AlertDialog$Builder
 *  android.app.Dialog
 *  android.app.PendingIntent
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.DialogInterface$OnCancelListener
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.view.View
 *  android.widget.ProgressBar
 */
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.View;
import android.widget.ProgressBar;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.material.behavior.SwipeDismissBehavior;

public final class cdn
implements Runnable {
    public final Object a;
    public final Object b;
    private final int c;

    public cdn(Object object, Object object2, int n2) {
        this.c = n2;
        this.b = object;
        this.a = object2;
    }

    @Override
    public final void run() {
        Object object;
        Object object2;
        int n2;
        block19: {
            block17: {
                Object object3;
                block18: {
                    int n3 = this.c;
                    n2 = 2;
                    if (n3 != 0) {
                        Object object4;
                        if (n3 != 1) {
                            if (n3 != 2) {
                                Object object5 = (jid)this.b;
                                Object object6 = ((jid)object5).p(((jid)object5).q.e, false);
                                if (object6 == null) {
                                    return;
                                }
                                object5 = this.b;
                                object6 = new jdg(this, object6, 15, null);
                                ((jid)object5).f.execute((Runnable)object6);
                                return;
                            }
                            yt yt2 = ((SwipeDismissBehavior)this.b).a;
                            if (yt2 != null && yt2.l()) {
                                ((View)this.a).postOnAnimation((Runnable)this);
                            }
                            return;
                        }
                        Object object7 = ((gy)this.b).c;
                        if (object7 != null && (object4 = ((fs)object7).b) != null) {
                            object4.F((fs)object7);
                        }
                        if ((object7 = (View)((gy)this.b).f) != null && object7.getWindowToken() != null && ((gc)this.a).h()) {
                            object4 = this.b;
                            ((gy)object4).i = object7 = (gx)this.a;
                        }
                        ((gy)this.b).k = null;
                        return;
                    }
                    if (!((cdo)this.b).a) break block17;
                    object2 = (cbk)((hti)this.a).b;
                    if (((cbk)object2).a()) {
                        Object object8 = this.b;
                        PendingIntent pendingIntent = ((cbk)object2).d;
                        object2 = ((cec)object8).l();
                        kl.at(pendingIntent);
                        object2 = GoogleApiActivity.a((Context)object2, pendingIntent, ((hti)this.a).a, false);
                        ((cdo)object8).f.startActivityForResult((Intent)object2, 1);
                        return;
                    }
                    object = this.b;
                    n3 = ((cbk)object2).c;
                    object3 = ((cec)object).l();
                    if (((cdo)object).d.g((Context)object3, n3, null) == null) break block18;
                    object = this.b;
                    n2 = ((cbk)object2).c;
                    object2 = ((cec)object).l();
                    cdo cdo2 = (cdo)object;
                    object3 = cdo2.d;
                    cdo2 = ((cbo)object3).c((Context)object2, n2, new cfj(((cbp)object3).g((Context)object2, n2, "d"), cdo2.f), (DialogInterface.OnCancelListener)object);
                    if (cdo2 != null) {
                        ((cbo)object3).a((Activity)object2, (Dialog)cdo2, "GooglePlayServicesErrorDialog", (DialogInterface.OnCancelListener)object);
                        return;
                    }
                    break block17;
                }
                if (((cbk)object2).c != 18) break block19;
                object2 = this.b;
                object = ((cec)object2).l();
                Object object9 = new ProgressBar((Context)object, null, 16842874);
                object9.setIndeterminate(true);
                object9.setVisibility(0);
                object3 = new AlertDialog.Builder((Context)object);
                object3.setView((View)object9);
                object3.setMessage((CharSequence)cff.b((Context)object, 18));
                object3.setPositiveButton((CharSequence)"", null);
                object3 = object3.create();
                ((cdo)object2).d.a((Activity)object, (Dialog)object3, "GooglePlayServicesUpdatingDialog", (DialogInterface.OnCancelListener)object2);
                object = ((cec)this.b).l().getApplicationContext();
                object9 = new eky(this, (Dialog)object3);
                object3 = new IntentFilter("android.intent.action.PACKAGE_ADDED");
                object3.addDataScheme("package");
                object2 = new ceb((eky)object9);
                if (cgw.e()) {
                    if (!cgw.e()) {
                        n2 = 0;
                    }
                    ag$$ExternalSyntheticApiModelOutline0.m((Context)object, (BroadcastReceiver)object2, (IntentFilter)object3, n2);
                } else {
                    object.registerReceiver((BroadcastReceiver)object2, (IntentFilter)object3);
                }
                ((ceb)((Object)object2)).a = object;
                if (!ccg.b((Context)object)) {
                    ((eky)object9).a();
                    ((ceb)((Object)object2)).a();
                }
            }
            return;
        }
        object = this.b;
        n2 = ((hti)this.a).a;
        ((cdo)object).a((cbk)object2, n2);
    }
}

