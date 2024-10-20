/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

public final class dan
implements jnu {
    public final Object a;
    private final int b;

    public /* synthetic */ dan(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    @Override
    public final Object b() {
        switch (this.b) {
            default: {
                return gzx.q((gzx)this.a.b());
            }
            case 15: {
                return gzx.q(this.a);
            }
            case 14: {
                return gzx.r(new hsr(((gpm)this.a).b, 1), new hto());
            }
            case 13: {
                return gzx.q(new hry(((hqw)((gpm)this.a).b).n));
            }
            case 12: {
                return gzx.q(new hsr(this.a, 0));
            }
            case 11: {
                gzs gzs2 = new gzs();
                Iterator iterator = ((gpm)this.a).a.iterator();
                while (iterator.hasNext()) {
                    gzs2.h(((hqz)iterator.next()).a());
                }
                return gzs2.g();
            }
            case 10: {
                return this.a;
            }
            case 9: {
                return ((glt)this.a).a();
            }
            case 8: {
                return ((glq)this.a).a();
            }
            case 7: {
                return this.a;
            }
            case 6: {
                return ((be)this.a).getChildFragmentManager();
            }
            case 5: {
                drw drw2 = (drw)this.a.b();
                return 10;
            }
            case 4: {
                return (dsc)this.a.b();
            }
            case 3: {
                dmo dmo2 = (dmo)((gto)this.a.b()).e(new dmo());
                return false;
            }
            case 2: {
                Object object = (dse)this.a;
                if (((dse)object).a().g()) {
                    object = (dmo)((dse)object).a().c();
                }
                return null;
            }
            case 1: {
                return ((buh)this.a).a();
            }
            case 0: 
        }
        return ((dam)this.a).a();
    }
}

