/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.FilenameFilter;

public final class gaq
implements FilenameFilter {
    public final hav a;
    public final boolean b;

    public /* synthetic */ gaq(hav hav2, boolean bl2) {
        this.a = hav2;
        this.b = bl2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public final boolean accept(File file, String object) {
        file = new File(file, (String)object);
        boolean bl2 = false;
        try {
            object = Integer.valueOf((String)object);
            int n2 = (Integer)object;
            if (n2 < 0) {
                return bl2;
            }
            hav hav2 = this.a;
            if (hav2 != null && hav2.contains(object)) {
                return bl2;
            }
            boolean bl3 = file.isDirectory();
            if (!bl3) {
                return bl2;
            }
            if (!this.b) return true;
            bl3 = file.canWrite();
            if (!bl3) return false;
        }
        catch (NumberFormatException numberFormatException) {
            return bl2;
        }
        return true;
    }
}

