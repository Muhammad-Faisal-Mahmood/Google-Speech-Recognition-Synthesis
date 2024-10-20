/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.Comparator;

public final class py
implements Comparator {
    private final int a;

    public py(int n2) {
        this.a = n2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final /* synthetic */ int compare(Object object, Object object2) {
        int n2;
        int n3;
        int n4 = this.a;
        if (n4 != 0) {
            int n5;
            n3 = -1;
            n2 = 0;
            int n6 = 0;
            if (n4 != 1) {
                float f2;
                if (n4 != 2) {
                    if (n4 != 3) {
                        int n7 = 4;
                        if (n4 != 4) {
                            object = (koe)object;
                            koe koe2 = (koe)object2;
                            if ("Fallback-Cronet-Provider".equals(((koe)object).a.a())) {
                                return 1;
                            }
                            if ("Fallback-Cronet-Provider".equals(koe2.a.a())) return n3;
                            ((koe)object).a.b();
                            koe2.a.b();
                            String[] stringArray = "129.0.6614.4".split("\\.");
                            String[] stringArray2 = "129.0.6614.4".split("\\.");
                            for (n3 = n6; n3 < (n2 = stringArray.length) && n3 < stringArray2.length; ++n3) {
                                try {
                                    n7 = Integer.parseInt(stringArray[n3]);
                                    n2 = Integer.parseInt(stringArray2[n3]);
                                    if (n7 == n2) continue;
                                }
                                catch (NumberFormatException numberFormatException) {
                                    String string = stringArray[n3];
                                    String string2 = stringArray2[n3];
                                    StringBuilder stringBuilder = new StringBuilder("Unable to convert version segments into integers: ");
                                    stringBuilder.append(string);
                                    stringBuilder.append(" & ");
                                    stringBuilder.append(string2);
                                    throw new IllegalArgumentException(stringBuilder.toString(), numberFormatException);
                                }
                                n3 = n2 = Integer.signum(n7 - n2);
                                return -n3;
                            }
                            n3 = Integer.signum(n2 - stringArray2.length);
                            return -n3;
                        }
                        object = (String)object;
                        String string = (String)object2;
                        jse.e(object, "a");
                        jse.e(string, "b");
                        n6 = Math.min(((String)object).length(), string.length());
                        for (n3 = n7; n3 < n6; ++n3) {
                            n4 = ((String)object).charAt(n3);
                            if (n4 == (n7 = (int)string.charAt(n3))) continue;
                            if (jse.a(n4, n7) < 0) return -1;
                            return 1;
                        }
                        n7 = ((String)object).length();
                        n6 = string.length();
                        n3 = n2;
                        if (n7 == n6) return n3;
                        if (n7 < n6) return -1;
                        return 1;
                    }
                    object = (View)object;
                    View view = (View)object2;
                    n3 = object.getTop();
                    n2 = view.getTop();
                    return n3 - n2;
                }
                object = (View)object;
                View view = (View)object2;
                float f3 = wa.b((View)object);
                if (f3 > (f2 = wa.b(view))) return n3;
                if (!(f3 < f2)) return 0;
                return 1;
            }
            object = (ji)object;
            ji ji2 = (ji)object2;
            RecyclerView recyclerView = ((ji)object).d;
            n2 = recyclerView != null ? 0 : 1;
            if (n2 != (n5 = ji2.d != null ? 0 : 1)) {
                if (recyclerView != null) return n3;
                return 1;
            }
            boolean bl2 = ((ji)object).a;
            if (bl2 == ji2.a) {
                n3 = n2 = ji2.b - ((ji)object).b;
                if (n2 != 0) return n3;
                n3 = n2 = ((ji)object).c - ji2.c;
                if (n2 != 0) return n3;
                return 0;
            }
            if (!bl2) return 1;
            return n3;
        }
        object = (qb)object;
        qb qb2 = (qb)object2;
        n3 = ((qb)object).c;
        n2 = qb2.c;
        return n3 - n2;
    }
}

