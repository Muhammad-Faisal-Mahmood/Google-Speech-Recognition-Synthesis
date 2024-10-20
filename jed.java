/*
 * Decompiled with CFR 0.152.
 */
final class jed
implements ivo {
    private final int a;

    public jed(int n2) {
        this.a = n2;
    }

    @Override
    public final /* synthetic */ Object a(byte[] byArray) {
        if (this.a != 0) {
            return byArray;
        }
        if (byArray.length >= 3) {
            return (byArray[0] - 48) * 100 + (byArray[1] - 48) * 10 + (byArray[2] - 48);
        }
        throw new NumberFormatException("Malformed status code ".concat(new String(byArray, ivp.a)));
    }

    @Override
    public final /* synthetic */ byte[] b(Object object) {
        if (this.a != 0) {
            return (byte[])object;
        }
        object = (Integer)object;
        throw new UnsupportedOperationException();
    }
}

