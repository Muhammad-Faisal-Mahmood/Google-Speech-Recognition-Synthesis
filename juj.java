/*
 * Decompiled with CFR 0.152.
 */
public final class juj
implements juk {
    private final int a;
    private final Object b;

    public juj(Object object, int n2) {
        this.a = n2;
        this.b = object;
    }

    @Override
    public final void a(Throwable throwable) {
        int n2 = this.a;
        if (n2 != 0) {
            if (n2 != 1) {
                this.b.bu();
                return;
            }
            this.b.cancel(false);
            return;
        }
        this.b.a(throwable);
    }

    public final String toString() {
        int n2 = this.a;
        if (n2 != 0) {
            if (n2 != 1) {
                StringBuilder stringBuilder = new StringBuilder("DisposeOnCancel[");
                stringBuilder.append(this.b);
                stringBuilder.append("]");
                return stringBuilder.toString();
            }
            StringBuilder stringBuilder = new StringBuilder("CancelFutureOnCancel[");
            stringBuilder.append(this.b);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
        String string = jvf.a(this.b);
        String string2 = jvf.b(this);
        StringBuilder stringBuilder = new StringBuilder("CancelHandler.UserSupplied[");
        stringBuilder.append(string);
        stringBuilder.append("@");
        stringBuilder.append(string2);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

