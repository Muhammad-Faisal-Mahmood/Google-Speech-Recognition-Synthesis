/*
 * Decompiled with CFR 0.152.
 */
package androidx.work;

import androidx.wear.ambient.AmbientMode$AmbientCallback;
import java.util.LinkedHashMap;
import java.util.List;

public final class OverwritingInputMerger
extends bba {
    @Override
    public final bas a(List object) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        object = object.iterator();
        while (object.hasNext()) {
            linkedHashMap2.putAll(((bas)object.next()).c());
        }
        AmbientMode$AmbientCallback.c(linkedHashMap2, linkedHashMap);
        return AmbientMode$AmbientCallback.a(linkedHashMap);
    }
}

