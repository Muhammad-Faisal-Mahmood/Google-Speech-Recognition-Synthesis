/*
 * Decompiled with CFR 0.152.
 */
public final class hug
implements hgy {
    private static final hfv a;
    private final jnu b;

    static {
        int n2 = gzx.d;
        a = new huf("", hct.a);
    }

    public hug(jnu jnu2) {
        this.b = jnu2;
    }

    @Override
    public final hfv a(String string) {
        Object object = ((imj)this.b).a();
        int n2 = object.size();
        if (n2 != 0) {
            if (n2 != 1) {
                gzs gzs2 = gzx.g(n2);
                object = object.iterator();
                while (object.hasNext()) {
                    gzs2.h(((hgy)object.next()).a(string));
                }
                return new huf(string, gzs2.g());
            }
            return ((hgy)object.iterator().next()).a(string);
        }
        return a;
    }
}

