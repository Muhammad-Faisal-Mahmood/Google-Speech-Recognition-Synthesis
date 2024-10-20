/*
 * Decompiled with CFR 0.152.
 */
public final class cgc
extends Exception {
    public final cbk a;

    public cgc(cbk cbk2) {
        kl.ao(cbk2.a(), "ResolvableConnectionException can only be created with a connection result containing a resolution.");
        this.a = cbk2;
    }
}

