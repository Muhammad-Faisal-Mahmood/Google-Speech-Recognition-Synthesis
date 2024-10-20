/*
 * Decompiled with CFR 0.152.
 */
package org.chromium.url;

import java.net.IDN;

public class IDNStringUtil {
    private static String idnToASCII(String string) {
        try {
            string = IDN.toASCII(string, 2);
            return string;
        }
        catch (Exception exception) {
            return null;
        }
    }
}

