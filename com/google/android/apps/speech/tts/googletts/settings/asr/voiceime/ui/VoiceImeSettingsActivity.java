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
package com.google.android.apps.speech.tts.googletts.settings.asr.voiceime.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;

public final class VoiceImeSettingsActivity
extends bzc
implements ggz,
ghv {
    private bze l;
    private final gms m = new gms(this, (Context)this);
    private boolean n;
    private Context o;
    private final long p = SystemClock.elapsedRealtime();
    private abg q;
    private boolean r;

    public VoiceImeSettingsActivity() {
        this.z(new mn(this, 9));
    }

    public final void applyOverrideConfiguration(Configuration configuration) {
        Context context;
        Context context2 = context = this.getBaseContext();
        if (context == null) {
            context2 = this.o;
        }
        fxf.Z(context2);
        super.applyOverrideConfiguration(configuration);
    }

    protected final void attachBaseContext(Context context) {
        this.o = context;
        fxf.Y(context);
        super.attachBaseContext(context);
        this.o = null;
    }

    public final void finish() {
        gpf gpf2 = this.m.a();
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
        if (this.q == null) {
            this.q = new ghw(this);
        }
        return this.q;
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
        gpf gpf2 = this.m.q();
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
        gpf gpf2 = this.m.b();
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
        gpf gpf2 = this.m.r();
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
        gpf gpf2 = this.m.s();
        try {
            this.n = true;
            Object object2 = ((db)this).getLifecycle();
            Object object3 = this.m;
            ((ghw)object2).g((gms)object3);
            super.onCreate((Bundle)object);
            this.u();
            object2 = this.l;
            ((mr)((bze)object2).a).setContentView(2131624128);
            object = new bzg();
            iln.e((be)object);
            object3 = ((bze)object2).a.bb();
            object2 = new y((by)object3);
            ((ce)object2).p(2131427963, (be)object, "voiceImeSettingsFragment");
            ((ce)object2).b();
            this.n = false;
            this.m.l();
            return;
        }
        finally {
            gpf2.close();
        }
    }

    @Override
    public final boolean onCreatePanelMenu(int n2, Menu menu) {
        gpf gpf2 = this.m.t();
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
        gpf gpf2 = this.m.c();
        try {
            super.onDestroy();
            this.r = true;
            return;
        }
        finally {
            gpf2.close();
        }
    }

    @Override
    public final boolean onMenuItemSelected(int n2, MenuItem menuItem) {
        gpf gpf2 = this.m.u();
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
        gpf gpf2 = this.m.d(intent);
        try {
            super.onNewIntent(intent);
            return;
        }
        finally {
            gpf2.close();
        }
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        gpf gpf2 = this.m.v();
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
        gpf gpf2 = this.m.e();
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
        gpf gpf2 = this.m.w();
        try {
            super.onPictureInPictureModeChanged(bl2, configuration);
            return;
        }
        finally {
            gpf2.close();
        }
    }

    protected final void onPostCreate(Bundle bundle) {
        gpf gpf2 = this.m.x();
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
        gpf gpf2 = this.m.f();
        try {
            super.onPostResume();
            return;
        }
        finally {
            gpf2.close();
        }
    }

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
        gpf gpf2 = this.m.y();
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
        gpf gpf2 = this.m.g();
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
        gpf gpf2 = this.m.z();
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
        gpf gpf2 = this.m.h();
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
        gpf gpf2 = this.m.i();
        try {
            super.onStop();
            return;
        }
        finally {
            gpf2.close();
        }
    }

    public final void onUserInteraction() {
        gpf gpf2 = this.m.k();
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
        return this.p;
    }

    public final void startActivity(Intent intent) {
        if (fvd.n(intent, this.getApplicationContext())) {
            gqk.l(intent);
        }
        super.startActivity(intent);
    }

    public final void startActivity(Intent intent, Bundle bundle) {
        if (fvd.n(intent, this.getApplicationContext())) {
            gqk.l(intent);
        }
        super.startActivity(intent, bundle);
    }

    @Override
    public final /* synthetic */ ile t() {
        return new gip(this);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void u() {
        Throwable throwable2222;
        gol gol2;
        Object object;
        block14: {
            if (this.l != null) return;
            if (!this.n) throw new IllegalStateException("createPeer() called outside of onCreate");
            if (this.r) {
                if (!this.isFinishing()) throw new IllegalStateException("createPeer() called after destroyed.");
            }
            object = fxf.aq("CreateComponent");
            this.bn();
            gol2 = fxf.aq("CreatePeer");
            try {
                object = this.bn();
                object = ((brb)object).a();
                if (object instanceof VoiceImeSettingsActivity) {
                    bze bze2;
                    object = (VoiceImeSettingsActivity)object;
                    this.l = bze2 = new bze((VoiceImeSettingsActivity)object);
                    gol2.close();
                    this.l.b = this;
                    return;
                }
                IllegalStateException illegalStateException = new IllegalStateException(a.au((bh)object, bze.class));
                throw illegalStateException;
            }
            catch (Throwable throwable2222) {
                break block14;
            }
            catch (ClassCastException classCastException) {
                IllegalStateException illegalStateException = new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", classCastException);
                throw illegalStateException;
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
}

