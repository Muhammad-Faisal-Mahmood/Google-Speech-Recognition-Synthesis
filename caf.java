/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.util.ArrayList;

public class caf {
    public static volatile int a = -1;
    public static final cjn[] b = new cjn[0];
    public static final String[] c = new String[0];
    @Deprecated
    public static final bxt k;
    private static final ki l;
    public final car d;
    public final Context e;
    protected final cak f;
    protected final String g;
    public final String h;
    public final cat i;
    protected final cam j;

    static {
        cad cad2 = new cad();
        l = cad2;
        k = new bxt((Object)"ClearcutLogger.API", cad2, null);
    }

    protected caf(Context context, String object, cat cat2, cak cak2, car car2, gui gui2, cam cam2) {
        if (!cat2.a(cau.d)) {
            kl.ao(true, "Upload account name cannot be used with a deidentified or pseudonymous logger.");
        }
        caf.b(cat2);
        this.e = context.getApplicationContext();
        this.h = context.getPackageName();
        this.g = object;
        this.i = cat2;
        object = cak2;
        if (cak2 == null) {
            object = new cba(context, gui2);
        }
        this.f = object;
        object = car2;
        if (car2 == null) {
            object = new cbg(context);
        }
        this.d = object;
        this.j = cam2;
    }

    static final String a(Iterable iterable) {
        return new gtk(", ").d(iterable);
    }

    static final void b(cat cat2) {
        if (!(cat2.equals(cat.c) || cat2.equals(cat.a) || cat2.equals(cat.b))) {
            throw new IllegalArgumentException("piiLevelSet must be one of ZWIEBACK_ONLY, NO_RESTRICTIONS, or DEIDENTIFIED");
        }
    }

    public static final int[] d(ArrayList arrayList) {
        if (arrayList == null) {
            return null;
        }
        int[] nArray = new int[arrayList.size()];
        int n2 = arrayList.size();
        int n3 = 0;
        int n4 = 0;
        while (n3 < n2) {
            nArray[n4] = (Integer)arrayList.get(n3);
            ++n3;
            ++n4;
        }
        return nArray;
    }

    public final boolean c() {
        return this.i.equals(cat.b);
    }
}

