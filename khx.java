/*
 * Decompiled with CFR 0.152.
 */
public final class khx
implements kgn {
    private final kgd a;

    public khx(kgd kgd2) {
        this.a = kgd2;
    }

    @Override
    public final kgv a(kid object) {
        Object object2 = ((kid)object).b;
        Object object3 = new kgr((kgs)object2);
        Object object4 = ((kgs)object2).d;
        if (object4 != null) {
            long l2 = ((kgt)object4).a();
            if (l2 != -1L) {
                ((kgr)object3).b("Content-Length", String.valueOf(l2));
                ((kgr)object3).d("Transfer-Encoding");
            } else {
                ((kgr)object3).b("Transfer-Encoding", "chunked");
                ((kgr)object3).d("Content-Length");
            }
        }
        object4 = ((kgs)object2).a("Host");
        boolean bl2 = false;
        if (object4 == null) {
            ((kgr)object3).b("Host", khb.l(((kgs)object2).a, false));
        }
        if (((kgs)object2).a("Connection") == null) {
            ((kgr)object3).b("Connection", "Keep-Alive");
        }
        boolean bl3 = bl2;
        if (((kgs)object2).a("Accept-Encoding") == null) {
            bl3 = bl2;
            if (((kgs)object2).a("Range") == null) {
                ((kgr)object3).b("Accept-Encoding", "gzip");
                bl3 = true;
            }
        }
        object4 = ((kgs)object2).a;
        if (((kgs)object2).a("User-Agent") == null) {
            ((kgr)object3).b("User-Agent", "okhttp/4.12.0");
        }
        object = ((kid)object).a(((kgr)object3).a());
        kic.a(this.a, ((kgs)object2).a, ((kgv)object).f);
        object3 = new kgu((kgv)object);
        ((kgu)object3).f((kgs)object2);
        if (bl3 && jse.H("gzip", kgv.a((kgv)object, "Content-Encoding")) && kic.b((kgv)object) && (object2 = ((kgv)object).g) != null) {
            object4 = new klt(((kgx)object2).b());
            object2 = ((kgv)object).f.e();
            ((bzo)object2).aA("Content-Encoding");
            ((bzo)object2).aA("Content-Length");
            ((kgu)object3).c(((bzo)object2).aw());
            kgv.a((kgv)object, "Content-Type");
            ((kgu)object3).c = new kie(-1L, new kme((kmk)object4));
        }
        return ((kgu)object3).a();
    }
}

