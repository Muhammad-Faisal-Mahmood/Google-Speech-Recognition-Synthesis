/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.AbsListView
 *  android.widget.AdapterView
 */
import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;

final class iz {
    public static Method a;
    public static Method b;
    public static Method c;
    public static boolean d;

    static {
        try {
            GenericDeclaration genericDeclaration = Integer.TYPE;
            Class<Boolean> clazz = Boolean.TYPE;
            Class<Float> clazz2 = Float.TYPE;
            genericDeclaration = AbsListView.class.getDeclaredMethod("positionSelector", new Class[]{genericDeclaration, View.class, clazz, clazz2, clazz2});
            a = genericDeclaration;
            ((Method)genericDeclaration).setAccessible(true);
            genericDeclaration = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", Integer.TYPE);
            b = genericDeclaration;
            ((Method)genericDeclaration).setAccessible(true);
            genericDeclaration = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", Integer.TYPE);
            c = genericDeclaration;
            ((Method)genericDeclaration).setAccessible(true);
            d = true;
        }
        catch (NoSuchMethodException noSuchMethodException) {
            noSuchMethodException.printStackTrace();
        }
    }
}

