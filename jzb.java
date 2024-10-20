/*
 * Decompiled with CFR 0.152.
 */
public final class jzb {
    private static final jrk a = jza.a;
    private static final jro b = ghk.g;

    public static final jyx a(jyx jyx2) {
        jro jro2;
        jrk jrk2;
        block3: {
            block2: {
                if (jyx2 instanceof jzq) break block2;
                boolean bl2 = jyx2 instanceof jyw;
                jrk2 = a;
                jro2 = b;
                if (!bl2) break block3;
                jyw jyw2 = (jyw)jyx2;
                if (jyw2.a != jrk2 || jyw2.b != jro2) break block3;
            }
            return jyx2;
        }
        return new jyw(jyx2, jrk2, jro2);
    }
}

