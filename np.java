/*
 * Decompiled with CFR 0.152.
 */
public final class np
extends nm {
    final nq a;
    final String b;
    final nu c;

    public np(nq nq2, String string, nu nu2) {
        this.a = nq2;
        this.b = string;
        this.c = nu2;
    }

    @Override
    public final void a() {
        this.a.d(this.b);
    }

    @Override
    public final void b(Object object) {
        Object object2 = this.a.b.get(this.b);
        if (object2 != null) {
            int n2 = ((Number)object2).intValue();
            nq nq2 = this.a;
            object2 = this.b;
            nq2.d.add(object2);
            try {
                this.a.f(n2, this.c, object);
                return;
            }
            catch (Exception exception) {
                nq2 = this.a;
                object2 = this.b;
                nq2.d.remove(object2);
                throw exception;
            }
        }
        nu nu2 = this.c;
        object2 = new StringBuilder("Attempting to launch an unregistered ActivityResultLauncher with contract ");
        ((StringBuilder)object2).append(nu2);
        ((StringBuilder)object2).append(" and input ");
        ((StringBuilder)object2).append(object);
        ((StringBuilder)object2).append(". You must ensure the ActivityResultLauncher is registered before calling launch().");
        throw new IllegalStateException(((StringBuilder)object2).toString());
    }
}

