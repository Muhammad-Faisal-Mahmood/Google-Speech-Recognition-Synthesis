/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;

public final class gia
implements gib {
    private final bh a;

    public gia(bh bh2) {
        this.a = bh2;
    }

    @Override
    public final Context a() {
        return this.a;
    }

    @Override
    public final by b() {
        return this.a.bb();
    }

    @Override
    public final acr getDefaultViewModelCreationExtras() {
        return this.a.getDefaultViewModelCreationExtras();
    }

    @Override
    public final ack getDefaultViewModelProviderFactory() {
        return this.a.getDefaultViewModelProviderFactory();
    }

    @Override
    public final abb getLifecycle() {
        return this.a.getLifecycle();
    }

    @Override
    public final awf getSavedStateRegistry() {
        return this.a.getSavedStateRegistry();
    }

    @Override
    public final bzb getViewModelStore$ar$class_merging$ar$class_merging$ar$class_merging() {
        return this.a.getViewModelStore$ar$class_merging$ar$class_merging$ar$class_merging();
    }
}

