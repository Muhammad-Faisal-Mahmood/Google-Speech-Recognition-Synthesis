/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.AbsListView
 */
import android.widget.AbsListView;
import java.lang.reflect.Field;

final class jb {
    public static final Field a;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        void var1_3;
        Field field;
        block4: {
            try {
                field = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            }
            catch (NoSuchFieldException noSuchFieldException) {
                field = null;
                break block4;
            }
            try {
                field.setAccessible(true);
            }
            catch (NoSuchFieldException noSuchFieldException) {}
        }
        var1_3.printStackTrace();
        a = field;
    }
}

