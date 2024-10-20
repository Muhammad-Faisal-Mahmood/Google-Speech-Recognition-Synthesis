/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.animation.AnimationUtils
 */
package androidx.transition;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FragmentTransitionSupport
extends cm {
    private static boolean A(ayc ayc2) {
        return !FragmentTransitionSupport.x(ayc2.c) || !FragmentTransitionSupport.x(null) || !FragmentTransitionSupport.x(null);
        {
        }
    }

    @Override
    public final Object a(Object object) {
        if (object != null) {
            return ((ayc)object).i();
        }
        return null;
    }

    @Override
    public final Object b(Object object, Object object2, Object object3) {
        ayc ayc2 = (ayc)object;
        object2 = (ayc)object2;
        object3 = (ayc)object3;
        if (ayc2 != null && object2 != null) {
            object = new ayk();
            ((ayk)object).N(ayc2);
            ((ayk)object).N((ayc)object2);
            ((ayk)object).O();
        } else {
            object = ayc2;
            if (ayc2 == null) {
                object = object2 != null ? object2 : null;
            }
        }
        if (object3 != null) {
            object2 = new ayk();
            if (object != null) {
                ((ayk)object2).N((ayc)object);
            }
            ((ayk)object2).N((ayc)object3);
            return object2;
        }
        return object;
    }

    @Override
    public final Object c(Object object) {
        if (object == null) {
            return null;
        }
        ayk ayk2 = new ayk();
        ayk2.N((ayc)object);
        return ayk2;
    }

    @Override
    public final void d(Object object, View view) {
        ((ayc)object).E(view);
    }

    @Override
    public final void e(Object object, ArrayList arrayList) {
        block2: {
            int n2;
            block3: {
                if ((object = (ayc)object) == null) break block2;
                boolean bl2 = object instanceof ayk;
                int n3 = 0;
                if (!bl2) break block3;
                object = (ayk)object;
                n3 = ((ayk)object).f();
                for (n2 = 0; n2 < n3; ++n2) {
                    this.e(((ayk)object).g(n2), arrayList);
                }
                break block2;
            }
            if (FragmentTransitionSupport.A((ayc)object) || !FragmentTransitionSupport.x(((ayc)object).d)) break block2;
            int n4 = arrayList.size();
            for (n2 = n3; n2 < n4; ++n2) {
                ((ayc)object).E((View)arrayList.get(n2));
            }
        }
    }

    @Override
    public final void f(ViewGroup viewGroup, Object object) {
        ayc ayc2 = (ayc)object;
        if (!ayg.b.contains(viewGroup) && viewGroup.isLaidOut()) {
            ayg.b.add(viewGroup);
            object = ayc2;
            if (ayc2 == null) {
                object = ayg.a;
            }
            object = ((ayc)object).i();
            ayg.c(viewGroup, (ayc)object);
            aay.k(viewGroup);
            ayg.b(viewGroup, (ayc)object);
        }
    }

    public final void g(Object object, ArrayList arrayList, ArrayList arrayList2) {
        block4: {
            int n2;
            int n3;
            ayc ayc2;
            block3: {
                ayc2 = (ayc)object;
                boolean bl2 = ayc2 instanceof ayk;
                if (!bl2) break block3;
                object = (ayk)ayc2;
                n3 = ((ayk)object).f();
                for (n2 = 0; n2 < n3; ++n2) {
                    this.g(((ayk)object).g(n2), arrayList, arrayList2);
                }
                break block4;
            }
            if (FragmentTransitionSupport.A(ayc2) || (object = ayc2.d).size() != arrayList.size() || !object.containsAll(arrayList)) break block4;
            n2 = arrayList2 == null ? 0 : arrayList2.size();
            for (n3 = 0; n3 < n2; ++n3) {
                ayc2.E((View)arrayList2.get(n3));
            }
            n2 = arrayList.size();
            while (--n2 >= 0) {
                ayc2.G((View)arrayList.get(n2));
            }
        }
    }

    @Override
    public final void h(Object object, View view, ArrayList arrayList) {
        ((ayc)object).D(new axs(view, arrayList));
    }

    @Override
    public final void i(Object object, Rect rect) {
        ((ayc)object).M(new aay());
    }

    @Override
    public final void j(Object object, View view) {
        if (view != null) {
            object = (ayc)object;
            FragmentTransitionSupport.y(view, new Rect());
            ((ayc)object).M(new aay());
        }
    }

    @Override
    public final void k(Object object, View view, ArrayList arrayList) {
        ayk ayk2 = (ayk)object;
        object = ayk2.d;
        object.clear();
        int n2 = arrayList.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            FragmentTransitionSupport.v((List)object, (View)arrayList.get(i2));
        }
        object.add(view);
        arrayList.add(view);
        this.e(ayk2, arrayList);
    }

    @Override
    public final void l(Object object, ArrayList arrayList, ArrayList arrayList2) {
        if ((object = (ayk)object) != null) {
            ((ayc)object).d.clear();
            ((ayc)object).d.addAll(arrayList2);
            this.g(object, arrayList, arrayList2);
        }
    }

    @Override
    public final boolean m(Object object) {
        return object instanceof ayc;
    }

    @Override
    public final boolean n() {
        return true;
    }

    @Override
    public final boolean o(Object object) {
        boolean bl2 = ((ayc)object).d();
        if (!bl2) {
            Objects.toString(object);
        }
        return bl2;
    }

    @Override
    public final Object p(Object object, Object object2) {
        ayk ayk2 = new ayk();
        if (object != null) {
            ayk2.N((ayc)object);
        }
        ayk2.N((ayc)object2);
        return ayk2;
    }

    @Override
    public final void q(Object object, Object object2, ArrayList arrayList, Object object3, ArrayList arrayList2) {
        ((ayc)object).D(new axt(this, object2, arrayList, object3, arrayList2));
    }

    @Override
    public final void r(Object object, tu tu2, Runnable runnable) {
        ((cm)this).z(object, tu2, null, runnable);
    }

    @Override
    public final Object s(ViewGroup viewGroup, Object object) {
        ayc ayc2 = (ayc)object;
        boolean bl2 = ayg.b.contains(viewGroup);
        ayc ayc3 = null;
        object = ayc3;
        if (!bl2) {
            object = ayc3;
            if (viewGroup.isLaidOut()) {
                if (Build.VERSION.SDK_INT < 34) {
                    object = ayc3;
                } else if (ayc2.d()) {
                    ayg.b.add(viewGroup);
                    ayc3 = ayc2.i();
                    object = new ayk();
                    ((ayk)object).N(ayc3);
                    ayg.c(viewGroup, (ayc)object);
                    aay.k(viewGroup);
                    ayg.b(viewGroup, (ayc)object);
                    viewGroup.invalidate();
                    ((ayc)object).q = new axy((ayc)object);
                    ((ayc)object).D(((ayc)object).q);
                    object = ((ayc)object).q;
                } else {
                    throw new IllegalArgumentException("The Transition must support seeking.");
                }
            }
        }
        return object;
    }

    @Override
    public final void t(Object object) {
        ((axy)object).i();
    }

    @Override
    public final void u(Object object, Runnable runnable) {
        ((axy)object).j(runnable);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final void w(Object var1_1, float var2_2) {
        block6: {
            block7: {
                block8: {
                    var1_1 = (axy)var1_1;
                    if (!var1_1.b) break block6;
                    var3_3 = (long)(var2_2 * (float)var1_1.h());
                    var7_4 = 0L;
                    var5_5 = var3_3;
                    if (var3_3 == 0L) {
                        var5_5 = 1L;
                    }
                    var11_6 = var1_1.h();
                    var9_7 = -1L;
                    var3_3 = var5_5;
                    if (var5_5 == var11_6) {
                        var3_3 = var1_1.h() - 1L;
                    }
                    if (var1_1.g != null) break block7;
                    var11_6 = var1_1.a;
                    if (var3_3 == var11_6) break block6;
                    var5_5 = var3_3;
                    if (var1_1.c) break block8;
                    if (var3_3 != 0L) ** GOTO lbl-1000
                    var3_3 = var7_4;
                    if (var11_6 > 0L) {
                        var3_3 = var9_7;
                    } else if (var3_3 == (var5_5 = var1_1.h()) && var11_6 < var5_5) {
                        var3_3 = var5_5 + 1L;
                    }
                    if (var3_3 != var11_6) {
                        var1_1.f.y(var3_3, var11_6);
                        var1_1.a = var3_3;
                    }
                    var5_5 = var3_3;
                }
                var1_1.h.c(AnimationUtils.currentAnimationTimeMillis(), var5_5);
                return;
            }
            throw new IllegalStateException("setCurrentPlayTimeMillis() called after animation has been started");
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final void z(Object object, tu tu2, Runnable object2, Runnable runnable) {
        object = (ayc)object;
        object2 = new fkg((Runnable)object2, (ayc)object, runnable);
        // MONITORENTER : tu2
        while (true) {
            boolean bl2;
            if (bl2 = tu2.b) {
                tu2.wait();
            }
            if (tu2.c == object2) {
                // MONITOREXIT : tu2
            } else {
                tu2.c = object2;
                if (tu2.a) {
                    // MONITOREXIT : tu2
                    ((fkg)object2).e();
                }
            }
            ((ayc)object).D(new axu(runnable));
            return;
            catch (InterruptedException interruptedException) {
            }
        }
    }
}

