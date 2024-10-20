/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioManager
 *  android.media.AudioRecordingConfiguration
 */
import android.media.AudioManager;
import android.media.AudioRecordingConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ery
implements erb {
    private static final List a = jns.f(5, 7, 4);
    private final AudioManager b;
    private final ers c;

    public ery(AudioManager audioManager, ers ers2) {
        this.b = audioManager;
        this.c = ers2;
    }

    private static final boolean b(AudioRecordingConfiguration audioRecordingConfiguration) {
        return a.contains(ag$$ExternalSyntheticApiModelOutline1.m$1(audioRecordingConfiguration));
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final boolean a(era object) {
        void var1_10;
        Object e2;
        void var1_14;
        void var1_5;
        Object object2;
        Object object3;
        block15: {
            jse.e(object, "mode");
            jse.e(object, "mode");
            object3 = ag$$ExternalSyntheticApiModelOutline1.m(this.b);
            jse.d(object3, "getActiveRecordingConfigurations(...)");
            object2 = new ArrayList(jns.B((Iterable)object3));
            Iterator iterator = object3.iterator();
            while (true) {
                boolean bl2 = iterator.hasNext();
                object3 = null;
                if (!bl2) break;
                object3 = ag$$ExternalSyntheticApiModelOutline1.m(iterator.next());
                jse.b(object3);
                int n2 = ((Enum)object).ordinal();
                if (n2 != 0) {
                    if (n2 != 1) throw new joa();
                    object3 = ery.b((AudioRecordingConfiguration)object3) ? erd.a : erd.b;
                } else if (ery.b((AudioRecordingConfiguration)object3)) {
                    object3 = erd.a;
                } else if (ag$$ExternalSyntheticApiModelOutline1.m$1((AudioRecordingConfiguration)object3) == 1999) {
                    object3 = erd.b;
                } else if (jse.i(object3 = this.c.a((AudioRecordingConfiguration)object3, eri.a, eri.b), erk.a)) {
                    object3 = new erc(null);
                } else if (object3 instanceof erj) {
                    object3 = (erj)object3;
                    object3 = new erc(null);
                } else {
                    if (!jse.i(object3, erk.b)) throw new joa();
                    object3 = erd.b;
                }
                object2.add(object3);
            }
            iterator = object2.iterator();
            while (iterator.hasNext()) {
                Object t2 = iterator.next();
                if (!jse.i((ere)t2, erd.a)) continue;
                break block15;
            }
            Object var1_4 = null;
        }
        ere ere2 = (ere)var1_5;
        if (ere2 != null) return !jse.i(var1_14, erd.b);
        object2 = object2.iterator();
        do {
            Object object4 = object3;
        } while (object2.hasNext() && !((ere)(e2 = object2.next()) instanceof erc));
        ere ere3 = (ere)var1_10;
        if (ere3 != null) return !jse.i(var1_14, erd.b);
        if (this.b.getMode() == 2) {
            erd erd2 = erd.a;
            return !jse.i(var1_14, erd.b);
        } else {
            erd erd3 = erd.b;
        }
        return !jse.i(var1_14, erd.b);
    }
}

