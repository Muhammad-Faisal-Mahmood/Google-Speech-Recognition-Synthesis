/*
 * Decompiled with CFR 0.152.
 */
final class iwv
extends iws {
    private final iww d;

    public iwv(String string, boolean bl2, iww iww2) {
        super(string, bl2, iww2);
        fxf.y(string.endsWith("-bin") ^ true, "ASCII header is named %s.  Only binary headers may end with %s", string, "-bin");
        a.s(iww2, "marshaller");
        this.d = iww2;
    }

    @Override
    public final Object a(byte[] byArray) {
        return this.d.a(byArray);
    }

    @Override
    public final byte[] b(Object object) {
        object = this.d.b(object);
        a.s(object, "null marshaller.toAsciiString()");
        return object;
    }
}

