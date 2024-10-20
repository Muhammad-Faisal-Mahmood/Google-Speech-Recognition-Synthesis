/*
 * Decompiled with CFR 0.152.
 */
public final class jbp {
    public final ivz a;
    public iwh b;
    public iwi c;
    final ksb d;

    public jbp(ksb object, ivz object2) {
        this.d = object;
        this.a = object2;
        Object object3 = ((ksb)object).b;
        String string = (String)((ksb)object).a;
        this.c = object3 = ((iwj)object3).a(string);
        if (object3 != null) {
            this.b = ((ivx)object3).a((ivz)object2);
            return;
        }
        object = ((ksb)object).a;
        object2 = new StringBuilder("Could not find policy '");
        ((StringBuilder)object2).append((String)object);
        ((StringBuilder)object2).append("'. Make sure its implementation is either registered to LoadBalancerRegistry or included in META-INF/services/io.grpc.LoadBalancerProvider from your jar files.");
        throw new IllegalStateException(((StringBuilder)object2).toString());
    }
}

