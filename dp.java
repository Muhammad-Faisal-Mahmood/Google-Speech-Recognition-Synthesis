/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.Configuration
 *  android.content.res.Resources$Theme
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.LocaleList
 *  android.util.Log
 *  android.util.Xml
 *  android.view.ContextThemeWrapper
 *  android.view.KeyEvent
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 */
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.util.Xml;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;

public class dp
extends bh
implements dq {
    private ds k;

    public dp() {
        this.getSavedStateRegistry().b("androidx:appcompat", new bo(this, 2));
        this.z(new do(this));
    }

    private final void D() {
        we.f(this.getWindow().getDecorView(), this);
        wf.d(this.getWindow().getDecorView(), this);
        xm.f(this.getWindow().getDecorView(), this);
        kh.c(this.getWindow().getDecorView(), this);
    }

    @Override
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        this.D();
        this.bk().d(view, layoutParams);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    protected void attachBaseContext(Context var1_1) {
        block67: {
            block75: {
                block74: {
                    block73: {
                        block69: {
                            block65: {
                                block71: {
                                    block72: {
                                        block70: {
                                            var5_7 = (eg)this.bk();
                                            var5_7.E = true;
                                            var2_9 = var5_7.r(var1_1, var5_7.q());
                                            if (!eg.n(var1_1) || !ds.n(var1_1)) break block69;
                                            if (Build.VERSION.SDK_INT < 33) break block70;
                                            if (!ds.e) {
                                                ds.a.execute(new ak(var1_1, 10));
                                            }
                                            break block69;
                                        }
                                        var4_10 = ds.h;
                                        // MONITORENTER : var4_10
                                        var6_13 = ds.c;
                                        if (var6_13 != null) break block71;
                                        if (ds.d == null) {
                                            ds.d = tw.c(x.a(var1_1));
                                        }
                                        if (!ds.d.g()) break block72;
                                        // MONITOREXIT : var4_10
                                        break block69;
                                    }
                                    ds.c = ds.d;
                                    break block65;
                                }
                                if (!var6_13.equals(ds.d)) {
                                    block66: {
                                        var6_13 = ds.c;
                                        ds.d = var6_13;
                                        var8_15 = var6_13.e();
                                        var6_13 = x.a;
                                        // MONITORENTER : var6_13
                                        if (var8_15.equals("")) {
                                            var1_1.deleteFile("android.support.v7.app.AppCompatDelegate.application_locales_record_file");
                                            // MONITOREXIT : var6_13
                                        } else {
                                            block63: {
                                                try {
                                                    var7_17 = var1_1.openFileOutput("android.support.v7.app.AppCompatDelegate.application_locales_record_file", 0);
                                                }
                                                catch (FileNotFoundException var7_18) {
                                                    Log.w((String)"AppLocalesStorageHelper", (String)String.format("Storing App Locales : FileNotFoundException: Cannot open file %s for writing ", new Object[]{"android.support.v7.app.AppCompatDelegate.application_locales_record_file"}));
                                                    // MONITOREXIT : var6_13
                                                    break block65;
                                                }
                                                var9_20 = Xml.newSerializer();
                                                var9_20.setOutput((OutputStream)var7_17, null);
                                                var9_20.startDocument("UTF-8", Boolean.valueOf(true));
                                                var9_20.startTag(null, "locales");
                                                var9_20.attribute(null, "application_locales", var8_15);
                                                var9_20.endTag(null, "locales");
                                                var9_20.endDocument();
                                                if (var7_17 == null) break block63;
                                                while (true) {
                                                    try {
                                                        var7_17.close();
                                                    }
                                                    catch (IOException var7_19) {}
                                                    break block63;
                                                    break;
                                                }
                                                {
                                                    catch (Throwable var1_2) {
                                                        break block66;
                                                    }
                                                    catch (Exception var8_16) {}
                                                    {
                                                        Log.w((String)"AppLocalesStorageHelper", (String)"Storing App Locales : Failed to persist app-locales in storage ", (Throwable)var8_16);
                                                        if (var7_17 != null) ** continue;
                                                    }
                                                }
                                            }
                                            // MONITOREXIT : var6_13
                                        }
                                        break block65;
                                    }
                                    if (var7_17 == null) throw var1_2;
                                    var7_17.close();
                                    throw var1_2;
                                }
                            }
                            // MONITOREXIT : var4_10
                        }
                        var6_13 = var5_7.x(var1_1);
                        if (!(var1_1 instanceof ContextThemeWrapper)) break block73;
                        var4_10 = var5_7.t(var1_1, var2_9, (tw)var6_13, null, false);
                        try {
                            ((ContextThemeWrapper)var1_1).applyOverrideConfiguration((Configuration)var4_10);
                            var4_10 = var1_1;
                            break block67;
                        }
                        catch (IllegalStateException var4_11) {}
                        catch (IOException var5_8) {
                            throw var1_2;
                        }
                    }
                    if (var1_1 instanceof nx) {
                        var4_10 = var5_7.t(var1_1, var2_9, (tw)var6_13, null, false);
                        try {
                            ((nx)var1_1).a((Configuration)var4_10);
                            var4_10 = var1_1;
                            break block67;
                        }
                        catch (IllegalStateException var4_12) {}
                    }
                    var4_10 = var1_1;
                    if (!eg.i) break block67;
                    var4_10 = new Configuration();
                    var4_10.uiMode = -1;
                    var4_10.fontScale = 0.0f;
                    var10_21 = var1_1.createConfigurationContext((Configuration)var4_10).getResources().getConfiguration();
                    var7_17 = var1_1.getResources().getConfiguration();
                    var10_21.uiMode = var7_17.uiMode;
                    if (var10_21.equals((Configuration)var7_17)) break block74;
                    var4_10 = new Configuration();
                    var4_10.fontScale = 0.0f;
                    if (var7_17 != null && var10_21.diff((Configuration)var7_17) != 0) {
                        if (var10_21.fontScale != var7_17.fontScale) {
                            var4_10.fontScale = var7_17.fontScale;
                        }
                        if (var10_21.mcc != var7_17.mcc) {
                            var4_10.mcc = var7_17.mcc;
                        }
                        if (var10_21.mnc != var7_17.mnc) {
                            var4_10.mnc = var7_17.mnc;
                        }
                        if (!ag$$ExternalSyntheticApiModelOutline1.m((LocaleList)(var8_15 = ag$$ExternalSyntheticApiModelOutline1.m(var10_21)), (Object)(var9_20 = ag$$ExternalSyntheticApiModelOutline1.m((Configuration)var7_17)))) {
                            ag$$ExternalSyntheticApiModelOutline1.m((Configuration)var4_10, (LocaleList)var9_20);
                            var4_10.locale = var7_17.locale;
                        }
                        if (var10_21.touchscreen != var7_17.touchscreen) {
                            var4_10.touchscreen = var7_17.touchscreen;
                        }
                        if (var10_21.keyboard != var7_17.keyboard) {
                            var4_10.keyboard = var7_17.keyboard;
                        }
                        if (var10_21.keyboardHidden != var7_17.keyboardHidden) {
                            var4_10.keyboardHidden = var7_17.keyboardHidden;
                        }
                        if (var10_21.navigation != var7_17.navigation) {
                            var4_10.navigation = var7_17.navigation;
                        }
                        if (var10_21.navigationHidden != var7_17.navigationHidden) {
                            var4_10.navigationHidden = var7_17.navigationHidden;
                        }
                        if (var10_21.orientation != var7_17.orientation) {
                            var4_10.orientation = var7_17.orientation;
                        }
                        if ((var10_21.screenLayout & 15) != (var7_17.screenLayout & 15)) {
                            var4_10.screenLayout |= var7_17.screenLayout & 15;
                        }
                        if ((var10_21.screenLayout & 192) != (var7_17.screenLayout & 192)) {
                            var4_10.screenLayout |= var7_17.screenLayout & 192;
                        }
                        if ((var10_21.screenLayout & 48) != (var7_17.screenLayout & 48)) {
                            var4_10.screenLayout |= var7_17.screenLayout & 48;
                        }
                        if ((var10_21.screenLayout & 768) != (var7_17.screenLayout & 768)) {
                            var4_10.screenLayout |= var7_17.screenLayout & 768;
                        }
                        if ((ag$$ExternalSyntheticApiModelOutline0.m(var10_21) & 3) != (ag$$ExternalSyntheticApiModelOutline0.m((Configuration)var7_17) & 3)) {
                            ag$$ExternalSyntheticApiModelOutline0.m((Configuration)var4_10, ag$$ExternalSyntheticApiModelOutline0.m((Configuration)var4_10) | ag$$ExternalSyntheticApiModelOutline0.m((Configuration)var7_17) & 3);
                        }
                        if ((ag$$ExternalSyntheticApiModelOutline0.m(var10_21) & 12) != (ag$$ExternalSyntheticApiModelOutline0.m((Configuration)var7_17) & 12)) {
                            ag$$ExternalSyntheticApiModelOutline0.m((Configuration)var4_10, ag$$ExternalSyntheticApiModelOutline0.m((Configuration)var4_10) | ag$$ExternalSyntheticApiModelOutline0.m((Configuration)var7_17) & 12);
                        }
                        if ((var10_21.uiMode & 15) != (var7_17.uiMode & 15)) {
                            var4_10.uiMode |= var7_17.uiMode & 15;
                        }
                        if ((var10_21.uiMode & 48) != (var7_17.uiMode & 48)) {
                            var4_10.uiMode |= var7_17.uiMode & 48;
                        }
                        if (var10_21.screenWidthDp != var7_17.screenWidthDp) {
                            var4_10.screenWidthDp = var7_17.screenWidthDp;
                        }
                        if (var10_21.screenHeightDp != var7_17.screenHeightDp) {
                            var4_10.screenHeightDp = var7_17.screenHeightDp;
                        }
                        if (var10_21.smallestScreenWidthDp != var7_17.smallestScreenWidthDp) {
                            var4_10.smallestScreenWidthDp = var7_17.smallestScreenWidthDp;
                        }
                        if (var10_21.densityDpi != var7_17.densityDpi) {
                            var4_10.densityDpi = var7_17.densityDpi;
                        }
                    }
                    break block75;
                }
                var4_10 = null;
            }
            var5_7 = var5_7.t(var1_1, var2_9, (tw)var6_13, (Configuration)var4_10, true);
            var4_10 = new nx(var1_1, 2132083751);
            var4_10.a((Configuration)var5_7);
            try {
                var1_1 = var1_1.getTheme();
                if (var1_1 == null) break block67;
            }
            catch (NullPointerException var1_6) {}
            var1_1 = var4_10.getTheme();
            if (Build.VERSION.SDK_INT >= 29) {
                dp$$ExternalSyntheticApiModelOutline0.m((Resources.Theme)var1_1);
            } else {
                block68: {
                    var5_7 = tc.a;
                    // MONITORENTER : var5_7
                    var3_22 = tc.c;
                    if (!var3_22) {
                        try {
                            tc.b = Resources.Theme.class.getDeclaredMethod("rebase", null);
                            tc.b.setAccessible(true);
                        }
                        catch (NoSuchMethodException var6_14) {
                            Log.i((String)"ResourcesCompat", (String)"Failed to retrieve rebase() method", (Throwable)var6_14);
                        }
                        tc.c = true;
                    }
                    if ((var6_13 = tc.b) != null) {
                        try {
                            var6_13.invoke((Object)var1_1, null);
                            break block68;
                        }
                        catch (InvocationTargetException var1_3) {
                        }
                        catch (IllegalAccessException var1_4) {
                            // empty catch block
                        }
                        Log.i((String)"ResourcesCompat", (String)"Failed to invoke rebase() method via reflection", (Throwable)var1_5);
                        tc.b = null;
                    }
                }
                // MONITOREXIT : var5_7
            }
        }
        super.attachBaseContext((Context)var4_10);
    }

    public final ds bk() {
        if (this.k == null) {
            int n2 = ds.b;
            this.k = new eg((Context)this, null, this, this);
        }
        return this.k;
    }

    public final void closeOptionsMenu() {
        this.o();
        if (this.getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        this.o();
        return super.dispatchKeyEvent(keyEvent);
    }

    public final View findViewById(int n2) {
        return this.bk().c(n2);
    }

    public final MenuInflater getMenuInflater() {
        eg eg2 = (eg)this.bk();
        if (eg2.o == null) {
            eg2.E();
            de de2 = eg2.n;
            de2 = de2 != null ? de2.a() : eg2.k;
            eg2.o = new fc((Context)de2);
        }
        return eg2.o;
    }

    public void invalidateOptionsMenu() {
        this.bk().f();
    }

    public final de o() {
        return this.bk().b();
    }

    @Override
    public void onConfigurationChanged(Configuration object) {
        Object object2;
        super.onConfigurationChanged((Configuration)object);
        object = (eg)this.bk();
        if (((eg)object).y && ((eg)object).v && (object2 = ((eg)object).b()) != null) {
            object2 = (eq)object2;
            kh.f(((eq)object2).a);
            ((eq)object2).m();
        }
        object2 = ((eg)object).k;
        hj.d().e((Context)object2);
        ((eg)object).G = new Configuration(((eg)object).k.getResources().getConfiguration());
        ((eg)object).P(false, false);
    }

    public final void onContentChanged() {
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        this.bk().g();
    }

    @Override
    public final boolean onMenuItemSelected(int n2, MenuItem menuItem) {
        if (super.onMenuItemSelected(n2, menuItem)) {
            return true;
        }
        de de2 = this.o();
        if (menuItem.getItemId() == 16908332 && de2 != null && (((eq)de2).p.b & 4) != 0) {
            return this.t();
        }
        return false;
    }

    protected void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((eg)this.bk()).D();
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        de de2 = ((eg)this.bk()).b();
        if (de2 != null) {
            de2.e(true);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        ((eg)this.bk()).P(true, false);
    }

    @Override
    protected void onStop() {
        super.onStop();
        this.bk().h();
    }

    protected final void onTitleChanged(CharSequence charSequence, int n2) {
        super.onTitleChanged(charSequence, n2);
        this.bk().m(charSequence);
    }

    public final void openOptionsMenu() {
        this.o();
        if (this.getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    @Override
    public void q(ew ew2) {
    }

    @Override
    public final void setContentView(int n2) {
        this.D();
        this.bk().j(n2);
    }

    @Override
    public final void setContentView(View view) {
        this.D();
        this.bk().k(view);
    }

    @Override
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        this.D();
        this.bk().l(view, layoutParams);
    }

    public final void setTheme(int n2) {
        super.setTheme(n2);
        ((eg)this.bk()).H = n2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean t() {
        Intent[] intentArray = rw.t(this);
        if (intentArray == null) return false;
        if (this.shouldUpRecreateTask((Intent)intentArray)) {
            sr sr2 = new sr((Context)this);
            Intent intent = rw.t(this);
            intentArray = intent;
            if (intent == null) {
                intentArray = rw.t(this);
            }
            if (intentArray != null) {
                ComponentName componentName = intentArray.getComponent();
                intent = componentName;
                if (componentName == null) {
                    intent = intentArray.resolveActivity(sr2.b.getPackageManager());
                }
                int n2 = sr2.a.size();
                try {
                    intent = rw.u(sr2.b, (ComponentName)intent);
                }
                catch (PackageManager.NameNotFoundException nameNotFoundException) {
                    Log.e((String)"TaskStackBuilder", (String)"Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(nameNotFoundException);
                }
                while (intent != null) {
                    sr2.a.add(n2, intent);
                    intent = rw.u(sr2.b, intent.getComponent());
                }
                sr2.a.add(intentArray);
            }
            if (sr2.a.isEmpty()) throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            intentArray = sr2.a.toArray(new Intent[0]);
            intentArray[0] = new Intent(intentArray[0]).addFlags(0x1000C000);
            sr2.b.startActivities(intentArray, null);
            try {
                this.finishAffinity();
                return true;
            }
            catch (IllegalStateException illegalStateException) {
                this.finish();
            }
            return true;
        }
        this.navigateUpTo((Intent)intentArray);
        return true;
    }

    protected void u() {
    }

    protected void v() {
    }

    @Override
    public void w() {
    }
}

