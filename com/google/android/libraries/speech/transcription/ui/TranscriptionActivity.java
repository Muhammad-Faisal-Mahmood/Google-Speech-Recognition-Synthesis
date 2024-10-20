/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Configuration
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.SystemClock
 *  android.view.Menu
 *  android.view.MenuItem
 */
package com.google.android.libraries.speech.transcription.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import androidx.wear.ambient.AmbientModeSupport$AmbientController;
import j$.util.Optional;

public final class TranscriptionActivity
extends fkl
implements ggz,
ghv {
    private fkq m;
    private final gms n = new gms(this, (Context)this);
    private boolean o;
    private Context p;
    private final long q = SystemClock.elapsedRealtime();
    private abg r;
    private boolean s;

    private final fkq F() {
        this.G();
        return this.m;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void G() {
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
                Optional<bmu> optional = this.bn();
                object = ((brb)((Object)optional)).a();
                if (object instanceof TranscriptionActivity) {
                    fkq fkq2;
                    object = (TranscriptionActivity)object;
                    boolean bl2 = ((AmbientModeSupport$AmbientController)((brb)((Object)optional)).c.U().a.b()).g("com.google.android.apps.search.transcription.device 45353567").d();
                    optional = Optional.of((bmu)((brb)((Object)optional)).c.y.b());
                    this.m = fkq2 = new fkq((TranscriptionActivity)object, bl2, optional);
                    gol2.close();
                    return;
                }
                optional = new Optional<bmu>(a.au((bh)object, fkq.class));
                throw optional;
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
    public final /* synthetic */ ile E() {
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
            this.G();
            Object object2 = ((db)this).getLifecycle();
            Object object3 = this.n;
            ((ghw)object2).g((gms)object3);
            this.bn().b().a();
            super.onCreate((Bundle)object);
            object2 = this.F();
            ((heg)((heg)fkq.a.c()).j("com/google/android/libraries/speech/transcription/ui/TranscriptionActivityPeer", "onCreate", 68, "TranscriptionActivityPeer.java")).u("trampolineEnabled: %b", ((fkq)object2).c);
            if (Build.VERSION.SDK_INT >= 31 && ((fkq)object2).c && (object3 = fdm.a((Context)((fkq)object2).b)) != null && object3.getPackageName().equals("com.google.android.tts")) {
                object3 = ffi.f(((fkq)object2).b);
                ((heg)((heg)fkq.a.f()).j("com/google/android/libraries/speech/transcription/ui/TranscriptionActivityPeer", "logTrampoline", 119, "TranscriptionActivityPeer.java")).r("Forwarding the request to Speech Services By Google");
                object = ((fkq)object2).d;
                fjo fjo2 = new fjo(object3, 8);
                ((Optional)object).ifPresent(fjo2);
                object = ((fkq)object2).b.getIntent();
                object.setComponent(fdm.a((Context)((fkq)object2).b));
                object.setFlags(0x2000000);
                gqk.m((Context)((fkq)object2).b, (Intent)object);
                ((foq)((fkq)object2).b).finish();
            } else {
                ((mr)((fkq)object2).b).setContentView(2131624122);
                if (object == null) {
                    object = new fkw();
                    iln.e((be)object);
                    object2 = ((fkq)object2).b.bb();
                    object3 = new y((by)object2);
                    ((ce)object3).p(2131427963, (be)object, "transcriptionInitFragment");
                    ((ce)object3).b();
                }
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
            this.F();
            ((heg)((heg)fkq.a.h()).j("com/google/android/libraries/speech/transcription/ui/TranscriptionActivityPeer", "onNewIntent", 97, "TranscriptionActivityPeer.java")).r("Multiple activities started, only one will be kept");
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
            fkq fkq2 = this.F();
            if (!fkq2.b.isChangingConfigurations()) {
                ((foq)fkq2.b).finish();
            }
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

