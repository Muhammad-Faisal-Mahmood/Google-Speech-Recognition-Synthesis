/*
 * Decompiled with CFR 0.152.
 */
import java.net.SocketAddress;
import java.util.Iterator;

public final class jgy
implements iwg {
    final Object a;
    final iwh b;
    private final int c;

    public /* synthetic */ jgy(jgx jgx2, jgw jgw2, int n2) {
        this.c = n2;
        this.b = jgx2;
        this.a = jgw2;
    }

    public jgy(jhc jhc2, iwe iwe2, int n2) {
        this.c = n2;
        this.a = iwe2;
        this.b = jhc2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final void a(iuj object) {
        block18: {
            Object object22;
            block20: {
                int n2;
                iui iui2;
                Object object3;
                Object object4;
                Object object5;
                block19: {
                    if (this.c == 0) break block18;
                    object5 = this.a;
                    object4 = (jgw)object5;
                    object3 = ((jgw)object4).a;
                    object22 = this.b;
                    SocketAddress socketAddress = jgx.i((iwe)object3);
                    object3 = (jgx)object22;
                    if (object5 != ((jgx)object3).g.get(socketAddress) || (iui2 = ((iuj)object).a) == iui.e) return;
                    if (iui2 == iui.d) {
                        ((jgx)object3).f.e();
                    }
                    ((jgw)object4).b(iui2);
                    iui iui3 = ((jgx)object3).k;
                    iui iui4 = iui.c;
                    if (iui3 != iui4 && ((jgx)object3).l != iui4) break block19;
                    if (iui2 == iui.a) return;
                    if (iui2 == iui.d) break block20;
                }
                if ((n2 = iui2.ordinal()) != 0) {
                    if (n2 != 1) {
                        iui iui5;
                        if (n2 != 2) {
                            if (n2 != 3) throw new IllegalArgumentException("Unsupported state:".concat(((Object)((Object)iui2)).toString()));
                            ((jgx)object3).h.c();
                            object = iui.d;
                            ((jgx)object3).k = object;
                            ((jgx)object3).g((iui)((Object)object), new jgv((jgx)object3, (jgx)object3));
                            return;
                        }
                        if (((jgx)object3).h.f() && ((jgx)object3).g.get(((jgx)object3).h.b()) == object5 && ((jgx)object3).h.e()) {
                            ((jgx)object3).f();
                            ((iwh)object22).d();
                        }
                        if (((jgx)object3).h.f()) return;
                        object4 = ((jgx)object3).g;
                        jgs jgs2 = ((jgx)object3).h;
                        if (object4.size() < jgs2.a) return;
                        Iterator iterator = ((jgx)object3).g.values().iterator();
                        while (iterator.hasNext()) {
                            if (((jgw)iterator.next()).c) continue;
                            return;
                        }
                        ((jgx)object3).k = iui5 = iui.c;
                        ((jgx)object3).g(iui5, new jgu(iwb.a(((iuj)object).b)));
                        ((jgx)object3).i = n2 = ((jgx)object3).i + 1;
                        if (n2 < ((jgx)object3).h.a && !((jgx)object3).j) return;
                        ((jgx)object3).j = false;
                        ((jgx)object3).i = 0;
                        ((jgx)object3).f.e();
                        return;
                    }
                    ((jgx)object3).f();
                    for (Object object22 : ((jgx)object3).g.values()) {
                        if (((jgw)object22).a.equals(((jgw)object4).a)) continue;
                        ((jgw)object22).a.b();
                    }
                    ((jgx)object3).g.clear();
                    ((jgw)object4).b(iui.b);
                    ((jgx)object3).g.put(jgx.i(((jgw)object4).a), object5);
                    ((jgx)object3).h.g(jgx.i(((jgw)object4).a));
                    ((jgx)object3).k = iui.b;
                    ((jgx)object3).h((jgw)object4);
                    return;
                }
                object = iui.a;
                ((jgx)object3).k = object;
                ((jgx)object3).g((iui)((Object)object), new jgu(iwb.a));
                return;
            }
            ((iwh)object22).d();
            return;
        }
        iui iui6 = ((iuj)object).a;
        if (iui6 == iui.e) return;
        Object object6 = this.b;
        if (iui6 == iui.c || iui6 == iui.d) {
            ((jhc)object6).e.e();
        }
        jhc jhc2 = (jhc)object6;
        if (jhc2.f == iui.c) {
            if (iui6 == iui.a) return;
            if (iui6 == iui.d) {
                ((iwh)object6).d();
                return;
            }
        }
        object6 = this.a;
        int n3 = iui6.ordinal();
        if (n3 != 0) {
            if (n3 != 1) {
                if (n3 != 2) {
                    if (n3 != 3) throw new IllegalArgumentException("Unsupported state:".concat(((Object)((Object)iui6)).toString()));
                    object = new jhb(jhc2, (iwe)object6);
                } else {
                    object = new jha(iwb.a(((iuj)object).b));
                }
            } else {
                object = new jha(iwb.b((iwe)object6));
            }
        } else {
            object = new jha(iwb.a);
        }
        jhc2.f(iui6, (iwf)object);
    }
}

