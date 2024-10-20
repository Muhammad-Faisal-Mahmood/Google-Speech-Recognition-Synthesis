/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.CancellationException;

public final class jwj
extends CancellationException
implements juv {
    public final transient jwi a;

    public jwj(String string, Throwable throwable, jwi jwi2) {
        super(string);
        this.a = jwi2;
        if (throwable != null) {
            this.initCause(throwable);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = bl2 = true;
        if (object == this) return bl3;
        if (!(object instanceof jwj)) return false;
        if (!jse.i(((Throwable)(object = (jwj)object)).getMessage(), this.getMessage())) return false;
        if (!jse.i(((jwj)object).a, this.a)) return false;
        if (!jse.i(((Throwable)object).getCause(), this.getCause())) return false;
        return bl2;
    }

    @Override
    public final Throwable fillInStackTrace() {
        if (jve.a) {
            return super.fillInStackTrace();
        }
        this.setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        Object object = this.getMessage();
        jse.b(object);
        int n2 = ((String)object).hashCode();
        int n3 = this.a.hashCode();
        object = this.getCause();
        int n4 = object != null ? object.hashCode() : 0;
        return (n2 * 31 + n3) * 31 + n4;
    }

    @Override
    public final String toString() {
        String string = super.toString();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append("; job=");
        stringBuilder.append(this.a);
        return stringBuilder.toString();
    }
}

