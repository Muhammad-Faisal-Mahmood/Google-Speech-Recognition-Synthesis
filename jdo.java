/*
 * Decompiled with CFR 0.152.
 */
import java.net.InetSocketAddress;
import java.net.URI;
import java.util.Collection;
import java.util.Collections;

public final class jdo
extends ixj {
    private static final boolean a = kmp.M(jdo.class.getClassLoader());

    @Override
    public final ixi a(URI uRI, ixc ixc2) {
        if ("dns".equals(uRI.getScheme())) {
            String string = uRI.getPath();
            a.s(string, "targetPath");
            fxf.y(string.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", string, uRI);
            string = string.substring(1);
            uRI.getAuthority();
            return new jdn(string, ixc2, jeb.o, new guh(), a);
        }
        return null;
    }

    @Override
    public final String b() {
        return "dns";
    }

    @Override
    public final Collection c() {
        return Collections.singleton(InetSocketAddress.class);
    }

    @Override
    protected final void d() {
    }

    @Override
    public final void e() {
    }
}

