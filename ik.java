/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.RectF
 *  android.os.Build$VERSION
 *  android.text.Layout$Alignment
 *  android.text.StaticLayout$Builder
 *  android.text.TextPaint
 *  android.util.DisplayMetrics
 *  android.util.Log
 *  android.util.TypedValue
 *  android.view.View
 *  android.widget.TextView
 */
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

final class ik {
    private static final RectF j = new RectF();
    private static final ConcurrentHashMap k = new ConcurrentHashMap();
    public int a = 0;
    public boolean b = false;
    public float c = -1.0f;
    public float d = -1.0f;
    public float e = -1.0f;
    public int[] f = new int[0];
    public boolean g = false;
    public final TextView h;
    public final Context i;
    private TextPaint l;
    private final kh m;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public ik(TextView object) {
        void var1_3;
        this.h = object;
        this.i = object.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            ij ij2 = new ij();
        } else {
            ii ii2 = new ii();
        }
        this.m = var1_3;
    }

    static Object d(Object object, String string, Object object2) {
        try {
            object2 = object = ik.m(string).invoke(object, null);
            if (object == null) {
                return null;
            }
        }
        catch (Throwable throwable) {
            throw throwable;
        }
        catch (Exception exception) {
            Log.w((String)"ACTVAutoSizeHelper", (String)a.aj(string, "Failed to invoke TextView#", "() method"), (Throwable)exception);
        }
        return object2;
    }

    public static final int[] l(int[] nArray) {
        int n2;
        int n3 = nArray.length;
        if (n3 == 0) {
            return nArray;
        }
        Arrays.sort(nArray);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int n4 = 0;
        for (n2 = 0; n2 < n3; ++n2) {
            Integer n5;
            int n6 = nArray[n2];
            if (n6 <= 0 || Collections.binarySearch(arrayList, n5 = Integer.valueOf(n6)) >= 0) continue;
            arrayList.add(n5);
        }
        if (n3 == arrayList.size()) {
            return nArray;
        }
        n3 = arrayList.size();
        nArray = new int[n3];
        for (n2 = n4; n2 < n3; ++n2) {
            nArray[n2] = (Integer)arrayList.get(n2);
        }
        return nArray;
    }

    private static Method m(String string) {
        Method method;
        block4: {
            Method method2;
            ConcurrentHashMap concurrentHashMap;
            try {
                concurrentHashMap = k;
                method = method2 = (Method)concurrentHashMap.get(string);
                if (method2 != null) break block4;
            }
            catch (Exception exception) {
                Log.w((String)"ACTVAutoSizeHelper", (String)a.aj(string, "Failed to retrieve TextView#", "() method"), (Throwable)exception);
                return null;
            }
            method = method2 = TextView.class.getDeclaredMethod(string, null);
            if (method2 == null) break block4;
            method2.setAccessible(true);
            concurrentHashMap.put(string, method2);
            method = method2;
        }
        return method;
    }

    final int a() {
        return Math.round(this.e);
    }

    final int b() {
        return Math.round(this.d);
    }

    final int c() {
        return Math.round(this.c);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    final void e() {
        if (!this.h()) {
            return;
        }
        if (this.b) {
            Object object;
            int n2;
            if (this.h.getMeasuredHeight() <= 0) return;
            if (this.h.getMeasuredWidth() <= 0) return;
            if (this.m.b(this.h)) {
                n2 = 0x100000;
            } else {
                object = this.h;
                n2 = object.getMeasuredWidth() - object.getTotalPaddingLeft() - this.h.getTotalPaddingRight();
            }
            object = this.h;
            int n3 = object.getHeight() - object.getCompoundPaddingBottom() - this.h.getCompoundPaddingTop();
            if (n2 <= 0) return;
            if (n3 <= 0) return;
            RectF rectF = j;
            synchronized (rectF) {
                rectF.setEmpty();
                rectF.right = n2;
                rectF.bottom = n3;
                n2 = this.f.length;
                if (n2 == 0) {
                    object = new IllegalStateException("No available text sizes to choose from.");
                    throw object;
                }
                int n4 = n2 - 1;
                n2 = 1;
                n3 = 0;
                while (n2 <= n4) {
                    int n5 = (n2 + n4) / 2;
                    n3 = this.f[n5];
                    CharSequence charSequence = this.h.getText();
                    Object object2 = this.h.getTransformationMethod();
                    object = charSequence;
                    if (object2 != null) {
                        object2 = object2.getTransformation(charSequence, (View)this.h);
                        object = charSequence;
                        if (object2 != null) {
                            object = object2;
                        }
                    }
                    int n6 = this.h.getMaxLines();
                    charSequence = this.l;
                    if (charSequence == null) {
                        charSequence = new TextPaint();
                        this.l = charSequence;
                    } else {
                        charSequence.reset();
                    }
                    this.l.set(this.h.getPaint());
                    this.l.setTextSize((float)n3);
                    Layout.Alignment alignment = (Layout.Alignment)ik.d(this.h, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
                    n3 = Math.round(rectF.right);
                    charSequence = this.h;
                    TextPaint textPaint = this.l;
                    object2 = this.m;
                    textPaint = StaticLayout.Builder.obtain((CharSequence)object, (int)0, (int)object.length(), (TextPaint)textPaint, (int)n3);
                    alignment = textPaint.setAlignment(alignment).setLineSpacing(charSequence.getLineSpacingExtra(), charSequence.getLineSpacingMultiplier()).setIncludePad(charSequence.getIncludeFontPadding()).setBreakStrategy(charSequence.getBreakStrategy()).setHyphenationFrequency(charSequence.getHyphenationFrequency());
                    n3 = n6 == -1 ? Integer.MAX_VALUE : n6;
                    alignment.setMaxLines(n3);
                    try {
                        ((kh)object2).a((StaticLayout.Builder)textPaint, (TextView)charSequence);
                    }
                    catch (ClassCastException classCastException) {
                        Log.w((String)"ACTVAutoSizeHelper", (String)"Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
                    }
                    charSequence = textPaint.build();
                    if ((n6 == -1 || charSequence.getLineCount() <= n6 && charSequence.getLineEnd(charSequence.getLineCount() - 1) == object.length()) && !((float)charSequence.getHeight() > rectF.bottom)) {
                        n3 = n2;
                        n2 = n5 + 1;
                        continue;
                    }
                    n4 = n3 = n5 - 1;
                }
                float f2 = this.f[n3];
                if (f2 != this.h.getTextSize()) {
                    this.f(0, f2);
                }
            }
        }
        this.b = true;
    }

    final void f(int n2, float f2) {
        Object object = this.i;
        object = object == null ? Resources.getSystem() : object.getResources();
        if ((f2 = TypedValue.applyDimension((int)n2, (float)f2, (DisplayMetrics)object.getDisplayMetrics())) != this.h.getPaint().getTextSize()) {
            this.h.getPaint().setTextSize(f2);
            object = this.h;
            boolean bl2 = object.isInLayout();
            if (object.getLayout() != null) {
                block7: {
                    this.b = false;
                    object = ik.m("nullLayouts");
                    if (object == null) break block7;
                    try {
                        ((Method)object).invoke((Object)this.h, null);
                    }
                    catch (Exception exception) {
                        Log.w((String)"ACTVAutoSizeHelper", (String)"Failed to invoke TextView#nullLayouts() method", (Throwable)exception);
                    }
                }
                if (!bl2) {
                    this.h.requestLayout();
                } else {
                    this.h.forceLayout();
                }
                this.h.invalidate();
            }
        }
    }

    public final void g(float f2, float f3, float f4) {
        if (!(f2 <= 0.0f)) {
            if (!(f3 <= f2)) {
                if (!(f4 <= 0.0f)) {
                    this.a = 1;
                    this.d = f2;
                    this.e = f3;
                    this.c = f4;
                    this.g = false;
                    return;
                }
                StringBuilder stringBuilder = new StringBuilder("The auto-size step granularity (");
                stringBuilder.append(f4);
                stringBuilder.append("px) is less or equal to (0px)");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            StringBuilder stringBuilder = new StringBuilder("Maximum auto-size text size (");
            stringBuilder.append(f3);
            stringBuilder.append("px) is less or equal to minimum auto-size text size (");
            stringBuilder.append(f2);
            stringBuilder.append("px)");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        StringBuilder stringBuilder = new StringBuilder("Minimum auto-size text size (");
        stringBuilder.append(f2);
        stringBuilder.append("px) is less or equal to (0px)");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    final boolean h() {
        return this.k() && this.a != 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean i() {
        boolean bl2 = this.k();
        boolean bl3 = false;
        boolean bl4 = bl3;
        if (bl2) {
            bl4 = bl3;
            if (this.a == 1) {
                if (!this.g || this.f.length == 0) {
                    int n2 = (int)Math.floor((this.e - this.d) / this.c) + 1;
                    int[] nArray = new int[n2];
                    for (int i2 = 0; i2 < n2; ++i2) {
                        float f2 = this.d;
                        float f3 = this.c;
                        nArray[i2] = Math.round(f2 + (float)i2 * f3);
                    }
                    this.f = ik.l(nArray);
                }
                bl4 = true;
            }
        }
        this.b = bl4;
        return bl4;
    }

    public final boolean j() {
        int[] nArray = this.f;
        int n2 = nArray.length;
        boolean bl2 = n2 > 0;
        this.g = bl2;
        if (bl2) {
            this.a = 1;
            this.d = nArray[0];
            this.e = nArray[n2 - 1];
            this.c = -1.0f;
        }
        return bl2;
    }

    public final boolean k() {
        return !(this.h instanceof hk);
    }
}

