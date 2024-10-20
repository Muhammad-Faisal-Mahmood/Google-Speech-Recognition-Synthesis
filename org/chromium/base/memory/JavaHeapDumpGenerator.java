/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Debug
 *  android.util.Log
 */
package org.chromium.base.memory;

import android.os.Debug;
import android.util.Log;
import java.io.IOException;

public final class JavaHeapDumpGenerator {
    private JavaHeapDumpGenerator() {
    }

    public static boolean generateHprof(String string) {
        try {
            Debug.dumpHprofData((String)string);
            return true;
        }
        catch (IOException iOException) {
            String string2 = iOException.getMessage();
            StringBuilder stringBuilder = new StringBuilder("Error writing to file ");
            stringBuilder.append(string);
            stringBuilder.append(". Error: ");
            stringBuilder.append(string2);
            Log.i((String)"cr_JavaHprofGenerator", (String)stringBuilder.toString());
            return false;
        }
    }
}

