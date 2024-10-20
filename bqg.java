/*
 * Decompiled with CFR 0.152.
 */
import androidx.wear.ambient.WearableControllerProvider;

public final class bqg {
    public final bpm a;
    public final bpq b;
    public final WearableControllerProvider c;

    public bqg() {
        throw null;
    }

    public bqg(bpm bpm2, WearableControllerProvider wearableControllerProvider, bpq bpq2) {
        this.a = bpm2;
        this.c = wearableControllerProvider;
        this.b = bpq2;
    }

    public final boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof bqg) {
            object = (bqg)object;
            if (this.a.equals(((bqg)object).a) && this.c.equals(((bqg)object).c) && ((Object)this.b).equals(((bqg)object).b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.c.hashCode()) * 1000003 ^ ((Object)this.b).hashCode();
    }

    public final String toString() {
        Object object = this.b;
        Object object2 = this.c;
        String string = String.valueOf(this.a);
        object2 = String.valueOf(object2);
        object = String.valueOf(object);
        StringBuilder stringBuilder = new StringBuilder("RosieRobotServiceOptions{aiCoreClient=");
        stringBuilder.append(string);
        stringBuilder.append(", downloadCallback=");
        stringBuilder.append((String)object2);
        stringBuilder.append(", feature=");
        stringBuilder.append((String)object);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

