/*
 * Decompiled with CFR 0.152.
 */
package j$.time.zone;

import j$.time.Instant;
import j$.time.chrono.e_0;
import j$.time.chrono.i_0;
import j$.time.g;
import j$.time.i;
import j$.time.x;
import j$.time.zone.a;
import j$.time.zone.b;
import j$.time.zone.d;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;

public final class e
implements Serializable {
    private static final long[] i = new long[0];
    private static final d[] j = new d[0];
    private static final i[] k = new i[0];
    private static final b[] l = new b[0];
    private static final long serialVersionUID = 3044319355680032515L;
    private final long[] a;
    private final x[] b;
    private final long[] c;
    private final i[] d;
    private final x[] e;
    private final d[] f;
    private final TimeZone g;
    private final transient ConcurrentHashMap h = new ConcurrentHashMap();

    private e(x object) {
        x[] xArray = new x[1];
        this.b = xArray;
        xArray[0] = object;
        object = i;
        this.a = (long[])object;
        this.c = (long[])object;
        this.d = k;
        this.e = xArray;
        this.f = j;
        this.g = null;
    }

    e(TimeZone timeZone) {
        x[] xArray = new x[1];
        this.b = xArray;
        xArray[0] = j$.time.zone.e.j(timeZone.getRawOffset());
        long[] lArray = i;
        this.a = lArray;
        this.c = lArray;
        this.d = k;
        this.e = xArray;
        this.f = j;
        this.g = timeZone;
    }

    private e(long[] object, x[] object2, long[] lArray, x[] xArray, d[] object3) {
        this.a = object;
        this.b = object2;
        this.c = lArray;
        this.e = xArray;
        this.f = object3;
        if (lArray.length == 0) {
            this.d = k;
        } else {
            object = new ArrayList();
            int n2 = 0;
            while (n2 < lArray.length) {
                object3 = xArray[n2];
                int n3 = n2 + 1;
                object2 = xArray[n3];
                if (((b)(object2 = new b(lArray[n2], (x)object3, (x)object2))).F()) {
                    ((ArrayList)object).add(((b)object2).m());
                    ((ArrayList)object).add(((b)object2).g());
                } else {
                    ((ArrayList)object).add(((b)object2).g());
                    ((ArrayList)object).add(((b)object2).m());
                }
                n2 = n3;
            }
            this.d = ((ArrayList)object).toArray(new i[((ArrayList)object).size()]);
        }
        this.g = null;
    }

    private static Object a(i i2, b b2) {
        i i3 = b2.m();
        if (b2.F()) {
            if (i2.O(i3)) {
                return b2.t();
            }
            if (i2.O(b2.g())) {
                return b2;
            }
            return b2.s();
        }
        if (!i2.O(i3)) {
            return b2.s();
        }
        if (i2.O(b2.g())) {
            return b2.t();
        }
        return b2;
    }

    private b[] b(int n2) {
        int n3;
        ConcurrentHashMap concurrentHashMap = this.h;
        Integer n4 = n2;
        Serializable[] serializableArray = (b[])concurrentHashMap.get(n4);
        if (serializableArray != null) {
            return serializableArray;
        }
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            serializableArray = l;
            if (n2 < 1800) {
                return serializableArray;
            }
            long l2 = i_0.n(j$.time.i.P(n2 - 1), this.b[0]);
            n3 = timeZone.getOffset(l2 * 1000L);
            long l3 = 31968000L + l2;
            while (l2 < l3) {
                Serializable[] serializableArray2;
                long l4 = 7776000L + l2;
                if (n3 != timeZone.getOffset(l4 * 1000L)) {
                    long l5 = l2;
                    l2 = l4;
                    l4 = l5;
                    while (l2 - l4 > 1L) {
                        l5 = j$.nio.file.attribute.a.f(l2 + l4, 2L);
                        if (timeZone.getOffset(l5 * 1000L) == n3) {
                            l4 = l5;
                            continue;
                        }
                        l2 = l5;
                    }
                    l5 = l3;
                    if (timeZone.getOffset(l4 * 1000L) == n3) {
                        l4 = l2;
                    }
                    x x2 = j$.time.zone.e.j(n3);
                    int n5 = timeZone.getOffset(l4 * 1000L);
                    x x3 = j$.time.zone.e.j(n5);
                    n3 = n5;
                    serializableArray2 = serializableArray;
                    l3 = l4;
                    l2 = l5;
                    if (j$.time.zone.e.c(l4, x3) == n2) {
                        serializableArray2 = (b[])Arrays.copyOf(serializableArray, serializableArray.length + 1);
                        serializableArray2[serializableArray2.length - 1] = new b(l4, x2, x3);
                        n3 = n5;
                        l3 = l4;
                        l2 = l5;
                    }
                } else {
                    l2 = l3;
                    l3 = l4;
                    serializableArray2 = serializableArray;
                }
                l4 = l2;
                serializableArray = serializableArray2;
                l2 = l3;
                l3 = l4;
            }
            if (1916 <= n2 && n2 < 2100) {
                concurrentHashMap.putIfAbsent(n4, serializableArray);
            }
            return serializableArray;
        }
        serializableArray = this.f;
        b[] bArray = new b[serializableArray.length];
        for (n3 = 0; n3 < serializableArray.length; ++n3) {
            bArray[n3] = ((d)serializableArray[n3]).a(n2);
        }
        if (n2 < 2100) {
            concurrentHashMap.putIfAbsent(n4, bArray);
        }
        return bArray;
    }

    private static int c(long l2, x x2) {
        return j$.time.g.V(j$.nio.file.attribute.a.f(l2 + (long)x2.O(), 86400)).P();
    }

    private Object e(i object) {
        int n2;
        Object object2 = null;
        Object object3 = null;
        x[] xArray = this.b;
        int n3 = 0;
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            b[] bArray = this.b(((i)object).M());
            if (bArray.length == 0) {
                return j$.time.zone.e.j(timeZone.getOffset(i_0.n((e_0)object, xArray[0]) * 1000L));
            }
            int n4 = bArray.length;
            object2 = object3;
            for (n2 = n3; n2 < n4; ++n2) {
                object3 = bArray[n2];
                object2 = j$.time.zone.e.a((i)object, (b)object3);
                if (!(object2 instanceof b) && !object2.equals(((b)object3).t())) {
                    continue;
                }
                return object2;
            }
            return object2;
        }
        if (this.c.length == 0) {
            return xArray[0];
        }
        n3 = this.f.length;
        object3 = this.d;
        if (n3 > 0 && ((i)object).N((i)object3[((Object[])object3).length - 1])) {
            for (b b2 : this.b(((i)object).M())) {
                object2 = j$.time.zone.e.a((i)object, b2);
                if (!(object2 instanceof b) && !object2.equals(b2.t())) {
                    continue;
                }
                return object2;
            }
            return object2;
        }
        n3 = Arrays.binarySearch((Object[])object3, object);
        object = this.e;
        if (n3 == -1) {
            return object[0];
        }
        if (n3 < 0) {
            n2 = -n3 - 2;
        } else {
            n2 = n3;
            if (n3 < ((Object[])object3).length - 1) {
                object2 = object3[n3];
                int n5 = n3 + 1;
                n2 = n3;
                if (((i)object2).equals(object3[n5])) {
                    n2 = n5;
                }
            }
        }
        if ((n2 & 1) == 0) {
            object2 = object3[n2];
            object3 = object3[n2 + 1];
            x x2 = object[n2 /= 2];
            if (((x)(object = object[n2 + 1])).O() > x2.O()) {
                return new b((i)object2, x2, (x)object);
            }
            return new b((i)object3, x2, (x)object);
        }
        return object[n2 / 2 + 1];
    }

    public static e i(x x2) {
        Objects.requireNonNull(x2, "offset");
        return new e(x2);
    }

    private static x j(int n2) {
        return x.R(n2 / 1000);
    }

    /*
     * Enabled aggressive block sorting
     */
    static e k(ObjectInput objectInput) {
        int n2;
        int n3 = objectInput.readInt();
        long[] lArray = i;
        long[] lArray2 = n3 == 0 ? lArray : new long[n3];
        int n4 = 0;
        for (n2 = 0; n2 < n3; ++n2) {
            lArray2[n2] = j$.time.zone.a.a(objectInput);
        }
        x[] xArray = new x[++n3];
        for (n2 = 0; n2 < n3; ++n2) {
            xArray[n2] = j$.time.zone.a.b(objectInput);
        }
        n3 = objectInput.readInt();
        if (n3 != 0) {
            lArray = new long[n3];
        }
        for (n2 = 0; n2 < n3; ++n2) {
            lArray[n2] = j$.time.zone.a.a(objectInput);
        }
        x[] xArray2 = new x[++n3];
        for (n2 = 0; n2 < n3; ++n2) {
            xArray2[n2] = j$.time.zone.a.b(objectInput);
        }
        n3 = objectInput.readByte();
        d[] dArray = n3 == 0 ? j : new d[n3];
        n2 = n4;
        while (n2 < n3) {
            dArray[n2] = j$.time.zone.d.b(objectInput);
            ++n2;
        }
        return new e(lArray2, xArray, lArray, xArray2, dArray);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        byte by2 = this.g != null ? (byte)100 : 1;
        return new a(by2, this);
    }

    public final x d(Instant object) {
        int n2;
        Object object2 = this.g;
        if (object2 != null) {
            return j$.time.zone.e.j(object2.getOffset(((Instant)object).toEpochMilli()));
        }
        object2 = this.c;
        int n3 = ((Object)object2).length;
        if (n3 == 0) {
            return this.b[0];
        }
        long l2 = ((Instant)object).getEpochSecond();
        n3 = this.f.length;
        object = this.e;
        if (n3 > 0 && l2 > object2[((Object)object2).length - 1]) {
            object2 = this.b(j$.time.zone.e.c(l2, object[((x[])object).length - 1]));
            object = null;
            for (n2 = 0; n2 < ((b[])object2).length; ++n2) {
                object = object2[n2];
                if (l2 >= ((b)object).H()) continue;
                return ((b)object).t();
            }
            return ((b)object).s();
        }
        n2 = n3 = Arrays.binarySearch((long[])object2, l2);
        if (n3 < 0) {
            n2 = -n3 - 2;
        }
        return object[n2 + 1];
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return true;
        }
        if (object instanceof e) {
            e e2 = (e)object;
            object = e2.g;
            if (!(Objects.equals(this.g, object) && Arrays.equals(this.a, e2.a) && Arrays.equals(this.b, e2.b) && Arrays.equals(this.c, e2.c) && Arrays.equals(this.e, e2.e) && Arrays.equals(this.f, e2.f))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final b f(i object) {
        object = (object = this.e((i)object)) instanceof b ? (b)object : null;
        return object;
    }

    public final List g(i object) {
        if ((object = this.e((i)object)) instanceof b) {
            return ((b)object).B();
        }
        return Collections.singletonList((x)object);
    }

    public final boolean h(Instant instant) {
        Object object = this.g;
        if (object != null) {
            object = j$.time.zone.e.j(object.getRawOffset());
        } else {
            int n2 = this.c.length;
            object = this.b;
            if (n2 == 0) {
                object = object[0];
            } else {
                int n3;
                long l2 = instant.getEpochSecond();
                n2 = n3 = Arrays.binarySearch(this.a, l2);
                if (n3 < 0) {
                    n2 = -n3 - 2;
                }
                object = object[n2 + 1];
            }
        }
        return object.equals(this.d(instant)) ^ true;
    }

    public final int hashCode() {
        return Objects.hashCode(this.g) ^ Arrays.hashCode(this.a) ^ Arrays.hashCode(this.b) ^ Arrays.hashCode(this.c) ^ Arrays.hashCode(this.e) ^ Arrays.hashCode(this.f);
    }

    final void l(ObjectOutput objectOutput) {
        objectOutput.writeUTF(this.g.getID());
    }

    public final String toString() {
        Object object = this.g;
        if (object != null) {
            String string = ((TimeZone)object).getID();
            object = new StringBuilder("ZoneRules[timeZone=");
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append("]");
            return ((StringBuilder)object).toString();
        }
        object = this.b;
        String string = String.valueOf(object[((x[])object).length - 1]);
        object = new StringBuilder("ZoneRules[currentStandardOffset=");
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append("]");
        return ((StringBuilder)object).toString();
    }

    final void writeExternal(ObjectOutput objectOutput) {
        int n2;
        Object[] objectArray = this.a;
        objectOutput.writeInt(objectArray.length);
        int n3 = objectArray.length;
        int n4 = 0;
        for (n2 = 0; n2 < n3; ++n2) {
            j$.time.zone.a.c(objectArray[n2], objectOutput);
        }
        objectArray = this.b;
        n3 = objectArray.length;
        for (n2 = 0; n2 < n3; ++n2) {
            j$.time.zone.a.d((x)objectArray[n2], objectOutput);
        }
        objectArray = this.c;
        objectOutput.writeInt(objectArray.length);
        n3 = objectArray.length;
        for (n2 = 0; n2 < n3; ++n2) {
            j$.time.zone.a.c(objectArray[n2], objectOutput);
        }
        objectArray = this.e;
        n3 = objectArray.length;
        for (n2 = 0; n2 < n3; ++n2) {
            j$.time.zone.a.d((x)objectArray[n2], objectOutput);
        }
        objectArray = this.f;
        objectOutput.writeByte(objectArray.length);
        n3 = objectArray.length;
        for (n2 = n4; n2 < n3; ++n2) {
            objectArray[n2].writeExternal(objectOutput);
        }
    }
}

