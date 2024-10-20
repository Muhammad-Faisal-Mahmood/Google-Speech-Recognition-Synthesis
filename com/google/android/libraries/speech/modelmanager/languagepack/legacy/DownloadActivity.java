/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Configuration
 *  android.os.Bundle
 *  android.os.SystemClock
 *  android.view.Menu
 *  android.view.MenuItem
 */
package com.google.android.libraries.speech.modelmanager.languagepack.legacy;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;

public final class DownloadActivity
extends fcu
implements ggz,
ghv {
    private fcm m;
    private final gms n = new gms(this, (Context)this);
    private boolean o;
    private Context p;
    private final long q = SystemClock.elapsedRealtime();
    private abg r;
    private boolean s;

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void F() {
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
                if (object instanceof DownloadActivity) {
                    object = (DownloadActivity)object;
                    dxi dxi2 = (dxi)((brb)object2).c.j.b();
                    this.m = object2 = new fcm((DownloadActivity)object, dxi2);
                    gol2.close();
                    return;
                }
                object2 = new IllegalStateException(a.au((bh)object, fcm.class));
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

    @Override
    public final /* synthetic */ ile D() {
        return new gip(this);
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

    @Override
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

    @Override
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
    protected final void onCreate(Bundle object) {
        gpf gpf2 = this.n.s();
        try {
            this.o = true;
            this.F();
            abb abb2 = ((db)this).getLifecycle();
            Object object2 = this.n;
            ((ghw)abb2).g((gms)object2);
            this.bn().b().a();
            super.onCreate((Bundle)object);
            this.F();
            object2 = this.m;
            ((fcm)object2).c.a(dxv.al);
            abb2 = ((fcm)object2).b.getIntent();
            String string = abb2.getAction();
            if (string != null && string.equals("com.google.recognition.action.DOWNLOAD_LANGUAGE")) {
                if (!abb2.hasExtra("android.speech.extra.LANGUAGE")) {
                    ((heg)((heg)fcm.a.g()).j("com/google/android/libraries/speech/modelmanager/languagepack/legacy/DownloadActivityPeer", "onCreate", 61, "DownloadActivityPeer.java")).r("Locale must be specified");
                    ((foq)((fcm)object2).b).finish();
                    ((fcm)object2).c.a(dxv.an.c(4));
                } else if (object != null) {
                    ((heg)((heg)fcm.a.f()).j("com/google/android/libraries/speech/modelmanager/languagepack/legacy/DownloadActivityPeer", "onCreate", 69, "DownloadActivityPeer.java")).r("Download dialog should have been created");
                    ((fcm)object2).c.a(dxv.an.c(7));
                } else {
                    object = new fcn();
                    iln.e((be)object);
                    abb2 = abb2.getExtras();
                    if (abb2 != null && !abb2.isEmpty()) {
                        ((be)object).setArguments((Bundle)abb2);
                    }
                    ((at)object).f(((fcm)object2).b.bb(), "DownloadDialogFragment");
                }
            } else {
                ((heg)((heg)fcm.a.g()).j("com/google/android/libraries/speech/modelmanager/languagepack/legacy/DownloadActivityPeer", "onCreate", 54, "DownloadActivityPeer.java")).r("Wrong action");
                ((foq)((fcm)object2).b).finish();
                ((fcm)object2).c.a(dxv.an.c(6));
            }
            this.o = false;
            this.n.l();
            return;
        }
        finally {
            try {
                gpf2.close();
            }
            catch (Throwable throwable) {
                Throwable throwable2;
                throwable2.addSuppressed(throwable);
            }
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

    @Override
    public final void onRequestPermissionsResult(int n2, String[] stringArray, int[] nArray) {
        gpf gpf2 = this.n.y();
        try {
            super.onRequestPermissionsResult(n2, stringArray, nArray);
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

    @Override
    public final boolean t() {
        gpf gpf2 = this.n.j();
        try {
            boolean bl2 = super.t();
            return bl2;
        }
        finally {
            gpf2.close();
        }
    }

    @Override
    protected final void u() {
    }

    @Override
    protected final void v() {
    }
}

