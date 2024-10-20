/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Executor;

public final class kqh
extends kog {
    public final kqm a;
    public final String b;
    public final kny c;
    public final Executor d;
    public final ArrayList e = new ArrayList();
    public final String f;
    public boolean g;
    public Collection h;
    public boolean i;
    public int j;
    public boolean k;
    public int l;

    public kqh(String string, kny kny2, Executor executor, kqm kqm2) {
        this.f = "POST";
        this.b = Objects.requireNonNull(string, "URL is required.");
        this.c = Objects.requireNonNull(kny2, "Callback is required.");
        this.d = Objects.requireNonNull(executor, "Executor is required.");
        this.a = Objects.requireNonNull(kqm2, "CronetEngine is required.");
    }
}

