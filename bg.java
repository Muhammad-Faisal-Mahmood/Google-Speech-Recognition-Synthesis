/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.PackageManager
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.Window
 */
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.wear.ambient.AmbientMode$AmbientController;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;

final class bg
extends bm
implements st,
su,
cs,
ct,
aco,
ng,
nr,
awh,
cb,
vf {
    final bh a;

    public bg(bh bh2) {
        this.a = bh2;
        super(bh2, (Context)bh2, new Handler());
    }

    @Override
    public final View a(int n2) {
        return this.a.findViewById(n2);
    }

    @Override
    public final boolean b() {
        Window window = this.a.getWindow();
        return window != null && window.peekDecorView() != null;
    }

    @Override
    public final LayoutInflater c() {
        bh bh2 = this.a;
        return bh2.getLayoutInflater().cloneInContext((Context)bh2);
    }

    @Override
    public final nq d() {
        return this.a.h;
    }

    @Override
    public final /* synthetic */ Object e() {
        return this.a;
    }

    @Override
    public final void f(um um2) {
        this.a.f(um2);
    }

    @Override
    public final void g(um um2) {
        this.a.g(um2);
    }

    @Override
    public final abb getLifecycle() {
        return this.a.a;
    }

    @Override
    public final nf getOnBackPressedDispatcher() {
        return this.a.getOnBackPressedDispatcher();
    }

    @Override
    public final awf getSavedStateRegistry() {
        return this.a.getSavedStateRegistry();
    }

    @Override
    public final bzb getViewModelStore$ar$class_merging$ar$class_merging$ar$class_merging() {
        return this.a.getViewModelStore$ar$class_merging$ar$class_merging$ar$class_merging();
    }

    @Override
    public final void h(um um2) {
        this.a.h(um2);
    }

    @Override
    public final void i(um um2) {
        this.a.i(um2);
    }

    @Override
    public final void j() {
        this.a.invalidateOptionsMenu();
    }

    @Override
    public final void k(um um2) {
        this.a.k(um2);
    }

    @Override
    public final void l(um um2) {
        this.a.l(um2);
    }

    @Override
    public final void m(um um2) {
        this.a.m(um2);
    }

    @Override
    public final void n(um um2) {
        this.a.n(um2);
    }

    @Override
    public final boolean o(String string) {
        int n2 = Build.VERSION.SDK_INT;
        boolean bl2 = false;
        if (n2 >= 33 || !TextUtils.equals((CharSequence)"android.permission.POST_NOTIFICATIONS", (CharSequence)string)) {
            bh bh2 = this.a;
            if (Build.VERSION.SDK_INT >= 32) {
                bl2 = bh2.shouldShowRequestPermissionRationale(string);
            } else if (Build.VERSION.SDK_INT == 31) {
                try {
                    PackageManager packageManager = bh2.getApplication().getPackageManager();
                    bl2 = (Boolean)PackageManager.class.getMethod("shouldShowRequestPermissionRationale", String.class).invoke((Object)packageManager, string);
                }
                catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException reflectiveOperationException) {
                    bl2 = bh2.shouldShowRequestPermissionRationale(string);
                }
            } else {
                bl2 = bh2.shouldShowRequestPermissionRationale(string);
            }
        }
        return bl2;
    }

    @Override
    public final void p(be be2) {
        this.a.e();
    }

    @Override
    public final void q(PrintWriter printWriter, String[] stringArray) {
        this.a.dump("  ", null, printWriter, stringArray);
    }

    @Override
    public final void r(AmbientMode$AmbientController ambientMode$AmbientController) {
        this.a.r(ambientMode$AmbientController);
    }

    @Override
    public final void s(AmbientMode$AmbientController ambientMode$AmbientController) {
        this.a.s(ambientMode$AmbientController);
    }
}

