/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Debug$MemoryInfo
 *  android.os.Process
 */
package org.chromium.base.memory;

import android.os.Debug;
import android.os.Process;

public class MemoryInfoBridge {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Debug.MemoryInfo getActivityManagerMemoryInfoForSelf() {
        Debug.MemoryInfo[] memoryInfoArray = (Debug.MemoryInfo[])jjj.c.getSystemService("activity");
        int n2 = Process.myPid();
        Debug.MemoryInfo memoryInfo = null;
        try {
            memoryInfoArray = memoryInfoArray.getProcessMemoryInfo(new int[]{n2});
            if (memoryInfoArray != null) return memoryInfoArray[0];
            return memoryInfo;
        }
        catch (SecurityException securityException) {
            return memoryInfo;
        }
    }
}

