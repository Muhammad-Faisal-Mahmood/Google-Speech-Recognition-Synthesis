/*
 * Decompiled with CFR 0.152.
 */
import java.nio.charset.StandardCharsets;

public final class iwm
extends iws {
    private final iwn d;

    public iwm(String string, iwn iwn2) {
        super(string, false, iwn2);
        fxf.y(string.endsWith("-bin") ^ true, "ASCII header is named %s.  Only binary headers may end with %s", string, "-bin");
        a.s(iwn2, "marshaller");
        this.d = iwn2;
    }

    @Override
    public final Object a(byte[] object) {
        object = new String((byte[])object, StandardCharsets.US_ASCII);
        return this.d.a((String)object);
    }

    @Override
    public final byte[] b(Object object) {
        object = this.d.b(object);
        a.s(object, "null marshaller.toAsciiString()");
        return ((String)object).getBytes(StandardCharsets.US_ASCII);
    }
}

