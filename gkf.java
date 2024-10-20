/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;

public final class gkf {
    public final String a;
    public final hyf b;
    public final gkc c;
    public final gzx d;
    public final gto e;
    public final gto f;
    public final Executor g;
    private final gto h;

    public gkf() {
        throw null;
    }

    public gkf(String string, gto gto2, hyf hyf2, gkc gkc2, gzx gzx2, gto gto3, gto gto4, Executor executor) {
        this.a = string;
        this.h = gto2;
        this.b = hyf2;
        this.c = gkc2;
        this.d = gzx2;
        this.e = gto3;
        this.f = gto4;
        this.g = executor;
    }

    public static gke a() {
        gke gke2 = new gke(null);
        gke2.d = 1;
        gke2.b = new gkc(2);
        return gke2;
    }

    public final boolean equals(Object object) {
        block4: {
            block6: {
                Object object2;
                block5: {
                    if (object == this) {
                        return true;
                    }
                    if (!(object instanceof gkf)) break block4;
                    object2 = (gkf)object;
                    if (!this.a.equals(((gkf)object2).a) || !this.h.equals(((gkf)object2).h) || !this.b.equals(((gkf)object2).b) || !((Object)this.c).equals(((gkf)object2).c) || !fvd.z(this.d, ((gkf)object2).d) || !this.e.equals(((gkf)object2).e) || !this.f.equals(((gkf)object2).f)) break block4;
                    object = this.g;
                    object2 = ((gkf)object2).g;
                    if (object != null) break block5;
                    if (object2 != null) break block4;
                    break block6;
                }
                if (!object.equals(object2)) break block4;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int n2 = this.a.hashCode();
        int n3 = this.b.hashCode();
        int n4 = ((Object)this.c).hashCode();
        int n5 = this.d.hashCode();
        int n6 = this.e.hashCode();
        Executor executor = this.g;
        int n7 = executor == null ? 0 : executor.hashCode();
        return ((((((((n2 ^ 0x16FC2542) * 1000003 ^ 0x79A31AAC) * 1000003 ^ n3) * 1000003 ^ n4) * 1000003 ^ n5) * 1000003 ^ n6) * 1000003 ^ 0x79A31AAC) * 1000003 ^ n7) * 1000003;
    }

    public final String toString() {
        Object object = this.g;
        Object object2 = this.f;
        Object object3 = this.e;
        Object object4 = this.d;
        Object object5 = this.c;
        Object object6 = this.b;
        String string = String.valueOf(this.h);
        object6 = String.valueOf(object6);
        object5 = String.valueOf(object5);
        object4 = String.valueOf(object4);
        object3 = String.valueOf(object3);
        object2 = String.valueOf(object2);
        object = String.valueOf(object);
        StringBuilder stringBuilder = new StringBuilder("ProtoDataStoreConfig{blockingSafeReads=false, name=");
        stringBuilder.append(this.a);
        stringBuilder.append(", nameSuffix=");
        stringBuilder.append(string);
        stringBuilder.append(", schema=");
        stringBuilder.append((String)object6);
        stringBuilder.append(", storage=");
        stringBuilder.append((String)object5);
        stringBuilder.append(", migrations=");
        stringBuilder.append((String)object4);
        stringBuilder.append(", handler=");
        stringBuilder.append((String)object3);
        stringBuilder.append(", logger=");
        stringBuilder.append((String)object2);
        stringBuilder.append(", ioExecutor=");
        stringBuilder.append((String)object);
        stringBuilder.append(", lamsConfig=null}");
        return stringBuilder.toString();
    }
}

