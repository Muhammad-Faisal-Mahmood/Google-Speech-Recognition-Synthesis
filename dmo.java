/*
 * Decompiled with CFR 0.152.
 */
public final class dmo {
    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof dmo) {
            object = (dmo)object;
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 296760191;
    }

    public final String toString() {
        return "GlobalConfigurations{componentNameSupplier=null, extensionProvider=null, pauseTimersWhenSleeping=false, pauseStartupMeasuresWhenSleeping=false}";
    }
}

