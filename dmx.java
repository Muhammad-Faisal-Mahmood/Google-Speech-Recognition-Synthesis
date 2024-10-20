/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

public final class dmx
implements dxe {
    public final gto a;
    public final jnu b;
    public final czh c;

    public /* synthetic */ dmx(gto gto2, jnu jnu2, czh czh2) {
        this.a = gto2;
        this.b = jnu2;
        this.c = czh2;
    }

    @Override
    public final void a() {
        if (((Boolean)this.a.e(false)).booleanValue() && dww.b()) {
            Iterator iterator = ((imj)this.b).a().iterator();
            while (iterator.hasNext()) {
                ((dmw)iterator.next()).L();
            }
            this.c.c();
        }
    }
}

