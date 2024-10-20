/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.SpannableString
 *  android.text.style.TtsSpan$TextBuilder
 *  android.view.accessibility.AccessibilityManager
 */
import android.text.SpannableString;
import android.text.style.TtsSpan;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.speech.tts.googletts.local.voicepack.ui.MultipleVoicesActivity;
import java.util.List;

public final class but
extends kf {
    private static final String[] d = new String[]{"C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
    private static final int[] e = new int[]{100, 90, 50, 40, 10, 9, 5, 4, 1};
    public final MultipleVoicesActivity a;
    public int b;
    public final bxf c;
    private final AccessibilityManager f;
    private List g;

    public but(MultipleVoicesActivity multipleVoicesActivity, int n2) {
        this.a = multipleVoicesActivity;
        this.b = n2;
        this.f = (AccessibilityManager)multipleVoicesActivity.getSystemService("accessibility");
        this.c = ((bur)fvd.l(multipleVoicesActivity.getApplicationContext(), bur.class)).B();
    }

    private final CharSequence b(bvj object) {
        Object object2;
        int n2 = ((bvj)object).d;
        String string = this.a.getString(2132017507, new Object[]{String.valueOf(n2)});
        n2 = ((bvj)object).d;
        if (n2 > 0 && n2 <= 399) {
            object = "";
            int n3 = 0;
            while (true) {
                object2 = object;
                if (n2 > 0) {
                    int n4 = e[n3];
                    if (n2 >= n4) {
                        object = ((String)object).concat(String.valueOf(d[n3]));
                        n2 -= n4;
                        continue;
                    }
                    ++n3;
                    continue;
                }
                break;
            }
        } else {
            object2 = a.ah(n2, "(", ")");
        }
        object = new SpannableString((CharSequence)this.a.getString(2132017507, new Object[]{object2}));
        object.setSpan((Object)new TtsSpan.TextBuilder(string).build(), 0, object.length(), 0);
        return object;
    }

    public final void a(List list) {
        this.g = list;
        this.notifyDataSetChanged();
    }

    @Override
    public final int getItemCount() {
        List list = this.g;
        if (list != null) {
            return list.size();
        }
        return 0;
    }
}

