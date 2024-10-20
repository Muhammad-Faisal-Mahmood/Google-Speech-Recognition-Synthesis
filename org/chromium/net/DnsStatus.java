/*
 * Decompiled with CFR 0.152.
 */
package org.chromium.net;

import java.net.InetAddress;
import java.util.List;

public class DnsStatus {
    private final List a;
    private final boolean b;
    private final String c;
    private final String d;

    public DnsStatus(List object, boolean bl2, String string, String string2) {
        this.a = object;
        this.b = bl2;
        object = string;
        if (string == null) {
            object = "";
        }
        this.c = object;
        object = string2;
        if (string2 == null) {
            object = "";
        }
        this.d = object;
    }

    public byte[][] getDnsServers() {
        byte[][] byArrayArray = new byte[this.a.size()][];
        for (int i2 = 0; i2 < this.a.size(); ++i2) {
            byArrayArray[i2] = ((InetAddress)this.a.get(i2)).getAddress();
        }
        return byArrayArray;
    }

    public boolean getPrivateDnsActive() {
        return this.b;
    }

    public String getPrivateDnsServerName() {
        return this.c;
    }

    public String getSearchDomains() {
        return this.d;
    }
}

