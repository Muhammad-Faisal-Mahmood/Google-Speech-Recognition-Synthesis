/*
 * Decompiled with CFR 0.152.
 */
import java.net.URI;
import java.util.ArrayList;
import org.chromium.net.impl.CronetUrlRequest;

public final class hst
implements Runnable {
    public final Object a;
    public final Object b;
    public final Object c;
    private final int d;

    public /* synthetic */ hst(fvc fvc2, iyh iyh2, iwx iwx2, int n2) {
        this.d = n2;
        this.a = fvc2;
        this.c = iyh2;
        this.b = iwx2;
    }

    public /* synthetic */ hst(itz itz2, Object object, Object object2, int n2) {
        this.d = n2;
        this.a = itz2;
        this.b = object;
        this.c = object2;
    }

    public /* synthetic */ hst(izi izi2, ArrayList arrayList, iyh iyh2, int n2) {
        this.d = n2;
        this.b = izi2;
        this.c = arrayList;
        this.a = iyh2;
    }

    public hst(Object object, Object object2, Object object3, int n2) {
        this.d = n2;
        this.b = object2;
        this.a = object3;
        this.c = object;
    }

    public /* synthetic */ hst(Object object, Object object2, Object object3, int n2, byte[] byArray) {
        this.d = n2;
        this.c = object;
        this.a = object2;
        this.b = object3;
    }

    public hst(jdd jdd2, fvc fvc2, iwx iwx2, int n2) {
        this.d = n2;
        this.a = fvc2;
        this.b = iwx2;
        this.c = jdd2;
    }

    public hst(jia jia2, jhw jhw2, jib jib2, int n2) {
        this.d = n2;
        this.a = jhw2;
        this.c = jib2;
        this.b = jia2;
    }

    public /* synthetic */ hst(krq krq2, kpv kpv2, kod kod2, int n2) {
        this.d = n2;
        this.c = krq2;
        this.b = kpv2;
        this.a = kod2;
    }

    public hst(CronetUrlRequest cronetUrlRequest, kpv kpv2, String string, int n2) {
        this.d = n2;
        this.c = cronetUrlRequest;
        this.b = kpv2;
        this.a = string;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final void run() {
        Object object;
        Object object2;
        Object object3;
        int n2 = this.d;
        int n3 = 0;
        switch (n2) {
            default: {
                object3 = this.a;
                object2 = this.b;
                object = this.c;
                break;
            }
            case 14: {
                Object object4 = this.c;
                krs krs2 = (krs)object4;
                String string = krs2.o = URI.create(krs2.m).resolve((String)this.a).toString();
                krs2.f.add(string);
                krs2.n(2, 3, new kot(object4, this.b, 10));
                return;
            }
            case 13: {
                Object object5;
                ((CronetUrlRequest)this.c).f();
                Object object6 = ((CronetUrlRequest)this.c).c;
                synchronized (object6) {
                    object5 = this.c;
                    if (((CronetUrlRequest)object5).m()) {
                        return;
                    }
                    ((CronetUrlRequest)object5).b = true;
                }
                try {
                    Object object7 = this.c;
                    object5 = ((CronetUrlRequest)object7).e;
                    Object object8 = this.b;
                    object6 = (String)this.a;
                    object8 = (kpv)object8;
                    ((ksj)object5).c((kpt)object7, (kpv)object8, (String)object6);
                    return;
                }
                catch (Exception exception) {
                    ((CronetUrlRequest)this.c).j(exception);
                    return;
                }
            }
            case 12: {
                Object object9;
                Object object10 = ((jhw)this.a).a;
                synchronized (object10) {
                    object9 = this.a;
                    if (((jhw)object9).b) {
                        return;
                    }
                    ((jhw)object9).a();
                }
                object10 = this.b;
                object9 = new jdg(this, this.c, 17, null);
                ((jia)object10).b.f.execute((Runnable)object9);
                return;
            }
            case 11: {
                Object object11 = this.c;
                Object object12 = ((jfk)object11).b;
                if (object11 != ((jfs)object12).t) {
                    return;
                }
                ((jfs)object12).k((iwf)this.b);
                object11 = this.a;
                if (object11 == iui.e) return;
                object12 = this.c;
                Object object13 = this.b;
                ((jfk)object12).b.G.b(2, "Entering {0} state with picker: {1}", object11, object13);
                object12 = this.c;
                object11 = this.a;
                ((jfk)object12).b.o.a((iui)((Object)object11));
                return;
            }
            case 10: {
                Object object14 = this.a;
                Object object15 = this.b;
                ((jdc)this.c).c.a((iyh)object15, (iwx)object14);
                return;
            }
            case 9: {
                Object object16 = this.b;
                Object object17 = this.a;
                ((jdd)this.c).b.a((fvc)object17, (iwx)object16);
                return;
            }
            case 8: {
                Object object18 = this.c;
                Object object19 = this.a;
                Object object20 = this.b;
                n2 = object18.size();
                while (true) {
                    if (n3 >= n2) {
                        synchronized (object20) {
                            ((izi)object20).j();
                        }
                        ((izi)object20).n();
                        return;
                    }
                    izu izu2 = (izu)object18.get(n3);
                    synchronized (izu2) {
                        izu2.h((iyh)object19);
                    }
                    ++n3;
                }
            }
            case 7: {
                Object object21 = this.b;
                Object object22 = this.c;
                ((htm)this.a).a.a((iyh)object22, (iwx)object21);
                return;
            }
            case 6: {
                Object object23 = this.a;
                hta hta2 = (hta)object23;
                boolean bl2 = hta2.a;
                Object object24 = this.b;
                Object object25 = this.c;
                if (bl2) return;
                try {
                    ((hta)object23).c.a((iyh)object25, (iwx)object24);
                    return;
                }
                finally {
                    hta2.a = true;
                    hta2.b.g.a();
                }
            }
            case 5: {
                Object object26 = this.b;
                Object object27 = this.a;
                ((hte)this.c).j((bzq)object27, (htb)object26);
                return;
            }
            case 4: {
                Object object28 = (hte)this.a;
                Object object29 = ((hte)object28).b.iterator();
                while (true) {
                    if (!object29.hasNext()) {
                        object29 = ((hte)object28).i;
                        if (object29 == null) return;
                        object28 = this.c;
                        ((itz)object29).c((String)this.b, (Throwable)object28);
                        return;
                    }
                    ((hpn)object29.next()).cancel(true);
                }
            }
            case 3: {
                Object object30 = this.b;
                Object object31 = this.a;
                ((hte)this.c).j((bzq)object31, (htb)object30);
                return;
            }
            case 2: {
                itz itz2 = ((hsu)this.a).b;
                Object object32 = this.c;
                itz2.a((fvc)this.b, (iwx)object32);
                return;
            }
            case 1: {
                itz itz3 = ((hsm)this.a).b();
                Object object33 = this.c;
                itz3.a((fvc)this.b, (iwx)object33);
                return;
            }
            case 0: {
                itz itz4 = ((hsu)this.a).b;
                Object object34 = this.c;
                itz4.c((String)this.b, (Throwable)object34);
                return;
            }
        }
        try {
            ((krq)object).a.a(((krq)object).d, (kpv)object2, (kod)object3);
        }
        catch (Exception exception) {
            ((krq)object).d.m("onFailed", exception);
        }
        object = (krq)object;
        ((krq)object).b();
        ((krq)object).d.q.i();
    }
}

