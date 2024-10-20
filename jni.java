/*
 * Decompiled with CFR 0.152.
 */
import java.util.logging.Level;

public class jni {
    public final iwh a;
    public iui b;
    public iwf c;
    final jnk d;
    private final Object e;

    public jni(jnk jnk2, Object object, ivx ivx2) {
        this.d = jnk2;
        this.c = new ivy(iwb.a);
        this.e = object;
        this.a = ivx2.a(this.a());
        this.b = iui.a;
    }

    protected jnh a() {
        return new jnh(this);
    }

    protected final void b() {
        this.a.e();
        this.b = iui.e;
        jnk.e.logp(Level.FINE, "io.grpc.util.MultiChildLoadBalancer$ChildLbState", "shutdown", "Child balancer {0} deleted", this.e);
    }

    public final String toString() {
        String string = String.valueOf(this.e);
        String string2 = String.valueOf((Object)this.b);
        String string3 = String.valueOf(this.c.getClass());
        String string4 = String.valueOf(this.a);
        StringBuilder stringBuilder = new StringBuilder("Address = ");
        stringBuilder.append(string);
        stringBuilder.append(", state = ");
        stringBuilder.append(string2);
        stringBuilder.append(", picker type: ");
        stringBuilder.append(string3);
        stringBuilder.append(", lb: ");
        stringBuilder.append(string4);
        return stringBuilder.toString();
    }
}

