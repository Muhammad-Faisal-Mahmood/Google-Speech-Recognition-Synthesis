/*
 * Decompiled with CFR 0.152.
 */
package org.chromium.net;

import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AndroidCertVerifyResult {
    private final int a;
    private final boolean b;
    private final List c;

    public AndroidCertVerifyResult(int n2) {
        this.a = n2;
        this.b = false;
        this.c = Collections.emptyList();
    }

    public AndroidCertVerifyResult(boolean bl2, List list) {
        this.a = 0;
        this.b = bl2;
        this.c = new ArrayList(list);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[][] getCertificateChainEncoded() {
        byte[][] byArrayArray = new byte[this.c.size()][];
        int n2 = 0;
        try {
            while (true) {
                if (n2 >= this.c.size()) {
                    return byArrayArray;
                }
                byArrayArray[n2] = ((X509Certificate)this.c.get(n2)).getEncoded();
                ++n2;
            }
        }
        catch (CertificateEncodingException certificateEncodingException) {
            return new byte[0][];
        }
    }

    public int getStatus() {
        return this.a;
    }

    public boolean isIssuedByKnownRoot() {
        return this.b;
    }
}

