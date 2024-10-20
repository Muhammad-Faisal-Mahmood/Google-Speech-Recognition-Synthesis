/*
 * Decompiled with CFR 0.152.
 */
final class kcg
extends kcf {
    public final Runnable a;

    public kcg(Runnable runnable, long l2, boolean bl2) {
        super(l2, bl2);
        this.a = runnable;
    }

    @Override
    public final void run() {
        this.a.run();
    }

    public final String toString() {
        Object object = this.a;
        String string = jvf.a(object);
        String string2 = jvf.b(object);
        long l2 = this.g;
        boolean bl2 = this.h;
        object = kch.a;
        object = true != bl2 ? "Non-blocking" : "Blocking";
        StringBuilder stringBuilder = new StringBuilder("Task[");
        stringBuilder.append(string);
        stringBuilder.append("@");
        stringBuilder.append(string2);
        stringBuilder.append(", ");
        stringBuilder.append(l2);
        stringBuilder.append(", ");
        stringBuilder.append((String)object);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

