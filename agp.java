/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.util.Base64
 */
import android.net.Uri;
import android.util.Base64;
import j$.net.URLDecoder;
import java.nio.charset.StandardCharsets;

public final class agp
extends agl {
    private agt a;
    private byte[] b;
    private int c;
    private int d;

    public agp() {
        super(false);
    }

    @Override
    public final int a(byte[] byArray, int n2, int n3) {
        if (n3 == 0) {
            return 0;
        }
        int n4 = this.d;
        if (n4 == 0) {
            return -1;
        }
        n3 = Math.min(n3, n4);
        byte[] byArray2 = this.b;
        n4 = agf.a;
        System.arraycopy(byArray2, this.c, byArray, n2, n3);
        this.c += n3;
        this.d -= n3;
        this.g(n3);
        return n3;
    }

    @Override
    public final long b(agt agt2) {
        this.j();
        this.a = agt2;
        Object object = agt2.a.normalizeScheme();
        String[] stringArray = object.getScheme();
        abr.e("data".equals(stringArray), "Unsupported scheme: ".concat(String.valueOf(stringArray)));
        stringArray = agf.w(object.getSchemeSpecificPart(), ",");
        if (stringArray.length == 2) {
            object = stringArray[1];
            if (stringArray[0].contains(";base64")) {
                try {
                    this.b = Base64.decode((String)object, (int)0);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw new aem("Error while parsing Base64 encoded string: ".concat(String.valueOf(object)), (Throwable)illegalArgumentException, true, 0);
                }
            } else {
                this.b = URLDecoder.decode((String)object, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
            }
            long l2 = agt2.e;
            int n2 = this.b.length;
            if (l2 <= (long)n2) {
                int n3;
                this.c = n3 = (int)l2;
                this.d = n2 - n3;
                l2 = agt2.f;
                this.i(agt2);
                l2 = agt2.f;
                return this.d;
            }
            this.b = null;
            throw new ags(2008);
        }
        throw new aem("Unexpected URI format: ".concat(String.valueOf(String.valueOf(object))), null, true, 0);
    }

    @Override
    public final Uri c() {
        agt agt2 = this.a;
        if (agt2 != null) {
            return agt2.a;
        }
        return null;
    }

    @Override
    public final void d() {
        if (this.b != null) {
            this.b = null;
            this.h();
        }
        this.a = null;
    }
}

