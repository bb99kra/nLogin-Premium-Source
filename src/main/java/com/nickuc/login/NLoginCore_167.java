/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_171;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_427;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_532;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_459;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_173;
import com.nickuc.login.NLoginCore_112;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_062;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_092;
import com.nickuc.login.NLoginCore_323;
import com.nickuc.login.NLoginCore_218;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_270;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_446;
import com.nickuc.login.NLoginCore_004;
import com.nickuc.login.NLoginCore_436;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_138;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_324;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_523;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_151;
import com.nickuc.login.NLoginCore_387;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;

public class NLoginCore_167
implements NLoginCore_151 {
    private static long ap;
    private static long fu;
    private static int db;
    private static int ek;
    private static int ha;
    private static int ea;
    private static long gj;
    private static int fs;
    private static int dp;
    private static int hf;
    private static int gy;
    private static int ck;
    private static int ec;
    private static int as;
    private static long m;
    private static long t;
    private static long ag;
    private static int ff;
    private static int bn;
    private static int dk;
    private static int bz;
    private static long l;
    private static int bx;
    private static int k;
    private static int i;
    public static final NLoginCore_167 var_com_nickuc_login_NLoginCore_167_a;
    private static int gt;
    private static int gh;
    private static long dx;
    private static int aq;
    private static long ev;
    private static int cr;
    private static long bv;
    private static long ah;
    private static int av;
    private static long cz;
    private static long f;
    private static int bi;
    private static long eb;
    private static int ds;
    private static int r;
    private static long fn;
    private static int gc;
    private static int gi;
    private static long ce;
    private static int bq;
    private static int eu;
    private static int cy;
    private static int fe;
    private static int gu;
    private static int ae;
    private static long gs;
    private static int dv;
    private static int cp;
    private static int hb;
    private static int cv;
    private static int em;
    private static long j;
    private static int u;
    private static int ee;
    private static long s;
    private static int ci;
    private static int cc;
    private static int af;
    private static long d;
    private static long p;
    private static long g;
    private static long ei;
    private static int en;
    private static int ao;
    private static int dm;
    private static int cq;
    private static int e;
    private static int bo;
    private static int bk;
    private static int gl;
    private static long ax;
    private static int gd;
    private static long dg;
    private static long al;
    private static int ew;
    private static int fh;
    private static long cw;
    private static long dt;
    private static long fr;
    private static long er;
    private static int an;
    private static int fk;
    private static int aw;
    private static int gm;
    private static int bp;
    private static long ac;
    private static int cl;
    private static int gb;
    private static int de;
    private static long hc;
    private static int gx;
    private static long gw;
    private static int bs;
    private static int da;
    private static long var_long_b;
    private static long du;
    private static int bc;
    private static int go;
    private static int ct;
    private static long cm;
    private static int gq;
    private static int dy;
    private static long cx;
    private static int be;
    private static long gv;
    private static int bh;
    private static int fa;
    private static int he;
    private static int dz;
    private static int fb;
    private static int bl;
    private static int cf;
    private static int eo;
    private static long ey;
    private static int ch;
    private static int et;
    private static long cn;
    private static long br;
    private static int df;
    private static long gk;
    private static int dh;
    private static int by;
    private static long fx;
    private static long fo;
    private static int fp;
    private static int bd;
    private static long ay;
    private static int eq;
    private static int di;
    private static int bf;
    private static int bm;
    private static long hg;
    private static int fd;
    private static int ep;
    private static long ca;
    private static int ge;
    private static int ft;
    private static long bb;
    private static int dn;
    private static int hd;
    private static int ej;
    private static long fy;
    private static int v;
    private static int cu;
    private static int fq;
    private static long gg;
    private static int fi;
    private static int q;
    private static int fm;
    private static int cfr_renamed_1;
    private static long c;
    private static int o;
    private static int hj;
    private static int h;
    private static int var_int_a;
    private static long ad;
    private static long ef;
    private static int dl;
    private static int z;
    private static long gz;
    private static int cg;
    private static int el;
    private static int cs;
    private static long bu;
    private static long cd;
    private static int bw;
    private static int eg;
    private static long ex;
    private static int ab;
    private static long dw;
    private static int y;
    private static long dq;
    private static int am;
    private static long aa;
    private static long hh;
    private static long eh;
    private static int ai;
    private static long dd;
    private static long x;
    private static long cj;
    private static int ez;
    private static int fg;
    private static int aj;
    private static int bt;
    private static long fv;
    private static int bg;
    private static long au;
    private static int co;
    private static int fw;
    private static int cb;
    private static int ga;
    private static int gr;
    private static long w;
    private static int n;
    private static String[] var_java_lang_String_arr_b;
    private static int fc;
    private static int az;
    private static int gf;
    private static int fl;
    private static String[] var_java_lang_String_arr_a;
    private static int ed;
    private static int hi;
    private static long at;
    private static int gn;
    private static int dj;
    private static int gp;
    private static int fj;
    private static int fz;
    private static long es;
    private static int ar;
    private static long ak;
    private static long ba;
    private static long dc;
    private static long dr;
    private static int bj;

    @Override
    public void void_a(NLoginType_008 NLoginType_008, NLoginCore_523 NLoginCore_4952, NLoginCore_459 NLoginCore_459) {
        Object object;
        Object object2;
        Object object3;
        AutoCloseable autoCloseable;
        NLoginCore_270 NLoginCore_2702 = new NLoginCore_270();
        if (NLoginCore_150.j()) {
            NLoginCore_370.c((String)NLoginCore_167.c("㺀", (int)e, (long)(f ^ g)), new Object[h]);
            NLoginCore_370.c((String)NLoginCore_167.c("㺃", (int)i, (long)j) + this.q() + (String)NLoginCore_167.c("㺆", (int)k, (long)(l ^ m)), new Object[n]);
            NLoginCore_370.c((String)NLoginCore_167.c("㺉", (int)o, (long)p), new Object[q]);
            NLoginCore_370.c((String)NLoginCore_167.c("㺌", (int)r, (long)(s ^ t)), new Object[u]);
        } else {
            NLoginCore_370.c((String)NLoginCore_167.c("㺏", (int)v, (long)(w ^ x)), new Object[y]);
            NLoginCore_370.c((String)NLoginCore_167.c("㺒", (int)z, (long)aa) + this.q() + (String)NLoginCore_167.c("㺕", (int)ab, (long)(ac ^ ad)), new Object[ae]);
            NLoginCore_370.c((String)NLoginCore_167.c("㺘", (int)af, (long)(ag ^ ah)), new Object[ai]);
            NLoginCore_370.c((String)NLoginCore_167.c("㺛", (int)aj, (long)(ak ^ al)), new Object[am]);
        }
        NLoginCore_370.c((String)NLoginCore_167.c("㺞", (int)(an & ao), (long)ap), new Object[aq]);
        String string2 = NLoginCore_532.e.a(new Object[ar]);
        String string3 = string2 + (String)NLoginCore_167.c("㺡", (int)as, (long)(at ^ au));
        this.a(NLoginCore_459, string2, string3);
        try {
            NLoginCore_4952.a(av != 0);
        }
        catch (Exception exception) {
            if (exception.getMessage().contains((CharSequence)NLoginCore_167.c("㺤", (int)aw, (long)(ax ^ ay))) && exception.getMessage().contains((CharSequence)NLoginCore_167.c("㺧", (int)az, (long)(ba ^ bb)))) {
                return;
            }
            throw exception;
        }
        CharSequence[] charSequenceArray = new String[bc];
        charSequenceArray[NLoginCore_167.bd] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_a.getName();
        charSequenceArray[NLoginCore_167.be] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_b.getName();
        charSequenceArray[NLoginCore_167.bf] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_c.getName();
        charSequenceArray[NLoginCore_167.bg] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_d.getName();
        charSequenceArray[NLoginCore_167.bh] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_e.getName();
        charSequenceArray[NLoginCore_167.bi] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_f.getName();
        charSequenceArray[NLoginCore_167.bj] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_g.getName();
        charSequenceArray[NLoginCore_167.bk] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_h.getName();
        charSequenceArray[NLoginCore_167.bl] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_i.getName();
        charSequenceArray[NLoginCore_167.bm] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_j.getName();
        charSequenceArray[NLoginCore_167.bn] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_k.getName();
        charSequenceArray[NLoginCore_167.bo] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_l.getName();
        CharSequence[] charSequenceArray2 = charSequenceArray;
        NLoginCore_370.c((String)NLoginCore_167.c("㺪", (int)(bp & bq), (long)br), new Object[bs]);
        Object[] objectArray = new Object[bw];
        objectArray[NLoginCore_167.bx] = string2;
        objectArray[NLoginCore_167.by] = String.join((CharSequence)NLoginCore_167.c("㺰", (int)bz, (long)ca), charSequenceArray2);
        objectArray[NLoginCore_167.cb] = String.join((CharSequence)NLoginCore_167.c("㺳", (int)cc, (long)(cd ^ ce)), charSequenceArray2);
        objectArray[NLoginCore_167.cf] = string3;
        NLoginCore_459.void_a(String.format((String)NLoginCore_167.c("㺭", (int)bt, (long)(bu ^ bv)), objectArray), new Object[cg]);
        NLoginCore_370.c((String)NLoginCore_167.c("㺶", (int)(ch & ci), (long)cj), new Object[ck]);
        Object[] objectArray2 = new Object[co];
        objectArray2[NLoginCore_167.cp] = NLoginCore_532.r.a(new Object[cq]);
        objectArray2[NLoginCore_167.cr] = NLoginCore_532.t.a(new Object[cs]);
        Object[] objectArray3 = new Object[ct];
        objectArray3[NLoginCore_167.cu] = NLoginCore_167.c("㺼", (int)cv, (long)(cw ^ cx));
        NLoginCore_459.void_a(String.format((String)NLoginCore_167.c("㺹", (int)cl, (long)(cm ^ cn)), objectArray2), objectArray3);
        NLoginCore_370.c((String)NLoginCore_167.c("㺿", (int)cy, (long)cz), new Object[da]);
        Object[] objectArray4 = new Object[dh];
        objectArray4[NLoginCore_167.di] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_f.getName();
        objectArray4[NLoginCore_167.dj] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_c.getName();
        objectArray4[NLoginCore_167.dk] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_d.getName();
        objectArray4[NLoginCore_167.dl] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_e.getName();
        objectArray4[NLoginCore_167.dm] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_f.getName();
        Object[] objectArray5 = new Object[dn];
        objectArray5[NLoginCore_167.cfr_renamed_1] = NLoginCore_167.c("㻈", (int)dp, (long)(dq ^ dr));
        Integer n = NLoginCore_459.b(String.format((String)NLoginCore_167.c("㻂", (int)db, (long)(dc ^ dd)) + string2 + (String)NLoginCore_167.c("㻅", (int)(de & df), (long)dg), objectArray4), objectArray5).d();
        NLoginCore_370.c((String)NLoginCore_167.c("㻋", (int)ds, (long)(dt ^ du)) + NLoginCore_112.d(n.intValue()) + (String)NLoginCore_167.c("㻎", (int)dv, (long)(dw ^ dx)), new Object[dy]);
        NLoginCore_370.c((String)NLoginCore_167.c("㻑", (int)(dz & ea), (long)eb), new Object[ec]);
        HashMap<String, List> hashMap = new HashMap<String, List>();
        Object[] objectArray6 = new Object[ej];
        objectArray6[NLoginCore_167.ek] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_c.getName();
        objectArray6[NLoginCore_167.el] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_c.getName();
        objectArray6[NLoginCore_167.em] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_c.getName();
        objectArray6[NLoginCore_167.en] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_c.getName();
        try (AutoCloseable autoCloseable2 = NLoginCore_459.com_nickuc_login_NLoginCore_171_a(String.format((String)NLoginCore_167.c("㻔", (int)(ed & ee), (long)ef) + string2 + (String)NLoginCore_167.c("㻗", (int)eg, (long)(eh ^ ei)), objectArray6), new Object[eo]);){
            autoCloseable = (ResultSet)((NLoginCore_218)((Object)autoCloseable2)).d();
            while (autoCloseable.next()) {
                hashMap.computeIfAbsent(autoCloseable.getString(ep), string -> new ArrayList());
            }
        }
        NLoginCore_370.c((String)NLoginCore_167.c("㻚", (int)eq, (long)(er ^ es)), new Object[et]);
        autoCloseable2 = NLoginCore_459.java_sql_Connection_a();
        autoCloseable = null;
        try {
            HashSet hashSet = new HashSet(hashMap.keySet());
            Object object4 = hashSet.iterator();
            while (object4.hasNext()) {
                object3 = (String)object4.next();
                Object[] objectArray7 = new Object[ez];
                objectArray7[NLoginCore_167.fa] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_a.getName();
                objectArray7[NLoginCore_167.fb] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_d.getName();
                objectArray7[NLoginCore_167.fc] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_e.getName();
                objectArray7[NLoginCore_167.fd] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_c.getName();
                autoCloseable = autoCloseable2.prepareStatement(String.format((String)NLoginCore_167.c("㻝", (int)eu, (long)ev) + string2 + (String)NLoginCore_167.c("㻠", (int)ew, (long)(ex ^ ey)), objectArray7));
                autoCloseable.setString(fe, (String)object3);
                object2 = autoCloseable.executeQuery();
                while (object2.next()) {
                    object = hashMap.computeIfAbsent((String)object3, string -> new ArrayList());
                    object.add(new NLoginCore_062(object2.getLong(ff), (object2.getString(fg) != null ? fh : fi) != 0, (object2.getString(fj) != null ? fk : fl) != 0, null));
                }
                autoCloseable.close();
                autoCloseable = null;
            }
        }
        catch (SQLException sQLException) {
            throw sQLException;
        }
        finally {
            if (autoCloseable != null) {
                autoCloseable.close();
            }
            NLoginCore_459.a((Connection)autoCloseable2);
        }
        NLoginCore_370.c((String)NLoginCore_167.c("㻣", (int)fm, (long)(fn ^ fo)) + NLoginCore_112.d(hashMap.size()) + (String)NLoginCore_167.c("㻦", (int)(fp & fq), (long)fr), new Object[fs]);
        block15: for (Object object4 : hashMap.values()) {
            object3 = null;
            object2 = object4.iterator();
            while (object2.hasNext()) {
                object = (NLoginCore_062)object2.next();
                if (NLoginCore_062.boolean_a((NLoginCore_062)object)) break block15;
                if (NLoginCore_062.b((NLoginCore_062)object)) continue;
                if (object3 != null) break block15;
                object3 = NLoginCore_062.long_a((NLoginCore_062)object);
            }
            if (object3 == null) continue;
            Object[] objectArray8 = new Object[fz];
            objectArray8[NLoginCore_167.ga] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_c.getName();
            objectArray8[NLoginCore_167.gb] = NLoginCore_436.var_com_nickuc_login_NLoginCore_436_a.getName();
            Object[] objectArray9 = new Object[gc];
            objectArray9[NLoginCore_167.gd] = null;
            objectArray9[NLoginCore_167.ge] = object3;
            NLoginCore_459.void_a(String.format((String)NLoginCore_167.c("㻩", (int)ft, (long)(fu ^ fv)) + string2 + (String)NLoginCore_167.c("㻬", (int)fw, (long)(fx ^ fy)), objectArray8), objectArray9);
        }
        NLoginCore_370.c((String)NLoginCore_167.c("㻯", (int)gf, (long)gg) + NLoginCore_2702.a(TimeUnit.SECONDS, gh) + (String)NLoginCore_167.c("㻲", (int)gi, (long)(gj ^ gk)), new Object[gl]);
    }

    private static void b() {
        int n;
        c = -2134777120898944238L;
        long l = c ^ 0x3CC298D6A91CA995L;
        Cipher cipher = Cipher.getInstance(new String(new byte[]{(byte)(32 + 36), (byte)(7 + 62), (byte)(68 + 15), (byte)(5 + 42), (byte)(64 + 3), 66, (byte)(49 + 18), (byte)(23 + 24), (byte)(71 + 9), (byte)(67 + 8), (byte)(66 + 1), (byte)(36 + 47), (byte)(48 + 5), (byte)(57 + 23), (byte)(3 + 94), (byte)(47 + 53), 100, (byte)(33 + 72), (byte)(44 + 66), (byte)(33 + 70)}, StandardCharsets.UTF_8));
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{68, 69, (byte)(70 + 13)}, StandardCharsets.UTF_8));
        byte[] byArray = new byte[8];
        byArray[0] = (byte)(l >>> 56);
        for (n = 1; n < 8; ++n) {
            byArray[n] = (byte)(l << n * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
        n = 1;
        block7: for (int i = 0; i < n; ++i) {
            switch (i) {
                case 0: {
                    NLoginCore_167.var_java_lang_String_arr_b[0] = NLoginCore_559.B("ŀĿŠĦĳħŪĨŃķŌĬřīūĿŪţĨŊůłŗŸŹőŮŪŋŕƀő", (byte)54, 66);
                    NLoginCore_167.var_java_lang_String_arr_b[1] = NLoginCore_223.B("ğİĳĸŖňţŠńśŊĳ", (byte)54, 66);
                    NLoginCore_167.var_java_lang_String_arr_b[2] = NLoginCore_223.F("ՃԞ՚ՂՅթ՟եՌԪԲԬՋՎըՃՔՄջչմտլ՘ԵԻ՗ցհճդժժչՄչ֍՜֍ՒթժհՍր֓գՖ֓֐֗է֔Ւց֔՟֔կ֏֨֩յ՜մ֢օլ֍ւ֥֊րճ֣պ", (byte)54, 70);
                    NLoginCore_167.var_java_lang_String_arr_b[3] = NLoginCore_027.B("ĖļįťŘũŧĦħīĺĳ", (byte)54, 66);
                    NLoginCore_167.var_java_lang_String_arr_b[4] = NLoginCore_384.F("ԣԩՊ՛ԹէԽՂհՍՃշՃՕՌ՚եըջճջԹԹՁի՘կՐրՔՈՂՔբզՍօլռՋֈկտխբ֘ՑՓշըՖՔռմն֔ՙվջծճզֆզ֌չէ֜։֐֦֢֯֒֨ճ֤֭֗նֶֺշֺ֚֊֌ְִֻ֔օ֣֤֠֟", (byte)54, 70);
                    NLoginCore_167.var_java_lang_String_arr_b[5] = NLoginCore_173.E("ԦԷԺԿ՝ՏժէՋբՑԺ", (byte)54, 69);
                    NLoginCore_167.var_java_lang_String_arr_b[6] = NLoginCore_446.B("ğİĳĸŖňţŠńśŊĳ", (byte)54, 66);
                    NLoginCore_167.var_java_lang_String_arr_b[7] = NLoginCore_451.C("ҞҤӈҰӁӎҟӍӀҐҲҵӒӐҐӏӛҽҾңӚүҷӟӇӚҡӘӚҟӫӘӅӮӏӲӄөҾӠүҴӤӼӌӜҸӬӴӿԃԁӾәӵӄӁӴӥԃӺӮӟԈ", (byte)54, 67);
                    NLoginCore_167.var_java_lang_String_arr_b[8] = NLoginCore_559.C("҂ҨқӑӄӕӓҒғҗҦҟ", (byte)54, 67);
                    NLoginCore_167.var_java_lang_String_arr_b[9] = NLoginCore_201.E("ԳՅ՗ԮՀգ԰ՌՁեթՃեՓԹծՑՆՍՊձժՑռՖՌխկւ՞Ք՘՝Չ՜ռփգփ՚՛ժ֖ՠխմճբև֏Փջ֌ը֒ՙ՚Ֆր֦֝֠՛զֆբջ֋֛֘֟լֆտֹ֤֥֮շ֑ձ֪֬֯տֈօֆ", (byte)54, 69);
                    NLoginCore_167.var_java_lang_String_arr_b[10] = NLoginCore_091.A("ğİĳĸŖňţŠńśŊĳ", (byte)54, 65);
                    NLoginCore_167.var_java_lang_String_arr_b[11] = NLoginCore_027.F("ԴԢթգ՟Ո՟ՌԭԮՒՓոկԴշ՚Իետլսհ՛դԽնծԽհ՜է", (byte)54, 70);
                    NLoginCore_167.var_java_lang_String_arr_b[12] = NLoginCore_076.F("ԣՍ՞կՃձԱղՅկէԺ", (byte)54, 70);
                    NLoginCore_167.var_java_lang_String_arr_b[13] = NLoginCore_027.C("ҞҩӓҾҡҤҩӈғҕґҟ", (byte)54, 67);
                    NLoginCore_167.var_java_lang_String_arr_b[14] = NLoginCore_451.D("ҚӐӇ҉ҋӏґҗӆҲӍӜӈҬӝӘӟӕҪүҹӓҪҫ", (byte)54, 68);
                    NLoginCore_167.var_java_lang_String_arr_b[15] = NLoginCore_091.B("ťĮŝŗŃĠŜņŖūŌũŌŮĭŦŏĳŞœŒİķķŰĳŏŴĹŘŖŒ", (byte)54, 66);
                    NLoginCore_167.var_java_lang_String_arr_b[16] = NLoginCore_076.B("ŠŒŢĺĳĹĸīĸĿĦŦŭšŮĥŉĲŦūŰŭĶķŹŲŞōųŜŪōŌŽżŜŨŤŴƅśŕŇƊŎŤƈŎŏŔžŦƕŷŦœŤœƓŸƋƝŪų", (byte)54, 66);
                    NLoginCore_167.var_java_lang_String_arr_b[17] = NLoginCore_091.F("բԼՍ՛աԻԱՌղՄԽԺ", (byte)54, 70);
                    NLoginCore_167.var_java_lang_String_arr_b[18] = NLoginCore_201.C("ӇҡҲӀӆҠҖұӗҩҢҟ", (byte)54, 67);
                    NLoginCore_167.var_java_lang_String_arr_b[19] = NLoginCore_027.C("ҚӎӑұӒӑңҳҴҦӛӛһӈӉһӀҿӋӖҜүӕҙӒҥӤҪҾӍӋӪ", (byte)54, 67);
                    NLoginCore_167.var_java_lang_String_arr_b[20] = NLoginCore_451.D("ӍҿҩґҊҏҤҰӉӏҶӆӇҧӚҸӒӍӂӎҚӖӂӅҢӧӪҤҷӃӜӋӥӥӤӜӎҲӟұӬҰӂҿ", (byte)54, 68);
                    NLoginCore_167.var_java_lang_String_arr_b[21] = NLoginCore_201.F("ԻթդդԬՠՎՋՒըՐխՠճճՐՙՅկոԿվՅՆ", (byte)54, 70);
                    NLoginCore_167.var_java_lang_String_arr_b[22] = NLoginCore_110.A("ĮŢťŅŦťķŇňĺůłħūŀşĳńĿųĸŔŦńůŬſŶŽŌŪřƁŀƆŧŲńƊŔƅŉƀœ", (byte)54, 65);
                    NLoginCore_167.var_java_lang_String_arr_b[23] = NLoginCore_223.E("ը՚ՄԬԥԪԿՋդժՔՌՁոլՅՋՉձՕԵվՅՆ", (byte)54, 69);
                    NLoginCore_167.var_java_lang_String_arr_b[24] = NLoginCore_201.C("ӂҥӀҫӌӇӑҟҕҵҹӊӎҰәҳҰҭҪҴӜӚҹӚӒӉӆңөӮӦҦӯӍҩӫӝөҨүӣӫӺҺәӓӌӯӑӮӳӖӛԄԆӲӺӕӞӤӠҿӨӏԂӜԋӋԉӫԆӓԑӯӴԕԐӏԜӧԛӡӳӶԔӠԖӰӿӳԟӼԢӬӶԈԂԣӪӥԅԨԕԓԵӷԆԹԐԫԉԘԨԖԚԻԿԝԊԋ", (byte)54, 67);
                    NLoginCore_167.var_java_lang_String_arr_b[25] = NLoginCore_110.F("ԴԴՖԽ՘Կԩբ՞հԯմԵշՎՂՅՌյյկվՅՆ", (byte)54, 70);
                    NLoginCore_167.var_java_lang_String_arr_b[26] = NLoginCore_324.D("ӐҟҮҭӅҵӔӊҎүӆӔӍӜәҪӚҳӁҰӖҭҪҫ", (byte)54, 68);
                    NLoginCore_167.var_java_lang_String_arr_b[27] = NLoginCore_092.E("ԧԪբժԪԫըԻմՓՆՈյճչճԳՎկջՌԻշՙլչֆԾռՒֈի", (byte)54, 69);
                    NLoginCore_167.var_java_lang_String_arr_b[28] = NLoginCore_091.C("҆ӎҏӇӃӏҟӑӌӕӎӏҴҴҿқӏҶӠҚңӍҟҾӔӆҳӆҩӊӧӐҭҿһҽӍӝӭӍӳҴӸҿ", (byte)54, 67);
                    NLoginCore_167.var_java_lang_String_arr_b[29] = NLoginCore_027.D("ҊүқҥӕҵӋґґӖӍҒҮӜҗҸүӔҼӣҜҵӝҧҦҢӇӤҿҨҿӦӉҮӍӏӑӐӍӐӇҹұҿ", (byte)54, 68);
                    NLoginCore_167.var_java_lang_String_arr_b[30] = NLoginCore_384.E("եԽԭՊ՜՞Թԩ԰Ջԭ՗յՄձի՚կոՐէմջաԻՓԼՐՀտՇեթնօ՝֍՛իծ֌րիգդ֊֒֊֒։ՙվ֙ոեզ", (byte)54, 69);
                    NLoginCore_167.var_java_lang_String_arr_b[31] = NLoginCore_387.F("ԡթԪբ՞ժԺլէհթժՏՏ՚ԶժՑջԵԾըԺՙկաՎաՄեւի֊բքա՞է֑ՋՅ֍ճ֓֌ժն֘ձէ֎ՙֈըեզ", (byte)54, 70);
                    NLoginCore_167.var_java_lang_String_arr_b[32] = NLoginCore_027.E("ԥՊԶՀհՐզԬԬձթՇնմՆՑԹ՚հՋՠՏՋՓՐճՀփջ՛ղոՄռնծչծկ։բցՌ՚", (byte)54, 69);
                    NLoginCore_167.var_java_lang_String_arr_b[33] = NLoginCore_138.E("ՅՙԭՇըձԧ՚ՎՄզԴՈՊՉՋճՙ՗՟Ռ՘ՅՆ", (byte)54, 69);
                    NLoginCore_167.var_java_lang_String_arr_b[34] = NLoginCore_559.A("ĮŢťŅŦťķŇňĺůłħūŀşĳńĿųĸřŗŏũĻũŘŌūźźŝŰŕŻśŦƃňƃŝŖœ", (byte)54, 65);
                    NLoginCore_167.var_java_lang_String_arr_b[35] = NLoginCore_027.B("ĖļįťŘũŧĦħīĺĳ", (byte)54, 66);
                    NLoginCore_167.var_java_lang_String_arr_b[36] = NLoginCore_110.B("ŤŜĥŒťķĶĵĤłĹŏŠūĲőŢŶŠŰĲŷľĿ", (byte)54, 66);
                    NLoginCore_167.var_java_lang_String_arr_b[37] = NLoginCore_453.B("ţĤţœŖĥĩŌļŠŤĽĪŉŁŤŔŏŇŭšŷŤķżņŸōŐƂŵųŗĻƅŁŧżŜƌŃƃŚœ", (byte)54, 66);
                    NLoginCore_167.var_java_lang_String_arr_b[38] = NLoginCore_223.C("ҺӃӆӎҍҿҿӊҷӇҕҸҷҔҗӈӉӌҵҮӝҹҲҹҤҿӔӁҤҧӜӚ", (byte)54, 67);
                    NLoginCore_167.var_java_lang_String_arr_b[39] = NLoginCore_575.B("ĳĿŁŦĽĴŘŗĴĦŘĳ", (byte)54, 66);
                    NLoginCore_167.var_java_lang_String_arr_b[40] = NLoginCore_201.A("ĜņŗŨļŪĪūľŨŠĳ", (byte)54, 65);
                    NLoginCore_167.var_java_lang_String_arr_b[41] = NLoginCore_384.E("զ՛Ԥ՛ԾձՏԱԽէՖՆԩՖԳՅղԴ՝խղ՘ՅՆ", (byte)54, 69);
                    NLoginCore_167.var_java_lang_String_arr_b[42] = NLoginCore_027.B("ŖĹŔĿŠśťĳĩŉŌįŢłŢŔőŭŕőŹŁľĿ", (byte)54, 66);
                    NLoginCore_167.var_java_lang_String_arr_b[43] = NLoginCore_027.A("ĻĺŔŝŉťťŢŀĸŨĳ", (byte)54, 65);
                    NLoginCore_167.var_java_lang_String_arr_b[44] = NLoginCore_027.A("ĴŢŝŝĥřŇńŋšŉŦřŬŬŉŒľŨűĸŷľĿ", (byte)54, 65);
                    continue block7;
                }
                case 1: {
                    NLoginCore_167.var_java_lang_String_arr_b[0] = NLoginCore_324.D("ҬҫӌҒҟғӖҔүңҸҘӅҗӗҫӖӏҔҶӛҵӓәӜҦӡӦӉҥӡӨ", (byte)54, 68);
                    NLoginCore_167.var_java_lang_String_arr_b[1] = NLoginCore_138.D("ӈүҰӊҎӏғҴӕәӄҟ", (byte)54, 68);
                    NLoginCore_167.var_java_lang_String_arr_b[2] = NLoginCore_201.E("ՃԞ՚ՂՅթ՟եՌԪԲԬՋՎըՃՔՄջչմտլ՘ԵԻ՗ցհճդժժչՄչ֍՜֍ՒթժհՍր֓գՖ֓֐֗է֔Ւց֔՟֔կ֏֨֩յ՜ր։֧֛ևֈրְְ֧սպ", (byte)54, 69);
                    NLoginCore_167.var_java_lang_String_arr_b[3] = NLoginCore_092.C("ҿҤҟңҤңҟӘӅҨҕҟ", (byte)54, 67);
                    NLoginCore_167.var_java_lang_String_arr_b[4] = NLoginCore_427.C("҈ҎүӀҞӌҢҧӕҲҨӜҨҺұҿӊӍӠӘӠҞҞҦӐҽӔҵӥҹҭҧҹӇӋҲӪӑӡҰӭӔӤӒӇӽҶҸӜӍһҹӡәӛӹҾӣӠӓӘӋӫӋӱӞӌԁӮӵԔԋӷԍԇӘԉԒӼӛԛԟӜӿԟӯԕԀԉӸԧԠԈԃԉԈ", (byte)54, 67);
                    NLoginCore_167.var_java_lang_String_arr_b[5] = NLoginCore_173.B("ıėĝķģŀťĢŇłľĳ", (byte)54, 66);
                    NLoginCore_167.var_java_lang_String_arr_b[6] = NLoginCore_223.D("ҊӃҽҤҋӊӍҕҪӌҕҟ", (byte)54, 68);
                    NLoginCore_167.var_java_lang_String_arr_b[7] = NLoginCore_091.D("ҞҤӈҰӁӎҟӍӀҐҲҵӒӐҐӏӛҽҾңӚүҷӟӇӚҡӘӚҟӫӘӅӮӏӲӄөҾӠүҴӤӼӌӜҸӬӴӿԃԁӾӐӼӞӧӡԇӝӌӖӼӥ", (byte)54, 68);
                    NLoginCore_167.var_java_lang_String_arr_b[8] = NLoginCore_559.C("ҡҤӈӍӄӈҲӐұәӐҟ", (byte)54, 67);
                    NLoginCore_167.var_java_lang_String_arr_b[9] = NLoginCore_173.F("ԳՅ՗ԮՀգ԰ՌՁեթՃեՓԹծՑՆՍՊձժՑռՖՌխկւ՞Ք՘՝Չ՜ռփգփ՚՛ժ֖ՠխմճբև֏Փջ֌ը֒ՙ՚Ֆր֦֝֠՛զֆբջ֋֛֘֟լֆտ֤վֈֈճօջֱ֛֛֫ո֢֏׀ֵ֥֤֙׆ֿր", (byte)54, 70);
                    NLoginCore_167.var_java_lang_String_arr_b[10] = NLoginCore_091.B("ōĭťŜņŉŇĪŅŊŠĳ", (byte)54, 66);
                    NLoginCore_167.var_java_lang_String_arr_b[11] = NLoginCore_446.D("ҙ҇ӎӈӄҭӄұҒғҷҸӝӔҙӜҿҠӊӤӑӟҲұӢұӅҤӧӃӪӥ", (byte)54, 68);
                    NLoginCore_167.var_java_lang_String_arr_b[12] = NLoginCore_384.B("ťĢŚŅŞŧŨňļŘŗŉŬŊţŎŢŠūŎőŁľĿ", (byte)54, 66);
                    NLoginCore_167.var_java_lang_String_arr_b[13] = NLoginCore_004.E("ժՂԵթթԺՎԲժՆՀհէԲղՃԱծԯԽրՈՅՆ", (byte)54, 69);
                    NLoginCore_167.var_java_lang_String_arr_b[14] = NLoginCore_559.D("ҚӐӇ҉ҋӏґҗӆҲӎӚӍӜҰҩҮҜҮҷӘӦҹҧҴӘҡӊҿӡӬӗ", (byte)54, 68);
                    NLoginCore_167.var_java_lang_String_arr_b[15] = NLoginCore_173.F("լԵդ՞ՊԧգՍ՝ղՓհՓյԴխՖԺե՚ՙԼԿ՘Ճպ՛ձֈէցպ", (byte)54, 70);
                    NLoginCore_167.var_java_lang_String_arr_b[16] = NLoginCore_453.C("ӌҾӎҦҟҥҤҗҤҫҒӒәӍӚґҵҞӒӗӜәҢңӥӞӊҹӟӈӖҹҸөӨӈӔӐӠӱӇӁҳӶҺӐӴҺһӀӪӒԁӰԅԄӠӓԂӽӞӨӥԇ", (byte)54, 67);
                    NLoginCore_167.var_java_lang_String_arr_b[17] = NLoginCore_027.A("ğİĻŔšĴļĵģńŀţņŜļłŒĿŬŖŗŁľĿ", (byte)54, 65);
                    NLoginCore_167.var_java_lang_String_arr_b[18] = NLoginCore_091.B("ķĴœĥĲŤŧŠĢĵĭĳ", (byte)54, 66);
                    NLoginCore_167.var_java_lang_String_arr_b[19] = NLoginCore_384.E("ԵթլՌխլԾՎՏՁննՖգդՖ՛՚զձԷՊ՞ճվՐվնղդ՜ֆ", (byte)54, 69);
                    NLoginCore_167.var_java_lang_String_arr_b[20] = NLoginCore_559.E("ը՚ՄԬԥԪԿՋդժՑաբՂյՓխը՝թԵձ՝ՠԽւօԿՒ՞շզգզռ՜ՙաՊ֋դ՞կ֊Ցյլ֕Ք֌֖տտըեզ", (byte)54, 69);
                    NLoginCore_167.var_java_lang_String_arr_b[21] = NLoginCore_027.B("ĴŢŝŝĥřŇńŋšņķŐĽűŢũŠıńłŷľĿ", (byte)54, 66);
                    NLoginCore_167.var_java_lang_String_arr_b[22] = NLoginCore_091.F("ԵթլՌխլԾՎՏՁնՉԮղՇզԺՋՆպԿ՛խՋնճֆսքՓձՠքխգռծվ֋֋֔ի֏֔ՖճՕն֒֘֔իի֞եզ", (byte)54, 70);
                    NLoginCore_167.var_java_lang_String_arr_b[23] = NLoginCore_575.F("ը՚ՄԬԥԪԿՋդժՒԨԷձյՅթիսզծմժփՑղեչռՖբգ", (byte)54, 70);
                    NLoginCore_167.var_java_lang_String_arr_b[24] = NLoginCore_027.C("ӂҥӀҫӌӇӑҟҕҵҹӊӎҰәҳҰҭҪҴӜӚҹӚӒӉӆңөӮӦҦӯӍҩӫӝөҨүӣӫӺҺәӓӌӯӑӮӳӖӛԄԆӲӺӕӞӤӠҿӨӏԂӜԋӋԉӫԆӓԑӯӴԕԐӏԜӧԛӡӳӶԔӠԖӰӿӳԟӼԢӬӶԈԂԣӪӥԅԨԕԓԵӷԈԋԻӸԫԨԶԻՀԞԒԳԊԋ", (byte)54, 67);
                    NLoginCore_167.var_java_lang_String_arr_b[25] = NLoginCore_446.C("ҙҙһҢҽҤҎӇӃӕҔҪӛӓӊӎүҪӠӁӔӓҪҫ", (byte)54, 67);
                    NLoginCore_167.var_java_lang_String_arr_b[26] = NLoginCore_138.E("իԺՉՈՠՐկեԩՊբԵՄՏոձզ՝էԵՖ՘ՅՆ", (byte)54, 69);
                    NLoginCore_167.var_java_lang_String_arr_b[27] = NLoginCore_223.F("ԧԪբժԪԫըԻմՓՆՈյճչճԳՎկջՌտլռչւ՜՜վ։ամ", (byte)54, 70);
                    NLoginCore_167.var_java_lang_String_arr_b[28] = NLoginCore_027.F("ԡթԪբ՞ժԺլէհթժՏՏ՚ԶժՑջԵԾըԺՙկաՎաՄեւիլդևՌլռտտվ֏տ՚", (byte)54, 70);
                    NLoginCore_167.var_java_lang_String_arr_b[29] = NLoginCore_091.D("ҊүқҥӕҵӋґґӖӍҒҮӜҗҸүӔҼӣҜҵӝҧҦҢӇӤҿҨҿӦүӥүӒӌӲӳӘүҴӊӧҸӌӨӯӑӋӷӢӒӳӊӋ", (byte)54, 68);
                    NLoginCore_167.var_java_lang_String_arr_b[30] = NLoginCore_201.D("ӊҢҒүӁӃҞҎҕҰҒҼӚҩӖӐҿӔӝҵӌәӠӆҠҸҡҵҥӤҬӊӎӛӪӂӲӀӐӓӱӥӏӆӝӧӫӔӕӜӷҵӺәӅԄӥӟԀԁӪӞӝӾ", (byte)54, 68);
                    NLoginCore_167.var_java_lang_String_arr_b[31] = NLoginCore_324.D("҆ӎҏӇӃӏҟӑӌӕӎӏҴҴҿқӏҶӠҚңӍҟҾӔӆҳӆҩӊӧӐӯӇөӆӃӌӶҰҪӲӖӴӼӬӪөӰӱӖӬӢӦԀӛӽӖԋӜԅӬӊӉ", (byte)54, 68);
                    NLoginCore_167.var_java_lang_String_arr_b[32] = NLoginCore_004.E("ԥՊԶՀհՐզԬԬձթՇնմՆՑԹ՚հՋՠՏՋՓՐճՀփջ՛ղոՄսՍպիռՎՍ֐Փ։ց֔նՏխՙնլ֔ՙոեզ", (byte)54, 69);
                    NLoginCore_167.var_java_lang_String_arr_b[33] = NLoginCore_559.A("ľŒĦŀšŪĠœŇĽŞůľŨŪŭļŖűņŋŊŧŕŋŪŽĵňŎŠŶ", (byte)54, 65);
                    NLoginCore_167.var_java_lang_String_arr_b[34] = NLoginCore_027.A("ĮŢťŅŦťķŇňĺůłħūŀşĳńĿųĸřŗŏũĻũŘŌūźźŔűŷņƅšƂœŴƎŷŁŞŐżƓŲŶŖƄƒƇŞş", (byte)54, 65);
                    NLoginCore_167.var_java_lang_String_arr_b[35] = NLoginCore_091.F("ՓՕզզՅ՝կեԫՍգԺ", (byte)54, 70);
                    NLoginCore_167.var_java_lang_String_arr_b[36] = NLoginCore_559.B("ŤŜĥŒťķĶĵĤłĸīŤŃĤũĪłńŇłőľĿ", (byte)54, 66);
                    NLoginCore_167.var_java_lang_String_arr_b[37] = NLoginCore_559.A("ţĤţœŖĥĩŌļŠŤĽĪŉŁŤŔŏŇŭšŷŤķżņŸōŐƂŵųťſŁŃŽŚƋŧŠŷŜƂŝƊŜŨŦƏŭůŎűŞş", (byte)54, 65);
                    NLoginCore_167.var_java_lang_String_arr_b[38] = NLoginCore_201.E("Օ՞աթԨ՚՚եՒբ԰ՓՒԯԲգդէՐՉո՗ճՑԻՁրքզավՆֈ՗ծգօկ֍ՠը՟Ք՚", (byte)54, 69);
                    NLoginCore_167.var_java_lang_String_arr_b[39] = NLoginCore_223.D("ҭҮӏҝҍҢӒӑӍҥҶҟ", (byte)54, 68);
                    NLoginCore_167.var_java_lang_String_arr_b[40] = NLoginCore_559.E("ԶԸԹխՐզԱժձժՒՇԩՕՐԸջՄթխճ՘ՅՆ", (byte)54, 69);
                    NLoginCore_167.var_java_lang_String_arr_b[41] = NLoginCore_446.A("şŔĝŔķŪňĪĶŠŗŮŐŊĤůĽŦŢţŮšřůŶŸĺĵŀŐŒŶ", (byte)54, 65);
                    NLoginCore_167.var_java_lang_String_arr_b[42] = NLoginCore_223.A("ŖĹŔĿŠśťĳĩŉōŤŘĮŤıŢŌņłŢŁľĿ", (byte)54, 65);
                    NLoginCore_167.var_java_lang_String_arr_b[43] = NLoginCore_446.A("řĢŤœŁŗŧģħŕĩĳ", (byte)54, 65);
                    NLoginCore_167.var_java_lang_String_arr_b[44] = NLoginCore_092.A("ĴŢŝŝĥřŇńŋšŇšĩľŚŴůĵţİĳŁľĿ", (byte)54, 65);
                    continue block7;
                }
                case 2: {
                    NLoginCore_167.var_java_lang_String_arr_b[0] = NLoginCore_201.E("ժՇԟՊՊգկԲԥՁՋծի԰եԸշյՅՆԶճՁ՗ղեշՕօՂւվ", (byte)54, 69);
                    continue block7;
                }
                case 4: {
                    NLoginCore_167.var_java_lang_String_arr_b[0] = NLoginCore_559.D("ҾҼӎҠӈӏҨҩҢӐӈҟ", (byte)54, 68);
                }
            }
        }
    }

    @Override
    public String q() {
        return NLoginCore_167.c("㺀", (int)var_int_a, (long)(var_long_b ^ d));
    }

    static {
        var_int_a = (0 >>> 94 | 0 << ~94 + 1) & 0xFFFFFFFF;
        var_long_b = Long.reverse(5246680677260065351L);
        d = Long.reverse(0x4E00000000000000L);
        e = Integer.reverse(Integer.MIN_VALUE);
        f = Long.reverse(5246680677260065351L);
        g = Long.reverse(0x4E00000000000000L);
        h = 0 >>> 125 | 0 << ~125 + 1;
        i = (8 >>> 194 | 8 << ~194 + 1) & 0xFFFFFFFF;
        j = Long.reverse(490879470756821575L);
        k = Integer.reverse(-1073741824);
        l = Long.reverse(5246680677260065351L);
        m = Long.reverse(0x4E00000000000000L);
        n = Integer.reverse(0);
        o = 1 >>> 62 | 1 << ~62 + 1;
        p = Long.reverse(490879470756821575L);
        q = Integer.reverse(0);
        r = Integer.reverse(-1610612736);
        s = Long.reverse(5246680677260065351L);
        t = Long.reverse(0x4E00000000000000L);
        u = 0 >>> 229 | 0 << ~229 + 1;
        v = (0x180000 >>> 242 | 0x180000 << ~242 + 1) & 0xFFFFFFFF;
        w = Long.reverse(5246680677260065351L);
        x = Long.reverse(0x4E00000000000000L);
        y = Integer.reverse(0);
        z = (896 >>> 39 | 896 << -39) & 0xFFFFFFFF;
        aa = Long.reverse(490879470756821575L);
        ab = 128 >>> 132 | 128 << ~132 + 1;
        ac = Long.reverse(5246680677260065351L);
        ad = Long.reverse(0x4E00000000000000L);
        ae = Integer.reverse(0);
        af = 36 >>> 226 | 36 << ~226 + 1;
        ag = Long.reverse(5246680677260065351L);
        ah = Long.reverse(0x4E00000000000000L);
        ai = 0 >>> 222 | 0 << -222;
        aj = Integer.reverse(0x50000000);
        ak = Long.reverse(5246680677260065351L);
        al = Long.reverse(0x4E00000000000000L);
        am = 0 >>> 76 | 0 << ~76 + 1;
        an = (44 >>> 66 | 44 << ~66 + 1) & 0xFFFFFFFF;
        ao = (-1 >>> 192 | -1 << ~192 + 1) & 0xFFFFFFFF;
        ap = Long.reverse(490879470756821575L);
        aq = Integer.reverse(0);
        ar = (0 >>> 203 | 0 << ~203 + 1) & 0xFFFFFFFF;
        as = Integer.reverse(0x30000000);
        at = Long.reverse(5246680677260065351L);
        au = Long.reverse(0x4E00000000000000L);
        av = (0 >>> 144 | 0 << ~144 + 1) & 0xFFFFFFFF;
        aw = (851968 >>> 208 | 851968 << -208) & 0xFFFFFFFF;
        ax = Long.reverse(5246680677260065351L);
        ay = Long.reverse(0x4E00000000000000L);
        az = Integer.reverse(0x70000000);
        ba = Long.reverse(5246680677260065351L);
        bb = Long.reverse(0x4E00000000000000L);
        bc = Integer.reverse(0x30000000);
        bd = 0 >>> 62 | 0 << -62;
        be = 16 >>> 196 | 16 << ~196 + 1;
        bf = (0x8000000 >>> 90 | 0x8000000 << -90) & 0xFFFFFFFF;
        bg = (0x6000000 >>> 25 | 0x6000000 << -25) & 0xFFFFFFFF;
        bh = (64 >>> 228 | 64 << -228) & 0xFFFFFFFF;
        bi = Integer.reverse(-1610612736);
        bj = (24 >>> 226 | 24 << ~226 + 1) & 0xFFFFFFFF;
        bk = Integer.reverse(-536870912);
        bl = 524288 >>> 80 | 524288 << ~80 + 1;
        bm = (0x240000 >>> 18 | 0x240000 << -18) & 0xFFFFFFFF;
        bn = (163840 >>> 14 | 163840 << -14) & 0xFFFFFFFF;
        bo = Integer.reverse(-805306368);
        bp = Integer.reverse(-268435456);
        bq = Integer.reverse(-1);
        br = Long.reverse(490879470756821575L);
        bs = 0 >>> 123 | 0 << -123;
        bt = Integer.MIN_VALUE >>> 27 | Integer.MIN_VALUE << ~27 + 1;
        bu = Long.reverse(5246680677260065351L);
        bv = Long.reverse(0x4E00000000000000L);
        bw = (2048 >>> 233 | 2048 << -233) & 0xFFFFFFFF;
        bx = Integer.reverse(0);
        by = (0x4000000 >>> 90 | 0x4000000 << -90) & 0xFFFFFFFF;
        bz = 272 >>> 36 | 272 << ~36 + 1;
        ca = Long.reverse(490879470756821575L);
        cb = (262144 >>> 17 | 262144 << ~17 + 1) & 0xFFFFFFFF;
        cc = 4608 >>> 136 | 4608 << ~136 + 1;
        cd = Long.reverse(5246680677260065351L);
        ce = Long.reverse(0x4E00000000000000L);
        cf = Integer.reverse(-1073741824);
        cg = Integer.reverse(0);
        ch = (76 >>> 162 | 76 << ~162 + 1) & 0xFFFFFFFF;
        ci = (-1 >>> 98 | -1 << ~98 + 1) & 0xFFFFFFFF;
        cj = Long.reverse(490879470756821575L);
        ck = Integer.reverse(0);
        cl = (0x28000000 >>> 217 | 0x28000000 << -217) & 0xFFFFFFFF;
        cm = Long.reverse(5246680677260065351L);
        cn = Long.reverse(0x4E00000000000000L);
        co = Integer.reverse(0x40000000);
        cp = 0 >>> 103 | 0 << ~103 + 1;
        cq = Integer.reverse(0);
        cr = 1 >>> 192 | 1 << -192;
        cs = Integer.reverse(0);
        ct = (4 >>> 130 | 4 << -130) & 0xFFFFFFFF;
        cu = 0 >>> 106 | 0 << ~106 + 1;
        cv = (43008 >>> 75 | 43008 << -75) & 0xFFFFFFFF;
        cw = Long.reverse(5246680677260065351L);
        cx = Long.reverse(0x4E00000000000000L);
        cy = (0x160000 >>> 176 | 0x160000 << -176) & 0xFFFFFFFF;
        cz = Long.reverse(490879470756821575L);
        da = 0 >>> 161 | 0 << ~161 + 1;
        db = Integer.reverse(-402653184);
        dc = Long.reverse(5246680677260065351L);
        dd = Long.reverse(0x4E00000000000000L);
        de = (1536 >>> 166 | 1536 << ~166 + 1) & 0xFFFFFFFF;
        df = (-1 >>> 221 | -1 << ~221 + 1) & 0xFFFFFFFF;
        dg = Long.reverse(490879470756821575L);
        dh = Integer.reverse(-1610612736);
        di = Integer.reverse(0);
        dj = 512 >>> 233 | 512 << ~233 + 1;
        dk = 8 >>> 194 | 8 << -194;
        dl = 24576 >>> 13 | 24576 << ~13 + 1;
        dm = Integer.reverse(0x20000000);
        dn = Integer.reverse(Integer.MIN_VALUE);
        cfr_renamed_1 = Integer.reverse(0);
        dp = (200 >>> 67 | 200 << -67) & 0xFFFFFFFF;
        dq = Long.reverse(5246680677260065351L);
        dr = Long.reverse(0x4E00000000000000L);
        ds = Integer.reverse(0x58000000);
        dt = Long.reverse(5246680677260065351L);
        du = Long.reverse(0x4E00000000000000L);
        dv = -1342177279 >>> 156 | -1342177279 << ~156 + 1;
        dw = Long.reverse(5246680677260065351L);
        dx = Long.reverse(0x4E00000000000000L);
        dy = (0 >>> 59 | 0 << ~59 + 1) & 0xFFFFFFFF;
        dz = Integer.reverse(0x38000000);
        ea = -1 >>> 122 | -1 << ~122 + 1;
        eb = Long.reverse(490879470756821575L);
        ec = (0 >>> 143 | 0 << ~143 + 1) & 0xFFFFFFFF;
        ed = Integer.reverse(-1207959552);
        ee = Integer.reverse(-1);
        ef = Long.reverse(490879470756821575L);
        eg = Integer.reverse(0x78000000);
        eh = Long.reverse(5246680677260065351L);
        ei = Long.reverse(0x4E00000000000000L);
        ej = Integer.reverse(0x20000000);
        ek = 0 >>> 106 | 0 << -106;
        el = Integer.reverse(Integer.MIN_VALUE);
        em = Integer.reverse(0x40000000);
        en = (0x600000 >>> 53 | 0x600000 << ~53 + 1) & 0xFFFFFFFF;
        eo = 0 >>> 52 | 0 << -52;
        ep = 0x400000 >>> 214 | 0x400000 << -214;
        eq = (1984 >>> 102 | 1984 << -102) & 0xFFFFFFFF;
        er = Long.reverse(5246680677260065351L);
        es = Long.reverse(0x4E00000000000000L);
        et = Integer.reverse(0);
        eu = 32768 >>> 170 | 32768 << -170;
        ev = Long.reverse(490879470756821575L);
        ew = (2112 >>> 198 | 2112 << ~198 + 1) & 0xFFFFFFFF;
        ex = Long.reverse(5246680677260065351L);
        ey = Long.reverse(0x4E00000000000000L);
        ez = Integer.reverse(0x20000000);
        fa = Integer.reverse(0);
        fb = (262144 >>> 114 | 262144 << -114) & 0xFFFFFFFF;
        fc = Integer.reverse(0x40000000);
        fd = (0x6000000 >>> 249 | 0x6000000 << -249) & 0xFFFFFFFF;
        fe = (Integer.MIN_VALUE >>> 191 | Integer.MIN_VALUE << ~191 + 1) & 0xFFFFFFFF;
        ff = Integer.reverse(Integer.MIN_VALUE);
        fg = 1024 >>> 169 | 1024 << -169;
        fh = Integer.reverse(Integer.MIN_VALUE);
        fi = Integer.reverse(0);
        fj = Integer.reverse(-1073741824);
        fk = Integer.reverse(Integer.MIN_VALUE);
        fl = Integer.reverse(0);
        fm = Integer.reverse(0x44000000);
        fn = Long.reverse(5246680677260065351L);
        fo = Long.reverse(0x4E00000000000000L);
        fp = (70 >>> 129 | 70 << ~129 + 1) & 0xFFFFFFFF;
        fq = -1 >>> 167 | -1 << ~167 + 1;
        fr = Long.reverse(490879470756821575L);
        fs = (0 >>> 82 | 0 << -82) & 0xFFFFFFFF;
        ft = Integer.reverse(0x24000000);
        fu = Long.reverse(5246680677260065351L);
        fv = Long.reverse(0x4E00000000000000L);
        fw = Integer.reverse(-1543503872);
        fx = Long.reverse(5246680677260065351L);
        fy = Long.reverse(0x4E00000000000000L);
        fz = Integer.reverse(0x40000000);
        ga = (0 >>> 223 | 0 << ~223 + 1) & 0xFFFFFFFF;
        gb = 0x8000000 >>> 251 | 0x8000000 << -251;
        gc = Integer.reverse(0x40000000);
        gd = Integer.reverse(0);
        ge = Integer.reverse(Integer.MIN_VALUE);
        gf = Integer.reverse(0x64000000);
        gg = Long.reverse(490879470756821575L);
        gh = 12288 >>> 76 | 12288 << -76;
        gi = (624 >>> 228 | 624 << ~228 + 1) & 0xFFFFFFFF;
        gj = Long.reverse(5246680677260065351L);
        gk = Long.reverse(0x4E00000000000000L);
        gl = 0 >>> 202 | 0 << ~202 + 1;
        gm = Integer.reverse(0);
        gn = (0 >>> 187 | 0 << -187) & 0xFFFFFFFF;
        go = Integer.reverse(0);
        gp = 0 >>> 36 | 0 << -36;
        gq = 320 >>> 227 | 320 << -227;
        gr = Integer.reverse(-1);
        gs = Long.reverse(490879470756821575L);
        gt = (0 >>> 146 | 0 << -146) & 0xFFFFFFFF;
        gu = Integer.reverse(-1811939328);
        gv = Long.reverse(5246680677260065351L);
        gw = Long.reverse(0x4E00000000000000L);
        gx = 0 >>> 163 | 0 << -163;
        gy = 0x50000001 >>> 59 | 0x50000001 << -59;
        gz = Long.reverse(490879470756821575L);
        ha = 0 >>> 105 | 0 << ~105 + 1;
        hb = (688 >>> 68 | 688 << ~68 + 1) & 0xFFFFFFFF;
        hc = Long.reverse(490879470756821575L);
        hd = 64 >>> 70 | 64 << -70;
        he = Integer.reverse(0);
        hf = Integer.reverse(0x34000000);
        hg = Long.reverse(5246680677260065351L);
        hh = Long.reverse(0x4E00000000000000L);
        hi = Integer.reverse(-1275068416);
        hj = 92160 >>> 171 | 92160 << -171;
        var_java_lang_String_arr_a = new String[hi];
        var_java_lang_String_arr_b = new String[hj];
        NLoginCore_167.b();
        var_com_nickuc_login_NLoginCore_167_a = new NLoginCore_167();
    }

    @Override
    public boolean boolean_a(NLoginType_008 NLoginType_008, NLoginCore_523 NLoginCore_4952, NLoginCore_459 NLoginCore_459) {
        if (!NLoginCore_323.a(NLoginCore_459, NLoginCore_532.e.a(new Object[gm])) || !NLoginCore_323.a(NLoginCore_459, NLoginCore_532.r.a(new Object[gn]))) {
            return go != 0;
        }
        if (NLoginCore_323.a(NLoginCore_459, NLoginCore_532.e.a(new Object[gp]) + (String)NLoginCore_167.c("㺀", (int)(gq & gr), (long)gs))) {
            return gt != 0;
        }
        Object[] objectArray = new Object[hd];
        objectArray[NLoginCore_167.he] = NLoginCore_167.c("㺌", (int)hf, (long)(hg ^ hh));
        try (NLoginCore_171 NLoginCore_171 = NLoginCore_459.com_nickuc_login_NLoginCore_171_a((String)NLoginCore_167.c("㺃", (int)gu, (long)(gv ^ gw)) + NLoginCore_532.r.a(new Object[gx]) + (String)NLoginCore_167.c("㺆", (int)gy, (long)gz) + NLoginCore_532.t.a(new Object[ha]) + (String)NLoginCore_167.c("㺉", (int)hb, (long)hc), objectArray);){
            ResultSet resultSet = (ResultSet)NLoginCore_171.d();
            boolean bl = resultSet.next();
            return bl;
        }
    }

    private static String a(int n, long l) {
        l ^= 0x72L;
        l ^= 0x3CC298D6A91CA995L;
        if (var_java_lang_String_arr_a[n] == null) {
            SecretKeyFactory secretKeyFactory;
            Cipher cipher;
            try {
                cipher = Cipher.getInstance(new String(new byte[]{(byte)(53 + 15), (byte)(54 + 15), (byte)(4 + 79), 47, (byte)(6 + 61), (byte)(23 + 43), (byte)(46 + 21), (byte)(36 + 11), (byte)(46 + 34), 75, (byte)(41 + 26), (byte)(75 + 8), (byte)(15 + 38), (byte)(3 + 77), (byte)(57 + 40), (byte)(4 + 96), (byte)(22 + 78), (byte)(50 + 55), (byte)(49 + 61), (byte)(42 + 61)}, StandardCharsets.UTF_8));
                secretKeyFactory = SecretKeyFactory.getInstance(new String(new byte[]{(byte)(8 + 60), 69, 83}, StandardCharsets.UTF_8));
            }
            catch (Exception exception) {
                throw new RuntimeException(NLoginCore_384.B("ǂǏǎƑǑǍǈǑǜǋƘǖǚǓǖǜƞԷ԰ԚԧԲԨԫԚԸ", (byte)112, 66));
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray)), new IvParameterSpec(new byte[8]));
            NLoginCore_167.var_java_lang_String_arr_a[n] = new String(cipher.doFinal(Base64.getDecoder().decode(var_java_lang_String_arr_b[n])), StandardCharsets.UTF_8);
        }
        return var_java_lang_String_arr_a[n];
    }

    private static String c(String s, int n, long l) {
        return a(n, l);
    }

    private static Object c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        try {
            return new MutableCallSite(lookup.findStatic(NLoginCore_167.class, new String(new byte[]{97}, StandardCharsets.UTF_8), MethodType.fromMethodDescriptorString(NLoginCore_027.D("јѺѼќҀҟҗҭҙѨҦҜҪҤѭҒҴҳҫұҫҀ", (byte)41, 68), NLoginCore_167.class.getClassLoader())).asType(methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException(NLoginCore_324.D("ғҠҟѢҢҞҙҢҭҜѩҧҫҤҧҭѯࠈࠁ߫߸ࠃ߹߼߫ࠉ҄", (byte)41, 68) + string + NLoginCore_076.D("Ѫ", (byte)41, 68) + methodType.toString(), exception);
        }
    }
}

