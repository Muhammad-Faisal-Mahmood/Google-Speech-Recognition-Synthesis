/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.util.Comparator;

public final class dfz
implements Comparator {
    public final int a;

    public /* synthetic */ dfz(int n2) {
        this.a = n2;
    }

    public final int compare(Object object, Object object2) {
        int n2;
        int n3;
        dez dez2;
        int n4;
        dez dez3;
        object = (dfr)object;
        object2 = (dfr)object2;
        try {
            dez3 = ((dfr)object).c();
            n4 = ((dfr)object).a();
            dez2 = ((dfr)object2).c();
            n3 = ((dfr)object2).a();
        }
        catch (IOException iOException) {
            throw new IllegalStateException("Failed to get metadata", iOException);
        }
        int n5 = n2 = Long.compare(dez3.b(), dez2.b());
        if (n2 == 0) {
            n5 = n2 = Long.compare(n4, n3);
            if (n2 == 0) {
                n5 = n2 = Long.compare(dez3.d(), dez2.d());
                if (n2 == 0) {
                    n5 = this.a;
                    n5 = n5 != 3 && n5 != 2 ? Long.compare(dez3.e(), dez2.e()) : Long.compare(((dfr)object).b(), ((dfr)object2).b());
                }
            }
        }
        return n5;
    }
}

