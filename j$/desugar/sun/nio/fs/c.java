/*
 * Decompiled with CFR 0.152.
 */
package j$.desugar.sun.nio.fs;

import j$.desugar.sun.nio.fs.a;
import j$.util.Objects;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class c {
    public static /* synthetic */ List a(Object[] objectArray) {
        ArrayList<Object> arrayList = new ArrayList<Object>(objectArray.length);
        int n2 = objectArray.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            arrayList.add(Objects.requireNonNull(objectArray[i2]));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static FileChannel b(FileChannel fileChannel) {
        return a.b(fileChannel);
    }
}

