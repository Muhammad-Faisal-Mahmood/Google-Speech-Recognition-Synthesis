/*
 * Decompiled with CFR 0.152.
 */
import java.io.ByteArrayInputStream;
import java.io.InputStream;

public final class iwt
extends iws {
    private final iwp d;

    public iwt(String string, iwp iwp2) {
        boolean bl2 = false;
        super(string, false, iwp2);
        fxf.y(string.endsWith("-bin"), "Binary header is named %s. It must end with %s", string, "-bin");
        if (string.length() > 4) {
            bl2 = true;
        }
        fxf.r(bl2, "empty key name");
        this.d = iwp2;
    }

    @Override
    public final Object a(byte[] object) {
        object = new ByteArrayInputStream((byte[])object);
        return this.d.b((InputStream)object);
    }

    @Override
    public final byte[] b(Object object) {
        return iwx.k(this.d.a(object));
    }

    @Override
    public final boolean c() {
        return true;
    }
}

