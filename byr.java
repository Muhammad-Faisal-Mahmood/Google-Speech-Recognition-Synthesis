/*
 * Decompiled with CFR 0.152.
 */
public final class byr
implements gte {
    public final hac a;
    public final ezj b;
    public final gto c;
    public final boolean d;
    public final int e;

    public /* synthetic */ byr(hac hac2, ezj ezj2, int n2, gto gto2, boolean bl2) {
        this.a = hac2;
        this.b = ezj2;
        this.e = n2;
        this.c = gto2;
        this.d = bl2;
    }

    @Override
    public final Object apply(Object object) {
        object = (ezm)object;
        Object object2 = byu.a;
        object2 = this.b;
        String string = ((ezj)object2).a.toLanguageTag();
        String string2 = ((ezj)object2).a.toLanguageTag();
        string = (String)this.a.getOrDefault((Object)string, string2);
        return new byq((ezj)object2, gto.i(object), this.e, this.c, this.d, string);
    }
}

