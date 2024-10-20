/*
 * Decompiled with CFR 0.152.
 */
public final class acz
extends ach {
    public static final ack a = new acy(0);
    public final pb b = new pb();
    public boolean c = false;

    public final void a() {
        this.c = false;
    }

    public final acw b() {
        return (acw)pc.a(this.b, 54321);
    }

    @Override
    protected final void d() {
        int n2;
        int n3 = this.b.b();
        for (n2 = 0; n2 < n3; ++n2) {
            ((acw)this.b.c(n2)).j();
        }
        pb pb2 = this.b;
        n3 = pb2.d;
        Object[] objectArray = pb2.c;
        for (n2 = 0; n2 < n3; ++n2) {
            objectArray[n2] = null;
        }
        pb2.d = 0;
        pb2.a = false;
    }
}

