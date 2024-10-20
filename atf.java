/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.content.res.Resources
 *  android.util.AttributeSet
 *  android.util.Xml
 *  android.view.InflateException
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 */
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

final class atf {
    public static final int a = 0;
    private static final Class[] b = new Class[]{Context.class, AttributeSet.class};
    private static final HashMap c = new HashMap();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final Preference a(XmlPullParser xmlPullParser, PreferenceGroup object, Context object2, Object[] objectArray, atj object3, String[] stringArray) {
        synchronized (objectArray) {
            AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)xmlPullParser);
            objectArray[0] = object2;
            try {
                int n2;
                while ((n2 = xmlPullParser.next()) != 2) {
                    if (n2 != 1) continue;
                    object2 = new StringBuilder();
                    ((StringBuilder)object2).append(xmlPullParser.getPositionDescription());
                    ((StringBuilder)object2).append(": No start tag found!");
                    object = new InflateException(((StringBuilder)object2).toString());
                    throw object;
                }
                PreferenceGroup preferenceGroup = (PreferenceGroup)atf.d(xmlPullParser.getName(), attributeSet, (Context)object2, objectArray, stringArray);
                Object object4 = object;
                if (object == null) {
                    preferenceGroup.onAttachedToHierarchy((atj)object3);
                    object4 = preferenceGroup;
                }
                atf.b(xmlPullParser, object4, attributeSet, (Context)object2, objectArray, object3, stringArray);
                return object4;
            }
            catch (IOException iOException) {
                object2 = new StringBuilder();
                ((StringBuilder)object2).append(xmlPullParser.getPositionDescription());
                ((StringBuilder)object2).append(": ");
                ((StringBuilder)object2).append(iOException.getMessage());
                object3 = new InflateException(((StringBuilder)object2).toString());
                object3.initCause(iOException);
                throw object3;
            }
            catch (XmlPullParserException xmlPullParserException) {
                object = new InflateException(xmlPullParserException.getMessage());
                object.initCause(xmlPullParserException);
                throw object;
            }
            catch (InflateException inflateException) {
                throw inflateException;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static final void b(XmlPullParser object, Preference preference, AttributeSet attributeSet, Context context, Object[] objectArray, atj atj2, String[] stringArray) {
        int n2 = object.getDepth();
        while (true) {
            int n3;
            int n4 = n3 = object.next();
            if (n3 == 3) {
                if (object.getDepth() <= n2) break;
                n4 = 3;
            }
            if (n4 == 1) break;
            if (n4 != 2) continue;
            Object object2 = object.getName();
            if ("intent".equals(object2)) {
                try {
                    object2 = Intent.parseIntent((Resources)context.getResources(), (XmlPullParser)object, (AttributeSet)attributeSet);
                    preference.setIntent((Intent)object2);
                }
                catch (IOException iOException) {
                    object = new XmlPullParserException("Error parsing preference");
                    object.initCause((Throwable)iOException);
                    throw object;
                }
            }
            if ("extra".equals(object2)) {
                context.getResources().parseBundleExtra("extra", attributeSet, preference.getExtras());
                try {
                    n4 = object.getDepth();
                    while ((n3 = object.next()) != 1 && (n3 != 3 || (n3 = object.getDepth()) > n4)) {
                    }
                }
                catch (IOException iOException) {
                    object = new XmlPullParserException("Error parsing preference");
                    object.initCause((Throwable)iOException);
                    throw object;
                }
            }
            object2 = atf.d((String)object2, attributeSet, context, objectArray, stringArray);
            ((PreferenceGroup)preference).g((Preference)object2);
            atf.b(object, (Preference)object2, attributeSet, context, objectArray, atj2, stringArray);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static final Preference c(String object, String[] object2, AttributeSet attributeSet, Context object3, Object[] objectArray) {
        Constructor constructor;
        Constructor constructor2 = constructor = (Constructor)c.get(object);
        if (constructor == null) {
            ClassLoader classLoader = object3.getClassLoader();
            if (object2 == null) {
                object2 = Class.forName(object, false, classLoader);
            } else {
                constructor = null;
                int n2 = 0;
                constructor2 = null;
                while (true) {
                    object3 = constructor;
                    if (n2 >= 2) break;
                    object3 = object2[n2];
                    try {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append((String)object3);
                        stringBuilder.append((String)object);
                        object3 = Class.forName(stringBuilder.toString(), false, classLoader);
                    }
                    catch (ClassNotFoundException classNotFoundException) {
                        ++n2;
                        continue;
                    }
                    break;
                }
                object2 = object3;
                if (object3 == null) {
                    if (constructor2 != null) throw constructor2;
                    object2 = new InflateException(a.al(object, attributeSet, ": Error inflating class "));
                    throw object2;
                }
            }
            constructor2 = object2.getConstructor(b);
            constructor2.setAccessible(true);
            c.put(object, constructor2);
        }
        objectArray[1] = attributeSet;
        try {
            return (Preference)constructor2.newInstance(objectArray);
        }
        catch (Exception exception) {
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw classNotFoundException;
        }
        object = new InflateException(a.al(object, attributeSet, ": Error inflating class "));
        object.initCause((Throwable)exception);
        throw object;
    }

    private static final Preference d(String object, AttributeSet attributeSet, Context object2, Object[] objectArray, String[] stringArray) {
        block6: {
            block5: {
                if (object.indexOf(46) != -1) break block5;
                object2 = atf.c(object, stringArray, attributeSet, object2, objectArray);
                object = object2;
                break block6;
            }
            try {
                object2 = atf.c(object, null, attributeSet, object2, objectArray);
                object = object2;
            }
            catch (Exception exception) {
                object = new InflateException(a.al(object, attributeSet, ": Error inflating class "));
                object.initCause((Throwable)exception);
                throw object;
            }
            catch (ClassNotFoundException classNotFoundException) {
                object = new InflateException(a.al(object, attributeSet, ": Error inflating class (not found)"));
                object.initCause((Throwable)classNotFoundException);
                throw object;
            }
            catch (InflateException inflateException) {
                throw inflateException;
            }
        }
        return object;
    }
}

