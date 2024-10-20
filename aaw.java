/*
 * Decompiled with CFR 0.152.
 */
import java.util.Iterator;

public final class aaw
implements awd {
    @Override
    public final void a(awh awh2) {
        if (awh2 instanceof aco) {
            bzb bzb2 = ((aco)((Object)awh2)).getViewModelStore$ar$class_merging$ar$class_merging$ar$class_merging();
            awf awf2 = awh2.getSavedStateRegistry();
            Iterator iterator = bzb2.R().iterator();
            while (iterator.hasNext()) {
                ach ach2 = bzb2.Q((String)iterator.next());
                jse.b(ach2);
                aay.b(ach2, awf2, awh2.getLifecycle());
            }
            if (!bzb2.R().isEmpty()) {
                awf2.c(aaw.class);
            }
            return;
        }
        throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
    }
}

