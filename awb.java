/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public final class awb
implements awe {
    public final Set a = new LinkedHashSet();

    public awb(awf awf2) {
        awf2.b("androidx.savedstate.Restarter", this);
    }

    @Override
    public final Bundle a() {
        Bundle bundle = new Bundle();
        xm.h(bundle);
        ArrayList arrayList = jns.s(this.a);
        if (arrayList instanceof ArrayList) {
            jse.c(arrayList, "null cannot be cast to non-null type java.util.ArrayList<T of androidx.savedstate.SavedStateWriter.toArrayListUnsafe>{ kotlin.collections.TypeAliasesKt.ArrayList<T of androidx.savedstate.SavedStateWriter.toArrayListUnsafe> }");
            arrayList = arrayList;
        } else {
            jse.c(arrayList, "null cannot be cast to non-null type kotlin.collections.Collection<T of androidx.savedstate.SavedStateWriter.toArrayListUnsafe>");
            arrayList = new ArrayList(arrayList);
        }
        bundle.putStringArrayList("classes_to_restore", arrayList);
        return bundle;
    }
}

