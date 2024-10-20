/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.TypedArray
 *  android.media.MediaCodec$CryptoInfo
 *  android.media.MediaCodec$CryptoInfo$Pattern
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.Editable$Factory
 *  android.text.TextWatcher
 *  android.util.AttributeSet
 *  android.view.Choreographer
 *  android.view.Choreographer$FrameCallback
 *  android.view.View
 *  android.widget.EditText
 *  android.widget.TextView
 */
import android.content.Context;
import android.content.res.TypedArray;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.wear.ambient.WearableControllerProvider;
import com.android.car.ui.FocusArea;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class bxt {
    public final Object a;
    public final Object b;

    public bxt() {
        this.b = Choreographer.getInstance();
        this.a = Looper.myLooper();
    }

    public bxt(int n2, int n3, int n4, int n5) {
        this.b = new bjo(n2, n3);
        this.a = new bjn(n4, n5);
    }

    public bxt(abb abb2) {
        jse.e(abb2, "lifecycle");
        this.a = abb2;
        this.b = new ArrayList();
    }

    public bxt(Context object) {
        this.b = object.getPackageName();
        String string = isi.a.b().a();
        object = new StringBuilder();
        for (int i2 = 0; i2 < string.length(); ++i2) {
            ((StringBuilder)object).append((char)(((string.charAt(i2) - i2 * i2 - 48) % 75 + 75) % 75 + 48));
        }
        this.a = ((StringBuilder)object).toString();
    }

    public bxt(MediaCodec.CryptoInfo cryptoInfo) {
        this.b = cryptoInfo;
        this.a = new MediaCodec.CryptoInfo.Pattern(0, 0);
    }

    public bxt(Handler handler, aiv aiv2) {
        if (aiv2 == null) {
            handler = null;
        }
        this.a = handler;
        this.b = aiv2;
    }

    public bxt(EditText editText) {
        this.a = editText;
        Object object = editText;
        object = new zu(editText);
        this.b = object;
        editText.addTextChangedListener((TextWatcher)object);
        object = zp.a();
        EditText editText2 = editText;
        editText.setEditableFactory((Editable.Factory)object);
    }

    public bxt(TextView textView) {
        this.b = textView;
        this.a = new bzb(textView);
    }

    public bxt(bcn bcn2, czh czh2) {
        jse.e(bcn2, "processor");
        jse.e(czh2, "workTaskExecutor");
        this.a = bcn2;
        this.b = czh2;
    }

    public bxt(bud object) {
        this.a = new HashSet();
        this.b = object;
        object = ((bud)object).d.iterator();
        while (object.hasNext()) {
            Locale locale = brz.g((String)object.next());
            this.a.add(locale);
        }
    }

    public bxt(hwr object) {
        Object object2;
        this.a = object;
        object = (ikd)((hwr)object).b;
        int n2 = ((ikd)object).b;
        int n3 = 0;
        int n4 = 0;
        if ((n2 & 1) != 0) {
            object = object2 = ((ikd)object).c;
            if (object2 == null) {
                object = iiu.a;
            }
            object2 = ((iiu)object).c.iterator();
            while (true) {
                n3 = n4;
                if (!object2.hasNext()) break;
                object = (iit)object2.next();
                if (((iit)object).b != 2) continue;
                n4 += ((iix)((iit)object).c).c.size();
            }
        }
        object2 = new bzx[Math.max(n3, 1)];
        this.b = object2;
        object = bzx.a;
        Arrays.fill((Object[])object2, object);
    }

    public bxt(Object object, Object object2) {
        this.a = object;
        this.b = object2;
    }

    public bxt(Object object, Object object2, byte[] byArray) {
        this.b = object;
        this.a = object2;
    }

    public bxt(String string, String string2) {
        jse.e(string, "tag");
        jse.e(string2, "workSpecId");
        this.a = string;
        this.b = string2;
    }

    public bxt(String string, String string2, byte[] byArray) {
        jse.e(string, "name");
        jse.e(string2, "workSpecId");
        this.a = string;
        this.b = string2;
    }

    public bxt(String string, String string2, char[] cArray) {
        jse.e(string, "workSpecId");
        jse.e(string2, "prerequisiteId");
        this.b = string;
        this.a = string2;
    }

    public bxt(nl nl2, nu nu2) {
        jse.e(nl2, "callback");
        jse.e(nu2, "contract");
        this.a = nl2;
        this.b = nu2;
    }

    public bxt(byte[] byArray) {
        this.a = new pa();
        this.b = new ox();
    }

    public static final int e() {
        bvv bvv2 = isy.b();
        if ((bvv2.b & 1) != 0) {
            return bvv2.e;
        }
        return -1;
    }

    public final void A(bzb object, int n2) {
        jse.e(object, "workSpecId");
        object = new bij((bcn)this.a, (bzb)object, false, n2);
        ((czh)this.b).a((Runnable)object);
    }

    public final bzx a(int n2) {
        return ((bzx[])this.b)[n2];
    }

    public final buc b(brx brx2) {
        for (buc buc2 : ((bud)this.b).c) {
            Iterator iterator = buc2.d.iterator();
            while (iterator.hasNext()) {
                if (!brx2.equals(brz.a((String)iterator.next()))) continue;
                return buc2;
            }
        }
        return null;
    }

    public final List c() {
        bvv bvv2 = isy.b();
        if (bvv2.c == 2) {
            return ((bvu)bvv2.d).c;
        }
        return ((bud)this.b).f;
    }

    public final List d() {
        return ((bud)this.b).e;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final bso f(String object, String string, String object2, String string2, int n2, List list, boolean bl2, String string3) {
        block7: {
            if (object != null && !((String)object).isEmpty()) {
                Bundle bundle = new Bundle();
                bundle.putString("com.google.android.tts:Mode", string2);
                if (bl2) {
                    bundle.putString("com.google.android.tts:UseGoogleOnlyVoice", "hol");
                }
                string = (object2 = brz.e((String)object)) != null ? ((Locale)object2).getLanguage() : "";
                object2 = object2 != null ? ((Locale)object2).getCountry() : "";
                object = new brv("", string, (String)object2, (String)object, 100, 100, -1, list, bundle, 1.0f, bzt.a((Context)this.b), string3);
            } else {
                object = fxf.O(string);
                string = fxf.O((String)object2);
                object2 = new Bundle();
                object2.putString("com.google.android.tts:Mode", string2);
                if (bl2) {
                    object2.putString("com.google.android.tts:UseGoogleOnlyVoice", "hol");
                }
                object = new brv("", (String)object, string, null, 100, 100, -1, list, (Bundle)object2, 1.0f, bzt.a((Context)this.b), string3);
            }
            try {
                object = ((bse)this.a).b((brv)object, n2);
                if (object == null) break block7;
            }
            catch (bsp bsp2) {
                return null;
            }
            return (bso)((ddl)object).a;
        }
        return null;
    }

    public final bso g(String string, String string2, String string3, List list, boolean bl2, String string4) {
        return this.f(null, string, string2, string3, 0, list, bl2, string4);
    }

    public final bso h(String string, String string2, String string3, List list, String string4) {
        return this.f(string, string2, string3, "LocalFirst", 0, list, true, string4);
    }

    public final void i() {
        ((bjn)this.a).clear();
    }

    public final void j(View view, long l2) {
        ((bjo)this.b).b(view, l2);
    }

    public final FocusArea k(int n2, long l2) {
        bjn bjn2 = (bjn)this.a;
        elq elq2 = (elq)bjn2.get(n2);
        if (elq2 != null && !((n2 = bjn2.a) == 2 ? l2 - elq2.a >= (long)bjn2.b : n2 != 3)) {
            return (FocusArea)((Object)((WeakReference)elq2.b).get());
        }
        return null;
    }

    public final bzb l() {
        return new bzb(((bud)this.b).c);
    }

    public final void m(aie object) {
        ((aie)object).a();
        Object object2 = this.a;
        if (object2 != null) {
            object = new aks((Object)this, object, 0, null);
            ((Handler)object2).post((Runnable)object);
        }
    }

    public final void n(Runnable object) {
        object = new yw((Runnable)object);
        ((Choreographer)this.b).postFrameCallback((Choreographer.FrameCallback)object);
    }

    public final void o(lg lg2) {
        Object object = (mh)((pa)this.a).get(lg2);
        mh mh2 = object;
        if (object == null) {
            object = this.a;
            mh2 = mh.a();
            ((pa)object).put(lg2, mh2);
        }
        mh2.a |= 1;
    }

    public final void p(long l2, lg lg2) {
        ((ox)this.b).f(l2, lg2);
    }

    public final void q() {
        ((pa)this.a).clear();
        ((ox)this.b).e();
    }

    public final void r(lg object) {
        if ((object = (mh)((pa)this.a).get(object)) == null) {
            return;
        }
        ((mh)object).a &= 0xFFFFFFFE;
    }

    public final void s(lg object) {
        int n2;
        int n3 = ((ox)this.b).a();
        while ((n2 = n3 - 1) >= 0) {
            n3 = n2;
            if (object != ((ox)this.b).d(n2)) continue;
            ox ox2 = (ox)this.b;
            Object[] objectArray = ox2.c;
            Object object2 = objectArray[n2];
            Object object3 = oy.a;
            if (object2 == object3) break;
            objectArray[n2] = object3;
            ox2.a = true;
            break;
        }
        if ((object = (mh)((pa)this.a).remove(object)) != null) {
            mh.b((mh)object);
        }
    }

    public final boolean t(lg object) {
        return (object = (mh)((pa)this.a).get(object)) != null && (((mh)object).a & 1) != 0;
    }

    public final void u(AttributeSet object, int n2) {
        boolean bl2;
        TypedArray typedArray;
        block4: {
            typedArray = ((TextView)this.b).getContext().obtainStyledAttributes(object, er.i, n2, 0);
            boolean bl3 = typedArray.hasValue(14);
            bl2 = true;
            if (!bl3) break block4;
            bl2 = typedArray.getBoolean(14, true);
        }
        object = this.a;
        zt.g();
        ((zt)((bzb)object).a).a.a = bl2;
        return;
        finally {
            typedArray.recycle();
        }
    }

    public final bvl v(lg object, int n2) {
        block5: {
            block8: {
                int n3;
                mh mh2;
                int n4;
                block7: {
                    block6: {
                        n4 = ((pa)this.a).c(object);
                        if (n4 < 0) {
                            return null;
                        }
                        mh2 = (mh)((pa)this.a).g(n4);
                        if (mh2 == null || ((n3 = mh2.a) & n2) == 0) break block5;
                        mh2.a = n3 = ~n2 & n3;
                        if (n2 != 4) break block6;
                        object = mh2.c;
                        break block7;
                    }
                    if (n2 != 8) break block8;
                    object = mh2.d;
                }
                if ((n3 & 0xC) == 0) {
                    ((pa)this.a).e(n4);
                    mh.b(mh2);
                }
                return object;
            }
            throw new IllegalArgumentException("Must provide flag PRE or POST");
        }
        return null;
    }

    public final void w(lg lg2, bvl bvl2) {
        Object object = (mh)((pa)this.a).get(lg2);
        mh mh2 = object;
        if (object == null) {
            object = this.a;
            mh2 = mh.a();
            ((pa)object).put(lg2, mh2);
        }
        mh2.d = bvl2;
        mh2.a |= 8;
    }

    public final void x(lg lg2, bvl bvl2) {
        Object object = (mh)((pa)this.a).get(lg2);
        mh mh2 = object;
        if (object == null) {
            object = this.a;
            mh2 = mh.a();
            ((pa)object).put(lg2, mh2);
        }
        mh2.c = bvl2;
        mh2.a |= 4;
    }

    public final /* synthetic */ void y(bzb bzb2) {
        this.z(bzb2, null);
    }

    public final void z(bzb object, WearableControllerProvider wearableControllerProvider) {
        object = new ai((Object)this, object, (Object)wearableControllerProvider, 7, null);
        ((czh)this.b).a((Runnable)object);
    }
}

