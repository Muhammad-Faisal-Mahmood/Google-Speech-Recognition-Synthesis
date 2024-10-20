/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

public final class agt {
    public final Uri a;
    public final int b;
    public final byte[] c;
    public final Map d;
    public final long e;
    public final long f;

    static {
        aeg.b("media3.datasource");
    }

    public agt(Uri uri, Map map, long l2) {
        boolean bl2 = l2 >= 0L;
        abr.d(bl2);
        abr.d(bl2);
        abr.d(true);
        this.a = uri;
        this.b = 1;
        this.c = null;
        this.d = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.e = l2;
        this.f = -1L;
    }

    public final String a() {
        return "GET";
    }

    public final boolean b(int n2) {
        return (n2 & 6) == n2;
    }

    public final String toString() {
        String string = this.a.toString();
        StringBuilder stringBuilder = new StringBuilder("DataSpec[");
        stringBuilder.append(this.a());
        stringBuilder.append(" ");
        stringBuilder.append(string);
        stringBuilder.append(", ");
        stringBuilder.append(this.e);
        stringBuilder.append(", -1, null, 6]");
        return stringBuilder.toString();
    }
}

