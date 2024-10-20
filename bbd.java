/*
 * Decompiled with CFR 0.152.
 */
public final class bbd
implements pq {
    @Override
    public final Object a(po po2) {
        po2.d(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for`getForegroundInfoAsync()`"));
        return "default failing getForegroundInfoAsync";
    }
}

