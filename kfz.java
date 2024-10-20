/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Arrays;

public final class kfz {
    private final boolean a;
    private String[] b;
    private String[] c;
    private boolean d;

    public kfz(kga kga2) {
        this.a = kga2.c;
        this.b = kga2.e;
        this.c = kga2.f;
        this.d = kga2.d;
    }

    public kfz(boolean bl2) {
        this.a = bl2;
    }

    public final kga a() {
        return new kga(this.a, this.d, this.b, this.c);
    }

    public final void b(String ... stringArray) {
        jse.e(stringArray, "cipherSuites");
        if (this.a) {
            if (stringArray.length != 0) {
                this.b = (String[])stringArray.clone();
                return;
            }
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
        throw new IllegalArgumentException("no cipher suites for cleartext connections");
    }

    public final void c() {
        if (this.a) {
            this.d = true;
            return;
        }
        throw new IllegalArgumentException("no TLS extensions for cleartext connections");
    }

    public final void d(String ... stringArray) {
        jse.e(stringArray, "tlsVersions");
        if (this.a) {
            if (stringArray.length != 0) {
                this.c = (String[])stringArray.clone();
                return;
            }
            throw new IllegalArgumentException("At least one TLS version is required");
        }
        throw new IllegalArgumentException("no TLS versions for cleartext connections");
    }

    public final void e(kfy ... objectArray) {
        jse.e(objectArray, "cipherSuites");
        if (this.a) {
            int n2 = objectArray.length;
            ArrayList<String> arrayList = new ArrayList<String>(n2);
            for (int i2 = 0; i2 < n2; ++i2) {
                arrayList.add(objectArray[i2].s);
            }
            objectArray = arrayList.toArray(new String[0]);
            this.b((String[])Arrays.copyOf(objectArray, objectArray.length));
            return;
        }
        throw new IllegalArgumentException("no cipher suites for cleartext connections");
    }

    public final void f(kgz ... objectArray) {
        if (this.a) {
            int n2 = objectArray.length;
            ArrayList<String> arrayList = new ArrayList<String>(n2);
            for (int i2 = 0; i2 < n2; ++i2) {
                arrayList.add(objectArray[i2].f);
            }
            objectArray = arrayList.toArray(new String[0]);
            this.d((String[])Arrays.copyOf(objectArray, objectArray.length));
            return;
        }
        throw new IllegalArgumentException("no TLS versions for cleartext connections");
    }
}

