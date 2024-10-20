/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.content.res.TypedArray
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.view.View
 *  android.view.View$OnClickListener
 */
package android.support.v7.app;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.os.Build;
import android.support.v7.widget.AppCompatButton;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Constructor;

public class AppCompatViewInflater {
    private static final String LOG_TAG = "AppCompatViewInflater";
    private static final int[] sAccessibilityHeading;
    private static final int[] sAccessibilityPaneTitle;
    private static final String[] sClassPrefixList;
    private static final pa sConstructorMap;
    private static final Class[] sConstructorSignature;
    private static final int[] sOnClickAttrs;
    private static final int[] sScreenReaderFocusable;
    private final Object[] mConstructorArgs = new Object[2];

    static {
        sConstructorSignature = new Class[]{Context.class, AttributeSet.class};
        sOnClickAttrs = new int[]{16843375};
        sAccessibilityHeading = new int[]{16844160};
        sAccessibilityPaneTitle = new int[]{16844156};
        sScreenReaderFocusable = new int[]{16844148};
        sClassPrefixList = new String[]{"android.widget.", "android.view.", "android.webkit."};
        sConstructorMap = new pa();
    }

    private void backportAccessibilityAttributes(Context context, View view, AttributeSet attributeSet) {
        boolean bl2;
        if (Build.VERSION.SDK_INT > 28) {
            return;
        }
        TypedArray typedArray = context.obtainStyledAttributes(attributeSet, sAccessibilityHeading);
        if (typedArray.hasValue(0)) {
            bl2 = typedArray.getBoolean(0, false);
            new vv(Boolean.class).e(view, bl2);
        }
        typedArray.recycle();
        typedArray = context.obtainStyledAttributes(attributeSet, sAccessibilityPaneTitle);
        if (typedArray.hasValue(0)) {
            wj.n(view, typedArray.getString(0));
        }
        typedArray.recycle();
        context = context.obtainStyledAttributes(attributeSet, sScreenReaderFocusable);
        if (context.hasValue(0)) {
            bl2 = context.getBoolean(0, false);
            new vs(Boolean.class).e(view, bl2);
        }
        context.recycle();
    }

    private void checkOnClickListener(View view, AttributeSet object) {
        Context context = view.getContext();
        if (context instanceof ContextWrapper && view.hasOnClickListeners()) {
            if ((object = (context = context.obtainStyledAttributes(object, sOnClickAttrs)).getString(0)) != null) {
                view.setOnClickListener((View.OnClickListener)new ej(view, (String)object));
            }
            context.recycle();
        }
    }

