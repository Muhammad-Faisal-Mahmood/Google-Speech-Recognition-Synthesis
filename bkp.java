/*
 * Decompiled with CFR 0.152.
 */
public final class bkp
implements bkz {
    public final bkq a;
    public final String b;

    public /* synthetic */ bkp(bkq bkq2, String string) {
        this.a = bkq2;
        this.b = string;
    }

    @Override
    public final void a(bla object, boolean bl2) {
        object = this.a;
        String string = this.b;
        if (bl2) {
            ((bkq)object).a.add(string);
        } else {
            ((bkq)object).a.remove(string);
        }
        if (((bkq)object).b) {
            ((bkq)object).c();
        }
    }
}

