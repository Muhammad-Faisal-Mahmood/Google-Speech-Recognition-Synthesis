/*
 * Decompiled with CFR 0.152.
 */
public final class mh {
    public static final uo b = new uo(20);
    public int a;
    public bvl c;
    public bvl d;

    private mh() {
    }

    public static mh a() {
        mh mh2;
        mh mh3 = mh2 = (mh)b.a();
        if (mh2 == null) {
            mh3 = new mh();
        }
        return mh3;
    }

    public static void b(mh mh2) {
        mh2.a = 0;
        mh2.c = null;
        mh2.d = null;
        b.b(mh2);
    }
}

