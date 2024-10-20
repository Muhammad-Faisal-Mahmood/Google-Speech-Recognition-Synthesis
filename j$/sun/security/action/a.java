/*
 * Decompiled with CFR 0.152.
 */
package j$.sun.security.action;

import java.security.PrivilegedAction;

public final class a
implements PrivilegedAction {
    public final int a;

    public /* synthetic */ a(int n2) {
        this.a = n2;
    }

    public final Object run() {
        String string;
        switch (this.a) {
            default: {
                return Boolean.getBoolean("org.openjdk.java.util.stream.tripwire");
            }
            case 0: 
        }
        String string2 = string = System.getProperty("file.encoding");
        if (string == null) {
            string2 = null;
        }
        return string2;
    }
}

