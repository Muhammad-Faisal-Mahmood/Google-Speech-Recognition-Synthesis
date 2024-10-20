/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.Executor;

public final class cut {
    public byte a;
    public Object b;
    public Object c;
    public Object d;

    public cut() {
        throw null;
    }

    public cut(byte[] object) {
        object = gsl.a;
        this.c = object;
        this.d = object;
    }

    public cut(char[] cArray) {
    }

    public final cuu a() {
        Object object;
        if (this.a == 1 && (object = this.b) != null) {
            Object object2 = this.c;
            gto gto2 = (gto)this.d;
            object2 = (gto)object2;
            return new cuu((String)object, (gto)object2, gto2);
        }
        object = new StringBuilder();
        if (this.b == null) {
            ((StringBuilder)object).append(" groupName");
        }
        if (this.a == 0) {
            ((StringBuilder)object).append(" pendingOnly");
        }
        throw new IllegalStateException("Missing required properties:".concat(object.toString()));
    }

    public final void b(String string) {
        if (string != null) {
            this.b = string;
            return;
        }
        throw new NullPointerException("Null groupName");
    }

    public final void c(Executor executor) {
        if (executor != null) {
            this.d = executor;
            return;
        }
        throw new NullPointerException("Null callbackExecutor");
    }
}

