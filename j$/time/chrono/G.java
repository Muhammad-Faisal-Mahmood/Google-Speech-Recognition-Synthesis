/*
 * Decompiled with CFR 0.152.
 */
package j$.time.chrono;

import j$.time.ZoneId;
import j$.time.chrono.A;
import j$.time.chrono.C;
import j$.time.chrono.E;
import j$.time.chrono.I;
import j$.time.chrono.a_0;
import j$.time.chrono.b_0;
import j$.time.chrono.e_0;
import j$.time.chrono.g_0;
import j$.time.chrono.h_0;
import j$.time.chrono.k_0;
import j$.time.chrono.m;
import j$.time.chrono.q;
import j$.time.chrono.s;
import j$.time.chrono.z;
import j$.time.g;
import j$.time.k;
import j$.time.temporal.a;
import j$.time.temporal.l;
import j$.time.x;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

final class G
implements Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;
    private byte a;
    private Object b;

    public G() {
    }

    G(byte by2, Object object) {
        this.a = by2;
        this.b = object;
    }

    private Object readResolve() {
        return this.b;
    }

    @Override
    public final void readExternal(ObjectInput object) {
        byte by2;
        this.a = by2 = object.readByte();
        switch (by2) {
            default: {
                throw new StreamCorruptedException("Unknown serialized type");
            }
            case 9: {
                int n2 = h_0.e;
                object = new h_0(a_0.g(object.readUTF()), object.readInt(), object.readInt(), object.readInt());
                break;
            }
            case 8: {
                int n3 = object.readInt();
                byte by3 = object.readByte();
                byte by4 = object.readByte();
                I.d.getClass();
                object = new k_0(g.T(n3 - 543, by3, by4));
                break;
            }
            case 7: {
                int n4 = object.readInt();
                byte by5 = object.readByte();
                byte by6 = object.readByte();
                C.d.getClass();
                object = new E(g.T(n4 + 1911, by5, by6));
                break;
            }
            case 6: {
                q q2 = (q)object.readObject();
                int n5 = object.readInt();
                byte by7 = object.readByte();
                byte by8 = object.readByte();
                q2.getClass();
                object = s.P(q2, n5, by7, by8);
                break;
            }
            case 5: {
                A a2 = A.d;
                object = A.u(object.readByte());
                break;
            }
            case 4: {
                g g2 = z.d;
                int n6 = object.readInt();
                byte by9 = object.readByte();
                byte by10 = object.readByte();
                j$.time.chrono.x.d.getClass();
                object = new z(g.T(n6, by9, by10));
                break;
            }
            case 3: {
                e_0 e_02 = (e_0)object.readObject();
                x x2 = (x)object.readObject();
                object = (ZoneId)object.readObject();
                object = e_02.w(x2).i((ZoneId)object);
                break;
            }
            case 2: {
                object = ((b_0)object.readObject()).E((k)object.readObject());
                break;
            }
            case 1: {
                int n7 = a_0.c;
                object = a_0.g(object.readUTF());
            }
        }
        this.b = object;
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
            case 9: {
                ((h_0)object).writeExternal(objectOutput);
                break;
            }
            case 8: {
                object = (k_0)object;
                object.getClass();
                objectOutput.writeInt(l.a((j$.time.temporal.m)object, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(l.a((j$.time.temporal.m)object, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(l.a((j$.time.temporal.m)object, j$.time.temporal.a.DAY_OF_MONTH));
                break;
            }
            case 7: {
                object = (E)object;
                object.getClass();
                objectOutput.writeInt(l.a((j$.time.temporal.m)object, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(l.a((j$.time.temporal.m)object, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(l.a((j$.time.temporal.m)object, j$.time.temporal.a.DAY_OF_MONTH));
                break;
            }
            case 6: {
                ((s)object).writeExternal(objectOutput);
                break;
            }
            case 5: {
                ((A)object).G(objectOutput);
                break;
            }
            case 4: {
                object = (z)object;
                object.getClass();
                objectOutput.writeInt(l.a((j$.time.temporal.m)object, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(l.a((j$.time.temporal.m)object, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(l.a((j$.time.temporal.m)object, j$.time.temporal.a.DAY_OF_MONTH));
                break;
            }
            case 3: {
                ((m)object).writeExternal(objectOutput);
                break;
            }
            case 2: {
                ((g_0)object).writeExternal(objectOutput);
                break;
            }
            case 1: {
                objectOutput.writeUTF(((a_0)object).l());
            }
        }
    }
}

