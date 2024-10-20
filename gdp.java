/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gda
 */
import j$.time.Instant;

public final class gdp
implements gen {
    public final gec a;

    public /* synthetic */ gdp(gec gec2) {
        this.a = gec2;
    }

    @Override
    public final int a(Instant instant, gdo gdo2, boolean bl2) {
        block4: {
            int n2;
            block3: {
                block2: {
                    boolean bl3 = gdo2.b();
                    n2 = 2;
                    if (!bl3 || !gdo2.c()) break block2;
                    gec gec2 = this.a;
                    gda gda2 = gda.a;
                    fxf.B(gdo2.b(), "Cannot get timestamp for a CacheResult that does not have content");
                    fxf.B(gdo2.c(), "Cannot get timestamp for an invalid CacheResult");
                    Object object = gdo2.a.c;
                    fxf.K(gda2);
                    instant = instant.minus(gec2.k);
                    if (!((Instant)object).isBefore(instant)) break block3;
                }
                if (!bl2 && gdo2.b()) break block3;
                if (!gdo2.b()) break block4;
                n2 = 3;
            }
            return n2;
        }
        return 1;
    }
}

