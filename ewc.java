/*
 * Decompiled with CFR 0.152.
 */
public final class ewc {
    public static final ewa a = new ewa();
    public final boolean b;
    public final bzb c;

    public ewc(bzb bzb2, boolean bl2) {
        jse.e(bzb2, "audioFileWriterFactory");
        this.c = bzb2;
        this.b = bl2;
    }

    public static final String a(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = 0; i2 < string.length(); ++i2) {
            char c2 = string.charAt(i2);
            if (c2 == '@') continue;
            stringBuilder.append(c2);
        }
        return "@".concat(stringBuilder.toString());
    }
}

