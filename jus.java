/*
 * Decompiled with CFR 0.152.
 */
public final class jus {
    public final Object a;
    public final juk b;
    public final jrp c;
    public final Object d;
    public final Throwable e;

    public jus(Object object, juk juk2, Throwable throwable) {
        this.a = object;
        this.b = juk2;
        this.c = null;
        this.d = null;
        this.e = throwable;
    }

    public /* synthetic */ jus(Object object, juk juk2, Throwable throwable, int n2) {
        if ((n2 & 2) != 0) {
            juk2 = null;
        }
        if ((n2 & 0x10) != 0) {
            throwable = null;
        }
        this(object, juk2, throwable);
    }

    public static /* synthetic */ jus b(jus jus2, juk juk2, Throwable throwable, int n2) {
        Object object;
        Object object2 = (n2 & 1) != 0 ? jus2.a : null;
        if ((n2 & 2) != 0) {
            juk2 = jus2.b;
        }
        if ((n2 & 4) != 0) {
            object = jus2.c;
        }
        if ((n2 & 8) != 0) {
            object = jus2.d;
        }
        if ((n2 & 0x10) != 0) {
            throwable = jus2.e;
        }
        return new jus(object2, juk2, throwable);
    }

    public final boolean a() {
        return this.e != null;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof jus)) {
            return false;
        }
        object = (jus)object;
        if (!jse.i(this.a, ((jus)object).a)) {
            return false;
        }
        if (!jse.i(this.b, ((jus)object).b)) {
            return false;
        }
        Object object2 = ((jus)object).c;
        if (!jse.i(null, null)) {
            return false;
        }
        object2 = ((jus)object).d;
        if (!jse.i(null, null)) {
            return false;
        }
        return jse.i(this.e, ((jus)object).e);
    }

    public final int hashCode() {
        Object object = this.a;
        int n2 = 0;
        int n3 = object == null ? 0 : object.hashCode();
        object = this.b;
        int n4 = object == null ? 0 : object.hashCode();
        object = this.e;
        if (object != null) {
            n2 = object.hashCode();
        }
        return (n3 * 31 + n4) * 29791 + n2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CompletedContinuation(result=");
        stringBuilder.append(this.a);
        stringBuilder.append(", cancelHandler=");
        stringBuilder.append(this.b);
        stringBuilder.append(", onCancellation=null, idempotentResume=null, cancelCause=");
        stringBuilder.append(this.e);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

