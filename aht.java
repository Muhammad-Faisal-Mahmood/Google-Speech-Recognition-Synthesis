/*
 * Decompiled with CFR 0.152.
 */
public class aht {
    private int flags;

    public final void addFlag(int n2) {
        this.flags = n2 | this.flags;
    }

    public void clear() {
        this.flags = 0;
    }

    public final void clearFlag(int n2) {
        this.flags = ~n2 & this.flags;
    }

    protected final boolean getFlag(int n2) {
        return (this.flags & n2) == n2;
    }

    public final boolean hasSupplementalData() {
        return this.getFlag(0x10000000);
    }

    public final boolean isEndOfStream() {
        return this.getFlag(4);
    }

    public final boolean isFirstSample() {
        return this.getFlag(0x8000000);
    }

    public final boolean isKeyFrame() {
        return this.getFlag(1);
    }

    public final boolean isLastSample() {
        return this.getFlag(0x20000000);
    }

    public final boolean notDependedOn() {
        return this.getFlag(0x4000000);
    }

    public final void setFlags(int n2) {
        this.flags = n2;
    }
}

