/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

public final class auk {
    public final jta a;
    public final Context b;
    public final String c;
    public final List d;
    public final List e;
    public Executor f;
    public Executor g;
    public awo h;
    public boolean i;
    public final aul j;
    public final Set k;
    public final Set l;
    public final List m;
    public boolean n;
    public boolean o;
    public final bzb p;

    public auk(Context context, Class clazz, String string) {
        jse.e(context, "context");
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.j = aul.a;
        this.p = new bzb(null, null);
        this.k = new LinkedHashSet();
        this.l = new LinkedHashSet();
        this.m = new ArrayList();
        this.n = true;
        this.a = jsd.e(clazz);
        this.b = context;
        this.c = string;
    }

    public final void a(avp ... avpArray) {
        avp avp2 = avpArray[0];
        int n2 = avp2.a;
        this.l.add(n2);
        n2 = avp2.b;
        this.l.add(n2);
        avpArray = Arrays.copyOf(avpArray, 1);
        jse.e(avpArray, "migrations");
        n2 = avpArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            this.p.M(avpArray[i2]);
        }
    }
}