    /*
     * Unable to fully structure code
     */
    private View createViewByPrefix(Context var1_1, String var2_3, String var3_4) {
        var6_5 = AppCompatViewInflater.sConstructorMap;
        var5_6 = (Constructor)var6_5.get(var2_3);
        var4_7 = var5_6;
        if (var5_6 != null) ** GOTO lbl19
        if (var3_4 != null) {
            var4_7 = new Constructor<View>();
            var4_7.append(var3_4);
            var4_7.append(var2_3);
            var3_4 = var4_7.toString();
        } else {
            var3_4 = var2_3;
        }
        try {
            var4_7 = Class.forName(var3_4, false, var1_1.getClassLoader()).asSubclass(View.class).getConstructor(AppCompatViewInflater.sConstructorSignature);
            var6_5.put(var2_3, var4_7);
lbl19:
            // 2 sources

            var4_7.setAccessible(true);
            var1_1 = (View)var4_7.newInstance(this.mConstructorArgs);
            return var1_1;
        }
        catch (Exception var1_2) {
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private View createViewFromTag(Context objectArray, String view, AttributeSet attributeSet) {
        block8: {
            Object object = view;
            if (view.equals("view")) {
                object = attributeSet.getAttributeValue(null, "class");
            }
            try {
                view = this.mConstructorArgs;
                view[0] = objectArray;
                view[1] = attributeSet;
                if (((String)object).indexOf(46) == -1) {
                    for (int i2 = 0; i2 < ((Object[])(view = sClassPrefixList)).length; ++i2) {
                        if ((view = this.createViewByPrefix((Context)objectArray, (String)object, (String)view[i2])) == null) continue;
                        objectArray = this.mConstructorArgs;
                        objectArray[0] = null;
                        objectArray[1] = null;
                        return view;
                    }
                    break block8;
                }
                objectArray = this.createViewByPrefix((Context)objectArray, (String)object, null);
                view = this.mConstructorArgs;
                view[0] = null;
                view[1] = null;
                return objectArray;
            }
            catch (Throwable throwable) {
                view = this.mConstructorArgs;
                view[0] = null;
                view[1] = null;
                throw throwable;
            }
            catch (Exception exception) {}
        }
        objectArray = this.mConstructorArgs;
        objectArray[0] = null;
        objectArray[1] = null;
        return null;
    }

    private static Context themifyContext(Context context, AttributeSet attributeSet, boolean bl2, boolean bl3) {
        attributeSet = context.obtainStyledAttributes(attributeSet, er.y, 0, 0);
        int n2 = bl2 ? attributeSet.getResourceId(0, 0) : 0;
        int n3 = n2;
        if (bl3) {
            n3 = n2;
            if (n2 == 0) {
                n3 = n2 = attributeSet.getResourceId(4, 0);
                if (n2 != 0) {
                    Log.i((String)LOG_TAG, (String)"app:theme is now deprecated. Please move to using android:theme instead.");
                    n3 = n2;
                }
            }
        }
        attributeSet.recycle();
        if (!(n3 == 0 || context instanceof nx && ((nx)context).a == n3)) {
            return new nx(context, n3);
        }
        return context;
    }

    private void verifyNotNull(View object, String string) {
        if (object != null) {
            return;
        }
        object = new StringBuilder();
        ((StringBuilder)object).append(this.getClass().getName());
        ((StringBuilder)object).append(" asked to inflate view for <");
        ((StringBuilder)object).append(string);
        ((StringBuilder)object).append(">, but returned null");
        throw new IllegalStateException(((StringBuilder)object).toString());
    }

    protected he createAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new he(context, attributeSet);
    }

    protected AppCompatButton createButton(Context context, AttributeSet attributeSet) {
        return new AppCompatButton(context, attributeSet);
    }

    protected hg createCheckBox(Context context, AttributeSet attributeSet) {
        return new hg(context, attributeSet);
    }

    protected hh createCheckedTextView(Context context, AttributeSet attributeSet) {
        return new hh(context, attributeSet);
    }

    protected hk createEditText(Context context, AttributeSet attributeSet) {
        return new hk(context, attributeSet);
    }

    protected hl createImageButton(Context context, AttributeSet attributeSet) {
        return new hl(context, attributeSet);
    }

    protected hm createImageView(Context context, AttributeSet attributeSet) {
        return new hm(context, attributeSet);
    }

    protected hn createMultiAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        return new hn(context, attributeSet);
    }

    protected hq createRadioButton(Context context, AttributeSet attributeSet) {
        return new hq(context, attributeSet);
    }

    protected hr createRatingBar(Context context, AttributeSet attributeSet) {
        return new hr(context, attributeSet);
    }

    protected hs createSeekBar(Context context, AttributeSet attributeSet) {
        return new hs(context, attributeSet);
    }

    protected ib createSpinner(Context context, AttributeSet attributeSet) {
        return new ib(context, attributeSet);
    }

    protected AppCompatTextView createTextView(Context context, AttributeSet attributeSet) {
        return new AppCompatTextView(context, attributeSet);
    }

    protected il createToggleButton(Context context, AttributeSet attributeSet) {
        return new il(context, attributeSet);
    }

    protected View createView(Context context, String string, AttributeSet attributeSet) {
        return null;
    }

