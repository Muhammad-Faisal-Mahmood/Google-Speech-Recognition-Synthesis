/*
 * Decompiled with CFR 0.152.
 */
package j$.time.zone;

import j$.time.zone.e;
import j$.time.zone.i;
import java.util.AbstractCollection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TimeZone;

final class h
extends i {
    private final Set c;

    h() {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        String[] stringArray = TimeZone.getAvailableIDs();
        int n2 = stringArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            ((AbstractCollection)linkedHashSet).add(stringArray[i2]);
        }
        this.c = Collections.unmodifiableSet(linkedHashSet);
    }

    @Override
    protected final e b(String string) {
        if (this.c.contains(string)) {
            return new e(TimeZone.getTimeZone(string));
        }
        StringBuilder stringBuilder = new StringBuilder("Not a built-in time zone: ");
        stringBuilder.append(string);
        throw new RuntimeException(stringBuilder.toString());
    }

    @Override
    protected final Set c() {
        return this.c;
    }
}

