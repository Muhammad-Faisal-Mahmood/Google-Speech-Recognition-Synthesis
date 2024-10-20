/*
 * Decompiled with CFR 0.152.
 */
public final class aie {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    /*
     * Enabled aggressive block sorting
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void a() {
        // MONITORENTER : this
        // MONITOREXIT : this
    }

    public final String toString() {
        int n2 = this.a;
        int n3 = this.b;
        int n4 = this.c;
        int n5 = this.d;
        int n6 = this.e;
        int n7 = this.f;
        Integer n8 = 0;
        return agf.r("DecoderCounters {\n decoderInits=%s,\n decoderReleases=%s\n queuedInputBuffers=%s\n skippedInputBuffers=%s\n renderedOutputBuffers=%s\n skippedOutputBuffers=%s\n droppedBuffers=%s\n droppedInputBuffers=%s\n maxConsecutiveDroppedBuffers=%s\n droppedToKeyframeEvents=%s\n totalVideoFrameProcessingOffsetUs=%s\n videoFrameProcessingOffsetCount=%s\n}", n2, n3, n4, n5, n6, n7, n8, n8, n8, n8, 0L, n8);
    }
}

