/*
 * Decompiled with CFR 0.152.
 */
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

final class jgx
extends iwh {
    public static final Logger e = Logger.getLogger(jgx.class.getName());
    public final ivz f;
    public final Map g = new HashMap();
    public final jgs h;
    public int i;
    public boolean j;
    public iui k;
    public iui l;
    public boolean m;
    public ksb n;
    private final boolean o;

    public jgx(ivz ivz2) {
        iui iui2;
        int n2 = gzx.d;
        this.h = new jgs(hct.a);
        this.i = 0;
        this.j = true;
        this.k = iui2 = iui.d;
        this.l = iui2;
        n2 = jhd.a;
        this.o = jeb.j("GRPC_PF_USE_HAPPY_EYEBALLS");
        this.m = true;
        this.f = ivz2;
    }

    public static final SocketAddress i(iwe object) {
        boolean bl2;
        block3: {
            block2: {
                object = (jbk)object;
                ((jbk)object).i.m.c();
                fxf.B(((jbk)object).g, "not started");
                object = ((jbk)object).e;
                if (object == null) break block2;
                int n2 = object.size();
                bl2 = true;
                if (n2 == 1) break block3;
            }
            bl2 = false;
        }
        fxf.E(bl2, "%s does not have exactly one group", object);
        return (SocketAddress)((iux)object.get((int)0)).b.get(0);
    }

    private final void j() {
        Object object;
        if (this.o && ((object = this.n) == null || !((ksb)object).k())) {
            object = this.f;
            this.n = ((ivz)object).c().d(new jel(this, 15), 250L, TimeUnit.MILLISECONDS, ((ivz)object).d());
        }
    }

    @Override
    public final iyh a(iwd object) {
        if (this.k != iui.e) {
            Object object22 = (Boolean)((iwd)object).b.a(d);
            int n2 = 0;
            boolean bl2 = object22 == null || !((Boolean)object22).booleanValue();
            this.m = bl2;
            Iterator iterator = ((iwd)object).a;
            if (iterator.isEmpty()) {
                Object object3 = ((iwd)object).a;
                object22 = iyh.k;
                object3 = String.valueOf(object3);
                object = ((Object)((iwd)object).b).toString();
                iterator = new StringBuilder("NameResolver returned no usable address. addrs=");
                ((StringBuilder)((Object)iterator)).append((String)object3);
                ((StringBuilder)((Object)iterator)).append(", attrs=");
                ((StringBuilder)((Object)iterator)).append((String)object);
                object = ((iyh)object22).e(((StringBuilder)((Object)iterator)).toString());
                this.b((iyh)object);
                return object;
            }
            object22 = iterator.iterator();
            while (object22.hasNext()) {
                if ((iux)object22.next() != null) continue;
                Object object4 = ((iwd)object).a;
                object22 = iyh.k;
                object4 = String.valueOf(object4);
                object = ((Object)((iwd)object).b).toString();
                iterator = new StringBuilder("NameResolver returned address list with null endpoint. addrs=");
                ((StringBuilder)((Object)iterator)).append((String)object4);
                ((StringBuilder)((Object)iterator)).append(", attrs=");
                ((StringBuilder)((Object)iterator)).append((String)object);
                object = ((iyh)object22).e(((StringBuilder)((Object)iterator)).toString());
                this.b((iyh)object);
                return object;
            }
            this.j = true;
            HashSet hashSet = new HashSet();
            object22 = new ArrayList();
            Iterator iterator2 = iterator.iterator();
            while (iterator2.hasNext()) {
                iterator = (iux)iterator2.next();
                ArrayList<SocketAddress> arrayList = new ArrayList<SocketAddress>();
                for (SocketAddress socketAddress : ((iux)((Object)iterator)).b) {
                    if (!hashSet.add(socketAddress)) continue;
                    arrayList.add(socketAddress);
                }
                if (arrayList.isEmpty()) continue;
                object22.add(new iux(arrayList, ((iux)((Object)iterator)).c));
            }
            object = ((iwd)object).c;
            if (object instanceof jgt) {
                hashSet = (jgt)object;
                object = ((jgt)((Object)hashSet)).a;
                if (object != null && ((Boolean)object).booleanValue()) {
                    object = ((jgt)((Object)hashSet)).b;
                    Collections.shuffle(object22, new Random());
                }
            }
            object = new gzs();
            ((gzs)object).j((Iterable)object22);
            object22 = ((gzs)object).g();
            if (this.k == iui.b) {
                hashSet = this.h;
                object = ((jgs)((Object)hashSet)).b();
                ((jgs)((Object)hashSet)).d((List)object22);
                if (this.h.g((SocketAddress)object)) {
                    object22 = ((jgw)this.g.get(object)).a;
                    object = this.h;
                    ((iwe)object22).d(Collections.singletonList(new iux(((jgs)object).b(), ((jgs)object).a())));
                    return iyh.b;
                }
            } else {
                this.h.d((List)object22);
            }
            hashSet = new HashSet(this.g.keySet());
            object = new HashSet();
            int n3 = ((hct)object22).c;
            while (n2 < n3) {
                object.addAll(((iux)object22.get((int)n2)).b);
                ++n2;
            }
            for (Object object22 : hashSet) {
                if (object.contains(object22)) continue;
                ((jgw)this.g.remove((Object)object22)).a.b();
            }
            if (hashSet.size() == 0) {
                object = iui.a;
                this.k = object;
                this.g((iui)((Object)object), new jgu(iwb.a));
            }
            if ((object = this.k) == iui.b) {
                object = iui.d;
                this.k = object;
                this.g((iui)((Object)object), new jgv(this, this));
            } else if (object == iui.a || object == iui.c) {
                this.f();
                ((iwh)this).d();
            }
            return iyh.b;
        }
        return iyh.h.e("Already shut down");
    }

    @Override
    public final void b(iyh iyh2) {
        if (this.k == iui.e) {
            return;
        }
        Object object = this.g.values().iterator();
        while (object.hasNext()) {
            ((jgw)object.next()).a.b();
        }
        this.g.clear();
        object = this.h;
        int n2 = gzx.d;
        ((jgs)object).d(hct.a);
        object = iui.c;
        this.k = object;
        this.g((iui)((Object)object), new jgu(iwb.a(iyh2)));
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final void d() {
        int n2;
        if (!this.h.f() || this.k == iui.e) return;
        Object object = this.h;
        Object object2 = this.g;
        SocketAddress socketAddress = ((jgs)object).b();
        object2 = object = (jgw)object2.get(socketAddress);
        if (object == null) {
            Object object3;
            Object object4;
            block7: {
                Object[][] objectArray;
                object4 = this.h.a();
                object = new jgr(this);
                object2 = this.f;
                object3 = new ivu();
                ((ivu)object3).b(fvd.v(new iux(socketAddress, (its)object4)));
                object4 = b;
                for (n2 = 0; n2 < (objectArray = (Object[][])((ivu)object3).c).length; ++n2) {
                    if (!object4.equals(objectArray[n2][0])) {
                        continue;
                    }
                    break block7;
                }
                n2 = -1;
            }
            int n3 = n2;
            if (n2 == -1) {
                Object object5 = ((ivu)object3).c;
                n2 = ((Object[][])object5).length;
                Object[][] objectArray = new Object[n2 + 1][2];
                System.arraycopy(object5, 0, objectArray, 0, n2);
                ((ivu)object3).c = objectArray;
                n3 = ((Object[][])((ivu)object3).c).length - 1;
            }
            ((Object[][])((ivu)object3).c)[n3] = new Object[]{object4, object};
            object3 = ((ivz)object2).b(((ivu)object3).a());
            ((jgr)object).a = object2 = new jgw((iwe)object3, iui.d);
            this.g.put(socketAddress, object2);
            object = ((jbk)object3).a;
            if (this.m || ((ivw)object).b.a(iwh.c) == null) {
                ((jgw)object2).d = iuj.a(iui.b);
            }
            ((iwe)object3).c(new jgy(this, (jgw)object2, 1));
        }
        if ((n2 = ((jgw)object2).b.ordinal()) != 0) {
            if (n2 != 2) {
                if (n2 != 3) return;
                ((jgw)object2).a.a();
                ((jgw)object2).b(iui.a);
                this.j();
                return;
            }
            this.h.e();
            ((iwh)this).d();
            return;
        }
        this.j();
    }

    @Override
    public final void e() {
        e.logp(Level.FINE, "io.grpc.internal.PickFirstLeafLoadBalancer", "shutdown", "Shutting down, currently have {} subchannels created", this.g.size());
        Object object = iui.e;
        this.k = object;
        this.l = object;
        this.f();
        object = this.g.values().iterator();
        while (object.hasNext()) {
            ((jgw)object.next()).a.b();
        }
        this.g.clear();
    }

    public final void f() {
        ksb ksb2 = this.n;
        if (ksb2 != null) {
            ksb2.j();
            this.n = null;
        }
    }

    public final void g(iui iui2, iwf iwf2) {
        if (iui2 == this.l && (iui2 == iui.d || iui2 == iui.a)) {
            return;
        }
        this.l = iui2;
        this.f.f(iui2, iwf2);
    }

    public final void h(jgw jgw2) {
        block6: {
            block5: {
                iui iui2;
                if (jgw2.b != iui.b) break block5;
                if (this.m || jgw2.a() == iui.b) break block6;
                iui iui3 = jgw2.a();
                if (iui3 == (iui2 = iui.c)) {
                    this.g(iui2, new jgu(iwb.a(jgw2.d.b)));
                    return;
                }
                if (this.l != iui2) {
                    this.g(jgw2.a(), new jgu(iwb.a));
                }
            }
            return;
        }
        this.g(iui.b, new ivy(iwb.b(jgw2.a)));
    }
}

