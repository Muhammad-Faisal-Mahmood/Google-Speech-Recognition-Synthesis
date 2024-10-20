/*
 * Decompiled with CFR 0.152.
 */
final class ay
implements oj {
    final Object a;
    private final int b;

    public ay(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    @Override
    public final /* synthetic */ Object a() {
        if (this.b != 0) {
            be be2 = (be)this.a;
            Object object = be2.B;
            object = object instanceof nr ? ((nr)object).d() : be2.requireActivity().h;
            return object;
        }
        return this.a;
    }
}

