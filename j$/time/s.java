/*
 * Decompiled with CFR 0.152.
 */
package j$.time;

import j$.time.Duration;
import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.g;
import j$.time.i;
import j$.time.n;
import j$.time.p;
import j$.time.q;
import j$.time.r;
import j$.time.temporal.k;
import j$.time.u;
import j$.time.w;
import j$.time.x;
import j$.time.y;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;

final class s
implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;
    private byte a;
    private Object b;

    public s() {
    }

    s(byte by2, Object object) {
        this.a = by2;
        this.b = object;
    }

    static Serializable a(ObjectInput objectInput) {
        return s.b(objectInput.readByte(), objectInput);
    }

    private static Serializable b(byte by2, ObjectInput objectInput) {
        switch (by2) {
            default: {
                throw new StreamCorruptedException("Unknown serialized type");
            }
            case 14: {
                return r.a(objectInput);
            }
            case 13: {
                return n.I(objectInput);
            }
            case 12: {
                return w.M(objectInput);
            }
            case 11: {
                by2 = (byte)u.b;
                return u.I(objectInput.readInt());
            }
            case 10: {
                return p.K(objectInput);
            }
            case 9: {
                return q.K(objectInput);
            }
            case 8: {
                return x.T(objectInput);
            }
            case 7: {
                by2 = (byte)y.d;
                return ZoneId.J(objectInput.readUTF(), false);
            }
            case 6: {
                return ZonedDateTime.L(objectInput);
            }
            case 5: {
                k k2 = i.c;
                k2 = g.d;
                return i.Q(g.T(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), j$.time.k.X(objectInput));
            }
            case 4: {
                return j$.time.k.X(objectInput);
            }
            case 3: {
                g g2 = g.d;
                return g.T(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            }
            case 2: {
                Instant instant = Instant.EPOCH;
                return Instant.ofEpochSecond(objectInput.readLong(), objectInput.readInt());
            }
            case 1: 
        }
        Duration duration = Duration.ZERO;
        return Duration.ofSeconds(objectInput.readLong(), objectInput.readInt());
    }

    private Object readResolve() {
        return this.b;
    }

    @Override
    public final void readExternal(ObjectInput objectInput) {
        byte by2;
        this.a = by2 = objectInput.readByte();
        this.b = s.b(by2, objectInput);
    }

    @Override
    public final void writeExternal(ObjectOutput objectOutput) {
        byte by2 = this.a;
        Object object = this.b;
        objectOutput.writeByte(by2);
        switch (by2) {
            default: {
                throw new InvalidClassException("Unknown serialized type");
            }
            case 14: {
                ((r)object).writeExternal(objectOutput);
                break;
            }
            case 13: {
                ((n)object).J(objectOutput);
                break;
            }
            case 12: {
                ((w)object).P(objectOutput);
                break;
            }
            case 11: {
                ((u)object).M(objectOutput);
                break;
            }
            case 10: {
                ((p)object).writeExternal(objectOutput);
                break;
            }
            case 9: {
                ((q)object).writeExternal(objectOutput);
                break;
            }
            case 8: {
                ((x)object).U(objectOutput);
                break;
            }
            case 7: {
                ((y)object).O(objectOutput);
                break;
            }
            case 6: {
                ((ZonedDateTime)object).N(objectOutput);
                break;
            }
            case 5: {
                ((i)object).Z(objectOutput);
                break;
            }
            case 4: {
                ((j$.time.k)object).c0(objectOutput);
                break;
            }
            case 3: {
                ((g)object).f0(objectOutput);
                break;
            }
            case 2: {
                ((Instant)object).N(objectOutput);
                break;
            }
            case 1: {
                ((Duration)object).writeExternal(objectOutput);
            }
        }
    }
}

