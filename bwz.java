/*
 * Decompiled with CFR 0.152.
 */
import androidx.preference.Preference;
import com.google.android.apps.speech.tts.googletts.settings.AnalyticsPreferenceScreen;

public final class bwz
implements aso {
    public final Object a;
    public final Object b;
    public final Object c;
    private final int d;

    public /* synthetic */ bwz(Object object, Object object2, Object object3, int n2) {
        this.d = n2;
        this.a = object;
        this.c = object2;
        this.b = object3;
    }

    @Override
    public final boolean a(Preference object, Object object2) {
        int n2 = this.d;
        if (n2 != 0) {
            if (n2 != 1) {
                Object object3 = this.c;
                object3 = ((grn)this.a).a.H("OnPreferenceChangeListener", (String)object3);
                Object object4 = this.b;
                try {
                    boolean bl2 = object4.a((Preference)object, object2);
                    return bl2;
                }
                finally {
                    object3.close();
                }
            }
            object2 = (Boolean)object2;
            boolean bl3 = (Boolean)object2;
            ((bxf)this.c).d(bl3);
            bl3 = (Boolean)object2;
            ((bwq)this.b).a(bl3);
            object = (bwv)this.a;
            ((bwv)object).ai.setChecked((Boolean)object2);
            ((bwv)object).ai.setTitle(((bwv)object).K((Boolean)object2));
            return true;
        }
        object = (Boolean)object2;
        boolean bl4 = (Boolean)object;
        ((bxf)this.c).d(bl4);
        bl4 = (Boolean)object;
        ((bwq)this.b).a(bl4);
        object2 = (AnalyticsPreferenceScreen)this.a;
        ((AnalyticsPreferenceScreen)object2).d.setChecked((Boolean)object);
        ((AnalyticsPreferenceScreen)object2).d.setTitle(((AnalyticsPreferenceScreen)object2).I((Boolean)object));
        return true;
    }
}

