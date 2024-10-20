/*
 * Decompiled with CFR 0.152.
 */
public final class iwo
extends iws {
    public iwo(String string, kmp kmp2) {
        boolean bl2 = false;
        super(string, false, kmp2);
        fxf.y(string.endsWith("-bin"), "Binary header is named %s. It must end with %s", string, "-bin");
        if (string.length() > 4) {
            bl2 = true;
        }
        fxf.r(bl2, "empty key name");
        a.s(kmp2, "marshaller is null");
    }

    @Override
    public final Object a(byte[] byArray) {
        return byArray;
    }

    @Override
    public final byte[] b(Object object) {
        object = (byte[])object;
        a.s(object, "null marshaller.toBytes()");
        return object;
    }
}

