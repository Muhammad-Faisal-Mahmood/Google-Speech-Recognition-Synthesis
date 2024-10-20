/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
import android.util.Log;
import j$.util.Objects;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.concurrent.Executor;

public final class ksc
extends kol {
    private static final String l = "ksc";
    public String a;
    public boolean b;
    public int d = 3;
    public kpq e;
    public Executor f;
    public boolean g;
    public boolean h;
    public int i;
    public boolean j;
    public int k;
    private final kqm m;
    private final String n;
    private final kps o;
    private final Executor p;
    private final ArrayList q = new ArrayList();

    public ksc(String string, kps kps2, Executor executor, kqm kqm2) {
        this.n = Objects.requireNonNull(string, "URL is required.");
        this.o = Objects.requireNonNull(kps2, "Callback is required.");
        this.p = Objects.requireNonNull(executor, "Executor is required.");
        this.m = Objects.requireNonNull(kqm2, "CronetEngine is required.");
    }

    @Override
    public final kom ah() {
        int n2 = this.d;
        boolean bl2 = this.b;
        boolean bl3 = this.g;
        boolean bl4 = this.h;
        int n3 = this.i;
        boolean bl5 = this.j;
        int n4 = this.k;
        Object object = this.a;
        String string = object;
        if (object == null) {
            string = "GET";
        }
        kpq kpq2 = this.e;
        object = this.f;
        ArrayList arrayList = this.q;
        return this.m.h(this.n, this.o, this.p, n2, bl2, bl3, bl4, n3, bl5, n4, string, arrayList, kpq2, (Executor)object);
    }

    @Override
    public final void ai(String string) {
        this.a = Objects.requireNonNull(string, "Method is required.");
    }

    public final void aj(String string, String string2) {
        Objects.requireNonNull(string, "Invalid header name.");
        Objects.requireNonNull(string2, "Invalid header value.");
        if ("Accept-Encoding".equalsIgnoreCase(string)) {
            if (Log.isLoggable((String)l, (int)3)) {
                new Exception();
            }
            return;
        }
        this.q.add(new AbstractMap.SimpleEntry<String, String>(string, string2));
    }
}

