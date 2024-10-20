/*
 * Decompiled with CFR 0.152.
 */
public class jut {
    public final Throwable b;
    public final jtz c;

    public /* synthetic */ jut(Throwable throwable) {
        this(throwable, false);
    }

    public jut(Throwable throwable, boolean bl2) {
        this.b = throwable;
        this.c = new jtz(bl2, jud.a);
    }

    public final boolean a() {
        return this.c.a(false, true);
    }

    public final String toString() {
        String string = jvf.a(this);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("[");
        stringBuilder.append(this.b);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