    public final View createView(View object, String string, Context context, AttributeSet attributeSet, boolean bl2, boolean bl3, boolean bl4, boolean bl5) {
        View view;
        int n2;
        block41: {
            block40: {
                block39: {
                    object = bl2 && object != null ? object.getContext() : context;
                    n2 = 1;
                    bl2 = bl4;
                    if (bl3) break block39;
                    view = object;
                    if (!bl4) break block40;
                    bl2 = true;
                }
                view = AppCompatViewInflater.themifyContext((Context)object, attributeSet, bl3, bl2);
            }
            if (bl5) {
                lv.a((Context)view);
            }
            switch (string.hashCode()) {
                default: {
                    break;
                }
                case 2001146706: {
                    if (!string.equals("Button")) break;
                    n2 = 2;
                    break block41;
                }
                case 1666676343: {
                    if (!string.equals("EditText")) break;
                    n2 = 3;
                    break block41;
                }
                case 1601505219: {
                    if (!string.equals("CheckBox")) break;
                    n2 = 6;
                    break block41;
                }
                case 1413872058: {
                    if (!string.equals("AutoCompleteTextView")) break;
                    n2 = 9;
                    break block41;
                }
                case 1125864064: {
                    if (!string.equals("ImageView")) break;
                    break block41;
                }
                case 799298502: {
                    if (!string.equals("ToggleButton")) break;
                    n2 = 13;
                    break block41;
                }
                case 776382189: {
                    if (!string.equals("RadioButton")) break;
                    n2 = 7;
                    break block41;
                }
                case -339785223: {
                    if (!string.equals("Spinner")) break;
                    n2 = 4;
                    break block41;
                }
                case -658531749: {
                    if (!string.equals("SeekBar")) break;
                    n2 = 12;
                    break block41;
                }
                case -937446323: {
                    if (!string.equals("ImageButton")) break;
                    n2 = 5;
                    break block41;
                }
                case -938935918: {
                    if (!string.equals("TextView")) break;
                    n2 = 0;
                    break block41;
                }
                case -1346021293: {
                    if (!string.equals("MultiAutoCompleteTextView")) break;
                    n2 = 10;
                    break block41;
                }
                case -1455429095: {
                    if (!string.equals("CheckedTextView")) break;
                    n2 = 8;
                    break block41;
                }
                case -1946472170: {
                    if (!string.equals("RatingBar")) break;
                    n2 = 11;
                    break block41;
                }
            }
            n2 = -1;
        }
        switch (n2) {
            default: {
                object = this.createView((Context)view, string, attributeSet);
                break;
            }
            case 13: {
                object = this.createToggleButton((Context)view, attributeSet);
                this.verifyNotNull((View)object, string);
                break;
            }
            case 12: {
                object = this.createSeekBar((Context)view, attributeSet);
                this.verifyNotNull((View)object, string);
                break;
            }
            case 11: {
                object = this.createRatingBar((Context)view, attributeSet);
                this.verifyNotNull((View)object, string);
                break;
            }
            case 10: {
                object = this.createMultiAutoCompleteTextView((Context)view, attributeSet);
                this.verifyNotNull((View)object, string);
                break;
            }
            case 9: {
                object = this.createAutoCompleteTextView((Context)view, attributeSet);
                this.verifyNotNull((View)object, string);
                break;
            }
            case 8: {
                object = this.createCheckedTextView((Context)view, attributeSet);
                this.verifyNotNull((View)object, string);
                break;
            }
            case 7: {
                object = this.createRadioButton((Context)view, attributeSet);
                this.verifyNotNull((View)object, string);
                break;
            }
            case 6: {
                object = this.createCheckBox((Context)view, attributeSet);
                this.verifyNotNull((View)object, string);
                break;
            }
            case 5: {
                object = this.createImageButton((Context)view, attributeSet);
                this.verifyNotNull((View)object, string);
                break;
            }
            case 4: {
                object = this.createSpinner((Context)view, attributeSet);
                this.verifyNotNull((View)object, string);
                break;
            }
            case 3: {
                object = this.createEditText((Context)view, attributeSet);
                this.verifyNotNull((View)object, string);
                break;
            }
            case 2: {
                object = this.createButton((Context)view, attributeSet);
                this.verifyNotNull((View)object, string);
                break;
            }
            case 1: {
                object = this.createImageView((Context)view, attributeSet);
                this.verifyNotNull((View)object, string);
                break;
            }
            case 0: {
                object = this.createTextView((Context)view, attributeSet);
                this.verifyNotNull((View)object, string);
            }
        }
        Object object2 = object;
        if (object == null) {
            object2 = object;
            if (context != view) {
                object2 = this.createViewFromTag((Context)view, string, attributeSet);
            }
        }
        if (object2 != null) {
            this.checkOnClickListener((View)object2, attributeSet);
            this.backportAccessibilityAttributes((Context)view, (View)object2, attributeSet);
        }
        return object2;
    }
}

