/*
 * Decompiled with CFR 0.152.
 */
public abstract class hfe {
    public static final hfe c = new hfa();
    public static final hfe d = new hfa();

    protected hfe() {
    }

    static hfe b(hfe hfe2, hfe hfe3) {
        hfe hfe4;
        if (hfe2 == null) {
            return hfe3;
        }
        if (hfe3 == null) {
            return hfe2;
        }
        hfe hfe5 = c;
        if (hfe2 != hfe5 && hfe3 != (hfe4 = d)) {
            if (hfe3 != hfe5 && hfe2 != hfe4) {
                return new hfb(hfe2, hfe3);
            }
            return hfe3;
        }
        return hfe2;
    }

    protected abstract void a();
}

