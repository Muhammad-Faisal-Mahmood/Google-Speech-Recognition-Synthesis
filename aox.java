/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.AudioManager
 *  android.text.TextUtils
 *  android.util.Pair
 */
import android.content.Context;
import android.media.AudioManager;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public final class aox
extends aoz {
    public static final hcp a = new gys(new aog(2));
    public final Object b;
    public final boolean c;
    public final aop d;
    public aos e;
    public adi f;

    public aox(Context context) {
        boolean bl2;
        aop aop2 = new aop(new aoo(context));
        this.b = new Object();
        if (context != null) {
            context.getApplicationContext();
        }
        this.d = aop2;
        this.f = adi.a;
        boolean bl3 = bl2 = false;
        if (context != null) {
            bl3 = bl2;
            if (agf.u(context)) {
                bl3 = true;
            }
        }
        this.c = bl3;
        if (!bl3 && context != null && agf.a >= 32) {
            Object object = (AudioManager)context.getSystemService("audio");
            object = object == null ? null : new aos(xu$$ExternalSyntheticApiModelOutline6.m(object));
            this.e = object;
        }
        if (aop2.p && context == null) {
            afx.e("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    protected static int a(adu object, String string, boolean bl2) {
        if (!TextUtils.isEmpty((CharSequence)string) && string.equals(((adu)object).d)) {
            return 4;
        }
        string = aox.c(string);
        object = aox.c(((adu)object).d);
        if (object != null && string != null) {
            if (!((String)object).startsWith(string) && !string.startsWith((String)object)) {
                if (agf.x((String)object, "-")[0].equals(agf.x(string, "-")[0])) {
                    return 2;
                }
                return 0;
            }
            return 3;
        }
        if (bl2 && object == null) {
            return 1;
        }
        return 0;
    }

    public static int b(int n2, int n3) {
        return Integer.bitCount(0);
    }

    protected static String c(String string) {
        if (!TextUtils.isEmpty((CharSequence)string) && !TextUtils.equals((CharSequence)string, (CharSequence)"und")) {
            return string;
        }
        return null;
    }

    public static void e(aob aob2, afb afb2) {
        for (int i2 = 0; i2 < aob2.b; ++i2) {
            aex aex2 = aob2.a(i2);
            if ((aey)afb2.j.get(aex2) == null) {
                continue;
            }
            throw null;
        }
    }

    public static final Pair f(int n2, kpo object, int[][][] object2, aou aou2, Comparator comparator) {
        ArrayList arrayList = new ArrayList();
        if (n2 == ((kpo)object).f(0)) {
            aob aob2 = ((kpo)object).h(0);
            block0: for (n2 = 0; n2 < aob2.b; ++n2) {
                aex aex2 = aob2.a(n2);
                List list = aou2.a(0, aex2, (int[])object2[0][n2]);
                int n3 = aex2.a;
                boolean[] blArray = new boolean[1];
                int n4 = 0;
                while (true) {
                    n3 = aex2.a;
                    if (n4 > 0) continue block0;
                    n3 = n4 + 1;
                    aov aov2 = (aov)list.get(n4);
                    int n5 = aov2.b();
                    if (!blArray[n4] && n5 != 0) {
                        if (n5 == 1) {
                            object = gzx.q(aov2);
                        } else {
                            ArrayList<Object> arrayList2 = new ArrayList<Object>();
                            arrayList2.add(aov2);
                            n4 = n3;
                            while (true) {
                                n5 = aex2.a;
                                object = arrayList2;
                                if (n4 > 0) break;
                                object = (aov)list.get(n4);
                                if (((aov)object).b() == 2 && aov2.c((aov)object)) {
                                    arrayList2.add(object);
                                    blArray[n4] = true;
                                }
                                ++n4;
                            }
                        }
                        arrayList.add(object);
                    }
                    n4 = n3;
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        object2 = (List)Collections.max(arrayList, comparator);
        object = new int[object2.size()];
        for (n2 = 0; n2 < object2.size(); ++n2) {
            object[n2] = ((aov)object2.get((int)n2)).c;
        }
        object2 = (aov)object2.get(0);
        object = new awg(((aov)object2).b, (int[])object);
        n2 = ((aov)object2).a;
        return Pair.create((Object)object, (Object)0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void d() {
        boolean bl2;
        Object object = this.b;
        // MONITORENTER : object
        boolean bl3 = this.d.p;
        boolean bl4 = bl2 = false;
        if (bl3) {
            bl4 = bl2;
            if (!this.c) {
                bl4 = bl2;
                if (agf.a >= 32) {
                    aos aos2 = this.e;
                    bl4 = bl2;
                    if (aos2 != null) {
                        bl4 = bl2;
                        if (aos2.b) {
                            bl4 = true;
                        }
                    }
                }
            }
        }
        // MONITOREXIT : object
        if (!bl4) return;
        object = this.g;
        if (object == null) return;
        ((ajd)object).d.d(10);
    }
}

