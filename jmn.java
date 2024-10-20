/*
 * Decompiled with CFR 0.152.
 */
public abstract class jmn {
    public final itx a;
    public final itw b;

    protected jmn(itx itx2, itw itw2) {
        a.s(itx2, "channel");
        this.a = itx2;
        this.b = itw2;
    }

    public abstract jmn a(itx var1, itw var2);

    public final jmn c(iua ... iuaArray) {
        return this.a(fvc.T(this.a, iuaArray), this.b);
    }
}

