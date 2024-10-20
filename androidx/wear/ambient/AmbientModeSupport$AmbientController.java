/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  com.google.android.wearable.compat.WearableActivityController
 *  gqv
 */
package androidx.wear.ambient;

import android.graphics.drawable.Drawable;
import androidx.wear.ambient.AmbientDelegate;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.wearable.compat.WearableActivityController;
import java.io.Closeable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

public final class AmbientModeSupport$AmbientController {
    public final Object a;

    public AmbientModeSupport$AmbientController() {
        throw null;
    }

    public AmbientModeSupport$AmbientController(Object object) {
        this.a = object;
    }

    public /* synthetic */ AmbientModeSupport$AmbientController(Object object, byte[] byArray) {
        this.a = object;
    }

    public final void a(Throwable throwable) {
        ((po)this.a).d(throwable);
    }

    public final void b(cbk cbk2) {
        this.a.i(cbk2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void c() {
        Object object = ((fsi)this.a).h;
        synchronized (object) {
            int n2 = ((fsi)this.a).k;
            boolean bl2 = n2 > 0;
            fxf.C(bl2, "Refcount went negative!", n2);
            Object object2 = this.a;
            n2 = ((fsi)object2).k;
            ((fsi)object2).k = n2 - 1;
            ((fsi)object2).c();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void d() {
        Object object = ((fsi)this.a).h;
        synchronized (object) {
            int n2 = ((fsi)this.a).k;
            if (n2 == 0) {
                CancellationException cancellationException = new CancellationException("database is closed");
                throw cancellationException;
            }
            boolean bl2 = n2 > 0;
            fxf.C(bl2, "Refcount went negative!", n2);
            Object object2 = this.a;
            n2 = ((fsi)object2).k;
            ((fsi)object2).k = n2 + 1;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e() {
        Object object = this.a;
        synchronized (object) {
            this.a.a();
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f(fiq fiq2) {
        Object object = this.a;
        synchronized (object) {
            this.a.c(fiq2);
            return;
        }
    }

    /*
     * Unable to fully structure code
     */
    public final gex g(String var1_1) {
        block30: {
            var2_5 = jse.L((CharSequence)var1_1, ' ', 0, 6);
            if (var2_5 <= 0 || var2_5 >= var1_1.length() - 1) break block30;
            var4_6 = this.a;
            var5_8 = var1_1.substring(0, var2_5);
            jse.d(var5_8, "substring(...)");
            var1_1 = var1_1.substring(var2_5 + 1);
            jse.d(var1_1, "substring(...)");
            var5_8 = new gfe((String)var5_8, (String)var1_1);
            var1_1 = var5_8.a;
            var4_6 = (gpm)var4_6;
            var6_9 = ((AmbientModeSupport$AmbientController)var4_6.c).h((String)var1_1);
            var1_1 = var4_6.a;
            if (var1_1 != null) {
                var1_1.a();
            }
            var3_10 = ((gto)var4_6.d).g();
            var1_1 = null;
            if (!var3_10) ** GOTO lbl81
            var6_9 = var4_6.b.get(var6_9);
            jse.b(var6_9);
            var6_9 = (gfv)var6_9;
            var5_8 = var5_8.b;
            var7_11 = (dlm)((gto)var4_6.d).c();
            var8_13 = dtx.a(var6_9.o);
            jse.e(var5_8, "name");
            var4_6 = ((gey)var6_9.g.b()).a((String)var5_8);
            if (var4_6 != null) {
                if ((var7_11 = var7_11.c(var8_13, null, (String)var5_8)) == null) {
                    var1_1 = var4_6;
                } else {
                    switch (var4_6.a.ordinal()) {
                        default: {
                            throw new joa();
                        }
                        case 6: {
                            var4_6 = var6_9.o;
                            var1_1 = new StringBuilder("No default value for ");
                            var1_1.append((String)var4_6);
                            var1_1.append(" ");
                            var1_1.append((String)var5_8);
                            throw new IllegalArgumentException(var1_1.toString());
                        }
                        case 5: {
                            var1_1 = new bfb(var4_6, var7_11, 6, null);
                            var5_8 = var4_6.b;
                            jse.b(var5_8);
                            var1_1 = fvc.C((jqz)var1_1, (hyf)var5_8);
                            break;
                        }
                        case 4: {
                            var1_1 = new gex(new eop(var7_11, 19), ger.e);
                            break;
                        }
                        case 3: {
                            var1_1 = fvc.D((String)var7_11);
                            break;
                        }
                        case 2: {
                            var1_1 = fvc.A(Double.parseDouble((String)var7_11));
                            break;
                        }
                        case 1: {
                            if (cmc.c.matcher((CharSequence)var7_11).matches()) {
                                var1_1 = true;
                            } else if (cmc.d.matcher((CharSequence)var7_11).matches()) {
                                var1_1 = false;
                            }
                            var3_10 = var1_1 != null ? var1_1.booleanValue() : var4_6.d();
                            var1_1 = fvc.z(var3_10);
                            break;
                        }
                        case 0: {
                            var1_1 = fvc.B(Long.parseLong((String)var7_11));
                            break;
                        }
                    }
                }
            } else {
                block29: {
                    var4_6 = ((gey)var6_9.g.b()).b();
                    var1_1 = new StringBuilder("No known flag ");
                    var1_1.append((String)var5_8);
                    var1_1.append(", known flags: ");
                    var1_1.append(var4_6);
                    throw new IllegalArgumentException(var1_1.toString());
lbl81:
                    // 1 sources

                    var1_1 = var4_6.b.get(var6_9);
                    jse.b(var1_1);
                    var4_6 = (gfv)var1_1;
                    var5_8 = var5_8.b;
                    jse.e(var5_8, "name");
                    if (var4_6.n.e()) {
                        var1_1 = (gfo)hhk.S(var4_6.n.c());
                        break block29;
                    }
                    var6_9 = var4_6.o;
                    var1_1 = new StringBuilder("Blocking for: ");
                    var1_1.append((String)var6_9);
                    var6_9 = fxf.as(var1_1.toString(), gqv.a);
                    var7_12 = var4_6.e;
                    var1_1 = new frn(var4_6, 14);
                    var1_1 = (gfo)var7_12.a((hnx)var1_1);
                    jsd.f((Closeable)var6_9, null);
                }
                var1_1 = var1_1.a((String)var5_8, new etv(var4_6, 8));
            }
lbl103:
            // 4 sources

            return var1_1;
            catch (Throwable var1_2) {
                try {
                    throw var1_2;
                }
                catch (Throwable var4_7) {
                    try {
                        jsd.f((Closeable)var6_9, var1_2);
                        throw var4_7;
                    }
                    catch (ExecutionException var1_3) {
                        throw new RuntimeException(var1_3.getCause());
                    }
                }
            }
        }
        throw new IllegalStateException("Bad flag format for ".concat((String)var1_1));
        catch (hxn var1_4) {
            var1_1 = var4_6;
            ** continue;
        }
    }

    public final String h(String string) {
        jse.e(string, "mendelPackage");
        String string2 = (String)this.a.get(string);
        if (string2 != null) {
            return string2;
        }
        throw new IllegalStateException("Unknown package ".concat(String.valueOf(string)));
    }

    public final fxd i(fxd fxd2) {
        if (fxd2 instanceof fxk) {
            return fxd2;
        }
        return new fxb(-((fxi)this.a).b(), fxd2);
    }

    public final boolean isAmbient() {
        AmbientDelegate ambientDelegate = ((AmbientModeSupport)this.a).a;
        if (ambientDelegate == null) {
            return false;
        }
        return ambientDelegate.h();
    }

    public final void j(Drawable drawable) {
        if (drawable != null) {
            FloatingActionButton.d((FloatingActionButton)this.a, drawable);
        }
    }

    public final boolean k() {
        return ((FloatingActionButton)this.a).b;
    }

    public final void setAmbientOffloadEnabled(boolean bl2) {
        AmbientDelegate ambientDelegate = ((AmbientModeSupport)this.a).a;
        if (ambientDelegate != null) {
            ambientDelegate.setAmbientOffloadEnabled(bl2);
        }
    }

    public final void setAutoResumeEnabled(boolean bl2) {
        Object object = ((AmbientModeSupport)this.a).a;
        if (object != null && (object = ((AmbientDelegate)object).a) != null) {
            ((WearableActivityController)object).setAutoResumeEnabled(bl2);
        }
    }
}

