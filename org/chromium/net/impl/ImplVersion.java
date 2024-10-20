/*
 * Decompiled with CFR 0.152.
 */
package org.chromium.net.impl;

public class ImplVersion {
    private ImplVersion() {
    }

    public static int getApiLevel() {
        return 33;
    }

    public static String getCronetVersion() {
        return "129.0.6614.4";
    }

    public static String getCronetVersionWithLastChange() {
        return "129.0.6614.4@".concat("bf119708");
    }

    public static String getLastChange() {
        return "bf119708126f1aefe6b2c03bc3f2c70e55136ce1-refs/branch-heads/6614@{#8}";
    }
}

