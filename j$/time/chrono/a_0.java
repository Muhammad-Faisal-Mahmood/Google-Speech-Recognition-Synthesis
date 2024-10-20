/*
 * Decompiled with CFR 0.152.
 */
package j$.time.chrono;

import j$.time.c;
import j$.time.chrono.C;
import j$.time.chrono.I;
import j$.time.chrono.e_0;
import j$.time.chrono.n;
import j$.time.chrono.q;
import j$.time.chrono.u;
import j$.time.chrono.x;
import j$.time.i;
import j$.time.k;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;

/*
 * Renamed from j$.time.chrono.a
 */
public abstract class a_0
implements n {
    private static final ConcurrentHashMap a = new ConcurrentHashMap();
    private static final ConcurrentHashMap b = new ConcurrentHashMap();
    public static final int c = 0;

    static {
        new Locale("ja", "JP", "JP");
    }

    protected a_0() {
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static n g(String string) {
        n n2;
        Iterator<a_0> iterator;
        Objects.requireNonNull(string, "id");
        while (true) {
            void var1_5;
            ConcurrentHashMap concurrentHashMap = a;
            iterator = (n)concurrentHashMap.get(string);
            n n3 = iterator;
            if (iterator == null) {
                n n4 = (n)b.get(string);
            }
            if (var1_5 != null) {
                return var1_5;
            }
            if (concurrentHashMap.get("ISO") != null) break;
            q q2 = q.o;
            a_0.m(q2, q2.l());
            x x2 = x.d;
            a_0.m(x2, x2.l());
            C c2 = C.d;
            a_0.m(c2, c2.l());
            I i2 = I.d;
            a_0.m(i2, i2.l());
            try {
                iterator = Arrays.asList(new a_0[0]).iterator();
            }
            catch (Throwable throwable) {
                throw new ServiceConfigurationError(throwable.getMessage(), throwable);
            }
            while (iterator.hasNext()) {
                a_0 a_02 = iterator.next();
                if (a_02.l().equals("ISO")) continue;
                a_0.m(a_02, a_02.l());
            }
            u u2 = u.d;
            a_0.m(u2, u2.l());
        }
        iterator = ServiceLoader.load(n.class).iterator();
        do {
            if (iterator.hasNext()) continue;
            StringBuilder stringBuilder = new StringBuilder("Unknown chronology: ");
            stringBuilder.append(string);
            throw new RuntimeException(stringBuilder.toString());
        } while (!string.equals((n2 = (n)iterator.next()).l()) && !string.equals(n2.z()));
        return n2;
    }

    static n m(a_0 a_02, String object) {
        String string;
        if ((object = (n)a.putIfAbsent(object, a_02)) == null && (string = a_02.z()) != null) {
            b.putIfAbsent(string, a_02);
        }
        return object;
    }

    public final int compareTo(Object object) {
        object = (n)object;
        return this.l().compareTo(object.l());
    }

    @Override
    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        if (object instanceof a_0) {
            object = (a_0)object;
            if (this.l().compareTo(object.l()) != 0) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    @Override
    public final int hashCode() {
        return this.getClass().hashCode() ^ this.l().hashCode();
    }

    @Override
    public final String toString() {
        return this.l();
    }

    @Override
    public e_0 u(i e_02) {
        try {
            e_02 = this.r(e_02).E(k.K(e_02));
            return e_02;
        }
        catch (c c2) {
            throw new RuntimeException("Unable to obtain ChronoLocalDateTime from TemporalAccessor: ".concat(String.valueOf(i.class)), c2);
        }
    }
}

