/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.WearableControllerProvider;
import j$.util.Optional;
import java.util.function.Supplier;

public final class cnh
implements Supplier {
    public final cni a;
    public final bpm b;

    public /* synthetic */ cnh(cni cni2, bpm bpm2) {
        this.a = cni2;
        this.b = bpm2;
    }

    public final Object get() {
        Object object = new WearableControllerProvider(null);
        bpq bpq2 = (bpq)this.a.c.get();
        if (bpq2 != null) {
            object = new bqg(this.b, (WearableControllerProvider)object, bpq2);
            return Optional.of(new bqf(((bqg)object).a, ((bqg)object).b, ((bqg)object).c));
        }
        throw new NullPointerException("Null feature");
    }
}

