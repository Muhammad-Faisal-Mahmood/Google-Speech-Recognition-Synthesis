/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

public final class czd {
    public final cwk a;
    public final Context b;
    public final cuv c;
    public final gto d;
    public final Executor e;
    public final cyu f;
    public final egg g;
    public final bmu h;

    public czd(Context context, cwk cwk2, egg egg2, bmu bmu2, cyu cyu2, cuv cuv2, gto gto2, Executor executor) {
        this.b = context;
        this.a = cwk2;
        this.g = egg2;
        this.h = bmu2;
        this.f = cyu2;
        this.c = cuv2;
        this.d = gto2;
        this.e = executor;
    }

    public static final String a(ctq ctq2) {
        StringBuilder stringBuilder = new StringBuilder(ctq2.c);
        stringBuilder.append("|");
        stringBuilder.append(ctq2.d);
        return stringBuilder.toString();
    }

    public static final Set b(Map map, String string) {
        Set set = (Set)map.get(string);
        if (set == null) {
            map.put(string, new HashSet());
            return (Set)map.get(string);
        }
        return set;
    }
}

