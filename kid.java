/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public final class kid {
    public final khp a;
    public final kgs b;
    public final int c;
    public final int d;
    public final int e;
    public final kmb f;
    private final List g;
    private final int h;
    private int i;

    public kid(khp khp2, List list, int n2, kmb kmb2, kgs kgs2, int n3, int n4, int n5) {
        jse.e(kgs2, "request");
        this.a = khp2;
        this.g = list;
        this.h = n2;
        this.f = kmb2;
        this.b = kgs2;
        this.c = n3;
        this.d = n4;
        this.e = n5;
    }

    public static /* synthetic */ kid c(kid kid2, int n2, kmb kmb2, kgs kgs2, int n3) {
        if ((n3 & 1) != 0) {
            n2 = kid2.h;
        }
        if ((n3 & 2) != 0) {
            kmb2 = kid2.f;
        }
        if ((n3 & 4) != 0) {
            kgs2 = kid2.b;
        }
        n3 = kid2.c;
        int n4 = kid2.d;
        int n5 = kid2.e;
        jse.e(kgs2, "request");
        return new kid(kid2.a, kid2.g, n2, kmb2, kgs2, n3, n4, n5);
    }

    public final kgv a(kgs object) {
        jse.e(object, "request");
        if (this.h < this.g.size()) {
            Object object2;
            ++this.i;
            Object object3 = this.f;
            if (object3 != null) {
                object2 = ((kgs)object).a;
                if (((khl)((kmb)object3).d).c((kgm)object2)) {
                    if (this.i != 1) {
                        object = this.g.get(this.h - 1);
                        object3 = new StringBuilder("network interceptor ");
                        ((StringBuilder)object3).append(object);
                        ((StringBuilder)object3).append(" must call proceed() exactly once");
                        throw new IllegalStateException(((StringBuilder)object3).toString());
                    }
                } else {
                    object3 = this.g.get(this.h - 1);
                    object = new StringBuilder("network interceptor ");
                    ((StringBuilder)object).append(object3);
                    ((StringBuilder)object).append(" must retain the same host and port");
                    throw new IllegalStateException(((StringBuilder)object).toString());
                }
            }
            object = kid.c(this, this.h + 1, null, (kgs)object, 58);
            object2 = (kgn)this.g.get(this.h);
            object3 = object2.a((kid)object);
            if (this.f != null && this.h + 1 < this.g.size() && ((kid)object).i != 1) {
                throw new IllegalStateException(a.ak(object2, "network interceptor ", " must call proceed() exactly once"));
            }
            if (((kgv)object3).g != null) {
                return object3;
            }
            throw new IllegalStateException(a.ak(object2, "interceptor ", " returned a response with no body"));
        }
        throw new IllegalStateException("Check failed.");
    }

    public final khr b() {
        kmb kmb2 = this.f;
        if (kmb2 != null) {
            return (khr)kmb2.f;
        }
        return null;
    }
}

