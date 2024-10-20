/*
 * Decompiled with CFR 0.152.
 */
package j$.time.format;

import java.util.Comparator;
import java.util.Map;

final class v
implements Comparator {
    public final int compare(Object object, Object object2) {
        object = (Map.Entry)object;
        return ((String)((Map.Entry)object2).getKey()).length() - ((String)object.getKey()).length();
    }
}

