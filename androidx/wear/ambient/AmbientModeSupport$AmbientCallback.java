/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.graphics.Rect
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 */
package androidx.wear.ambient;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.android.car.ui.FocusArea;
import com.android.car.ui.FocusParkingView;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class AmbientModeSupport$AmbientCallback {
    public AmbientModeSupport$AmbientCallback() {
    }

    public AmbientModeSupport$AmbientCallback(byte[] byArray) {
    }

    /*
     * WARNING - combined exceptions agressively - possible behaviour change.
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] a(bas object) {
        void var0_37;
        Object object2;
        jse.e(object, "data");
        Class clazz = new Class();
        DataOutputStream dataOutputStream = new DataOutputStream((OutputStream)((Object)clazz));
        try {
            dataOutputStream.writeShort(-21521);
            dataOutputStream.writeShort(1);
            dataOutputStream.writeInt(((bas)object).b.size());
            Iterator iterator = ((bas)object).b.entrySet().iterator();
            while (true) {
                String string;
                block55: {
                    int n2;
                    int n3;
                    Object[] objectArray;
                    boolean bl2;
                    block52: {
                        block53: {
                            Object v2;
                            block61: {
                                block60: {
                                    block59: {
                                        block58: {
                                            block57: {
                                                block56: {
                                                    block54: {
                                                        if (!iterator.hasNext()) break block53;
                                                        Map.Entry entry = iterator.next();
                                                        string = (String)entry.getKey();
                                                        v2 = entry.getValue();
                                                        if (v2 != null) break block54;
                                                        dataOutputStream.writeByte(0);
                                                        break block55;
                                                    }
                                                    if (!(v2 instanceof Boolean)) break block56;
                                                    dataOutputStream.writeByte(1);
                                                    dataOutputStream.writeBoolean((Boolean)v2);
                                                    break block55;
                                                }
                                                if (!(v2 instanceof Byte)) break block57;
                                                dataOutputStream.writeByte(2);
                                                dataOutputStream.writeByte(((Number)v2).byteValue());
                                                break block55;
                                            }
                                            if (!(v2 instanceof Integer)) break block58;
                                            dataOutputStream.writeByte(3);
                                            dataOutputStream.writeInt(((Number)v2).intValue());
                                            break block55;
                                        }
                                        if (!(v2 instanceof Long)) break block59;
                                        dataOutputStream.writeByte(4);
                                        dataOutputStream.writeLong(((Number)v2).longValue());
                                        break block55;
                                    }
                                    if (!(v2 instanceof Float)) break block60;
                                    dataOutputStream.writeByte(5);
                                    dataOutputStream.writeFloat(((Number)v2).floatValue());
                                    break block55;
                                }
                                if (!(v2 instanceof Double)) break block61;
                                dataOutputStream.writeByte(6);
                                dataOutputStream.writeDouble(((Number)v2).doubleValue());
                                break block55;
                            }
                            if (v2 instanceof String) {
                                dataOutputStream.writeByte(7);
                                dataOutputStream.writeUTF((String)v2);
                                break block55;
                            } else {
                                bl2 = v2 instanceof Object[];
                                if (bl2) {
                                    objectArray = (Object[])v2;
                                    object2 = objectArray.getClass();
                                    n3 = jsk.a;
                                    jrz jrz2 = new jrz((Class)object2);
                                    object2 = new jrz(Boolean[].class);
                                    if (jse.i(jrz2, object2)) {
                                        n3 = 8;
                                    } else {
                                        object2 = new jrz(Byte[].class);
                                        if (jse.i(jrz2, object2)) {
                                            n3 = 9;
                                        } else {
                                            object2 = new jrz(Integer[].class);
                                            if (jse.i(jrz2, object2)) {
                                                n3 = 10;
                                            } else {
                                                object2 = new jrz(Long[].class);
                                                if (jse.i(jrz2, object2)) {
                                                    n3 = 11;
                                                } else {
                                                    object2 = new jrz(Float[].class);
                                                    if (jse.i(jrz2, object2)) {
                                                        n3 = 12;
                                                    } else {
                                                        object2 = new jrz(Double[].class);
                                                        if (jse.i(jrz2, object2)) {
                                                            n3 = 13;
                                                        } else {
                                                            object2 = new jrz(String[].class);
                                                            if (!jse.i(jrz2, object2)) {
                                                                clazz = objectArray.getClass();
                                                                object2 = new jrz(clazz);
                                                                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Unsupported value type ".concat(String.valueOf(object2.b())));
                                                                throw illegalArgumentException;
                                                            }
                                                            n3 = 14;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    dataOutputStream.writeByte(n3);
                                    n2 = objectArray.length;
                                    dataOutputStream.writeInt(n2);
                                    break block52;
                                } else {
                                    clazz = v2.getClass();
                                    n3 = jsk.a;
                                    jrz jrz3 = new jrz(clazz);
                                    object2 = new IllegalArgumentException("Unsupported value type ".concat(String.valueOf(jrz3.c())));
                                    throw object2;
                                }
                            }
                        }
                        dataOutputStream.flush();
                        if (dataOutputStream.size() <= 10240) {
                            byte[] byArray = ((ByteArrayOutputStream)((Object)clazz)).toByteArray();
                            jsd.f(dataOutputStream, null);
                            jse.d(byArray, "{\n                ByteAr\u2026          }\n            }");
                            return var0_37;
                        }
                        IllegalStateException illegalStateException = new IllegalStateException("Data cannot occupy more than 10240 bytes when serialized");
                        throw illegalStateException;
                    }
                    for (int i2 = 0; i2 < n2; ++i2) {
                        void var0_27;
                        int n4;
                        Object object3 = objectArray[i2];
                        if (n3 == 8) {
                            void var0_9;
                            if (object3 instanceof Boolean) {
                                Boolean bl3 = (Boolean)object3;
                            } else {
                                Object var0_8 = null;
                            }
                            bl2 = var0_9 != null ? var0_9.booleanValue() : false;
                            dataOutputStream.writeBoolean(bl2);
                            continue;
                        }
                        if (n3 == 9) {
                            void var0_12;
                            if (object3 instanceof Byte) {
                                Byte by2 = (Byte)object3;
                            } else {
                                Object var0_11 = null;
                            }
                            n4 = var0_12 != null ? var0_12.byteValue() : 0;
                            dataOutputStream.writeByte(n4);
                            continue;
                        }
                        if (n3 == 10) {
                            void var0_15;
                            if (object3 instanceof Integer) {
                                Integer n5 = (Integer)object3;
                            } else {
                                Object var0_14 = null;
                            }
                            n4 = var0_15 != null ? var0_15.intValue() : 0;
                            dataOutputStream.writeInt(n4);
                            continue;
                        }
                        if (n3 == 11) {
                            void var0_18;
                            if (object3 instanceof Long) {
                                Long l2 = (Long)object3;
                            } else {
                                Object var0_17 = null;
                            }
                            long l3 = var0_18 != null ? var0_18.longValue() : 0L;
                            dataOutputStream.writeLong(l3);
                            continue;
                        }
                        if (n3 == 12) {
                            void var0_21;
                            if (object3 instanceof Float) {
                                Float f2 = (Float)object3;
                            } else {
                                Object var0_20 = null;
                            }
                            float f3 = var0_21 != null ? var0_21.floatValue() : 0.0f;
                            dataOutputStream.writeFloat(f3);
                            continue;
                        }
                        if (n3 == 13) {
                            void var0_24;
                            if (object3 instanceof Double) {
                                Double d2 = (Double)object3;
                            } else {
                                Object var0_23 = null;
                            }
                            double d3 = var0_24 != null ? var0_24.doubleValue() : 0.0;
                            dataOutputStream.writeDouble(d3);
                            continue;
                        }
                        if (object3 instanceof String) {
                            String string2 = (String)object3;
                        } else {
                            Object var0_26 = null;
                        }
                        object2 = var0_27;
                        if (var0_27 == null) {
                            object2 = "androidx.work.Data-95ed6082-b8e9-46e8-a73f-ff56f00f5d9d";
                        }
                        dataOutputStream.writeUTF((String)object2);
                    }
                }
                dataOutputStream.writeUTF(string);
            }
        }
        catch (Throwable throwable) {
            try {
                throw throwable;
            }
            catch (Throwable throwable2) {
                try {
                    jsd.f(dataOutputStream, throwable);
                    throw throwable2;
                }
                catch (IOException iOException) {
                    object2 = bat.a;
                    bbi.a().d((String)object2, "Error in Data#toByteArray: ", iOException);
                    byte[] byArray = new byte[]{};
                }
            }
        }
        return var0_37;
    }

    public static /* synthetic */ int b(long l2) {
        return (int)(l2 ^ l2 >>> 32);
    }

    public static int c(View view) {
        if (view != null && !(view instanceof FocusParkingView) && view.isShown()) {
            if (!ag$$ExternalSyntheticApiModelOutline0.m(view)) {
                ViewGroup viewGroup;
                FocusArea focusArea = AmbientModeSupport$AmbientCallback.t(view);
                if (focusArea != null && view == focusArea.a()) {
                    return 6;
                }
                focusArea = view.getParent();
                while (true) {
                    ViewGroup viewGroup2;
                    viewGroup = viewGroup2 = null;
                    if (focusArea == null) break;
                    viewGroup = viewGroup2;
                    if (!(focusArea instanceof ViewGroup) || AmbientModeSupport$AmbientCallback.p((View)(viewGroup = (ViewGroup)focusArea))) break;
                    focusArea = focusArea.getParent();
                }
                if (viewGroup == null || AmbientModeSupport$AmbientCallback.g(viewGroup) != view && AmbientModeSupport$AmbientCallback.f((View)viewGroup) != view) {
                    if (view.isSelected()) {
                        return 4;
                    }
                    if (AmbientModeSupport$AmbientCallback.q(view)) {
                        return 2;
                    }
                    return 3;
                }
                return 5;
            }
            return 7;
        }
        return 1;
    }

    public static Activity d(Context context) {
        while (context instanceof ContextWrapper && !(context instanceof Activity)) {
            context = ((ContextWrapper)context).getBaseContext();
        }
        if (context instanceof Activity) {
            return (Activity)context;
        }
        return null;
    }

    public static Rect e(View view) {
        int[] nArray = new int[2];
        view.getLocationOnScreen(nArray);
        int n2 = nArray[0];
        return new Rect(n2, nArray[1], view.getWidth() + n2, nArray[1] + view.getHeight());
    }

    static View f(View view) {
        return AmbientModeSupport$AmbientCallback.v(view, new bod(view, 0), new boa(8));
    }

    static View g(View view) {
        return AmbientModeSupport$AmbientCallback.v(view, new bod(view, 2), new boa(9));
    }

    public static View h(View view) {
        if ((view = AmbientModeSupport$AmbientCallback.v(view, new boa(0), new boa(5))) == null) {
            return null;
        }
        View view2 = AmbientModeSupport$AmbientCallback.g(view);
        if (view2 != null) {
            return view2;
        }
        return AmbientModeSupport$AmbientCallback.f(view);
    }

    public static void i(boe boe2, ViewTreeObserver.OnGlobalLayoutListener[] onGlobalLayoutListenerArray, Runnable[] runnableArray, Runnable[] runnableArray2) {
        boe2.removeOnLayoutCompleteListener(runnableArray[0]);
        if (!(boe2 instanceof View)) {
            return;
        }
        boe2 = (View)boe2;
        boe2.removeCallbacks(runnableArray2[0]);
        boe2.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListenerArray[0]);
    }

    public static boolean j(View view, int n2, View view2, boolean bl2) {
        return AmbientModeSupport$AmbientCallback.k(view, n2, view2, bl2, true);
    }

    public static boolean k(View view, int n2, View runnableArray, boolean bl2, boolean bl3) {
        Object object;
        if (!bl2 && AmbientModeSupport$AmbientCallback.r((View)runnableArray)) {
            return true;
        }
        if (n2 < 7 && AmbientModeSupport$AmbientCallback.r(AmbientModeSupport$AmbientCallback.v(view, new bod(view, 3), new boa(10)))) {
            return true;
        }
        if (n2 < 6 && AmbientModeSupport$AmbientCallback.r(AmbientModeSupport$AmbientCallback.w(view))) {
            return true;
        }
        if (n2 < 5 && AmbientModeSupport$AmbientCallback.r(AmbientModeSupport$AmbientCallback.h(view))) {
            return true;
        }
        if (n2 < 4 && AmbientModeSupport$AmbientCallback.r(AmbientModeSupport$AmbientCallback.g(view))) {
            return true;
        }
        if (bl3 && n2 < 5 && (object = (boe)AmbientModeSupport$AmbientCallback.v(view, new boa(3), new boa(4))) != null && !object.isLayoutCompleted()) {
            if (object instanceof View) {
                view = (View)object;
                Runnable[] runnableArray2 = new Runnable[1];
                runnableArray = new Runnable[1];
                ViewTreeObserver.OnGlobalLayoutListener[] onGlobalLayoutListenerArray = new ViewTreeObserver.OnGlobalLayoutListener[1];
                if (!object.isLayoutCompleted()) {
                    object.toString();
                    ww ww2 = new ww((boe)object, onGlobalLayoutListenerArray, runnableArray2, runnableArray, 7);
                    runnableArray2[0] = ww2;
                    object.addOnLayoutCompleteListener(ww2);
                }
                if (!view.isShown() || AmbientModeSupport$AmbientCallback.h(view) == null) {
                    if (!view.isShown()) {
                        object.toString();
                    } else {
                        object.toString();
                    }
                    onGlobalLayoutListenerArray[0] = new bob(view, (boe)object, onGlobalLayoutListenerArray, runnableArray2, runnableArray);
                    view.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListenerArray[0]);
                }
                runnableArray[0] = object = new boc((boe)object, onGlobalLayoutListenerArray, runnableArray2, runnableArray, view);
                view.postDelayed((Runnable)object, 3000L);
            }
            return false;
        }
        if (bl2 && AmbientModeSupport$AmbientCallback.r((View)runnableArray)) {
            return true;
        }
        if (n2 < 3 && AmbientModeSupport$AmbientCallback.v(view, new bod(view, 1), new boa(2)) != null) {
            return true;
        }
        if (n2 < 2) {
            return AmbientModeSupport$AmbientCallback.r(AmbientModeSupport$AmbientCallback.v(view, new boa(6), new boa(7)));
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean l(View view) {
        boolean bl2 = view.isFocusable();
        boolean bl3 = false;
        if (!bl2) {
            bl2 = bl3;
            if (!TextUtils.equals((CharSequence)view.getContentDescription(), (CharSequence)"com.android.car.ui.utils.FOCUS_DELEGATING_CONTAINER")) return bl2;
        }
        bl2 = bl3;
        if (!view.isEnabled()) return bl2;
        bl2 = bl3;
        if (!view.isShown()) return bl2;
        bl2 = bl3;
        if (view.getWidth() <= 0) return bl2;
        bl2 = bl3;
        if (view.getHeight() <= 0) return bl2;
        bl2 = bl3;
        if (!view.isAttachedToWindow()) return bl2;
        bl2 = bl3;
        if (view instanceof FocusParkingView) return bl2;
        if (!AmbientModeSupport$AmbientCallback.q(view)) return true;
        if (AmbientModeSupport$AmbientCallback.f(view) == null) return true;
        return bl3;
    }

    public static boolean m(View view) {
        return (view = view.getRootView().findFocus()) != null && !(view instanceof FocusParkingView);
    }

    public static boolean n(boe boe2) {
        if (!(boe2 instanceof View)) {
            return false;
        }
        if (AmbientModeSupport$AmbientCallback.m((View)(boe2 = (View)boe2))) {
            return true;
        }
        return AmbientModeSupport$AmbientCallback.k((View)boe2, AmbientModeSupport$AmbientCallback.c(null), null, false, false);
    }

    public static boolean o(View view) {
        return (view = AmbientModeSupport$AmbientCallback.d(view.getContext())) != null && ag$$ExternalSyntheticApiModelOutline1.m((Activity)view);
    }

    public static boolean p(View object) {
        return TextUtils.equals((CharSequence)(object = object.getContentDescription()), (CharSequence)"com.android.car.ui.utils.ROTARY_CONTAINER") || TextUtils.equals((CharSequence)object, (CharSequence)"com.android.car.ui.utils.VERTICALLY_SCROLLABLE") || TextUtils.equals((CharSequence)object, (CharSequence)"com.android.car.ui.utils.HORIZONTALLY_SCROLLABLE");
        {
        }
    }

    public static boolean q(View object) {
        return TextUtils.equals((CharSequence)(object = object.getContentDescription()), (CharSequence)"com.android.car.ui.utils.VERTICALLY_SCROLLABLE") || TextUtils.equals((CharSequence)object, (CharSequence)"com.android.car.ui.utils.HORIZONTALLY_SCROLLABLE");
        {
        }
    }

    public static boolean r(View view) {
        if (view != null && AmbientModeSupport$AmbientCallback.l(view)) {
            if (view.isFocused()) {
                return true;
            }
            return view.performAccessibilityAction(1, null);
        }
        return false;
    }

    public static /* synthetic */ boolean s(View view) {
        return !view.isShown();
    }

    public static FocusArea t(View view) {
        for (view = view.getParent(); view != null; view = view.getParent()) {
            if (!(view instanceof FocusArea)) continue;
            return (FocusArea)view;
        }
        return null;
    }

    /*
     * Exception decompiling
     */
    public static List u(Context var0, int var1_8) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 6[TRYBLOCK] [10 : 359->464)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    private static View v(View view, Predicate predicate, Predicate predicate2) {
        if (!ag$$ExternalSyntheticApiModelOutline1.m(predicate2, (Object)view)) {
            if (ag$$ExternalSyntheticApiModelOutline1.m(predicate, (Object)view)) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup)view;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); ++i2) {
                    view = AmbientModeSupport$AmbientCallback.v(viewGroup.getChildAt(i2), predicate, predicate2);
                    if (view == null) continue;
                    return view;
                }
            }
        }
        return null;
    }

    private static View w(View view) {
        if (!view.isShown()) {
            return null;
        }
        if (view instanceof FocusArea) {
            if ((view = ((FocusArea)view).a()) != null && AmbientModeSupport$AmbientCallback.l(view)) {
                return view;
            }
        } else if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup)view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); ++i2) {
                view = AmbientModeSupport$AmbientCallback.w(viewGroup.getChildAt(i2));
                if (view == null) continue;
                return view;
            }
        }
        return null;
    }

    public final void onAmbientOffloadInvalidated() {
    }

    public final void onEnterAmbient(Bundle bundle) {
    }

    public final void onExitAmbient() {
    }

    public final void onUpdateAmbient() {
    }
}

