/*
 * Decompiled with CFR 0.152.
 */
import j$.util.Collection$_EL;
import java.util.concurrent.Executor;

public final class fcl
implements fcj {
    public static final hfn a = hfn.o("LPDataServiceImpl");
    public final fbt b;
    public final fep c;
    public final Executor d;
    public final fxf e;

    public fcl(fxf fxf2, fbt fbt2, fep fep2, Executor executor) {
        this.e = fxf2;
        this.b = fbt2;
        this.d = executor;
        this.c = fep2;
    }

    public static hac a(gzx gzx2) {
        return (hac)Collection$_EL.stream(gzx2).collect(gye.b(new fab(19), new fab(20), new faf(2)));
    }
}

