/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.os.Bundle
 *  android.os.Looper
 *  android.os.Parcelable
 *  android.util.Log
 *  android.util.SparseArray
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.ViewGroup
 *  gqv
 */
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.wear.ambient.AmbientMode$AmbientController;
import j$.util.DesugarCollections;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public final class by {
    private boolean A;
    private ArrayList B;
    private final Map C;
    private final Map D;
    private final um E;
    private final um F;
    private final um G;
    private final um H;
    private final bl I;
    private boolean J;
    private ArrayList K;
    private ArrayList L;
    private ArrayList M;
    private final Runnable N;
    private final a O;
    private final AmbientMode$AmbientController P;
    public final ArrayList a = new ArrayList();
    ArrayList b;
    public final bn c;
    public nf d;
    y e = null;
    boolean f = false;
    public final my g;
    public final AtomicInteger h;
    final ArrayList i;
    public final CopyOnWriteArrayList j;
    int k;
    public bm l;
    public bj m;
    public be n;
    be o;
    public nm p;
    public nm q;
    public nm r;
    public ArrayDeque s;
    public boolean t;
    public boolean u;
    public boolean v;
    public boolean w;
    public ca x;
    public final bqv y = new bqv();
    public final awg z;

    public by() {
        this.b = new ArrayList();
        this.c = new bn(this);
        this.g = new bp(this);
        this.h = new AtomicInteger();
        this.C = DesugarCollections.synchronizedMap(new HashMap());
        this.D = DesugarCollections.synchronizedMap(new HashMap());
        DesugarCollections.synchronizedMap(new HashMap());
        this.i = new ArrayList();
        this.z = new awg(this);
        this.j = new CopyOnWriteArrayList();
        this.E = new bf(this, 2);
        this.F = new bf(this, 3);
        this.G = new bf(this, 4);
        this.H = new bf(this, 5);
        this.P = new AmbientMode$AmbientController(this);
        this.k = -1;
        this.I = new bq(this);
        this.O = new a();
        this.s = new ArrayDeque();
        this.N = new ak(this, 9, null);
    }

    public static boolean S(int n2) {
        return Log.isLoggable((String)"FragmentManager", (int)n2);
    }

    static final Set Z(y y2) {
        HashSet<be> hashSet = new HashSet<be>();
        for (int i2 = 0; i2 < y2.d.size(); ++i2) {
            be be2 = ((cd)y2.d.get((int)i2)).b;
            if (be2 == null || !y2.j) continue;
            hashSet.add(be2);
        }
        return hashSet;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static final boolean aa(be iterator) {
        if (((be)((Object)iterator)).L && ((be)((Object)iterator)).M) return true;
        iterator = ((be)((Object)iterator)).C.y.f().iterator();
        boolean bl2 = false;
        while (iterator.hasNext()) {
            be be2 = (be)iterator.next();
            boolean bl3 = bl2;
            if (be2 != null) {
                bl3 = by.aa(be2);
            }
            bl2 = bl3;
            if (!bl3) continue;
            return true;
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static final boolean ab(be be2) {
        boolean bl2 = true;
        if (be2 == null) {
            return true;
        }
        if (!be2.M) return false;
        if (be2.A == null) return bl2;
        if (by.ab(be2.D)) return true;
        return false;
    }

    static final void ae(be be2) {
        if (by.S(2)) {
            Objects.toString(be2);
        }
        if (be2.H) {
            be2.H = false;
            be2.V ^= true;
        }
    }

    private final ViewGroup ak(be be2) {
        ViewGroup viewGroup = be2.O;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (be2.F > 0 && this.m.b() && (be2 = this.m.a(be2.F)) instanceof ViewGroup) {
            return (ViewGroup)be2;
        }
        return null;
    }

    private final Set al() {
        HashSet<cz> hashSet = new HashSet<cz>();
        Iterator iterator = this.y.e().iterator();
        while (iterator.hasNext()) {
            ViewGroup viewGroup = ((be)((gbb)iterator.next()).c).O;
            if (viewGroup == null) continue;
            hashSet.add(a.P(viewGroup, this.aj()));
        }
        return hashSet;
    }

    private final void am() {
        if (!this.V()) {
            return;
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }

    private final void an() {
        this.A = false;
        this.L.clear();
        this.K.clear();
    }

    private final void ao() {
        if (this.J) {
            this.J = false;
            this.au();
        }
    }

    private final void ap(boolean bl2) {
        if (!this.A) {
            if (this.l == null) {
                if (this.w) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            if (Looper.myLooper() == this.l.d.getLooper()) {
                if (!bl2) {
                    this.am();
                }
                if (this.K == null) {
                    this.K = new ArrayList();
                    this.L = new ArrayList();
                }
                return;
            }
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        throw new IllegalStateException("FragmentManager is already executing transactions");
    }

    /*
     * Unable to fully structure code
     */
    private final void aq(ArrayList var1_1, ArrayList var2_2, int var3_3, int var4_4) {
        var12_5 = ((y)var1_1.get((int)var3_3)).s;
        var13_6 = this.M;
        if (var13_6 == null) {
            this.M = new ArrayList<E>();
        } else {
            var13_6.clear();
        }
        this.M.addAll(this.y.g());
        var13_6 = this.o;
        var9_7 = var3_3;
        var8_8 = 0;
        while (true) {
            block75: {
                block77: {
                    var6_10 = 1;
                    if (var9_7 >= var4_4) break;
                    var15_15 = (y)var1_1.get(var9_7);
                    if (((Boolean)var2_2.get(var9_7)).booleanValue()) break block77;
                    var16_16 = this.M;
                    var5_9 = 0;
                    while (true) {
                        block76: {
                            block81: {
                                block78: {
                                    block79: {
                                        block80: {
                                            var14_14 = var13_6;
                                            if (var5_9 >= var15_15.d.size()) break block75;
                                            var14_14 = (cd)var15_15.d.get(var5_9);
                                            var7_11 = var14_14.a;
                                            if (var7_11 == var6_10) break block78;
                                            if (var7_11 == 2) break block79;
                                            if (var7_11 == 3 || var7_11 == 6) break block80;
                                            if (var7_11 != 7) {
                                                if (var7_11 != 8) {
                                                    var14_14 = var13_6;
                                                    var6_10 = var5_9;
                                                } else {
                                                    var15_15.d.add(var5_9, new cd(9, (be)var13_6, null));
                                                    var14_14.c = true;
                                                    var14_14 = var14_14.b;
                                                    var6_10 = var5_9 + 1;
                                                }
lbl36:
                                                // 4 sources

                                                while (true) {
                                                    var5_9 = 1;
                                                    var13_6 = var14_14;
                                                    break block76;
                                                    break;
                                                }
                                            }
                                            var7_11 = 1;
                                            break block81;
                                        }
                                        var16_16.remove(var14_14.b);
                                        var17_17 = var14_14.b;
                                        var14_14 = var13_6;
                                        var6_10 = var5_9;
                                        if (var17_17 != var13_6) ** GOTO lbl36
                                        var15_15.d.add(var5_9, new cd(9, var17_17));
                                        var6_10 = var5_9 + 1;
                                        var5_9 = 1;
                                        var13_6 = null;
                                        break block76;
                                    }
                                    var17_17 = var14_14.b;
                                    var10_12 = var17_17.F;
                                    var11_13 = false;
                                    var6_10 = var5_9;
                                    for (var7_11 = var16_16.size() - 1; var7_11 >= 0; --var7_11) {
                                        var18_18 = (be)var16_16.get(var7_11);
                                        if (var18_18.F != var10_12) continue;
                                        if (var18_18 == var17_17) {
                                            var11_13 = true;
                                            continue;
                                        }
                                        if (var18_18 == var13_6) {
                                            var15_15.d.add(var6_10, new cd(9, var18_18, null));
                                            ++var6_10;
                                            var13_6 = null;
                                        }
                                        var19_19 = new cd(3, var18_18, null);
                                        var19_19.d = var14_14.d;
                                        var19_19.f = var14_14.f;
                                        var19_19.e = var14_14.e;
                                        var19_19.g = var14_14.g;
                                        var15_15.d.add(var6_10, var19_19);
                                        var16_16.remove(var18_18);
                                        ++var6_10;
                                    }
                                    if (var11_13) {
                                        var15_15.d.remove(var6_10);
                                        --var6_10;
                                        var14_14 = var13_6;
                                        ** continue;
                                    }
                                    var5_9 = 1;
                                    var14_14.a = 1;
                                    var14_14.c = true;
                                    var16_16.add(var17_17);
                                    break block76;
                                }
                                var7_11 = var6_10;
                            }
                            var16_16.add(var14_14.b);
                            var6_10 = var5_9;
                            var5_9 = var7_11;
                        }
                        var7_11 = var6_10 + var5_9;
                        var6_10 = var5_9;
                        var5_9 = var7_11;
                    }
                }
                var16_16 = this.M;
                var5_9 = var15_15.d.size() - 1;
                while (true) {
                    var14_14 = var13_6;
                    if (var5_9 < 0) break;
                    var14_14 = (cd)var15_15.d.get(var5_9);
                    var6_10 = var14_14.a;
                    if (var6_10 == 1) ** GOTO lbl-1000
                    if (var6_10 == 3) ** GOTO lbl-1000
                    switch (var6_10) {
                        default: {
                            break;
                        }
                        case 10: {
                            var14_14.i = var14_14.h;
                            break;
                        }
                        case 9: {
                            var13_6 = var14_14.b;
                            break;
                        }
                        case 8: {
                            var13_6 = null;
                            break;
                        }
                        case 6: lbl-1000:
                        // 2 sources

                        {
                            var16_16.add(var14_14.b);
                            break;
                        }
                        case 7: lbl-1000:
                        // 2 sources

                        {
                            var16_16.remove(var14_14.b);
                        }
                    }
                    --var5_9;
                }
            }
            var5_9 = var8_8 == 0 && !var15_15.j ? 0 : 1;
            ++var9_7;
            var13_6 = var14_14;
            var8_8 = var5_9;
        }
        this.M.clear();
        if (!var12_5 && this.k > 0) {
            for (var5_9 = var3_3; var5_9 < var4_4; ++var5_9) {
                var13_6 = ((y)var1_1.get((int)var5_9)).d;
                var7_11 = var13_6.size();
                for (var6_10 = 0; var6_10 < var7_11; ++var6_10) {
                    var14_14 = ((cd)var13_6.get((int)var6_10)).b;
                    if (var14_14 == null || var14_14.A == null) continue;
                    var14_14 = this.ah((be)var14_14);
                    this.y.m((gbb)var14_14);
                }
            }
        }
        for (var6_10 = var3_3; var6_10 < var4_4; ++var6_10) {
            var13_6 = (y)var1_1.get(var6_10);
            if (((Boolean)var2_2.get(var6_10)).booleanValue()) {
                var13_6.a(-1);
                block37: for (var7_11 = var13_6.d.size() - 1; var7_11 >= 0; --var7_11) {
                    var14_14 = (cd)var13_6.d.get(var7_11);
                    var15_15 = var14_14.b;
                    if (var15_15 != null) {
                        var15_15.t = false;
                        var15_15.v(true);
                        var10_12 = var13_6.i;
                        var5_9 = 8194;
                        var9_7 = 4097;
                        if (var10_12 != 4097) {
                            var5_9 = var9_7;
                            if (var10_12 != 8194) {
                                var5_9 = 4100;
                                var9_7 = 8197;
                                if (var10_12 != 8197) {
                                    if (var10_12 != 4099) {
                                        var5_9 = var9_7;
                                        if (var10_12 != 4100) {
                                            var5_9 = 0;
                                        }
                                    } else {
                                        var5_9 = 4099;
                                    }
                                }
                            }
                        }
                        var15_15.u(var5_9);
                        var15_15.w(var13_6.r, var13_6.q);
                    }
                    switch (var14_14.a) {
                        default: {
                            var1_1 = new StringBuilder("Unknown cmd: ");
                            var1_1.append(var14_14.a);
                            throw new IllegalArgumentException(var1_1.toString());
                        }
                        case 10: {
                            var13_6.a.L((be)var15_15, var14_14.h);
                            continue block37;
                        }
                        case 9: {
                            var13_6.a.M((be)var15_15);
                            continue block37;
                        }
                        case 8: {
                            var13_6.a.M(null);
                            continue block37;
                        }
                        case 7: {
                            var15_15.s(var14_14.d, var14_14.e, var14_14.f, var14_14.g);
                            var13_6.a.K((be)var15_15, true);
                            var13_6.a.m((be)var15_15);
                            continue block37;
                        }
                        case 6: {
                            var15_15.s(var14_14.d, var14_14.e, var14_14.f, var14_14.g);
                            var13_6.a.l((be)var15_15);
                            continue block37;
                        }
                        case 5: {
                            var15_15.s(var14_14.d, var14_14.e, var14_14.f, var14_14.g);
                            var13_6.a.K((be)var15_15, true);
                            var13_6.a.G((be)var15_15);
                            continue block37;
                        }
                        case 4: {
                            var15_15.s(var14_14.d, var14_14.e, var14_14.f, var14_14.g);
                            var14_14 = var13_6.a;
                            by.ae((be)var15_15);
                            continue block37;
                        }
                        case 3: {
                            var15_15.s(var14_14.d, var14_14.e, var14_14.f, var14_14.g);
                            var13_6.a.ag((be)var15_15);
                            continue block37;
                        }
                        case 1: {
                            var15_15.s(var14_14.d, var14_14.e, var14_14.f, var14_14.g);
                            var13_6.a.K((be)var15_15, true);
                            var13_6.a.I((be)var15_15);
                        }
                    }
                }
                continue;
            }
            var13_6.a(1);
            var7_11 = var13_6.d.size();
            block38: for (var5_9 = 0; var5_9 < var7_11; ++var5_9) {
                var14_14 = (cd)var13_6.d.get(var5_9);
                var15_15 = var14_14.b;
                if (var15_15 != null) {
                    var15_15.t = false;
                    var15_15.v(false);
                    var15_15.u(var13_6.i);
                    var15_15.w(var13_6.q, var13_6.r);
                }
                switch (var14_14.a) {
                    default: {
                        var1_1 = new StringBuilder("Unknown cmd: ");
                        var1_1.append(var14_14.a);
                        throw new IllegalArgumentException(var1_1.toString());
                    }
                    case 10: {
                        var13_6.a.L((be)var15_15, var14_14.i);
                        continue block38;
                    }
                    case 9: {
                        var13_6.a.M(null);
                        continue block38;
                    }
                    case 8: {
                        var13_6.a.M((be)var15_15);
                        continue block38;
                    }
                    case 7: {
                        var15_15.s(var14_14.d, var14_14.e, var14_14.f, var14_14.g);
                        var13_6.a.K((be)var15_15, false);
                        var13_6.a.l((be)var15_15);
                        continue block38;
                    }
                    case 6: {
                        var15_15.s(var14_14.d, var14_14.e, var14_14.f, var14_14.g);
                        var13_6.a.m((be)var15_15);
                        continue block38;
                    }
                    case 5: {
                        var15_15.s(var14_14.d, var14_14.e, var14_14.f, var14_14.g);
                        var13_6.a.K((be)var15_15, false);
                        var14_14 = var13_6.a;
                        by.ae((be)var15_15);
                        continue block38;
                    }
                    case 4: {
                        var15_15.s(var14_14.d, var14_14.e, var14_14.f, var14_14.g);
                        var13_6.a.G((be)var15_15);
                        continue block38;
                    }
                    case 3: {
                        var15_15.s(var14_14.d, var14_14.e, var14_14.f, var14_14.g);
                        var13_6.a.I((be)var15_15);
                        continue block38;
                    }
                    case 1: {
                        var15_15.s(var14_14.d, var14_14.e, var14_14.f, var14_14.g);
                        var13_6.a.K((be)var15_15, false);
                        var13_6.a.ag((be)var15_15);
                    }
                }
            }
        }
        var12_5 = (Boolean)var2_2.get(var4_4 - 1);
        if (var8_8 != 0 && !this.i.isEmpty()) {
            var13_6 = new LinkedHashSet<E>();
            var6_10 = var1_1.size();
            for (var5_9 = 0; var5_9 < var6_10; ++var5_9) {
                var13_6.addAll(by.Z((y)var1_1.get(var5_9)));
            }
            if (this.e == null) {
                var16_16 = this.i;
                var6_10 = var16_16.size();
                for (var5_9 = 0; var5_9 < var6_10; ++var5_9) {
                    var15_15 = (gpk)var16_16.get(var5_9);
                    var14_14 = var13_6.iterator();
                    while (var14_14.hasNext()) {
                        var17_17 = (be)var14_14.next();
                        var15_15.a(var12_5);
                    }
                }
                var14_14 = this.i;
                var6_10 = var14_14.size();
                for (var5_9 = 0; var5_9 < var6_10; ++var5_9) {
                    var15_15 = (gpk)var14_14.get(var5_9);
                    var15_15 = var13_6.iterator();
                    while (var15_15.hasNext()) {
                        var16_16 = (be)var15_15.next();
                    }
                }
            }
        }
        for (var5_9 = var3_3; var5_9 < var4_4; ++var5_9) {
            var14_14 = (y)var1_1.get(var5_9);
            if (var12_5) {
                for (var6_10 = var14_14.d.size() - 1; var6_10 >= 0; --var6_10) {
                    var13_6 = ((cd)var14_14.d.get((int)var6_10)).b;
                    if (var13_6 == null) continue;
                    this.ah((be)var13_6).e();
                }
                continue;
            }
            var14_14 = var14_14.d;
            var7_11 = var14_14.size();
            for (var6_10 = 0; var6_10 < var7_11; ++var6_10) {
                var13_6 = ((cd)var14_14.get((int)var6_10)).b;
                if (var13_6 == null) continue;
                this.ah((be)var13_6).e();
            }
        }
        this.H(this.k, true);
        var5_9 = var3_3;
        var14_14 = this.i((ArrayList)var1_1, var5_9, var4_4).iterator();
        while (true) {
            if (!var14_14.hasNext()) break;
            var13_6 = (cz)var14_14.next();
            var13_6.d = var12_5;
            var13_6.h();
            var13_6.f();
        }
        for (var3_3 = var5_9; var3_3 < var4_4; ++var3_3) {
            var13_6 = (y)var1_1.get(var3_3);
            if (((Boolean)var2_2.get(var3_3)).booleanValue() && var13_6.c >= 0) {
                var13_6.c = -1;
            }
            if (var13_6.t == null) continue;
            for (var5_9 = 0; var5_9 < var13_6.t.size(); ++var5_9) {
                ((Runnable)var13_6.t.get(var5_9)).run();
            }
            var13_6.t = null;
        }
        if (var8_8 != 0) {
            for (var3_3 = 0; var3_3 < this.i.size(); ++var3_3) {
                var2_2 = (gpk)this.i.get(var3_3);
                if (var2_2.b) {
                    var2_2.b = false;
                    fxf.K(gqv.a);
                    gno.l();
                    continue;
                }
                var1_1 = var2_2.a;
                if (var1_1 == null) continue;
                var1_1.close();
                var2_2.a = null;
            }
        }
    }

    private final void ar() {
        for (cz cz2 : this.al()) {
            if (!cz2.e) continue;
            cz2.e = false;
            cz2.f();
        }
    }

    private final void as(ArrayList arrayList, ArrayList arrayList2) {
        block10: {
            block9: {
                if (arrayList.isEmpty()) break block9;
                if (arrayList.size() != arrayList2.size()) break block10;
                int n2 = arrayList.size();
                int n3 = 0;
                int n4 = 0;
                while (n3 < n2) {
                    int n5 = n3;
                    int n6 = n4;
                    if (!((y)arrayList.get((int)n3)).s) {
                        if (n4 != n3) {
                            this.aq(arrayList, arrayList2, n4, n3);
                        }
                        n4 = n6 = n3 + 1;
                        if (((Boolean)arrayList2.get(n3)).booleanValue()) {
                            while (true) {
                                n6 = n4;
                                if (n4 >= n2) break;
                                n6 = n4;
                                if (!((Boolean)arrayList2.get(n4)).booleanValue()) break;
                                n6 = n4;
                                if (((y)arrayList.get((int)n4)).s) break;
                                ++n4;
                            }
                        }
                        this.aq(arrayList, arrayList2, n3, n6);
                        n5 = n6 - 1;
                    }
                    n3 = n5 + 1;
                    n4 = n6;
                }
                if (n4 != n2) {
                    this.aq(arrayList, arrayList2, n4, n2);
                }
            }
            return;
        }
        throw new IllegalStateException("Internal error with the back stack records");
    }

    private final void at(be be2) {
        ViewGroup viewGroup = this.ak(be2);
        if (viewGroup != null && be2.g() + be2.h() + be2.i() + be2.j() > 0) {
            if (viewGroup.getTag(2131428014) == null) {
                viewGroup.setTag(2131428014, (Object)be2);
            }
            ((be)viewGroup.getTag(2131428014)).v(be2.x());
        }
    }

    private final void au() {
        Iterator iterator = this.y.e().iterator();
        while (iterator.hasNext()) {
            this.ai((gbb)iterator.next());
        }
    }

    private final void av(RuntimeException runtimeException) {
        Log.e((String)"FragmentManager", (String)runtimeException.getMessage());
        Log.e((String)"FragmentManager", (String)"Activity state:");
        PrintWriter printWriter = new PrintWriter(new cr());
        bm bm2 = this.l;
        if (bm2 != null) {
            try {
                bm2.q(printWriter, new String[0]);
            }
            catch (Exception exception) {
                Log.e((String)"FragmentManager", (String)"Failed dumping state", (Throwable)exception);
            }
        } else {
            try {
                this.C("  ", null, printWriter, new String[0]);
            }
            catch (Exception exception) {
                Log.e((String)"FragmentManager", (String)"Failed dumping state", (Throwable)exception);
            }
        }
        throw runtimeException;
    }

    private final boolean aw(int n2) {
        this.af(false);
        this.ap(true);
        be be2 = this.o;
        if (be2 != null && be2.getChildFragmentManager().W()) {
            return true;
        }
        boolean bl2 = this.ad(this.K, this.L, -1, n2);
        if (bl2) {
            this.A = true;
            try {
                this.as(this.K, this.L);
            }
            finally {
                this.an();
            }
        }
        this.N();
        this.ao();
        this.y.i();
        return bl2;
    }

    public static be f(View object) {
        if ((object = object.getTag(2131427660)) instanceof be) {
            return (be)object;
        }
        return null;
    }

    public final void A(int n2) {
        try {
            Object object2;
            this.A = true;
            for (Object object2 : ((HashMap)this.y.c).values()) {
                if (object2 == null) continue;
                ((gbb)object2).b = n2;
            }
            this.H(n2, false);
            object2 = this.al().iterator();
            while (object2.hasNext()) {
                ((cz)object2.next()).g();
            }
            this.af(true);
            return;
        }
        finally {
            this.A = false;
        }
    }

    public final void B() {
        this.v = true;
        this.x.g = true;
        this.A(4);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void C(String string, FileDescriptor object, PrintWriter printWriter, String[] object2) {
        int n2;
        bqv bqv2 = this.y;
        if (!((HashMap)bqv2.c).isEmpty()) {
            printWriter.print(string);
            printWriter.println("Active Fragments:");
            for (Object object3 : ((HashMap)bqv2.c).values()) {
                printWriter.print(string);
                if (object3 != null) {
                    String string2 = String.valueOf(string);
                    object3 = ((gbb)object3).c;
                    printWriter.println(object3);
                    ((be)object3).dump(string2.concat("    "), (FileDescriptor)object, printWriter, (String[])object2);
                    continue;
                }
                printWriter.println("null");
            }
        }
        int n3 = ((ArrayList)bqv2.d).size();
        int n4 = 0;
        if (n3 > 0) {
            printWriter.print(string);
            printWriter.println("Added Fragments:");
            for (n2 = 0; n2 < n3; ++n2) {
                object = (be)((ArrayList)bqv2.d).get(n2);
                printWriter.print(string);
                printWriter.print("  #");
                printWriter.print(n2);
                printWriter.print(": ");
                printWriter.println(((be)object).toString());
            }
        }
        if ((object = this.B) != null && (n3 = ((ArrayList)object).size()) > 0) {
            printWriter.print(string);
            printWriter.println("Fragments Created Menus:");
            for (n2 = 0; n2 < n3; ++n2) {
                object = (be)this.B.get(n2);
                printWriter.print(string);
                printWriter.print("  #");
                printWriter.print(n2);
                printWriter.print(": ");
                printWriter.println(((be)object).toString());
            }
        }
        if ((n3 = this.b.size()) > 0) {
            printWriter.print(string);
            printWriter.println("Back Stack:");
            for (n2 = 0; n2 < n3; ++n2) {
                object2 = String.valueOf(string);
                object = (y)this.b.get(n2);
                printWriter.print(string);
                printWriter.print("  #");
                printWriter.print(n2);
                printWriter.print(": ");
                printWriter.println(((y)object).toString());
                ((y)object).d(object2.concat("    "), printWriter);
            }
        }
        printWriter.print(string);
        object = new StringBuilder("Back Stack Index: ");
        ((StringBuilder)object).append(this.h.get());
        printWriter.println(((StringBuilder)object).toString());
        object = this.a;
        synchronized (object) {
            n3 = this.a.size();
            if (n3 > 0) {
                printWriter.print(string);
                printWriter.println("Pending Actions:");
                for (n2 = n4; n2 < n3; ++n2) {
                    object2 = (bv)this.a.get(n2);
                    printWriter.print(string);
                    printWriter.print("  #");
                    printWriter.print(n2);
                    printWriter.print(": ");
                    printWriter.println(object2);
                }
            }
        }
        printWriter.print(string);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(string);
        printWriter.print("  mHost=");
        printWriter.println(this.l);
        printWriter.print(string);
        printWriter.print("  mContainer=");
        printWriter.println(this.m);
        if (this.n != null) {
            printWriter.print(string);
            printWriter.print("  mParent=");
            printWriter.println(this.n);
        }
        printWriter.print(string);
        printWriter.print("  mCurState=");
        printWriter.print(this.k);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.u);
        printWriter.print(" mStopped=");
        printWriter.print(this.v);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.w);
        if (this.t) {
            printWriter.print(string);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.t);
        }
    }

    public final void D() {
        Iterator iterator = this.al().iterator();
        while (iterator.hasNext()) {
            ((cz)iterator.next()).g();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final void E(bv object, boolean bl2) {
        if (!bl2) {
            if (this.l == null) {
                if (this.w) {
                    throw new IllegalStateException("FragmentManager has been destroyed");
                }
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            this.am();
        }
        ArrayList arrayList = this.a;
        synchronized (arrayList) {
            if (this.l == null) {
                if (bl2) {
                    return;
                }
                object = new IllegalStateException("Activity has been destroyed");
                throw object;
            }
            this.a.add(object);
            object = this.a;
            synchronized (object) {
                if (this.a.size() == 1) {
                    this.l.d.removeCallbacks(this.N);
                    this.l.d.post(this.N);
                    this.N();
                }
                return;
            }
        }
    }

    final void F(bv bv2, boolean bl2) {
        if (bl2 && (this.l == null || this.w)) {
            return;
        }
        this.ap(bl2);
        Object object = this.e;
        if (object != null) {
            ((y)object).b = false;
            if (by.S(3)) {
                Objects.toString(this.e);
                Objects.toString(bv2);
            }
            this.e.k(false, false);
            this.e.f(this.K, this.L);
            ArrayList arrayList = this.e.d;
            int n2 = arrayList.size();
            for (int i2 = 0; i2 < n2; ++i2) {
                object = ((cd)arrayList.get((int)i2)).b;
                if (object == null) continue;
                ((be)object).s = false;
            }
            this.e = null;
        }
        bv2.f(this.K, this.L);
        this.A = true;
        try {
            this.as(this.K, this.L);
            this.N();
            this.ao();
            this.y.i();
            return;
        }
        finally {
            this.an();
        }
    }

    final void G(be be2) {
        if (by.S(2)) {
            Objects.toString(be2);
        }
        if (!be2.H) {
            be2.H = true;
            be2.V = true ^ be2.V;
            this.at(be2);
        }
    }

    final void H(int n2, boolean bl2) {
        if (this.l == null && n2 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (bl2 || n2 != this.k) {
            Object object;
            this.k = n2;
            Object object2 = this.y;
            Iterator iterator = ((bqv)object2).d;
            int n3 = iterator.size();
            for (n2 = 0; n2 < n3; ++n2) {
                object = (be)iterator.get(n2);
                Object object3 = ((bqv)object2).c;
                object = ((be)object).k;
                if ((object3 = (gbb)((HashMap)object3).get(object)) == null) continue;
                ((gbb)object3).e();
            }
            for (Object object3 : ((HashMap)((bqv)object2).c).values()) {
                if (object3 == null) continue;
                ((gbb)object3).e();
                object = (be)((gbb)object3).c;
                if (!((be)object).r || ((be)object).y()) continue;
                bl2 = ((be)object).t;
                ((bqv)object2).n((gbb)object3);
            }
            this.au();
            if (this.t && (object2 = this.l) != null && this.k == 7) {
                ((bm)object2).j();
                this.t = false;
            }
        }
    }

    final void I(be be2) {
        if (by.S(2)) {
            Objects.toString(be2);
            int n2 = be2.z;
        }
        boolean bl2 = be2.y();
        if (be2.I && bl2) {
            return;
        }
        this.y.j(be2);
        if (by.aa(be2)) {
            this.t = true;
        }
        be2.r = true;
        this.at(be2);
    }

    final void J(Parcelable object) {
        int n2;
        Object object22;
        Object object32;
        object = (Bundle)object;
        for (Object object32 : object.keySet()) {
            if (!((String)object32).startsWith("result_") || (object22 = object.getBundle((String)object32)) == null) continue;
            object22.setClassLoader(this.l.c.getClassLoader());
            object32 = ((String)object32).substring(7);
            this.D.put(object32, object22);
        }
        Object object4 = new HashMap();
        Object object5 = object.keySet().iterator();
        while (object5.hasNext()) {
            object22 = (String)object5.next();
            if (!((String)object22).startsWith("fragment_") || (object32 = object.getBundle((String)object22)) == null) continue;
            object32.setClassLoader(this.l.c.getClassLoader());
            ((HashMap)object4).put(((String)object22).substring(9), object32);
        }
        object22 = this.y;
        ((HashMap)((bqv)object22).b).clear();
        ((HashMap)((bqv)object22).b).putAll(object4);
        object4 = (bz)object.getParcelable("state");
        if (object4 == null) {
            return;
        }
        ((HashMap)this.y.c).clear();
        object22 = ((bz)object4).a;
        int n3 = object22.size();
        int n4 = 0;
        for (n2 = 0; n2 < n3; ++n2) {
            object = (String)object22.get(n2);
            object32 = this.y.b((String)object, null);
            if (object32 == null) continue;
            object5 = (cc)object32.getParcelable("state");
            object = this.x;
            object5 = ((cc)object5).b;
            object = (be)((ca)object).b.get(object5);
            if (object != null) {
                if (by.S(2)) {
                    Objects.toString(object);
                }
                object = new gbb(this.z, this.y, (be)object, (Bundle)object32);
            } else {
                object = new gbb(this.z, this.y, this.l.c.getClassLoader(), this.g(), (Bundle)object32);
            }
            object5 = ((gbb)object).c;
            be be2 = (be)object5;
            be2.g = object32;
            be2.A = this;
            if (by.S(2)) {
                object32 = be2.k;
                Objects.toString(object5);
            }
            ((gbb)object).f(this.l.c.getClassLoader());
            this.y.m((gbb)object);
            ((gbb)object).b = this.k;
        }
        for (Object object22 : new ArrayList(this.x.b.values())) {
            if (this.y.k(((be)object22).k)) continue;
            if (by.S(2)) {
                Objects.toString(object22);
                Objects.toString(((bz)object4).a);
            }
            this.x.e((be)object22);
            ((be)object22).A = this;
            object = new gbb(this.z, this.y, (be)object22);
            ((gbb)object).b = 1;
            ((gbb)object).e();
            ((be)object22).r = true;
            ((gbb)object).e();
        }
        object = this.y;
        object22 = ((bz)object4).b;
        ((ArrayList)((bqv)object).d).clear();
        if (object22 != null) {
            object5 = object22.iterator();
            while (object5.hasNext()) {
                object22 = (String)object5.next();
                object32 = ((bqv)object).c((String)object22);
                if (object32 != null) {
                    if (by.S(2)) {
                        Objects.toString(object32);
                    }
                    ((bqv)object).h((be)object32);
                    continue;
                }
                throw new IllegalStateException(a.aj((String)object22, "No instantiated fragment for (", ")"));
            }
        }
        if ((object = ((bz)object4).c) != null) {
            this.b = new ArrayList(((z[])object).length);
            for (n3 = 0; n3 < ((Object)(object = ((bz)object4).c)).length; ++n3) {
                Object object6;
                object22 = object[n3];
                object = new y(this);
                n2 = 0;
                int n5 = 0;
                while ((object6 = n2) < ((Object)(object5 = (Object)((z)object22).a)).length) {
                    Object object7;
                    object32 = new cd();
                    n2 = object6 + 1;
                    ((cd)object32).a = (int)object5[object6];
                    if (by.S(2)) {
                        object.toString();
                        object7 = ((z)object22).a[n2];
                    }
                    object5 = ((z)object22).c;
                    ((cd)object32).h = aba.values()[object5[n5]];
                    object5 = ((z)object22).d;
                    ((cd)object32).i = aba.values()[object5[n5]];
                    object5 = ((z)object22).a;
                    boolean bl2 = object5[n2] != false;
                    ((cd)object32).c = bl2;
                    Object object8 = object5[object6 + 2];
                    ((cd)object32).d = (int)object8;
                    ((cd)object32).e = object7 = (Object)object5[object6 + 3];
                    Object object9 = object5[object6 + 4];
                    ((cd)object32).f = (int)object9;
                    n2 = object6 + 6;
                    ((cd)object32).g = object6 = (Object)object5[object6 + 5];
                    ((y)object).e = (int)object8;
                    ((y)object).f = object7;
                    ((y)object).g = (int)object9;
                    ((y)object).h = object6;
                    ((ce)object).l((cd)object32);
                    ++n5;
                }
                ((y)object).i = ((z)object22).e;
                ((y)object).l = ((z)object22).f;
                ((y)object).j = true;
                ((y)object).m = ((z)object22).h;
                ((y)object).n = ((z)object22).i;
                ((y)object).o = ((z)object22).j;
                ((y)object).p = ((z)object22).k;
                ((y)object).q = ((z)object22).l;
                ((y)object).r = ((z)object22).m;
                ((y)object).s = ((z)object22).n;
                ((y)object).c = ((z)object22).g;
                for (n2 = 0; n2 < ((z)object22).b.size(); ++n2) {
                    object32 = (String)((z)object22).b.get(n2);
                    if (object32 == null) continue;
                    ((cd)((y)object).d.get((int)n2)).b = this.c((String)object32);
                }
                ((y)object).a(1);
                if (by.S(2)) {
                    n2 = ((y)object).c;
                    object.toString();
                    object22 = new PrintWriter(new cr());
                    ((y)object).e("  ", (PrintWriter)object22, false);
                    ((PrintWriter)object22).close();
                }
                this.b.add(object);
            }
        } else {
            this.b = new ArrayList();
        }
        this.h.set(((bz)object4).d);
        object = ((bz)object4).e;
        if (object != null) {
            this.o = object = this.c((String)object);
            this.v((be)object);
        }
        if ((object = ((bz)object4).f) != null) {
            for (n2 = n4; n2 < ((ArrayList)object).size(); ++n2) {
                this.C.put((String)((ArrayList)object).get(n2), (ab)((bz)object4).g.get(n2));
            }
        }
        this.s = new ArrayDeque(((bz)object4).h);
    }

    final void K(be be2, boolean bl2) {
        if ((be2 = this.ak(be2)) != null && be2 instanceof bk) {
            ((bk)((Object)be2)).a = bl2 ^ true;
        }
    }

    final void L(be be2, aba aba2) {
        if (be2.equals(this.c(be2.k)) && (be2.B == null || be2.A == this)) {
            be2.Y = aba2;
            return;
        }
        throw new IllegalArgumentException(a.am(this, be2, "Fragment ", " is not an active fragment of FragmentManager "));
    }

    final void M(be be2) {
        if (be2 != null && (!be2.equals(this.c(be2.k)) || be2.B != null && be2.A != this)) {
            throw new IllegalArgumentException(a.am(this, be2, "Fragment ", " is not an active fragment of FragmentManager "));
        }
        be be3 = this.o;
        this.o = be2;
        this.v(be3);
        this.v(this.o);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void N() {
        ArrayList arrayList = this.a;
        synchronized (arrayList) {
            boolean bl2 = this.a.isEmpty();
            boolean bl3 = true;
            if (!bl2) {
                this.g.g(true);
                if (by.S(3)) {
                    ((Object)this).toString();
                }
                return;
            }
            if (this.a() <= 0 || !this.U(this.n)) {
                bl3 = false;
            }
            if (by.S(3)) {
                ((Object)this).toString();
            }
            this.g.g(bl3);
            return;
        }
    }

    final boolean O(MenuItem menuItem) {
        if (this.k <= 0) {
            return false;
        }
        for (be be2 : this.y.g()) {
            if (be2 == null || be2.H || !be2.onContextItemSelected(menuItem) && !be2.C.O(menuItem)) continue;
            return true;
        }
        return false;
    }

    public final boolean P(Menu object, MenuInflater menuInflater) {
        int n2 = this.k;
        int n3 = 0;
        if (n2 <= 0) {
            return false;
        }
        Iterator iterator = this.y.g().iterator();
        ArrayList<be> arrayList = null;
        boolean bl2 = false;
        while (iterator.hasNext()) {
            be be2 = (be)iterator.next();
            if (be2 == null || !by.ab(be2) || be2.H) continue;
            if (be2.L && be2.M) {
                be2.onCreateOptionsMenu((Menu)object, menuInflater);
                n2 = 1;
            } else {
                n2 = 0;
            }
            if ((n2 | be2.C.P((Menu)object, menuInflater)) == 0) continue;
            ArrayList<be> arrayList2 = arrayList;
            if (arrayList == null) {
                arrayList2 = new ArrayList<be>();
            }
            arrayList2.add(be2);
            bl2 = true;
            arrayList = arrayList2;
        }
        if (this.B != null) {
            for (n2 = n3; n2 < this.B.size(); ++n2) {
                object = (be)this.B.get(n2);
                if (arrayList == null) continue;
                arrayList.contains(object);
            }
        }
        this.B = arrayList;
        return bl2;
    }

    public final boolean Q(MenuItem menuItem) {
        if (this.k <= 0) {
            return false;
        }
        for (be be2 : this.y.g()) {
            if (be2 == null || be2.H || (!be2.L || !be2.M || !be2.onOptionsItemSelected(menuItem)) && !be2.C.Q(menuItem)) continue;
            return true;
        }
        return false;
    }

    public final boolean R(Menu menu) {
        if (this.k <= 0) {
            return false;
        }
        Iterator iterator = this.y.g().iterator();
        boolean bl2 = false;
        while (iterator.hasNext()) {
            boolean bl3;
            be be2 = (be)iterator.next();
            if (be2 == null || !by.ab(be2) || be2.H) continue;
            if (be2.L && be2.M) {
                be2.onPrepareOptionsMenu(menu);
                bl3 = true;
            } else {
                bl3 = false;
            }
            if (!(be2.C.R(menu) | bl3)) continue;
            bl2 = true;
        }
        return bl2;
    }

    public final boolean T() {
        be be2 = this.n;
        if (be2 == null) {
            return true;
        }
        return be2.isAdded() && be2.getParentFragmentManager().T();
    }

    final boolean U(be be2) {
        if (be2 == null) {
            return true;
        }
        by by2 = be2.A;
        return be2.equals(by2.o) && this.U(by2.n);
    }

    public final boolean V() {
        return this.u || this.v;
        {
        }
    }

    public final boolean W() {
        return this.aw(0);
    }

    public final void X(gpk gpk2) {
        this.i.add(gpk2);
    }

    public final void Y() {
        this.af(true);
        this.ar();
    }

    public final int a() {
        int n2 = this.b.size();
        int n3 = this.e != null ? 1 : 0;
        return n2 + n3;
    }

    public final void ac() {
        this.aw(1);
    }

    /*
     * Unable to fully structure code
     */
    final boolean ad(ArrayList var1_1, ArrayList var2_2, int var3_3, int var4_4) {
        block8: {
            block10: {
                block9: {
                    if (this.b.isEmpty()) lbl-1000:
                    // 2 sources

                    {
                        while (true) {
                            var3_3 = -1;
                            break block8;
                            break;
                        }
                    }
                    if (var3_3 >= 0) break block9;
                    var3_3 = var4_4 != 0 ? 0 : this.b.size() - 1;
                    break block8;
                }
                for (var5_5 = this.b.size() - 1; var5_5 >= 0 && var3_3 != ((y)this.b.get((int)var5_5)).c; --var5_5) {
                }
                if (var5_5 < 0) lbl-1000:
                // 3 sources

                {
                    while (true) {
                        var3_3 = var5_5;
                        break block8;
                        break;
                    }
                }
                var6_6 = var5_5;
                if (var4_4 != 0) break block10;
                ** while (var5_5 == this.b.size() - 1)
lbl18:
                // 1 sources

                var3_3 = var5_5 + 1;
                break block8;
            }
            while (true) {
                var5_5 = var6_6;
                if (var6_6 <= 0) ** GOTO lbl-1000
                var7_7 = this.b;
                var4_4 = var6_6 - 1;
                var5_5 = var6_6;
                if (var3_3 == ((y)var7_7.get((int)var4_4)).c) ** break;
                ** continue;
                var6_6 = var4_4;
            }
        }
        if (var3_3 < 0) {
            return false;
        }
        for (var4_4 = this.b.size() - 1; var4_4 >= var3_3; --var4_4) {
            var1_1.add((y)this.b.remove(var4_4));
            var2_2.add(true);
        }
        return true;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void af(boolean var1_1) {
        this.ap(var1_1);
        if (!this.f && (var5_2 = this.e) != null) {
            var5_2.b = false;
            if (by.S(3)) {
                Objects.toString(this.e);
                Objects.toString(this.a);
            }
            this.e.k(false, false);
            this.a.add(0, this.e);
            var6_4 = this.e.d;
            var3_6 = var6_4.size();
            for (var2_7 = 0; var2_7 < var3_6; ++var2_7) {
                var5_2 = ((cd)var6_4.get((int)var2_7)).b;
                if (var5_2 == null) continue;
                var5_2.s = false;
            }
            this.e = null;
        }
        while (true) lbl-1000:
        // 3 sources

        {
            var7_9 = this.K;
            var6_4 = this.L;
            var5_2 = this.a;
            synchronized (var5_2) {
                if (this.a.isEmpty()) {
                    ** break;
                }
                try {
                    var4_8 = this.a.size();
                    var2_7 = 0;
                    for (var3_6 = 0; var3_6 < var4_8; var2_7 |= var1_1, ++var3_6) {
                        var1_1 = ((bv)this.a.get(var3_6)).f(var7_9, var6_4);
                    }
                    this.a.clear();
                }
                catch (Throwable var6_5) {
                    this.a.clear();
                    this.l.d.removeCallbacks(this.N);
                    throw var6_5;
                }
                this.l.d.removeCallbacks(this.N);
                if (var2_7 == 0) ** break;
            }
            this.A = true;
            try {
                this.as(this.K, this.L);
            }
            finally {
                this.an();
                continue;
            }
            break;
        }
        ** GOTO lbl-1000
lbl48:
        // 2 sources

        this.N();
        this.ao();
        this.y.i();
    }

    final gbb ag(be be2) {
        Object object = be2.mPreviousWho;
        if (object != null) {
            zy.a(be2, (String)object);
        }
        if (by.S(2)) {
            Objects.toString(be2);
        }
        object = this.ah(be2);
        be2.A = this;
        this.y.m((gbb)object);
        if (!be2.I) {
            this.y.h(be2);
            be2.r = false;
            if (be2.P == null) {
                be2.V = false;
            }
            if (by.aa(be2)) {
                this.t = true;
            }
        }
        return object;
    }

    final gbb ah(be object) {
        gbb gbb2 = this.y.l(((be)object).k);
        if (gbb2 != null) {
            return gbb2;
        }
        object = new gbb(this.z, this.y, (be)object);
        ((gbb)object).f(this.l.c.getClassLoader());
        ((gbb)object).b = this.k;
        return object;
    }

    final void ai(gbb gbb2) {
        be be2 = (be)gbb2.c;
        if (be2.Q) {
            if (this.A) {
                this.J = true;
                return;
            }
            be2.Q = false;
            gbb2.e();
        }
    }

    final a aj() {
        be be2 = this.n;
        if (be2 != null) {
            return be2.A.aj();
        }
        return this.O;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final Bundle b() {
        Bundle bundle4;
        Object object;
        Object object2;
        Object object3;
        int n2;
        boolean bl2;
        Bundle bundle2 = new Bundle();
        this.ar();
        this.D();
        this.af(true);
        this.u = true;
        this.x.g = true;
        Object object42 = this.y;
        ArrayList<String> arrayList = new ArrayList<String>(((HashMap)((bqv)object42).c).size());
        Object object5 = ((HashMap)((bqv)object42).c).values().iterator();
        while (true) {
            bl2 = object5.hasNext();
            n2 = 0;
            if (!bl2) break;
            object3 = (gbb)object5.next();
            if (object3 == null) continue;
            object2 = ((gbb)object3).c;
            object = (be)object2;
            String string = ((be)object).k;
            bundle4 = new Bundle();
            be be2 = (be)((gbb)object3).c;
            if (be2.f == -1 && (be2 = be2.g) != null) {
                bundle4.putAll((Bundle)be2);
            }
            bundle4.putParcelable("state", (Parcelable)new cc((be)((gbb)object3).c));
            if (((be)((gbb)object3).c).f >= 0) {
                Bundle bundle3 = new Bundle();
                ((be)((gbb)object3).c).onSaveInstanceState(bundle3);
                if (!bundle3.isEmpty()) {
                    bundle4.putBundle("savedInstanceState", bundle3);
                }
                Object object6 = ((gbb)object3).a;
                be2 = (be)((gbb)object3).c;
                ((awg)object6).w(be2, bundle3, false);
                be2 = new Bundle();
                ((be)((gbb)object3).c).ad.c((Bundle)be2);
                if (!be2.isEmpty()) {
                    bundle4.putBundle("registryState", (Bundle)be2);
                }
                if (!(be2 = ((be)((gbb)object3).c).C.b()).isEmpty()) {
                    bundle4.putBundle("childFragmentManager", (Bundle)be2);
                }
                if (((be)((gbb)object3).c).P != null) {
                    ((gbb)object3).g();
                }
                if ((be2 = ((be)((gbb)object3).c).h) != null) {
                    bundle4.putSparseParcelableArray("viewState", (SparseArray)be2);
                }
                if ((be2 = ((be)((gbb)object3).c).i) != null) {
                    bundle4.putBundle("viewRegistryState", (Bundle)be2);
                }
            }
            if ((object3 = ((be)((gbb)object3).c).l) != null) {
                bundle4.putBundle("arguments", (Bundle)object3);
            }
            ((bqv)object42).b(string, bundle4);
            arrayList.add(((be)object).k);
            if (!by.S(2)) continue;
            Objects.toString(object2);
            Objects.toString(((be)object).g);
        }
        object = (HashMap)this.y.b;
        if (((HashMap)object).isEmpty()) {
            return bundle2;
        }
        object42 = this.y;
        bundle4 = ((bqv)object42).d;
        synchronized (bundle4) {
            bl2 = ((ArrayList)((bqv)object42).d).isEmpty();
            object2 = null;
            if (bl2) {
                // MONITOREXIT @DISABLED, blocks:[2, 12] lbl65 : MonitorExitStatement: MONITOREXIT : var6_8
                object5 = null;
            } else {
                object5 = new ArrayList(((ArrayList)((bqv)object42).d).size());
                for (Object object42 : (ArrayList)((bqv)object42).d) {
                    ((ArrayList)object5).add(((be)object42).k);
                    if (!by.S(2)) continue;
                    object3 = ((be)object42).k;
                    Objects.toString(object42);
                }
            }
        }
        int n3 = this.b.size();
        if (n3 > 0) {
            bundle4 = new z[n3];
            while (true) {
                object2 = bundle4;
                if (n2 >= n3) break;
                bundle4[n2] = new z((y)this.b.get(n2));
                if (by.S(2)) {
                    Objects.toString(this.b.get(n2));
                }
                ++n2;
            }
        }
        bundle4 = new bz();
        bundle4.a = arrayList;
        bundle4.b = object5;
        bundle4.c = object2;
        bundle4.d = this.h.get();
        object5 = this.o;
        if (object5 != null) {
            bundle4.e = ((be)object5).k;
        }
        bundle4.f.addAll(this.C.keySet());
        bundle4.g.addAll(this.C.values());
        bundle4.h = new ArrayList(this.s);
        bundle2.putParcelable("state", (Parcelable)bundle4);
        for (Bundle bundle4 : this.D.keySet()) {
            object2 = String.valueOf(bundle4);
            bundle4 = (Bundle)this.D.get(bundle4);
            bundle2.putBundle("result_".concat((String)object2), bundle4);
        }
        object2 = ((HashMap)object).keySet().iterator();
        while (object2.hasNext()) {
            bundle4 = (String)object2.next();
            object5 = String.valueOf(bundle4);
            bundle4 = (Bundle)((HashMap)object).get(bundle4);
            bundle2.putBundle("fragment_".concat((String)object5), bundle4);
        }
        return bundle2;
    }

    final be c(String string) {
        return this.y.c(string);
    }

    public final be d(int n2) {
        Object object2;
        block2: {
            int n3;
            bqv bqv2 = this.y;
            int n4 = ((ArrayList)bqv2.d).size();
            while ((n3 = n4 - 1) >= 0) {
                object2 = (be)((ArrayList)bqv2.d).get(n3);
                n4 = n3;
                if (object2 == null) continue;
                n4 = n3;
                if (((be)object2).E != n2) continue;
                break block2;
            }
            for (Object object2 : ((HashMap)bqv2.c).values()) {
                if (object2 == null) continue;
                object2 = ((gbb)object2).c;
                if (((be)object2).E != n2) continue;
                break block2;
            }
            object2 = null;
        }
        return object2;
    }

    public final be e(String string) {
        Object object;
        Object object2 = this.y;
        if (string != null) {
            int n2;
            int n3 = ((ArrayList)((bqv)object2).d).size();
            while ((n2 = n3 - 1) >= 0) {
                object = (be)((ArrayList)((bqv)object2).d).get(n2);
                n3 = n2;
                if (object == null) continue;
                n3 = n2;
                if (!string.equals(((be)object).G)) continue;
                break;
            }
        } else {
            be be2 = null;
            object = be2;
            if (string != null) {
                object2 = ((HashMap)((bqv)object2).c).values().iterator();
                while (true) {
                    object = be2;
                    if (!object2.hasNext()) break;
                    object = (gbb)object2.next();
                    if (object == null) continue;
                    object = ((gbb)object).c;
                    if (string.equals(((be)object).G)) break;
                }
            }
        }
        return (be)object;
    }

    public final bl g() {
        be be2 = this.n;
        if (be2 != null) {
            return be2.A.g();
        }
        return this.I;
    }

    public final List h() {
        return this.y.g();
    }

    final Set i(ArrayList arrayList, int n2, int n3) {
        HashSet<cz> hashSet = new HashSet<cz>();
        while (n2 < n3) {
            ArrayList arrayList2 = ((y)arrayList.get((int)n2)).d;
            int n4 = arrayList2.size();
            for (int i2 = 0; i2 < n4; ++i2) {
                be be2 = ((cd)arrayList2.get((int)i2)).b;
                if (be2 == null || (be2 = be2.O) == null) continue;
                hashSet.add(cz.c((ViewGroup)be2, this));
            }
            ++n2;
        }
        return hashSet;
    }

    public final void j(cb cb2) {
        this.j.add(cb2);
    }

    public final void k(bm object, bj object2, be be2) {
        if (this.l == null) {
            Object object3;
            Object object4;
            this.l = object;
            this.m = object2;
            this.n = be2;
            if (be2 != null) {
                this.j(new br());
            } else if (object instanceof cb) {
                this.j((cb)object);
            }
            if (this.n != null) {
                this.N();
            }
            if (object instanceof ng) {
                object2 = (ng)object;
                this.d = object4 = object2.getOnBackPressedDispatcher();
                if (be2 != null) {
                    object2 = be2;
                }
                object3 = this.g;
                jse.e(object2, "owner");
                jse.e(object3, "onBackPressedCallback");
                object2 = object2.getLifecycle();
                if (((abb)object2).a() != aba.a) {
                    ((my)object3).e(new nc((nf)object4, (abb)object2, (my)object3));
                    ((nf)object4).d();
                    ((my)object3).d = new ne(object4, 1);
                }
            }
            if (be2 != null) {
                object4 = be2.A.x;
                object = object2 = (ca)((ca)object4).c.get(be2.k);
                if (object2 == null) {
                    object = new ca(((ca)object4).e);
                    ((ca)object4).c.put(be2.k, object);
                }
                this.x = object;
            } else {
                this.x = object instanceof aco ? (ca)new acn(((aco)object).getViewModelStore$ar$class_merging$ar$class_merging$ar$class_merging(), ca.a).a(ca.class) : new ca(false);
                be2 = null;
            }
            object = this.x;
            ((ca)object).g = this.V();
            this.y.a = object;
            object = this.l;
            if (object instanceof awh && be2 == null) {
                object = ((awh)object).getSavedStateRegistry();
                ((awf)object).b("android:support:fragments", new bo(this, 0));
                object = ((awf)object).a("android:support:fragments");
                if (object != null) {
                    this.J((Parcelable)object);
                }
            }
            if ((object = this.l) instanceof nr) {
                object2 = ((nr)object).d();
                object = be2 != null ? String.valueOf(be2.k).concat(":") : "";
                object3 = new nw();
                object4 = new bs(this, 0);
                object = "FragmentManager:".concat((String)object);
                this.p = ((nq)object2).a(((String)object).concat("StartActivityForResult"), (nu)object3, (nl)object4);
                object4 = new bt();
                object3 = new bs(this, 2);
                this.q = ((nq)object2).a(((String)object).concat("StartIntentSenderForResult"), (nu)object4, (nl)object3);
                object3 = new nv();
                object4 = new bs(this, 1);
                this.r = ((nq)object2).a(((String)object).concat("RequestPermissions"), (nu)object3, (nl)object4);
            }
            if ((object = this.l) instanceof st) {
                ((st)object).f(this.E);
            }
            if ((object = this.l) instanceof su) {
                ((su)object).i(this.F);
            }
            if ((object = this.l) instanceof cs) {
                ((cs)object).g(this.G);
            }
            if ((object = this.l) instanceof ct) {
                ((ct)object).h(this.H);
            }
            if ((object = this.l) instanceof vf && be2 == null) {
                ((vf)object).r(this.P);
            }
            return;
        }
        throw new IllegalStateException("Already attached");
    }

    final void l(be be2) {
        if (by.S(2)) {
            Objects.toString(be2);
        }
        if (be2.I) {
            be2.I = false;
            if (!be2.q) {
                this.y.h(be2);
                if (by.S(2)) {
                    Objects.toString(be2);
                }
                if (by.aa(be2)) {
                    this.t = true;
                }
            }
        }
    }

    final void m(be be2) {
        if (by.S(2)) {
            Objects.toString(be2);
        }
        if (!be2.I) {
            be2.I = true;
            if (be2.q) {
                if (by.S(2)) {
                    Objects.toString(be2);
                }
                this.y.j(be2);
                if (by.aa(be2)) {
                    this.t = true;
                }
                this.at(be2);
            }
        }
    }

    public final void n() {
        this.u = false;
        this.v = false;
        this.x.g = false;
        this.A(4);
    }

    public void noteStateNotSaved() {
        if (this.l != null) {
            this.u = false;
            this.v = false;
            this.x.g = false;
            for (be be2 : this.y.g()) {
                if (be2 == null) continue;
                be2.C.noteStateNotSaved();
            }
        }
    }

    final void o(Configuration configuration, boolean bl2) {
        if (bl2 && this.l instanceof st) {
            this.av(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (be be2 : this.y.g()) {
            if (be2 == null) continue;
            be2.onConfigurationChanged(configuration);
            if (!bl2) continue;
            be2.C.o(configuration, true);
        }
    }

    public final void p() {
        this.u = false;
        this.v = false;
        this.x.g = false;
        this.A(1);
    }

    public final void q() {
        Context context2;
        block16: {
            block15: {
                boolean bl2;
                block14: {
                    block13: {
                        this.w = true;
                        this.af(true);
                        this.D();
                        context2 = this.l;
                        if (!(context2 instanceof aco)) break block13;
                        bl2 = ((ca)this.y.a).f;
                        break block14;
                    }
                    context2 = context2.c;
                    if (!(context2 instanceof Activity)) break block15;
                    bl2 = true ^ ((Activity)context2).isChangingConfigurations();
                }
                if (!bl2) break block16;
            }
            Iterator iterator = this.C.values().iterator();
            while (iterator.hasNext()) {
                for (Context context2 : ((ab)iterator.next()).a) {
                    ((ca)this.y.a).c((String)context2, false);
                }
            }
        }
        this.A(-1);
        context2 = this.l;
        if (context2 instanceof su) {
            ((su)context2).n(this.F);
        }
        if ((context2 = this.l) instanceof st) {
            ((st)context2).k(this.E);
        }
        if ((context2 = this.l) instanceof cs) {
            ((cs)context2).l(this.G);
        }
        if ((context2 = this.l) instanceof ct) {
            ((ct)context2).m(this.H);
        }
        if ((context2 = this.l) instanceof vf && this.n == null) {
            ((vf)context2).s(this.P);
        }
        this.l = null;
        this.m = null;
        this.n = null;
        if (this.d != null) {
            context2 = this.g.c.iterator();
            while (context2.hasNext()) {
                ((ml)context2.next()).b();
            }
            this.d = null;
        }
        if ((context2 = this.p) != null) {
            context2.a();
            this.q.a();
            this.r.a();
        }
    }

    final void r(boolean bl2) {
        if (bl2 && this.l instanceof su) {
            this.av(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (be be2 : this.y.g()) {
            if (be2 == null) continue;
            be2.onLowMemory();
            if (!bl2) continue;
            be2.C.r(true);
        }
    }

    final void s(boolean bl2, boolean bl3) {
        if (bl3 && this.l instanceof cs) {
            this.av(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (be be2 : this.y.g()) {
            if (be2 == null || !bl3) continue;
            be2.C.s(bl2, true);
        }
    }

    public final void t() {
        for (be be2 : this.y.f()) {
            if (be2 == null) continue;
            be2.C.t();
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("FragmentManager{");
        stringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
        stringBuilder.append(" in ");
        Object object = this.n;
        if (object != null) {
            stringBuilder.append(object.getClass().getSimpleName());
            stringBuilder.append("{");
            stringBuilder.append(Integer.toHexString(System.identityHashCode(this.n)));
            stringBuilder.append("}");
        } else {
            object = this.l;
            if (object != null) {
                stringBuilder.append(object.getClass().getSimpleName());
                stringBuilder.append("{");
                stringBuilder.append(Integer.toHexString(System.identityHashCode(this.l)));
                stringBuilder.append("}");
            } else {
                stringBuilder.append("null");
            }
        }
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }

    public final void u(Menu menu) {
        if (this.k > 0) {
            for (be be2 : this.y.g()) {
                if (be2 == null || be2.H) continue;
                be2.C.u(menu);
            }
        }
    }

    public final void v(be object) {
        if (object != null && object.equals(this.c(((be)object).k))) {
            boolean bl2 = ((be)object).A.U((be)object);
            Boolean bl3 = ((be)object).p;
            if (bl3 == null || bl3 != bl2) {
                ((be)object).p = bl2;
                object = ((be)object).C;
                ((by)object).N();
                ((by)object).v(((by)object).o);
            }
        }
    }

    public final void w() {
        this.A(5);
    }

    final void x(boolean bl2, boolean bl3) {
        if (bl3 && this.l instanceof ct) {
            this.av(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (be be2 : this.y.g()) {
            if (be2 == null || !bl3) continue;
            be2.C.x(bl2, true);
        }
    }

    public final void y() {
        this.u = false;
        this.v = false;
        this.x.g = false;
        this.A(7);
    }

    public final void z() {
        this.u = false;
        this.v = false;
        this.x.g = false;
        this.A(5);
    }
}

