/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.util.AndroidRuntimeException
 */
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AndroidRuntimeException;
import java.io.InputStream;

public final class izy {
    private static final iwp a = new izx(null, true);

    private izy() {
    }

    public static iwx a(Parcel object, its object2) {
        int n2 = object.readInt();
        if (n2 == 0) {
            return new iwx();
        }
        Object[] objectArray = new Object[n2 + n2];
        int n3 = 0;
        int n4 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            block14: {
                int n5;
                block13: {
                    int n6;
                    Object object3;
                    block10: {
                        block11: {
                            block9: {
                                block12: {
                                    Parcelable parcelable;
                                    int n7 = object.readInt();
                                    object3 = izy.c(object, n7, n3 += 4);
                                    n5 = i2 + i2;
                                    objectArray[n5] = object3;
                                    n6 = object.readInt();
                                    n3 = n3 + n7 + 4;
                                    if (n6 != -1) break block10;
                                    object3 = (iyu)((its)object2).a(izi.h);
                                    if (!object3.b) break block11;
                                    n7 = object.dataPosition();
                                    try {
                                        parcelable = object.readParcelable(izy.class.getClassLoader());
                                        if (parcelable == null) break block9;
                                    }
                                    catch (AndroidRuntimeException androidRuntimeException) {
                                        throw new iyi(iyh.j.d(androidRuntimeException).e("Failure reading parcelable in metadata"));
                                    }
                                    objectArray[n5 + 1] = new iwu(a, parcelable);
                                    n5 = n4 + (object.dataPosition() - n7);
                                    n4 = object3.d;
                                    if (n5 > 32768) break block12;
                                    n4 = n3;
                                    break block13;
                                }
                                throw new iyi(iyh.g.e("Inbound Parcelables too large according to policy (see InboundParcelablePolicy)"));
                            }
                            object = iyh.j.e("Read null parcelable in metadata");
                            object2 = new iyi((iyh)object);
                            throw object2;
                        }
                        throw new iyi(iyh.f.e("Parcelable metadata values not allowed"));
                    }
                    if (n6 < 0) break block14;
                    object3 = izy.c(object, n6, n3);
                    objectArray[n5 + 1] = object3;
                    n5 = n4;
                    n4 = n3 += n6;
                }
                n3 = n4;
                n4 = n5;
                continue;
            }
            throw new iyi(iyh.j.e("Unrecognized metadata sentinel"));
        }
        object = ivp.a;
        return new iwx(n2, objectArray);
    }

    public static void b(Parcel object, iwx object2) {
        int n2;
        int n3;
        int n4;
        Object object3;
        if (object2 != null) {
            object3 = ivp.a;
            n4 = ((iwx)object2).e;
        } else {
            n4 = 0;
        }
        if (n4 == 0) {
            object.writeInt(0);
            return;
        }
        object3 = ivp.a;
        Object[] objectArray = new Object[((iwx)object2).a()];
        for (n3 = 0; n3 < ((iwx)object2).e; ++n3) {
            Object object4;
            object3 = ((iwx)object2).j(n3);
            n2 = n3 + n3;
            objectArray[n2] = object3;
            object3 = object4 = ((iwx)object2).c(n3);
            if (!(object4 instanceof byte[])) {
                object3 = ((iwu)object4).b();
            }
            objectArray[n2 + 1] = object3;
        }
        object.writeInt(n4);
        for (n3 = 0; n3 < n4; ++n3) {
            int n5;
            n2 = n3 + n3;
            object2 = (byte[])objectArray[n2];
            object.writeInt(((Object)object2).length);
            object.writeByteArray((byte[])object2);
            object3 = objectArray[n2 + 1];
            if (object3 instanceof byte[]) {
                object2 = (byte[])object3;
                object.writeInt(((Object)object2).length);
                object.writeByteArray((byte[])object2);
                continue;
            }
            if (object3 instanceof jai) {
                object.writeInt(-1);
                ((jai)object3).a((Parcel)object);
                continue;
            }
            object2 = izn.b();
            object3 = (InputStream)object3;
            n2 = 0;
            while (true) {
                n5 = ((Object)object2).length;
                if (n2 >= n5) break;
                int n6 = ((InputStream)object3).read((byte[])object2, n2, n5 - n2);
                if (n6 == -1) break;
                n2 += n6;
                continue;
                break;
            }
            if (n2 != n5) {
                object.writeInt(n2);
                if (n2 <= 0) continue;
                object.writeByteArray((byte[])object2, 0, n2);
                continue;
            }
            try {
                object3 = iyh.g.e("Metadata value too large");
                object = new iyi((iyh)object3);
                throw object;
            }
            catch (Throwable throwable) {
                throw throwable;
            }
            finally {
                izn.a((byte[])object2);
            }
        }
    }

    private static byte[] c(Parcel parcel, int n2, int n3) {
        if (n3 + n2 <= 8192) {
            byte[] byArray = new byte[n2];
            if (n2 > 0) {
                parcel.readByteArray(byArray);
            }
            return byArray;
        }
        throw new iyi(iyh.g.e("Metadata too large"));
    }
}

