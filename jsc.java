/*
 * Decompiled with CFR 0.152.
 */
public class jsc
extends jrx
implements jsb,
jtc {
    private final int a;
    private final int f;

    public jsc(int n2, Class clazz, String string, String string2, int n3) {
        this(n2, b, clazz, string, string2, n3);
    }

    public jsc(int n2, Object object, Class clazz, String string, String string2) {
        this(n2, object, clazz, string, string2, 0);
    }

    public jsc(int n2, Object object, Class clazz, String string, String string2, int n3) {
        boolean bl2 = 1 == n3;
        super(object, clazz, string, string2, bl2);
        this.a = n2;
        this.f = 0;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof jsc) {
            object = (jsc)object;
            if (this.d.equals(((jrx)object).d) && this.e.equals(((jrx)object).e)) {
                int n2 = ((jsc)object).f;
                if (this.a == ((jsc)object).a && jse.i(this.c, ((jrx)object).c) && jse.i(this.d(), ((jrx)object).d())) {
                    return true;
                }
            }
            return false;
        }
        if (object instanceof jtc) {
            return object.equals(this.c());
        }
        return false;
    }

    @Override
    protected final void f() {
        int n2 = jsk.a;
    }

    public final int hashCode() {
        int n2 = this.d() == null ? 0 : this.d().hashCode() * 31;
        return (n2 + this.d.hashCode()) * 31 + this.e.hashCode();
    }

    @Override
    public final int i() {
        return this.a;
    }

    public final String toString() {
        Object object = this.c();
        if (object != this) {
            return object.toString();
        }
        if ("<init>".equals(this.d)) {
            object = "constructor (Kotlin reflection is not available)";
        } else {
            String string = this.d;
            object = new StringBuilder("function ");
            ((StringBuilder)object).append(string);
            ((StringBuilder)object).append(" (Kotlin reflection is not available)");
            object = ((StringBuilder)object).toString();
        }
        return object;
    }
}

