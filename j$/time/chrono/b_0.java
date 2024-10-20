/*
 * Decompiled with CFR 0.152.
 */
package j$.time.chrono;

import j$.time.chrono.e_0;
import j$.time.chrono.n;
import j$.time.k;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.p;

/*
 * Renamed from j$.time.chrono.b
 */
public interface b_0
extends j$.time.temporal.k,
j$.time.temporal.n,
Comparable {
    public int A(b_0 var1);

    public long C();

    public e_0 E(k var1);

    public n a();

    @Override
    public b_0 d(long var1, p var3);

    @Override
    public boolean e(p var1);

    @Override
    public b_0 f(long var1, TemporalUnit var3);

    public int hashCode();

    public boolean o();

    public String toString();

    public b_0 v(long var1, TemporalUnit var3);

    public int x();
}

