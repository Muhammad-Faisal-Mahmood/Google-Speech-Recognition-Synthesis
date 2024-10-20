/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Message
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.content.Intent;
import android.os.Message;
import android.support.v7.widget.Toolbar;
import android.view.View;
import androidx.preference.Preference;
import com.android.car.ui.preference.CarUiFooterPreference;
import com.android.car.ui.preference.CarUiPreference;
import com.android.car.ui.preference.CarUiTwoActionIconPreference;
import com.android.car.ui.preference.CarUiTwoActionSwitchPreference;
import com.android.car.ui.preference.CarUiTwoActionTextPreference;
import com.google.android.apps.speech.tts.googletts.local.voicepack.ui.MultipleVoicesActivity;
import java.util.ArrayList;
import java.util.function.Supplier;

public final class gp
implements View.OnClickListener {
    final Object a;
    private final int b;

    public gp(Object object, int n2) {
        this.b = n2;
        this.a = object;
    }

    public /* synthetic */ gp(Object object, int n2, byte[] byArray) {
        this.b = n2;
        this.a = object;
    }

    public final void onClick(View object) {
        switch (this.b) {
            default: {
                Intent intent = new Intent(object.getContext(), MultipleVoicesActivity.class);
                bsa bsa2 = (bsa)this.a;
                intent.putExtra("locale", new String[]{bsa2.e(), bsa2.c()});
                object.getContext().startActivity(intent);
                return;
            }
            case 19: {
                int n2;
                object = (bnu)this.a;
                Object object2 = new ArrayList(object.c);
                ArrayList arrayList = new ArrayList(object.d);
                int n3 = object2.size();
                boolean bl2 = false;
                for (n2 = 0; n2 < n3; ++n2) {
                    bnl bnl2 = (bnl)object2.get(n2);
                    if (!bl2 && !bnl2.a()) {
                        bl2 = false;
                        continue;
                    }
                    bl2 = true;
                }
                n3 = arrayList.size();
                for (n2 = 0; n2 < n3; ++n2) {
                    object2 = ag$$ExternalSyntheticApiModelOutline1.m(arrayList.get(n2));
                    if (!bl2 && !((Boolean)ag$$ExternalSyntheticApiModelOutline1.m((Supplier)object2)).booleanValue()) {
                        bl2 = false;
                        continue;
                    }
                    bl2 = true;
                }
                if (!bl2 && (object = bnv.e(object.b)) != null) {
                    object.onBackPressed();
                }
                return;
            }
            case 18: {
                ((bna)((Object)this.a)).h.showSoftInput(object, 0);
                return;
            }
            case 17: {
                boolean bl3 = object.isFocused();
                object = this.a;
                if (bl3) {
                    bna bna2 = (bna)((Object)object);
                    bna2.k.requestFocus();
                    bna2.h.showSoftInput((View)bna2.k, 0);
                }
                ((bna)((Object)object)).k.getText().clear();
                return;
            }
            case 16: {
                ((bmn)this.a).b.a();
                return;
            }
            case 15: {
                int n4 = blh.q;
                object = this.a;
                if (object != null) {
                    ((eky)object).b();
                }
                return;
            }
            case 14: {
                int n5 = blh.q;
                object = this.a;
                if (object != null) {
                    ((eky)object).b();
                }
                return;
            }
            case 13: {
                int n6 = blh.q;
                object = this.a;
                if (object != null) {
                    ((eky)object).b();
                }
                return;
            }
            case 12: {
                ((CarUiTwoActionTextPreference)this.a).lambda$onBindViewHolder$0$com-android-car-ui-preference-CarUiTwoActionTextPreference((View)object);
                return;
            }
            case 11: {
                ((CarUiPreference)this.a).performClickUnrestricted((View)object);
                return;
            }
            case 10: {
                ((CarUiTwoActionSwitchPreference)this.a).lambda$onBindViewHolder$1$com-android-car-ui-preference-CarUiTwoActionSwitchPreference((View)object);
                return;
            }
            case 9: {
                ((CarUiTwoActionSwitchPreference)this.a).lambda$onBindViewHolder$0$com-android-car-ui-preference-CarUiTwoActionSwitchPreference((View)object);
                return;
            }
            case 8: {
                ((CarUiPreference)this.a).performClickUnrestricted((View)object);
                return;
            }
            case 7: {
                ((CarUiPreference)this.a).performClickUnrestricted((View)object);
                return;
            }
            case 6: {
                ((CarUiTwoActionIconPreference)this.a).lambda$onBindViewHolder$0$com-android-car-ui-preference-CarUiTwoActionIconPreference((View)object);
                return;
            }
            case 5: {
                ((CarUiPreference)this.a).performClickUnrestricted((View)object);
                return;
            }
            case 4: {
                ((CarUiFooterPreference)this.a).lambda$onBindViewHolder$0$com-android-car-ui-preference-CarUiFooterPreference((View)object);
                return;
            }
            case 3: {
                ((Preference)this.a).performClick((View)object);
                return;
            }
            case 2: {
                ((Toolbar)this.a).j();
                return;
            }
            case 1: {
                Message message;
                dl dl2 = (dl)this.a;
                object = object == dl2.i && (message = dl2.k) != null ? Message.obtain((Message)message) : (object == dl2.l && (message = dl2.n) != null ? Message.obtain((Message)message) : (object == dl2.o && (object = dl2.q) != null ? Message.obtain((Message)object) : null));
                if (object != null) {
                    object.sendToTarget();
                }
                object = (dl)this.a;
                object.H.obtainMessage(1, (Object)object.b).sendToTarget();
                return;
            }
            case 0: 
        }
        ((ew)this.a).f();
    }
}

