/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Objects;

public final class diz {
    public final int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public diz(aqg aqg2, bzb bzb2, byte[] byArray, gfb[] gfbArray, int n2) {
        this.d = aqg2;
        this.b = bzb2;
        this.c = byArray;
        this.e = gfbArray;
        this.a = n2;
    }

    public diz(diy diy2, int n2, String string, String string2, Throwable throwable) {
        this.b = diy2;
        this.a = n2;
        this.c = string;
        this.d = string2;
        this.e = throwable;
    }

    public diz(ajy[] ajyArray, aoh[] aohArray, afd afd2, Object object) {
        int n2 = ajyArray.length;
        boolean bl2 = n2 == aohArray.length;
        abr.d(bl2);
        this.c = ajyArray;
        this.e = (aoh[])aohArray.clone();
        this.b = afd2;
        this.d = object;
        this.a = n2;
    }

    public static diz a(diy diy2, Throwable throwable) {
        return new diz(diy2, -1, throwable.getMessage(), null, throwable);
    }

    public final boolean b(int n2) {
        return ((ajy[])this.c)[n2] != null;
    }

    public final boolean c(diz diz2, int n2) {
        if (diz2 == null) {
            return false;
        }
        return Objects.equals(((ajy[])this.c)[n2], ((ajy[])diz2.c)[n2]) && Objects.equals(((aoh[])this.e)[n2], ((aoh[])diz2.e)[n2]);
    }
}

