/*
 * Decompiled with CFR 0.152.
 */
public final class ewb
implements evp {
    final ewc a;
    private final evz b;

    public ewb(ewc object, ecm object2) {
        jse.e(object2, "metadata");
        this.a = object;
        object = ((ewc)object).c;
        StringBuilder stringBuilder = new StringBuilder();
        Object object3 = emb.a;
        jse.d(object3, "clientInfo");
        stringBuilder.append(ewc.a(String.valueOf(eio.a((int)((eip)fvc.aF((hwt)object2, (gpm)object3)).b).K)));
        object3 = emb.c;
        jse.d(object3, "token");
        object3 = fvc.aF((hwt)object2, (gpm)object3);
        jse.d(object3, "get(...)");
        stringBuilder.append("-".concat(ewc.a((String)object3)));
        object3 = emb.b;
        jse.d(object3, "source");
        object3 = fvc.aF((hwt)object2, (gpm)object3);
        jse.d(object3, "get(...)");
        stringBuilder.append("-".concat(ewc.a((String)object3)));
        object2 = new evx(stringBuilder.toString(), ((ecm)object2).e, ((ecm)object2).d, ((ecm)object2).c);
        object = (gcv)((bzb)object).a;
        this.b = new evz(((ilt)((gcv)object).f).a(), (jvb)((gcv)object).d.b(), (cgw)((gcv)object).g.b(), ((imr)((gcv)object).e).a(), ((ims)((gcv)object).b).a(), ((ims)((gcv)object).c).a(), (crh)((gcv)object).a.b(), (evx)object2);
    }

    @Override
    public final hpn a() {
        return this.b.a();
    }

    @Override
    public final hpn b(dzn dzn2) {
        jse.e(dzn2, "audioData");
        jse.e(dzn2, "audioData");
        Object object = dzn2.c == 1 ? (dzm)dzn2.d : dzm.a;
        hvu hvu2 = ((dzm)object).c;
        jse.d(hvu2, "getBytes(...)");
        int n2 = dzn2.b;
        Long l2 = null;
        object = (n2 & 4) != 0 ? Integer.valueOf(dzn2.g) : null;
        if ((dzn2.b & 2) != 0) {
            l2 = dzn2.f;
        }
        return this.b.b(hvu2, (Integer)object, l2);
    }

    @Override
    public final hpn c(hvu hvu2) {
        jse.e(hvu2, "bytes");
        jse.e(hvu2, "bytes");
        return this.b.b(hvu2, null, null);
    }
}

