/*
 * Decompiled with CFR 0.152.
 */
public final class gjt {
    public final gzx a;
    public final gzx b;
    private final String c;

    static {
        new gjt(new knl(null));
    }

    private gjt(knl knl2) {
        this.c = (String)knl2.a;
        this.a = ((gzs)knl2.c).g();
        this.b = ((gzs)knl2.b).g();
    }

    public final String toString() {
        String string = Integer.toHexString(this.hashCode());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.c);
        stringBuilder.append("@");
        stringBuilder.append(string);
        return stringBuilder.toString();
    }
}

