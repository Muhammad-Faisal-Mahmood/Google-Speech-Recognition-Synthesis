/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.function.Supplier;

public final class fes
implements Supplier {
    private final int a;

    public /* synthetic */ fes(int n2) {
        this.a = n2;
    }

    public final Object get() {
        switch (this.a) {
            default: {
                return new hcc();
            }
            case 8: {
                return new LinkedHashMap();
            }
            case 7: {
                return new gzy();
            }
            case 6: {
                return new bzq();
            }
            case 5: {
                return new hat();
            }
            case 4: {
                return new gzs();
            }
            case 3: {
                return new ArrayList();
            }
            case 2: {
                return new HashSet();
            }
            case 1: {
                return new IllegalStateException();
            }
            case 0: 
        }
        return new ArrayList();
    }
}

