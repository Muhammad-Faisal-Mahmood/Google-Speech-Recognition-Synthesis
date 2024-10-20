/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.ArrayMap
 */
package org.jni_zero;

import android.util.ArrayMap;
import java.util.Iterator;
import java.util.Map;

public class JniUtil {
    private static Map arrayToMap(Object[] objectArray) {
        int n2 = objectArray.length;
        ArrayMap arrayMap = new ArrayMap(n2 >> 1);
        for (int i2 = 0; i2 < n2; i2 += 2) {
            arrayMap.put(objectArray[i2], objectArray[i2 + 1]);
        }
        return arrayMap;
    }

    private static Object[] mapToArray(Map object) {
        int n2 = object.size();
        Object[] objectArray = new Object[n2 + n2];
        Iterator iterator = object.entrySet().iterator();
        n2 = 0;
        while (iterator.hasNext()) {
            object = iterator.next();
            objectArray[n2] = object.getKey();
            objectArray[n2 + 1] = object.getValue();
            n2 += 2;
        }
        return objectArray;
    }
}

