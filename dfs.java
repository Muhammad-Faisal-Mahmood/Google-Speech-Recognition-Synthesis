/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 */
import android.util.Pair;
import java.io.File;
import java.util.Comparator;
import java.util.Map;
import org.chromium.net.impl.CronetLibraryLoader;

public final class dfs
implements Comparator {
    private final int a;

    public /* synthetic */ dfs(int n2) {
        this.a = n2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final int compare(Object object, Object object2) {
        int n2 = this.a;
        int n3 = 1;
        switch (n2) {
            default: {
                object = (Pair)object;
                Pair pair = (Pair)object2;
                object2 = CronetLibraryLoader.a;
                return ((Long)((Pair)object).first).compareTo((Long)pair.first);
            }
            case 9: {
                object = (String)object;
                object2 = (String)object2;
                n2 = klg.e;
                if (object == object2) {
                    return 0;
                }
                if (object == null) {
                    return -1;
                }
                if (object2 != null) return ((String)object).compareToIgnoreCase((String)object2);
                return n3;
            }
            case 8: {
                return ((String)((Map.Entry)object).getKey()).compareTo((String)((Map.Entry)object2).getKey());
            }
            case 7: {
                hhq hhq2 = hhq.a(object);
                hhq hhq3 = hhq.a(object2);
                if (hhq2 != hhq3) return hhq2.compareTo(hhq3);
                n3 = hhq2.ordinal();
                if (n3 == 0) return ((Boolean)object).compareTo((Boolean)object2);
                if (n3 == 1) return ((String)object).compareTo((String)object2);
                if (n3 == 2) return ((Long)object).compareTo((Long)object2);
                if (n3 != 3) throw null;
                return ((Double)object).compareTo((Double)object2);
            }
            case 6: {
                return jjj.t(Long.valueOf(((File)object).lastModified()), Long.valueOf(((File)object2).lastModified()));
            }
            case 5: {
                object = (dru)object;
                object2 = (dru)object2;
                return (int)(((dru)object).c - ((dru)object2).c);
            }
            case 4: {
                object = (dwm)object;
                object = (dwm)object2;
                return 0;
            }
            case 3: {
                object = (hti)object;
                object2 = (hti)object2;
                return Long.compare(((dkt)((hti)object).b).a, ((dkt)((hti)object2).b).a);
            }
            case 2: {
                object = (dfy)object;
                object2 = (dfy)object2;
                n3 = dfu.i;
                n3 = n2 = Long.compare(((dfy)object).b(), ((dfy)object2).b());
                if (n2 != 0) return n3;
                n3 = n2 = Long.compare(((dfy)object).f(), ((dfy)object2).f());
                if (n2 != 0) return n3;
                return Long.compare(((dfy)object).c(), ((dfy)object2).c());
            }
            case 1: {
                object = (den)object;
                object2 = (den)object2;
                return ((den)object).o().c(((den)object2).o());
            }
            case 0: 
        }
        object = (dfy)object;
        object2 = (dfy)object2;
        n3 = dfu.i;
        return ((dfy)object).e().c(((dfy)object2).e());
    }
}

