/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Log
 *  android.view.View
 *  android.view.ViewGroup
 */
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public final class cz {
    public final ViewGroup a;
    public final List b;
    public final List c;
    public boolean d;
    public boolean e;
    private boolean f;

    public cz(ViewGroup viewGroup) {
        jse.e(viewGroup, "container");
        this.a = viewGroup;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public static final cz c(ViewGroup viewGroup, by object) {
        jse.e(viewGroup, "container");
        object = ((by)object).aj();
        jse.d(object, "fragmentManager.specialEffectsControllerFactory");
        return a.P(viewGroup, (a)object);
    }

    private final void k() {
        for (cy cy2 : this.b) {
            if (cy2.b != cw.b) continue;
            cy2.g(a.N(cy2.c.requireView().getVisibility()), cw.a);
        }
    }

    private final void l(Map map, View view) {
        String string = wa.f(view);
        if (string != null) {
            map.put(string, view);
        }
        if (view instanceof ViewGroup) {
            view = (ViewGroup)view;
            int n2 = view.getChildCount();
            for (int i2 = 0; i2 < n2; ++i2) {
                string = view.getChildAt(i2);
                if (string.getVisibility() != 0) continue;
                jse.d(string, "child");
                this.l(map, (View)string);
            }
        }
    }

    private static void m(ot ot2, Collection collection) {
        jns.H(ot2.entrySet(), new mz(collection, 1));
    }

    public final cy a(be be2) {
        block1: {
            for (Object t2 : this.b) {
                cy cy2 = (cy)t2;
                if (!jse.i(cy2.c, be2) || cy2.d) continue;
                be2 = t2;
                break block1;
            }
            be2 = null;
        }
        return (cy)((Object)be2);
    }

    public final cy b(be be2) {
        block1: {
            for (Object t2 : this.c) {
                cy cy2 = (cy)t2;
                if (!jse.i(cy2.c, be2) || cy2.d) continue;
                be2 = t2;
                break block1;
            }
            be2 = null;
        }
        return (cy)((Object)be2);
    }

    public final void d(cy cy2) {
        jse.e(cy2, "operation");
        if (cy2.h) {
            cy2.a.a(cy2.c.requireView(), this.a);
            cy2.h();
        }
    }

    public final void e(List list) {
        int n2;
        Object object = new ArrayList();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            jns.A(object, ((cy)iterator.next()).i);
        }
        object = jns.s(jns.x(object));
        int n3 = object.size();
        int n4 = 0;
        for (n2 = 0; n2 < n3; ++n2) {
            ((cu)object.get(n2)).b(this.a);
        }
        n3 = list.size();
        for (n2 = 0; n2 < n3; ++n2) {
            this.d((cy)list.get(n2));
        }
        list = jns.s(list);
        n3 = list.size();
        for (n2 = n4; n2 < n3; ++n2) {
            object = (cy)list.get(n2);
            if (!((cy)object).i.isEmpty()) continue;
            ((cy)object).a();
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f() {
        if (this.e) {
            return;
        }
        if (!this.a.isAttachedToWindow()) {
            this.g();
            this.d = false;
            return;
        }
        var17_1 = this.b;
        synchronized (var17_1) {
            block77: {
                block76: {
                    block79: {
                        block78: {
                            block74: {
                                block73: {
                                    var7_2 = jns.u(this.c);
                                    this.c.clear();
                                    var8_3 = var7_2.iterator();
                                    while (true) {
                                        var5_5 = var8_3.hasNext();
                                        var4_4 = true;
                                        if (!var5_5) break;
                                        var6_6 /* !! */  = (cy)var8_3.next();
                                        if (this.b.isEmpty() || !var6_6 /* !! */ .c.s) {
                                            var4_4 = false;
                                        }
                                        var6_6 /* !! */ .f = var4_4;
                                    }
                                    var7_2 = var7_2.iterator();
                                    while (var7_2.hasNext()) {
                                        var6_6 /* !! */  = (cy)var7_2.next();
                                        if (this.f) {
                                            if (by.S(2)) {
                                                Objects.toString(var6_6 /* !! */ );
                                            }
                                            var6_6 /* !! */ .a();
                                        } else {
                                            if (by.S(2)) {
                                                Objects.toString(var6_6 /* !! */ );
                                            }
                                            var6_6 /* !! */ .e(this.a);
                                        }
                                        this.f = false;
                                        if (var6_6 /* !! */ .e) continue;
                                        this.c.add(var6_6 /* !! */ );
                                    }
                                    if (this.b.isEmpty()) break block77;
                                    this.k();
                                    var9_7 = jns.u(this.b);
                                    var4_4 = var9_7.isEmpty();
                                    if (var4_4) {
                                        return;
                                    }
                                    this.b.clear();
                                    this.c.addAll(var9_7);
                                    var5_5 = this.d;
                                    var7_2 = var9_7.iterator();
                                    while (var7_2.hasNext()) {
                                        var6_6 /* !! */  = var7_2.next();
                                        var8_3 = var6_6 /* !! */ ;
                                        var10_8 = var8_3.c.P;
                                        jse.d(var10_8, "operation.fragment.mView");
                                        var11_9 /* !! */  = a.O((View)var10_8);
                                        if (var11_9 /* !! */  != (var10_8 = cx.b) || var8_3.a == var10_8) continue;
                                        break block73;
                                    }
                                    var6_6 /* !! */  = null;
                                }
                                var18_10 /* !! */  = var6_6 /* !! */ ;
                                var7_2 = var9_7.listIterator(var9_7.size());
                                while (var7_2.hasPrevious()) {
                                    var6_6 /* !! */  = var7_2.previous();
                                    var8_3 = var6_6 /* !! */ ;
                                    var10_8 = var8_3.c.P;
                                    jse.d(var10_8, "operation.fragment.mView");
                                    var11_9 /* !! */  = a.O((View)var10_8);
                                    if (var11_9 /* !! */  == (var10_8 = cx.b) || var8_3.a != var10_8) continue;
                                    break block74;
                                }
                                var6_6 /* !! */  = null;
                            }
                            var19_11 /* !! */  = var6_6 /* !! */ ;
                            if (by.S(2)) {
                                Objects.toString(var18_10 /* !! */ );
                                Objects.toString(var19_11 /* !! */ );
                            }
                            var7_2 = new ArrayList();
                            var6_6 /* !! */  = new Iterator<T>();
                            var8_3 = ((cy)jns.m((List)var9_7)).c;
                            var10_8 = var9_7.iterator();
                            while (var10_8.hasNext()) {
                                var12_12 = ((cy)var10_8.next()).c.S;
                                var11_9 /* !! */  = var8_3.S;
                                var12_12.b = var11_9 /* !! */ .b;
                                var12_12.c = var11_9 /* !! */ .c;
                                var12_12.d = var11_9 /* !! */ .d;
                                var12_12.e = var11_9 /* !! */ .e;
                            }
                            var10_8 = var9_7.iterator();
                            while (var10_8.hasNext()) {
                                var8_3 = (cy)var10_8.next();
                                var11_9 /* !! */  = new ae((cy)var8_3, var5_5);
                                var7_2.add(var11_9 /* !! */ );
                                var4_4 = var5_5 != false ? var8_3 == var18_10 /* !! */  : var8_3 == var19_11 /* !! */ ;
                                var11_9 /* !! */  = new ao((cy)var8_3, var5_5, var4_4);
                                var6_6 /* !! */ .add(var11_9 /* !! */ );
                                var11_9 /* !! */  = new aj(this, var8_3, 1);
                                var8_3.c((Runnable)var11_9 /* !! */ );
                            }
                            var8_3 = new ArrayList();
                            var10_8 = var6_6 /* !! */ .iterator();
                            while (var10_8.hasNext()) {
                                var6_6 /* !! */  = var10_8.next();
                                if (((ao)var6_6 /* !! */ ).b()) continue;
                                var8_3.add(var6_6 /* !! */ );
                            }
                            var12_12 = new ArrayList<ArrayList<E>>();
                            var8_3 = var8_3.iterator();
                            while (var8_3.hasNext()) {
                                var6_6 /* !! */  = var8_3.next();
                                if (((ao)var6_6 /* !! */ ).a() == null) continue;
                                var12_12.add(var6_6 /* !! */ );
                            }
                            var10_8 = var12_12.iterator();
                            var8_3 = null;
                            while (var10_8.hasNext()) {
                                var11_9 /* !! */  = (ao)var10_8.next();
                                var6_6 /* !! */  = var11_9 /* !! */ .a();
                                if (var8_3 != null && var6_6 /* !! */  != var8_3) {
                                    var6_6 /* !! */  = new Iterator<T>();
                                    var6_6 /* !! */ .append("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                                    var6_6 /* !! */ .append(var11_9 /* !! */ .a.c);
                                    var6_6 /* !! */ .append(" returned Transition ");
                                    var6_6 /* !! */ .append(var11_9 /* !! */ .b);
                                    var6_6 /* !! */ .append(" which uses a different Transition type than other Fragments.");
                                    var7_2 = var6_6 /* !! */ .toString();
                                    var6_6 /* !! */  = new Iterator<T>((String)var7_2);
                                    throw var6_6 /* !! */ ;
                                }
                                var8_3 = var6_6 /* !! */ ;
                            }
                            if (var8_3 != null) break block78;
                            var8_3 = var7_2;
                            var7_2 = var9_7;
                            break block76;
                        }
                        var6_6 /* !! */  = new Iterator<T>();
                        var13_13 = new ArrayList<E>();
                        var22_14 = new ot();
                        var10_8 = new ArrayList();
                        var11_9 /* !! */  = new ArrayList();
                        var20_15 = new ot();
                        var21_16 = new ot();
                        var16_17 = var12_12.iterator();
                        var15_18 = null;
                        var14_19 = var8_3;
                        var4_4 = var5_5;
                        var8_3 = var9_7;
                        while (var16_17.hasNext()) {
                            var9_7 = (ao)var16_17.next();
                            if (var9_7.c() && var18_10 /* !! */  != null && var19_11 /* !! */  != null) {
                                var15_18 = var14_19.c(var14_19.a(var9_7.d));
                                var9_7 = var19_11 /* !! */ .c.m();
                                var11_9 /* !! */  = var18_10 /* !! */ .c.m();
                                var10_8 = var18_10 /* !! */ .c.n();
                                var2_21 = var10_8.size();
                                for (var1_20 = 0; var1_20 < var2_21; ++var1_20) {
                                    var3_22 = var9_7.indexOf(var10_8.get(var1_20));
                                    if (var3_22 == -1) continue;
                                    var9_7.set(var3_22, var11_9 /* !! */ .get(var1_20));
                                }
                                var10_8 = var19_11 /* !! */ .c.n();
                                if (!var4_4) {
                                    var23_23 = var18_10 /* !! */ .c;
                                    var11_9 /* !! */  = var19_11 /* !! */ .c;
                                    var23_23 = var23_23.A();
                                    var24_24 = var11_9 /* !! */ .z();
                                    var11_9 /* !! */  = new joc(var23_23, var24_24);
                                } else {
                                    var23_23 = var18_10 /* !! */ .c;
                                    var11_9 /* !! */  = var19_11 /* !! */ .c;
                                    var11_9 /* !! */  = new joc(var23_23.z(), var11_9 /* !! */ .A());
                                }
                                var23_23 = var11_9 /* !! */ .b;
                                var11_9 /* !! */  = (kl)var11_9 /* !! */ .a;
                                var23_23 = (kl)var23_23;
                                var1_20 = var9_7.size();
                                for (var2_21 = 0; var2_21 < var1_20; ++var2_21) {
                                    var24_24 = var9_7.get(var2_21);
                                    jse.d(var24_24, "exitingNames[i]");
                                    var24_24 = (String)var24_24;
                                    var25_25 = var10_8.get(var2_21);
                                    jse.d(var25_25, "enteringNames[i]");
                                    var22_14.put(var24_24, (String)var25_25);
                                }
                                if (by.S(2)) {
                                    var2_21 = var10_8.size();
                                    for (var1_20 = 0; var1_20 < var2_21; ++var1_20) {
                                        var24_24 = (String)var10_8.get(var1_20);
                                    }
                                    var2_21 = var9_7.size();
                                    for (var1_20 = 0; var1_20 < var2_21; ++var1_20) {
                                        var24_24 = (String)var9_7.get(var1_20);
                                    }
                                }
                                var24_24 = var18_10 /* !! */ .c.P;
                                jse.d(var24_24, "firstOut.fragment.mView");
                                this.l(var20_15, (View)var24_24);
                                var20_15.a((Collection)var9_7);
                                if (var11_9 /* !! */  != null) {
                                    if (by.S(2)) {
                                        Objects.toString(var18_10 /* !! */ );
                                    }
                                    throw null;
                                }
                                var22_14.a(var20_15.keySet());
                                var11_9 /* !! */  = var19_11 /* !! */ .c.P;
                                jse.d((Object)var11_9 /* !! */ , "lastIn.fragment.mView");
                                this.l(var21_16, (View)var11_9 /* !! */ );
                                var21_16.a((Collection)var10_8);
                                var21_16.a(var22_14.values());
                                if (var23_23 != null) {
                                    if (by.S(2)) {
                                        Objects.toString(var19_11 /* !! */ );
                                    }
                                    throw null;
                                }
                                var11_9 /* !! */  = cf.a;
                                for (var1_20 = var22_14.f - 1; var1_20 >= 0; --var1_20) {
                                    if (var21_16.containsKey((String)var22_14.g(var1_20))) continue;
                                    var22_14.e(var1_20);
                                }
                                cz.m(var20_15, var22_14.keySet());
                                cz.m(var21_16, var22_14.values());
                                if (var22_14.isEmpty()) {
                                    var11_9 /* !! */  = new StringBuilder();
                                    var11_9 /* !! */ .append("Ignoring shared elements transition ");
                                    var11_9 /* !! */ .append(var15_18);
                                    var11_9 /* !! */ .append(" between ");
                                    var11_9 /* !! */ .append(var18_10 /* !! */ );
                                    var11_9 /* !! */ .append(" and ");
                                    var11_9 /* !! */ .append(var19_11 /* !! */ );
                                    var11_9 /* !! */ .append(" as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element.");
                                    Log.i((String)"FragmentManager", (String)var11_9 /* !! */ .toString());
                                    var6_6 /* !! */ .clear();
                                    var13_13.clear();
                                    var15_18 = null;
                                    var11_9 /* !! */  = var9_7;
                                    var9_7 = var15_18;
                                } else {
                                    var11_9 /* !! */  = var9_7;
                                    var9_7 = var15_18;
                                }
                            } else {
                                var9_7 = var15_18;
                            }
                            var15_18 = var9_7;
                        }
                        var9_7 = var8_3;
                        var16_17 = var7_2;
                        if (var15_18 != null) break block79;
                        var8_3 = var16_17;
                        var7_2 = var9_7;
                        if (var12_12.isEmpty()) break block76;
                        var23_23 = var12_12.iterator();
                        do {
                            var8_3 = var16_17;
                            var7_2 = var9_7;
                            if (!var23_23.hasNext()) break block76;
                        } while (((ao)var23_23.next()).b == null);
                    }
                    var23_23 = new an(var12_12, var18_10 /* !! */ , var19_11 /* !! */ , (cm)var14_19, var15_18, (ArrayList)var6_6 /* !! */ , var13_13, var22_14, (ArrayList)var10_8, (ArrayList)var11_9 /* !! */ , var20_15, var21_16, var4_4);
                    var6_6 /* !! */  = var12_12.iterator();
                    while (true) {
                        var8_3 = var16_17;
                        var7_2 = var9_7;
                        if (!var6_6 /* !! */ .hasNext()) break;
                        ((ao)var6_6 /* !! */ .next()).a.d((cu)var23_23);
                    }
                }
                var6_6 /* !! */  = new Iterator<T>();
                var9_7 = new ArrayList();
                var10_8 = var8_3.iterator();
                while (var10_8.hasNext()) {
                    jns.A(var9_7, ((ae)var10_8.next()).a.i);
                }
                var4_4 = var9_7.isEmpty();
                var8_3 = var8_3.iterator();
                var1_20 = 0;
                while (var8_3.hasNext()) {
                    var9_7 = (ae)var8_3.next();
                    var11_9 /* !! */  = this.a;
                    var10_8 = var9_7.a;
                    var11_9 /* !! */  = var11_9 /* !! */ .getContext();
                    jse.d((Object)var11_9 /* !! */ , "context");
                    if ((var11_9 /* !! */  = var9_7.a((Context)var11_9 /* !! */ )) == null) continue;
                    if (var11_9 /* !! */ .a == null) {
                        var6_6 /* !! */ .add((Object)var9_7);
                        continue;
                    }
                    var11_9 /* !! */  = var10_8.c;
                    if (!var10_8.i.isEmpty()) {
                        if (!by.S(2)) continue;
                        Objects.toString((Object)var11_9 /* !! */ );
                        continue;
                    }
                    if (var10_8.a == cx.c) {
                        var10_8.h();
                    }
                    var11_9 /* !! */  = new ag((ae)var9_7);
                    var10_8.d((cu)var11_9 /* !! */ );
                    var1_20 = 1;
                }
                var8_3 = var6_6 /* !! */ .iterator();
                while (var8_3.hasNext()) {
                    var9_7 = (ae)var8_3.next();
                    var6_6 /* !! */  = var9_7.a;
                    var10_8 = var6_6 /* !! */ .c;
                    if (!var4_4) {
                        if (!by.S(2)) continue;
                        Objects.toString(var10_8);
                        continue;
                    }
                    if (var1_20 != 0) {
                        if (!by.S(2)) continue;
                        Objects.toString(var10_8);
                        continue;
                    }
                    var10_8 = new ad((ae)var9_7);
                    var6_6 /* !! */ .d((cu)var10_8);
                }
                var6_6 /* !! */  = var7_2.iterator();
                block33: while (true) {
                    var1_20 = 1;
                    while (var6_6 /* !! */ .hasNext()) {
                        var8_3 = (cy)var6_6 /* !! */ .next();
                        if (!var8_3.i.isEmpty()) {
                            var8_3 = var8_3.i;
                            if (var8_3.isEmpty()) continue block33;
                            var8_3 = var8_3.iterator();
                            do {
                                if (var8_3.hasNext()) ** break;
                                continue block33;
                            } while (((cu)var8_3.next()).e());
                        }
                        var1_20 = 0;
                    }
                    break;
                }
                if (var1_20 == 0) ** GOTO lbl-1000
                var8_3 = new ArrayList();
                var6_6 /* !! */  = var7_2.iterator();
                while (var6_6 /* !! */ .hasNext()) {
                    jns.A(var8_3, ((cy)var6_6 /* !! */ .next()).i);
                }
                if (!var8_3.isEmpty()) {
                    var1_20 = 1;
                } else lbl-1000:
                // 2 sources

                {
                    var1_20 = 0;
                }
                var6_6 /* !! */  = var7_2.iterator();
                var2_21 = 1;
                while (var6_6 /* !! */ .hasNext()) {
                    var2_21 &= ((cy)var6_6 /* !! */ .next()).c.s;
                }
                var4_4 = var2_21 != 0 && var1_20 == 0;
                this.f = var4_4;
                if (var2_21 == 0) {
                    this.i((List)var7_2);
                    this.e((List)var7_2);
                } else if (var1_20 != 0) {
                    this.i((List)var7_2);
                    var2_21 = var7_2.size();
                    for (var1_20 = 0; var1_20 < var2_21; ++var1_20) {
                        this.d((cy)var7_2.get(var1_20));
                    }
                }
                this.d = false;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void g() {
        boolean bl2 = this.a.isAttachedToWindow();
        List list = this.b;
        synchronized (list) {
            this.k();
            this.i(this.b);
            Object object = jns.u(this.c);
            Object object2 = object.iterator();
            while (object2.hasNext()) {
                ((cy)object2.next()).f = false;
            }
            Iterator iterator = object.iterator();
            while (iterator.hasNext()) {
                object2 = (cy)iterator.next();
                if (by.S(2)) {
                    if (!bl2) {
                        object = new StringBuilder();
                        ((StringBuilder)object).append("Container ");
                        ((StringBuilder)object).append(this.a);
                        ((StringBuilder)object).append(" is not attached to window. ");
                    }
                    Objects.toString(object2);
                }
                ((cy)object2).e(this.a);
            }
            object = jns.u(this.b);
            object2 = object.iterator();
            while (object2.hasNext()) {
                ((cy)object2.next()).f = false;
            }
            iterator = object.iterator();
            while (iterator.hasNext()) {
                object = (cy)iterator.next();
                if (by.S(2)) {
                    if (!bl2) {
                        object2 = new StringBuilder();
                        ((StringBuilder)object2).append("Container ");
                        ((StringBuilder)object2).append(this.a);
                        ((StringBuilder)object2).append(" is not attached to window. ");
                    }
                    Objects.toString(object);
                }
                ((cy)object).e(this.a);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void h() {
        List list = this.b;
        synchronized (list) {
            boolean bl2;
            Object var4_5;
            boolean bl3;
            Object object;
            Object object2;
            block7: {
                block6: {
                    Object object3;
                    Object object4;
                    cx cx2;
                    this.k();
                    object2 = this.b;
                    object = object2.listIterator(object2.size());
                    do {
                        bl3 = object.hasPrevious();
                        var4_5 = null;
                        if (!bl3) break block6;
                        object2 = object.previous();
                        object4 = (cy)object2;
                        object3 = object4.c.P;
                        jse.d(object3, "operation.fragment.mView");
                        object3 = a.O(object3);
                    } while ((cx2 = object4.a) != (object4 = cx.b) || object3 == object4);
                    break block7;
                }
                object2 = null;
            }
            object = (cy)object2;
            object2 = var4_5;
            if (object != null) {
                object2 = ((cy)object).c;
            }
            bl3 = bl2 = false;
            if (object2 != null) {
                object2 = ((be)object2).S;
                bl3 = object2 == null ? bl2 : ((ba)object2).s;
            }
            this.e = bl3;
            return;
        }
    }

    public final void i(List object) {
        int n2;
        int n3 = object.size();
        int n4 = 0;
        for (n2 = 0; n2 < n3; ++n2) {
            ((cy)object.get(n2)).b();
        }
        List list = new ArrayList();
        object = object.iterator();
        while (object.hasNext()) {
            jns.A(list, ((cy)object.next()).i);
        }
        list = jns.s(jns.x(list));
        n3 = list.size();
        for (n2 = n4; n2 < n3; ++n2) {
            cu cu2 = (cu)list.get(n2);
            object = this.a;
            jse.e(object, "container");
            if (!cu2.h) {
                cu2.d((ViewGroup)object);
            }
            cu2.h = true;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void j(cx object, cw cw2, gbb gbb2) {
        List list = this.b;
        synchronized (list) {
            void var2_4;
            void var3_5;
            Object object2 = var3_5.c;
            jse.d(object2, "fragmentStateManager.fragment");
            cy cy2 = this.a((be)object2);
            object2 = cy2;
            if (cy2 == null) {
                object2 = var3_5.c;
                if (((be)object2).s) {
                    jse.d(object2, "fragmentStateManager.fragment");
                    object2 = this.b((be)object2);
                } else {
                    object2 = null;
                }
            }
            if (object2 != null) {
                ((cy)object2).g((cx)((Object)object), (cw)var2_4);
                return;
            }
            object2 = new cv((cx)((Object)object), (cw)var2_4, (gbb)var3_5);
            this.b.add(object2);
            aj aj2 = new aj(this, object2, 5);
            ((cy)object2).c(aj2);
            aj aj3 = new aj(this, object2, 6);
            ((cy)object2).c(aj3);
            return;
        }
    }
}

