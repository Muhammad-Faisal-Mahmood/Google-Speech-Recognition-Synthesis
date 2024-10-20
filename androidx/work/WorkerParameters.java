/*
 * Decompiled with CFR 0.152.
 */
package androidx.work;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

public final class WorkerParameters {
    public final UUID a;
    public final bas b;
    public final Set c;
    public final Executor d;
    public final jqf e;
    public final bbz f;
    public final baz g;
    public final czh h;

    public WorkerParameters(UUID uUID, bas bas2, Collection collection, Executor executor, jqf jqf2, czh czh2, bbz bbz2, baz baz2) {
        this.a = uUID;
        this.b = bas2;
        this.c = new HashSet(collection);
        this.d = executor;
        this.e = jqf2;
        this.h = czh2;
        this.f = bbz2;
        this.g = baz2;
    }
}

