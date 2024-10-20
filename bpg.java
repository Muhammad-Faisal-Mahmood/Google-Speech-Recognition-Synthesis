/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 *  android.util.Log
 */
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import j$.util.Collection$_EL;
import j$.util.stream.Collectors;

public final class bpg
extends cgk {
    public static final Parcelable.Creator CREATOR = new bph();
    public final byte[] A;
    public final int B;
    public final int C;
    public final long D;
    public final long E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final long N;
    public final int a;
    public final long b;
    public final int c;
    public final int d;
    public final int e;
    public final long f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final long k;
    public final long l;
    public final long m;
    public final long n;
    public final long o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final boolean t;
    public final int u;
    public final long v;
    public final double w;
    public final double x;
    public final int y;
    public final float z;

    public bpg(int n2, int n3, int n4, int n5, long l2, int n6, int n7, int n8, long l3, long l4, long l5, long l6, long l7, long l8, int n9, int n10, int n11, int n12, boolean bl2, int n13, long l9, double d2, double d3, int n14, float f2, byte[] byArray, int n15, int n16, long l10, long l11, int n17, int n18, int n19, int n20, int n21, int n22, int n23, int n24, long l12, long l13) {
        this.a = n2;
        this.b = l13;
        this.c = n3;
        this.d = n4;
        this.e = n5;
        this.f = l2;
        this.g = n6;
        this.h = n7;
        this.i = n8;
        this.j = l3;
        this.k = l4;
        this.l = l5;
        this.m = l6;
        this.n = l7;
        this.o = l8;
        this.p = n9;
        this.q = n10;
        this.r = n11;
        this.s = n12;
        this.t = bl2;
        this.u = n13;
        this.v = l9;
        this.w = d2;
        this.x = d3;
        this.y = n14;
        this.z = f2;
        this.A = byArray;
        this.B = n15;
        this.C = n16;
        this.D = l10;
        this.E = l11;
        this.F = n17;
        this.G = n18;
        this.H = n19;
        this.I = n20;
        this.J = n21;
        this.K = n22;
        this.L = n23;
        this.M = n24;
        this.N = l12;
    }

    public final String toString() {
        Object object;
        Object object2;
        gzy gzy2 = new gzy();
        gzy2.d("customerId", this.a);
        gzy2.d("callingUserId", this.b);
        gzy2.d("featureType", this.c);
        gzy2.d("featureVariant", this.d);
        gzy2.d("status", this.e);
        gzy2.d("inferenceLatencyTotalMillis", this.f);
        gzy2.d("numInputTokens", this.g);
        gzy2.d("numOutputTokens", this.h);
        gzy2.d("numDecodeSteps", this.i);
        gzy2.d("inferenceServiceStartLatencyMillis", this.j);
        gzy2.d("inferenceApiCallHandlingLatencyMillis", this.k);
        gzy2.d("inferenceInputSafetyCheckLatencyMillis", this.l);
        gzy2.d("inferenceInputEncodingLatencyMillis", this.m);
        gzy2.d("inferenceOverallOutputLatencyMillis", this.n);
        gzy2.d("inferenceOutputSafetyCheckLatencyMillis", this.o);
        gzy2.d("inputSafetyCheckPolicyViolationType", this.p);
        gzy2.d("inputSafetyCheckSuggestedActionType", this.q);
        gzy2.d("outputSafetyCheckPolicyViolationType", this.r);
        gzy2.d("outputSafetyCheckSuggestedActionType", this.s);
        gzy2.d("isModelLoaded", this.t);
        gzy2.d("featureId", this.u);
        gzy2.d("featureVersion", this.M);
        gzy2.d("modelInferenceLatencyMillis", this.v);
        gzy2.d("outputTokensPerSecond", this.w);
        gzy2.d("inputTokensPerSecond", this.x);
        gzy2.d("numSamples", this.y);
        gzy2.d("cannedResponsesRatio", Float.valueOf(this.z));
        try {
            object2 = this.A;
            object = hwj.a();
            object = hwv.o(bqi.a, object2, 0, ((byte[])object2).length, (hwj)object);
            hwv.D((hwv)object);
            object = (bqi)object;
        }
        catch (hxn hxn2) {
            Log.e((String)"InferenceEventTraceResult", (String)"Failed to parse SpeculativeDecodeStatistics proto", (Throwable)hxn2);
            object = bqi.a;
        }
        StringBuilder stringBuilder = new StringBuilder("{drafter_id: ");
        stringBuilder.append(((bqi)object).b);
        stringBuilder.append(", drafter_time: ");
        hwg hwg2 = ((bqi)object).d;
        object2 = hwg2;
        if (hwg2 == null) {
            object2 = hwg.a;
        }
        stringBuilder.append(object2.b);
        stringBuilder.append(", acceptance_rate: ");
        stringBuilder.append(((bqi)object).e);
        stringBuilder.append(", drafter_guesses_per_position: ");
        stringBuilder.append(Collection$_EL.stream(((bqi)object).c).map(new bpf(0)).collect(Collectors.joining(", ")));
        stringBuilder.append("}");
        gzy2.d("speculativeDecodeStatistics", stringBuilder.toString());
        gzy2.d("numSuffixScoreFiltered", this.B);
        gzy2.d("numPostDeduped", this.C);
        gzy2.d("inferenceStatefulSuspensionLatencyMillis", this.D);
        gzy2.d("inferenceStatelessSuspensionLatencyMillis", this.E);
        gzy2.d("topCannedResponseIndex", this.F);
        gzy2.d("inferenceStatefulSuspensionCount", this.G);
        gzy2.d("inferenceStatefulResumptionCount", this.H);
        gzy2.d("inferenceStatelessSuspensionCount", this.I);
        gzy2.d("inferenceStatelessResumptionCount", this.J);
        gzy2.d("requestKind", this.K);
        gzy2.d("initialQueuePosition", this.L);
        gzy2.d("inferenceStartTimestampMillis", this.N);
        return "InferenceEventTraceResult\n".concat(fvd.r(gzy2.b()));
    }

    public final void writeToParcel(Parcel parcel, int n2) {
        n2 = this.a;
        int n3 = kl.u(parcel);
        kl.A(parcel, 1, n2);
        kl.A(parcel, 2, this.c);
        kl.A(parcel, 3, this.d);
        kl.A(parcel, 4, this.e);
        kl.B(parcel, 5, this.f);
        kl.A(parcel, 6, this.g);
        kl.A(parcel, 7, this.h);
        kl.A(parcel, 8, this.i);
        kl.B(parcel, 9, this.j);
        kl.B(parcel, 10, this.k);
        kl.B(parcel, 11, this.l);
        kl.B(parcel, 12, this.m);
        kl.B(parcel, 13, this.n);
        kl.B(parcel, 14, this.o);
        kl.A(parcel, 15, this.p);
        kl.A(parcel, 16, this.q);
        kl.A(parcel, 17, this.r);
        kl.A(parcel, 18, this.s);
        kl.x(parcel, 19, this.t);
        kl.A(parcel, 20, this.u);
        kl.B(parcel, 21, this.v);
        kl.y(parcel, 22, this.w);
        kl.y(parcel, 23, this.x);
        kl.A(parcel, 24, this.y);
        kl.z(parcel, 25, 4);
        parcel.writeFloat(this.z);
        kl.D(parcel, 26, this.A);
        kl.A(parcel, 27, this.B);
        kl.A(parcel, 28, this.C);
        kl.B(parcel, 29, this.D);
        kl.B(parcel, 30, this.E);
        kl.A(parcel, 31, this.F);
        kl.A(parcel, 32, this.G);
        kl.A(parcel, 33, this.H);
        kl.A(parcel, 34, this.I);
        kl.A(parcel, 35, this.J);
        kl.A(parcel, 36, this.K);
        kl.A(parcel, 37, this.L);
        kl.A(parcel, 38, this.M);
        kl.B(parcel, 39, this.N);
        kl.B(parcel, 40, this.b);
        kl.w(parcel, n3);
    }
}

