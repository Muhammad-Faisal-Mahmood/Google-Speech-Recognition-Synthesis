/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;

public final class frh {
    public final Uri a;
    public final hyf b;
    public final gto c;
    public final gzx d;
    public final boolean e;
    public final fvc f;

    public frh() {
        throw null;
    }

    public frh(Uri uri, hyf hyf2, gto gto2, gzx gzx2, fvc fvc2, boolean bl2) {
        this.a = uri;
        this.b = hyf2;
        this.c = gto2;
        this.d = gzx2;
        this.f = fvc2;
        this.e = bl2;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof frh) {
            object = (frh)object;
            if (this.a.equals((Object)((frh)object).a) && this.b.equals(((frh)object).b) && this.c.equals(((frh)object).c) && fvd.z(this.d, ((frh)object).d) && this.f.equals(((frh)object).f) && this.e == ((frh)object).e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2;
        int n3;
        int n4 = this.a.hashCode();
        hwv hwv2 = (hwv)this.b;
        if (hwv2.B()) {
            n3 = hwv2.i();
        } else {
            n3 = n2 = hwv2.memoizedHashCode;
            if (n2 == 0) {
                hwv2.memoizedHashCode = n3 = hwv2.i();
            }
        }
        int n5 = this.c.hashCode();
        int n6 = this.d.hashCode();
        int n7 = this.f.hashCode();
        n2 = true != this.e ? 1237 : 1231;
        return ((((((n4 ^ 0xF4243) * 1000003 ^ n3) * 1000003 ^ n5) * 1000003 ^ n6) * 1000003 ^ n7) * 1000003 ^ n2) * 1000003 ^ 0x4D5;
    }

    public final String toString() {
        Object object = this.f;
        Object object2 = this.d;
        Object object3 = this.c;
        Object object4 = this.b;
        String string = String.valueOf(this.a);
        object4 = String.valueOf(object4);
        object3 = String.valueOf(object3);
        object2 = String.valueOf(object2);
        String string2 = String.valueOf(object);
        object = new StringBuilder("ProtoDataStoreConfig{uri=");
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(", schema=");
        ((StringBuilder)object).append((String)object4);
        ((StringBuilder)object).append(", handler=");
        ((StringBuilder)object).append((String)object3);
        ((StringBuilder)object).append(", migrations=");
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append(", variantConfig=");
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append(", useGeneratedExtensionRegistry=");
        ((StringBuilder)object).append(this.e);
        ((StringBuilder)object).append(", enableTracing=false}");
        return ((StringBuilder)object).toString();
    }
}

