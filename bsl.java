/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Collection$_EL;

public final class bsl
implements imb {
    private final jnu a;

    public bsl(jnu jnu2) {
        this.a = jnu2;
    }

    public final iil a() {
        btn btn2 = (btn)this.a.b();
        hyg hyg2 = iil.a.l();
        hyg2.T((Iterable)Collection$_EL.stream(btn2.b()).map(new bpf(5)).collect(gye.b));
        hyg2 = (iil)hyg2.o();
        idi.m(hyg2);
        return hyg2;
    }
}

