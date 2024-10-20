/*
 * Decompiled with CFR 0.152.
 */
public final class dhd
extends dgq {
    private final diz a;

    public dhd(String string, diz diz2) {
        StringBuilder stringBuilder = new StringBuilder();
        Object object = diz2.b;
        stringBuilder.append(object);
        if (object == diy.d) {
            stringBuilder.append(" ");
            stringBuilder.append(diz2.a);
        }
        if ((object = diz2.c) != null) {
            stringBuilder.append(": ");
            stringBuilder.append((String)object);
        }
        stringBuilder.append(", url: ");
        stringBuilder.append(string);
        super(stringBuilder.toString());
        this.a = diz2;
    }

    @Override
    public final boolean a() {
        return this.a.b == diy.b;
    }

    @Override
    public final boolean b() {
        diz diz2 = this.a;
        int n2 = diz2.a;
        return n2 >= 400 && n2 < 500 || diz2.b == diy.c;
    }
}

