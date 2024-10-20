/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;

public final class cva {
    public final Uri a;
    public final String b;
    public final cuz c;
    public final int d;
    public final gzx e;
    private final gto f;
    private final hvi g;

    public cva() {
        throw null;
    }

    public cva(Uri uri, String string, cuz cuz2, int n2, gzx gzx2, gto gto2, hvi hvi2) {
        this.a = uri;
        this.b = string;
        this.c = cuz2;
        this.d = n2;
        this.e = gzx2;
        this.f = gto2;
        this.g = hvi2;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof cva) {
            object = (cva)object;
            if (this.a.equals((Object)((cva)object).a) && this.b.equals(((cva)object).b) && ((Object)this.c).equals(((cva)object).c) && this.d == ((cva)object).d && fvd.z(this.e, ((cva)object).e) && this.f.equals(((cva)object).f) && this.g.equals(((cva)object).g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n2;
        int n3 = this.a.hashCode();
        int n4 = this.b.hashCode();
        int n5 = ((Object)this.c).hashCode();
        Object object = this.e;
        int n6 = this.d;
        int n7 = ((gzx)object).hashCode();
        object = this.g;
        if (((hwv)object).B()) {
            n2 = ((hwv)object).i();
        } else {
            int n8;
            n2 = n8 = ((hwv)object).memoizedHashCode;
            if (n8 == 0) {
                ((hwv)object).memoizedHashCode = n2 = ((hwv)object).i();
            }
        }
        return ((((((n3 ^ 0xF4243) * 1000003 ^ n4) * 1000003 ^ n5) * 1000003 ^ n6) * 1000003 ^ n7) * 1000003 ^ 0x79A31AAC) * 1000003 ^ n2;
    }

    public final String toString() {
        Object object = this.g;
        Object object2 = this.f;
        Object object3 = this.e;
        Object object4 = this.c;
        String string = String.valueOf(this.a);
        object4 = String.valueOf(object4);
        object3 = String.valueOf(object3);
        object2 = String.valueOf(object2);
        String string2 = String.valueOf(object);
        object = new StringBuilder("DownloadRequest{fileUri=");
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(", urlToDownload=");
        ((StringBuilder)object).append(this.b);
        ((StringBuilder)object).append(", downloadConstraints=");
        ((StringBuilder)object).append((String)object4);
        ((StringBuilder)object).append(", trafficTag=");
        ((StringBuilder)object).append(this.d);
        ((StringBuilder)object).append(", extraHttpHeaders=");
        ((StringBuilder)object).append((String)object3);
        ((StringBuilder)object).append(", inlineDownloadParamsOptional=");
        ((StringBuilder)object).append((String)object2);
        ((StringBuilder)object).append(", customDownloaderMetadata=");
        ((StringBuilder)object).append(string2);
        ((StringBuilder)object).append("}");
        return ((StringBuilder)object).toString();
    }
}

