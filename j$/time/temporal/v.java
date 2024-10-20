/*
 * Decompiled with CFR 0.152.
 */
package j$.time.temporal;

import j$.time.d;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.h;
import j$.time.temporal.p;
import j$.time.temporal.u;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public final class v
implements Serializable {
    private static final ConcurrentHashMap g = new ConcurrentHashMap(4, 0.75f, 2);
    public static final TemporalUnit h;
    private static final long serialVersionUID = -1177360819670808121L;
    private final d a;
    private final int b;
    private final transient p c = u.d(this);
    private final transient p d = u.f(this);
    private final transient p e;
    private final transient p f;

    static {
        new v(j$.time.d.MONDAY, 4);
        v.f(j$.time.d.SUNDAY, 1);
        h = j$.time.temporal.h.d;
    }

    private v(d d2, int n2) {
        ChronoUnit chronoUnit = ChronoUnit.NANOS;
        this.e = u.h(this);
        this.f = u.e(this);
        Objects.requireNonNull(d2, "firstDayOfWeek");
        if (n2 >= 1 && n2 <= 7) {
            this.a = d2;
            this.b = n2;
            return;
        }
        throw new IllegalArgumentException("Minimal number of days is invalid");
    }

    static /* bridge */ /* synthetic */ p a(v v2) {
        return v2.c;
    }

    static /* bridge */ /* synthetic */ p b(v v2) {
        return v2.e;
    }

    public static v f(d d2, int n2) {
        Object object = d2.toString();
        Serializable serializable = new StringBuilder();
        serializable.append((String)object);
        serializable.append(n2);
        String string = serializable.toString();
        ConcurrentHashMap concurrentHashMap = g;
        serializable = (v)concurrentHashMap.get(string);
        object = serializable;
        if (serializable == null) {
            concurrentHashMap.putIfAbsent(string, new v(d2, n2));
            object = (v)concurrentHashMap.get(string);
        }
        return object;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (this.a != null) {
            int n2 = this.b;
            if (n2 >= 1 && n2 <= 7) {
                return;
            }
            throw new InvalidObjectException("Minimal number of days is invalid");
        }
        throw new InvalidObjectException("firstDayOfWeek is null");
    }

    private Object readResolve() {
        try {
            v v2 = v.f(this.a, this.b);
            return v2;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            String string = illegalArgumentException.getMessage();
            StringBuilder stringBuilder = new StringBuilder("Invalid serialized WeekFields: ");
            stringBuilder.append(string);
            throw new InvalidObjectException(stringBuilder.toString());
        }
    }

    public final p c() {
        return this.c;
    }

    public final d d() {
        return this.a;
    }

    public final int e() {
        return this.b;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        if (object instanceof v) {
            if (this.hashCode() != object.hashCode()) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final p g() {
        return this.f;
    }

    public final p h() {
        return this.d;
    }

    public final int hashCode() {
        return this.a.ordinal() * 7 + this.b;
    }

    public final p i() {
        return this.e;
    }

    public final String toString() {
        String string = String.valueOf(this.a);
        StringBuilder stringBuilder = new StringBuilder("WeekFields[");
        stringBuilder.append(string);
        stringBuilder.append(",");
        stringBuilder.append(this.b);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

