/*
 * Decompiled with CFR 0.152.
 */
package j$.time.zone;

import j$.time.x;
import j$.time.zone.b;
import j$.time.zone.d;
import j$.time.zone.e;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import java.util.TimeZone;

final class a
implements Externalizable {
    private static final long serialVersionUID = -8885321777449118786L;
    private byte a;
    private Serializable b;

    public a() {
    }

    a(byte by2, Serializable serializable) {
        this.a = by2;
        this.b = serializable;
    }

    static long a(ObjectInput objectInput) {
        int n2 = objectInput.readByte() & 0xFF;
        if (n2 == 255) {
            return objectInput.readLong();
        }
        return (long)((n2 << 16) + ((objectInput.readByte() & 0xFF) << 8) + (objectInput.readByte() & 0xFF)) * 900L - 4575744000L;
    }

    static x b(ObjectInput object) {
        byte by2 = object.readByte();
        object = by2 == 127 ? x.R(object.readInt()) : x.R(by2 * 900);
        return object;
    }

    static void c(long l2, ObjectOutput objectOutput) {
        if (l2 >= -4575744000L && l2 < 10413792000L && l2 % 900L == 0L) {
            int n2 = (int)((l2 + 4575744000L) / 900L);
            objectOutput.writeByte(n2 >>> 16 & 0xFF);
            objectOutput.writeByte(n2 >>> 8 & 0xFF);
            objectOutput.writeByte(n2 & 0xFF);
        } else {
            objectOutput.writeByte(255);
            objectOutput.writeLong(l2);
        }
    }

    static void d(x x2, ObjectOutput objectOutput) {
        int n2 = x2.O();
        int n3 = n2 % 900 == 0 ? n2 / 900 : 127;
        objectOutput.writeByte(n3);
        if (n3 == 127) {
            objectOutput.writeInt(n2);
        }
    }

    private Object readResolve() {
        return this.b;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final void readExternal(ObjectInput object) {
        byte by2;
        this.a = by2 = object.readByte();
        if (by2 != 1) {
            if (by2 != 2) {
                if (by2 != 3) {
                    if (by2 != 100) throw new StreamCorruptedException("Unknown serialized type");
                    object = new e(TimeZone.getTimeZone(object.readUTF()));
                } else {
                    object = d.b((ObjectInput)object);
                }
            } else {
                long l2 = j$.time.zone.a.a((ObjectInput)object);
                x x2 = j$.time.zone.a.b((ObjectInput)object);
                if (x2.equals(object = j$.time.zone.a.b((ObjectInput)object))) throw new IllegalArgumentException("Offsets must not be equal");
                object = new b(l2, x2, (x)object);
            }
        } else {
            object = e.k((ObjectInput)object);
        }
        this.b = object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final void writeExternal(ObjectOutput objectOutput) {
        byte by2 = this.a;
        Serializable serializable = this.b;
        objectOutput.writeByte(by2);
        if (by2 != 1) {
            if (by2 != 2) {
                if (by2 != 3) {
                    if (by2 != 100) throw new InvalidClassException("Unknown serialized type");
                    ((e)serializable).l(objectOutput);
                    return;
                } else {
                    ((d)serializable).writeExternal(objectOutput);
                }
                return;
            } else {
                ((b)serializable).writeExternal(objectOutput);
            }
            return;
        } else {
            ((e)serializable).writeExternal(objectOutput);
        }
    }
}

