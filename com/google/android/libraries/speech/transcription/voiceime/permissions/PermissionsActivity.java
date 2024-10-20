/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Configuration
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.SystemClock
 *  android.view.Menu
 *  android.view.MenuItem
 */
package com.google.android.libraries.speech.transcription.voiceime.permissions;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.IBinder;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;

public final class PermissionsActivity
extends fmc
implements ggz,
ghv {
    private fmd m;
    private final gms n = new gms(this, (Context)this);
    private boolean o;
    private Context p;
    private final long q = SystemClock.elapsedRealtime();
    private abg r;
    private boolean s;

    private final fmd t() {
        this.u();
        return this.m;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void u() {
        Throwable throwable2222;
        gol gol2;
        Object object;
        block14: {
            if (this.m != null) return;
            if (!this.o) throw new IllegalStateException("createPeer() called outside of onCreate");
            if (this.s) {
                if (!this.isFinishing()) throw new IllegalStateException("createPeer() called after destroyed.");
            }
            object = fxf.aq("CreateComponent");
            this.bn();
            gol2 = fxf.aq("CreatePeer");
            try {
                Object object2 = this.bn();
                object = ((brb)object2).a();
                if (object instanceof PermissionsActivity) {
                    object = (PermissionsActivity)object;
                    fld fld2 = (fld)((brb)object2).c.z.b();
                    this.m = object2 = new fmd((PermissionsActivity)object, fld2);
                    gol2.close();
                    return;
                }
                object2 = new IllegalStateException(a.au((bh)object, fmd.class));
                throw object2;
            }
            catch (Throwable throwable2222) {
                break block14;
            }
            catch (ClassCastException classCastException) {
                object = new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", classCastException);
                throw object;
            }
        }
        try {
            gol2.close();
            throw throwable2222;
        }
        catch (Throwable throwable3) {
            throwable2222.addSuppressed(throwable3);
        }
        throw throwable2222;
        finally {
            ((gol)object).close();
        }
    }

    public final void applyOverrideConfiguration(Configuration configuration) {
        Context context;
        Context context2 = context = this.getBaseContext();
        if (context == null) {
            context2 = this.p;
        }
        fxf.Z(context2);
        super.applyOverrideConfiguration(configuration);
    }

    protected final void attachBaseContext(Context context) {
        this.p = context;
        fxf.Y(context);
        super.attachBaseContext(context);
        this.p = null;
    }

    @Override
    public final void finish() {
        gpf gpf2 = this.n.a();
        try {
            super.finish();
            return;
        }
        finally {
            gpf2.close();
        }
    }

    @Override
    public final abb getLifecycle() {
        if (this.r == null) {
            this.r = new ghw(this);
        }
        return this.r;
    }

    public final void invalidateOptionsMenu() {
        gpf gpf2 = gno.i();
        try {
            super.invalidateOptionsMenu();
            return;
        }
        finally {
            gpf2.close();
        }
    }

    @Override
    protected final void onActivityResult(int n2, int n3, Intent intent) {
        gpf gpf2 = this.n.q();
        try {
            super.onActivityResult(n2, n3, intent);
            return;
        }
        finally {
            gpf2.close();
        }
    }

    @Override
    public final void onBackPressed() {
        gpf gpf2 = this.n.b();
        try {
            super.onBackPressed();
            return;
        }
        finally {
            gpf2.close();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        gpf gpf2 = this.n.r();
        try {
            super.onConfigurationChanged(configuration);
            return;
        }
        finally {
            gpf2.close();
        }
    }

    @Override
    protected final void onCreate(Bundle bundle) {
        gpf gpf2 = this.n.s();
        try {
            this.o = true;
            this.u();
            abb abb2 = ((db)this).getLifecycle();
            gms gms2 = this.n;
            ((ghw)abb2).g(gms2);
            this.bn().b().a();
            super.onCreate(bundle);
            this.o = false;
            this.n.l();
            return;
        }
        finally {
            gpf2.close();
        }
    }

    @Override
    public final boolean onCreatePanelMenu(int n2, Menu menu) {
        gpf gpf2 = this.n.t();
        try {
            super.onCreatePanelMenu(n2, menu);
            return true;
        }
        finally {
            gpf2.close();
        }
    }

    @Override
    protected final void onDestroy() {
        gpf gpf2 = this.n.c();
        try {
            super.onDestroy();
            this.s = true;
            return;
        }
        finally {
            gpf2.close();
        }
    }

    @Override
    public final boolean onMenuItemSelected(int n2, MenuItem menuItem) {
        gpf gpf2 = this.n.u();
        try {
            boolean bl2 = super.onMenuItemSelected(n2, menuItem);
            return bl2;
        }
        finally {
            gpf2.close();
        }
    }

    @Override
    protected final void onNewIntent(Intent intent) {
        gpf gpf2 = this.n.d(intent);
        try {
            super.onNewIntent(intent);
            return;
        }
        finally {
            gpf2.close();
        }
    }

    @Override
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        gpf gpf2 = this.n.v();
        try {
            boolean bl2 = super.onOptionsItemSelected(menuItem);
            return bl2;
        }
        finally {
            gpf2.close();
        }
    }

    @Override
    protected final void onPause() {
        gpf gpf2 = this.n.e();
        try {
            super.onPause();
            return;
        }
        finally {
            gpf2.close();
        }
    }

    @Override
    public final void onPictureInPictureModeChanged(boolean bl2, Configuration configuration) {
        gpf gpf2 = this.n.w();
        try {
            super.onPictureInPictureModeChanged(bl2, configuration);
            return;
        }
        finally {
            gpf2.close();
        }
    }

    @Override
    protected final void onPostCreate(Bundle bundle) {
        gpf gpf2 = this.n.x();
        try {
            super.onPostCreate(bundle);
            return;
        }
        finally {
            gpf2.close();
        }
    }

    @Override
    protected final void onPostResume() {
        gpf gpf2 = this.n.f();
        try {
            super.onPostResume();
            return;
        }
        finally {
            gpf2.close();
        }
    }

    @Override
    public final boolean onPrepareOptionsMenu(Menu menu) {
        gpf gpf2 = gno.i();
        try {
            boolean bl2 = super.onPrepareOptionsMenu(menu);
            return bl2;
        }
        finally {
            gpf2.close();
        }
    }

    /*
     * WARNING - combined exceptions agressively - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void onRequestPermissionsResult(int n2, String[] object, int[] object2) {
        gpf gpf2 = this.n.y();
        try {
            super.onRequestPermissionsResult(n2, (String[])object, (int[])object2);
            fmd fmd2 = this.t();
            if (n2 != 1) {
                ((heg)((heg)fmd.a.h()).j("com/google/android/libraries/speech/transcription/voiceime/permissions/PermissionsActivityPeer", "onRequestPermissionsResult", 54, "PermissionsActivityPeer.java")).s("Unhandled onRequestPermissionsResult. Request code=%d", n2);
            } else if (((Object)object).length == 1 && ((String)object[0]).equals("android.permission.RECORD_AUDIO") && ((int[])object2).length == 1 && object2[0] == 0) {
                ((heg)((heg)fmd.a.f()).j("com/google/android/libraries/speech/transcription/voiceime/permissions/PermissionsActivityPeer", "onRequestPermissionsResult", 48, "PermissionsActivityPeer.java")).r("RECORD_AUDIO permission was granted.");
            } else {
                ((heg)((heg)fmd.a.h()).j("com/google/android/libraries/speech/transcription/voiceime/permissions/PermissionsActivityPeer", "onRequestPermissionsResult", 50, "PermissionsActivityPeer.java")).r("Incorrect set of permissions was granted.");
            }
            fld fld2 = fmd2.c;
            ((heg)((heg)fld.a.f()).j("com/google/android/libraries/speech/transcription/voiceime/InputMethodManagerWrapper", "showSoftInputFromInputMethod", 56, "InputMethodManagerWrapper.java")).r("#showSoftInputFromInputMethod");
            object = (gto)fld2.c.a();
            if (fld2.b != null && ((gto)object).g()) {
                fld2.b.showSoftInputFromInputMethod((IBinder)((gto)object).c(), 0);
            }
            ((fou)fmd2.b).finish();
            return;
        }
        finally {
            gpf2.close();
        }
    }

    @Override
    protected final void onResume() {
        gpf gpf2 = this.n.g();
        try {
            super.onResume();
            fmd fmd2 = this.t();
            ((heg)((heg)fmd.a.f()).j("com/google/android/libraries/speech/transcription/voiceime/permissions/PermissionsActivityPeer", "onResume", 34, "PermissionsActivityPeer.java")).r("#onResume");
            se.b(fmd2.b, new String[]{"android.permission.RECORD_AUDIO"}, 1);
            return;
        }
        finally {
            gpf2.close();
        }
    }

    @Override
    protected final void onSaveInstanceState(Bundle bundle) {
        gpf gpf2 = this.n.z();
        try {
            super.onSaveInstanceState(bundle);
            return;
        }
        finally {
            gpf2.close();
        }
    }

    @Override
    protected final void onStart() {
        gpf gpf2 = this.n.h();
        try {
            super.onStart();
            return;
        }
        finally {
            gpf2.close();
        }
    }

    @Override
    protected final void onStop() {
        gpf gpf2 = this.n.i();
        try {
            super.onStop();
            return;
        }
        finally {
            gpf2.close();
        }
    }

    @Override
    public final void onUserInteraction() {
        gpf gpf2 = this.n.k();
        try {
            super.onUserInteraction();
            return;
        }
        finally {
            gpf2.close();
        }
    }

    @Override
    public final long p() {
        return this.q;
    }

    @Override
    public final /* synthetic */ ile q() {
        return new gip(this);
    }

    @Override
    public final void startActivity(Intent intent) {
        if (fvd.n(intent, this.getApplicationContext())) {
            gqk.l(intent);
        }
        super.startActivity(intent);
    }

    @Override
    public final void startActivity(Intent intent, Bundle bundle) {
        if (fvd.n(intent, this.getApplicationContext())) {
            gqk.l(intent);
        }
        super.startActivity(intent, bundle);
    }
}

