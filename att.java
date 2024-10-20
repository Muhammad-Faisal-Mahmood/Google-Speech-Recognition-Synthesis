/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

public final class att {
    public final Context a;
    public final String b;
    public final awo c;
    public final List d;
    public final boolean e;
    public final aul f;
    public final Executor g;
    public final Executor h;
    public final boolean i;
    public final boolean j;
    public final Set k;
    public final List l;
    public final List m;
    public final bzb n;

    public att(Context context, String string, awo awo2, bzb bzb2, List list, boolean bl2, aul aul2, Executor executor, Executor executor2, boolean bl3, boolean bl4, Set set, List list2, List list3) {
        jse.e(context, "context");
        jse.e((Object)aul2, "journalMode");
        this.a = context;
        this.b = string;
        this.c = awo2;
        this.n = bzb2;
        this.d = list;
        this.e = bl2;
        this.f = aul2;
        this.g = executor;
        this.h = executor2;
        this.i = bl3;
        this.j = bl4;
        this.k = set;
        this.l = list2;
        this.m = list3;
    }
}

