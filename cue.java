/*
 * Decompiled with CFR 0.152.
 */
public final class cue
implements gte {
    public final cuq a;
    public final boolean b;
    public final csu c;
    public final String d;

    public /* synthetic */ cue(cuq cuq2, boolean bl2, csu csu2, String string) {
        this.a = cuq2;
        this.b = bl2;
        this.c = csu2;
        this.d = string;
    }

    @Override
    public final Object apply(Object object) {
        object = (csg)object;
        Object object2 = this.c;
        if (this.b) {
            try {
                ((csv)((csu)object2).g.c()).a((csg)object);
            }
            catch (Exception exception) {
                cyr.o(exception, "%s: Listener onComplete failed for group %s", "MobileDataDownload", ((csg)object).c);
            }
            object2 = this.d;
            ((daa)this.a.e.c()).i((String)object2);
        }
        return object;
    }
}

