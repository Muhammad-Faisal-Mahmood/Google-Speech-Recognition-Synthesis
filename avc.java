/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public final class avc {
    public static final int g = 0;
    private static final String[] h = new String[]{"INSERT", "UPDATE", "DELETE"};
    public final aum a;
    public final Map b;
    public final Map c;
    public jqz d;
    public final ggv e;
    public final bzb f;
    private final Map i;
    private final jrk j;
    private final String[] k;
    private final jtz l;

    public avc(aum iterator, Map iterator2, Map object4, String[] object2, jrk object3) {
        String string;
        String string2;
        this.a = iterator;
        this.i = iterator2;
        this.b = object4;
        this.j = string2;
        iterator = jud.a;
        int n2 = 0;
        this.l = new jtz(false, (jse)((Object)iterator));
        this.d = aud.b;
        this.c = new LinkedHashMap();
        String[] stringArray = new String[7];
        while (true) {
            iterator = null;
            if (n2 >= 7) break;
            iterator2 = string[n2].toLowerCase(Locale.ROOT);
            jse.d(iterator2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            this.c.put(iterator2, n2);
            string2 = (String)this.i.get(string[n2]);
            if (string2 != null) {
                iterator = string2.toLowerCase(Locale.ROOT);
                jse.d(iterator, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            }
            if (iterator == null) {
                iterator = iterator2;
            }
            stringArray[n2] = iterator;
            ++n2;
        }
        this.k = stringArray;
        for (Map.Entry entry : this.i.entrySet()) {
            iterator = ((String)entry.getValue()).toLowerCase(Locale.ROOT);
            jse.d(iterator, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (!this.c.containsKey(iterator)) continue;
            string = ((String)entry.getKey()).toLowerCase(Locale.ROOT);
            jse.d(string, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            Map map = this.c;
            map.put(string, jjj.G(map, iterator));
        }
        this.e = new ggv(null);
        this.f = new bzb(null, null);
    }

    /*
     * Unable to fully structure code
     */
    public final Object a(aui var1_1, jqb var2_2) {
        block12: {
            block10: {
                block11: {
                    block7: {
                        block8: {
                            block9: {
                                if (!(var2_2 instanceof aur)) ** GOTO lbl-1000
                                var4_3 = (aur)var2_2;
                                var3_4 = var4_3.d;
                                if ((var3_4 & -2147483648) != 0) {
                                    var4_3.d = var3_4 + -2147483648;
                                    var2_2 = var4_3;
                                } else lbl-1000:
                                // 2 sources

                                {
                                    var2_2 = new aur(this, (jqb)var2_2);
                                }
                                var4_3 = var2_2.b;
                                var5_5 = jqh.a;
                                var3_4 = var2_2.d;
                                if (var3_4 == 0) break block7;
                                if (var3_4 == 1) break block8;
                                if (var3_4 != 2) break block9;
                                var1_1 = (Set)var2_2.a;
                                jns.ak(var4_3);
                                break block10;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        var1_1 = (aui)var2_2.a;
                        jns.ak(var4_3);
                        break block11;
                    }
                    jns.ak(var4_3);
                    var4_3 = wl.f;
                    var2_2.a = var1_1;
                    var2_2.d = 1;
                    var4_3 = var1_1.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1", (jrk)var4_3, (jqb)var2_2);
                    if (var4_3 == var5_5) break block12;
                }
                var4_3 = (Set)var4_3;
                if (!var4_3.isEmpty()) {
                    var2_2.a = var4_3;
                    var2_2.d = 2;
                    if (we.k((aui)var1_1, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", (jqb)var2_2) == var5_5) {
                        return var5_5;
                    }
                }
                var1_1 = var4_3;
            }
            return var1_1;
        }
        return var5_5;
    }

    /*
     * Exception decompiling
     */
    public final Object b(jqb var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 4[TRYBLOCK] [4 : 262->269)] java.lang.Throwable
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

    /*
     * Unable to fully structure code
     */
    public final Object c(aui var1_1, int var2_2, jqb var3_3) {
        block10: {
            block9: {
                block6: {
                    block7: {
                        block8: {
                            if (!(var3_3 instanceof auy)) ** GOTO lbl-1000
                            var6_4 = (auy)var3_3;
                            var4_5 = var6_4.h;
                            if ((var4_5 & -2147483648) != 0) {
                                var6_4.h = var4_5 + -2147483648;
                                var3_3 = var6_4;
                            } else lbl-1000:
                            // 2 sources

                            {
                                var3_3 = new auy(this, (jqb)var3_3);
                            }
                            var8_6 = var3_3.f;
                            var10_7 = jqh.a;
                            var4_5 = var3_3.h;
                            if (var4_5 == 0) break block6;
                            if (var4_5 == 1) break block7;
                            if (var4_5 != 2) break block8;
                            var5_8 = var3_3.e;
                            var2_2 = var3_3.d;
                            var4_5 = var3_3.c;
                            var7_9 = var3_3.i;
                            var6_4 = (String)var3_3.b;
                            var9_10 = (aui)var3_3.a;
                            jns.ak(var8_6);
                            ** GOTO lbl-1000
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    var2_2 = var3_3.c;
                    var1_1 = (aui)var3_3.b;
                    var6_4 = (avc)var3_3.a;
                    jns.ak(var8_6);
                    break block9;
                }
                jns.ak(var8_6);
                var6_4 = a.ah(var2_2, "INSERT OR IGNORE INTO room_table_modification_log VALUES(", ", 0)");
                var3_3.a = this;
                var3_3.b = var1_1;
                var3_3.c = var2_2;
                var3_3.h = 1;
                if (we.k(var1_1, (String)var6_4, (jqb)var3_3) == var10_7) break block10;
                var6_4 = this;
            }
            var6_4 = var6_4.k[var2_2];
            var7_9 = avc.h;
            var5_8 = 3;
            var4_5 = var2_2;
            var8_6 = var3_3;
            for (var2_2 = 0; var2_2 < var5_8; ++var2_2) {
                var11_11 = var7_9[var2_2];
                var3_3 = we.j((String)var6_4, var11_11);
                var9_10 = new StringBuilder("CREATE TEMP TRIGGER IF NOT EXISTS `");
                var9_10.append((String)var3_3);
                var9_10.append("` AFTER ");
                var9_10.append(var11_11);
                var9_10.append(" ON `");
                var9_10.append((String)var6_4);
                var9_10.append("` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = ");
                var9_10.append(var4_5);
                var9_10.append(" AND invalidated = 0; END");
                var11_11 = var9_10.toString();
                var8_6.a = var1_1;
                var8_6.b = var6_4;
                var8_6.i = var7_9;
                var8_6.c = var4_5;
                var8_6.d = var2_2;
                var8_6.e = var5_8;
                var8_6.h = 2;
                var3_3 = var8_6;
                var9_10 = var1_1;
                if (we.k(var1_1, var11_11, (jqb)var8_6) == var10_7) {
                    return var10_7;
                } else {
                    break;
                }
            }
lbl-1000:
            // 3 sources

            {
                var8_6 = var3_3;
                var1_1 = var9_10;
                continue;
            }
            return jon.a;
        }
        return var10_7;
    }

    /*
     * Unable to fully structure code
     */
    public final Object d(aui var1_1, int var2_2, jqb var3_3) {
        if (!(var3_3 instanceof auz)) ** GOTO lbl-1000
        var5_4 = (String[])var3_3;
        var4_5 = var5_4.e;
        if ((var4_5 & -2147483648) != 0) {
            var5_4.e = var4_5 + -2147483648;
            var3_3 = var5_4;
        } else lbl-1000:
        // 2 sources

        {
            var3_3 = new auz(this, var3_3);
        }
        var8_6 = var3_3.c;
        var7_7 = jqh.a;
        var4_5 = var3_3.e;
        if (var4_5 == 0) ** GOTO lbl22
        if (var4_5 == 1) {
            var4_5 = var3_3.b;
            var2_2 = var3_3.a;
            var5_4 = var3_3.g;
            var6_8 = var3_3.f;
            var1_1 = var3_3.h;
            jns.ak(var8_6);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
lbl22:
            // 1 sources

            jns.ak(var8_6);
            var6_8 = this.k[var2_2];
            var5_4 = avc.h;
            var4_5 = 3;
        }
        for (var2_2 = 0; var2_2 < var4_5; ++var2_2) {
            var9_9 = we.j(var6_8, var5_4[var2_2]);
            var8_6 = new StringBuilder("DROP TRIGGER IF EXISTS `");
            var8_6.append(var9_9);
            var8_6.append('`');
            var8_6 = var8_6.toString();
            var3_3.h = (avk)var1_1;
            var3_3.f = var6_8;
            var3_3.g = var5_4;
            var3_3.a = var2_2;
            var3_3.b = var4_5;
            var3_3.e = 1;
            if (we.k(var1_1, (String)var8_6, var3_3) != var7_7) continue;
            return var7_7;
        }
        return jon.a;
    }

    /*
     * Unable to fully structure code
     */
    public final Object e(jqb var1_1) {
        block11: {
            block9: {
                block10: {
                    block8: {
                        if (!(var1_1 instanceof ava)) ** GOTO lbl-1000
                        var3_2 = (ava)var1_1;
                        var2_6 = var3_2.c;
                        if ((var2_6 & -2147483648) != 0) {
                            var3_2.c = var2_6 + -2147483648;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var3_2 = new ava(this, (jqb)var1_1);
                        }
                        var5_7 = var3_2.a;
                        var4_8 = jqh.a;
                        var2_6 = var3_2.c;
                        if (var2_6 != 0) {
                            if (var2_6 == 1) {
                                var1_1 = var3_2.d;
                                try {
                                    jns.ak(var5_7);
                                    break block8;
                                }
                                catch (Throwable var3_3) {
                                    break block9;
                                }
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        jns.ak(var5_7);
                        var1_1 = this.a.h;
                        if (!var1_1.e()) break block11;
                        try {
                            var6_9 = this.a;
                            var5_7 = new aux_(this, null, 2, null);
                            var3_2.d = var1_1;
                            var3_2.c = 1;
                            var3_2 = var6_9.s((jro)var5_7, (jqb)var3_2);
                            if (var3_2 == var4_8) break block10;
                        }
                        catch (Throwable var3_4) {
                            // empty catch block
                        }
                    }
                    var1_1.d();
                    break block11;
                }
                return var4_8;
            }
            var1_1.d();
            throw var3_5;
        }
        return jon.a;
    }

    public final void f(jqz jqz2, jqz jqz3) {
        jse.e(jqz2, "onRefreshScheduled");
        jse.e(jqz3, "onRefreshCompleted");
        if (this.l.a(false, true)) {
            jse.ah(this.a.h(), new jva(), null, new bes(this, jqz3, null, 1), 2);
        }
    }
}

