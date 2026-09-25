/*
 * Decompiled with CFR 0.152.
 */
package com.nickuc.login;

import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginType_008;
import com.nickuc.login.NLoginCore_459;
import com.nickuc.login.NLoginCore_108;
import com.nickuc.login.NLoginCore_223;
import com.nickuc.login.NLoginCore_110;
import com.nickuc.login.NLoginCore_150;
import com.nickuc.login.NLoginCore_559;
import com.nickuc.login.NLoginCore_027;
import com.nickuc.login.NLoginCore_076;
import com.nickuc.login.NLoginCore_286;
import com.nickuc.login.NLoginCore_091;
import com.nickuc.login.NLoginCore_384;
import com.nickuc.login.NLoginCore_201;
import com.nickuc.login.NLoginCore_575;
import com.nickuc.login.NLoginCore_019;
import com.nickuc.login.NLoginCore_314;
import com.nickuc.login.NLoginCore_453;
import com.nickuc.login.NLoginCore_167;
import com.nickuc.login.NLoginCore_451;
import com.nickuc.login.NLoginCore_370;

public interface NLoginCore_502 {
    default public boolean b(NLoginType_008 NLoginType_008) {
        try {
            if (this.a(NLoginType_008)) {
                this.c(NLoginType_008);
            }
            return true;
        }
        catch (Throwable throwable) {
            NLoginCore_370.a(throwable);
            if (NLoginCore_150.j()) {
                NLoginCore_370.d("", new Object[0]);
                NLoginCore_370.d(NLoginCore_076.A("ÅôƊėÉĐĚĕÍĞĞģĤƟĩęġÖĚħħİĠĮıģıàİâĥĥĳĩĶèĭįëİĮĲľŃċò", (byte)19, 65) + this.q() + NLoginCore_451.E("ӽ", (byte)19, 69), new Object[0]);
                NLoginCore_370.d(NLoginCore_559.B("ÅöĖĚÉĐČĢĜĠÛÐĔġġĨĖĪĜØħĩĮįĞÞĤıĶīĳĩÿ", (byte)19, 66), new Object[0]);
                NLoginCore_370.d("", new Object[0]);
                NLoginCore_370.d(NLoginCore_223.F("ӯԔԺՅԶՃՇԺԑӸրԼՒՓՔԌՍՉՄՍ՘ՇԓՉՖՕԘՎՔ՟Ր՝աՔ", (byte)19, 70), new Object[0]);
                NLoginCore_370.d(NLoginCore_559.B("ÅëÔĕĊēėæÍŕĕģĦĢģģħĪ÷ĦĢĝĦıĠìĢįĮ", (byte)19, 66), new Object[0]);
                if (NLoginCore_150.aM()) {
                    NLoginCore_370.d(NLoginCore_384.C("ЎхлЫВҚњѬѭѮЦѧѣўѧѲѡЭѣѰѯвѺѰ", (byte)19, 67), new Object[0]);
                }
                NLoginCore_370.d("", new Object[0]);
                NLoginCore_370.d(NLoginCore_091.F("ӯԣԶՄՉԽԹՅՉӸԽԿՎՈՆՅՀՒׂԂՈՑԅԜԗԈ՜ՏՒա՛Ւ՞գ", (byte)19, 70), new Object[0]);
                NLoginCore_370.d("", new Object[0]);
            } else {
                NLoginCore_370.d("", new Object[0]);
                NLoginCore_370.d(NLoginCore_451.F("ӯԤԹԷӳԸԶՊԸԺԺՍՀӼՀՍՔՌՅԂՑՓՙԆՉՍԉՍ՚՚գՓադՖՖԭԔ", (byte)19, 70) + this.q() + NLoginCore_453.A("Ó", (byte)19, 65), new Object[0]);
                NLoginCore_370.d(NLoginCore_451.B("ÅöēčĊĝĐÌĐĝĝĤĒĕħÔĤīĩØĭğĜĩ÷", (byte)19, 66), new Object[0]);
                NLoginCore_370.d("", new Object[0]);
                NLoginCore_370.d(NLoginCore_027.D("ЎгљѤѕѢѦљаЗҟћѱѲѳЫѬѨѣѬѷѦвѨѵѴзѭѳѾѯѼҀѳ", (byte)19, 68), new Object[0]);
                NLoginCore_370.d(NLoginCore_110.D("ЎдѝђћџЮЕҝѝѫѮѪѫѫѯѲпѮѪѥѮѹѨдѪѷѶ", (byte)19, 68), new Object[0]);
                if (NLoginCore_150.aM()) {
                    NLoginCore_370.d(NLoginCore_091.B("ÅüòâÉőđģĤĥÝĞĚĕĞĩĘäĚħĦéıħ", (byte)19, 66), new Object[0]);
                }
                NLoginCore_370.d("", new Object[0]);
                NLoginCore_370.d(NLoginCore_201.C("ЎтѕѣѨјѦЕѭѠѤѥКѮѤѲѲПѤѰѹѱФѮѴЧойЪѾѱѰѽѽѴ҄", (byte)19, 67), new Object[0]);
                NLoginCore_370.d("", new Object[0]);
            }
            return false;
        }
    }

    public String q();

    public void c(NLoginType_008 var1);

    public static void M() {
        try {
            Thread.sleep(60000L);
        }
        catch (InterruptedException interruptedException) {
            NLoginCore_370.a(interruptedException);
        }
        System.exit(1);
    }

    public boolean a(NLoginType_008 var1);

    public static void e(NLoginType_008 NLoginType_008) {
        if (!NLoginCore_019.var_com_nickuc_login_NLoginCore_019_a.b(NLoginType_008)) {
            NLoginCore_502.M();
        }
        if (!NLoginCore_167.var_com_nickuc_login_NLoginCore_167_a.b(NLoginType_008)) {
            NLoginCore_502.M();
        }
        if (!NLoginCore_108.var_com_nickuc_login_NLoginCore_108_a.b(NLoginType_008)) {
            NLoginCore_502.M();
        }
        if (!NLoginCore_286.var_com_nickuc_login_NLoginCore_286_a.b(NLoginType_008)) {
            NLoginCore_502.M();
        }
    }

    default public void a(NLoginCore_459 NLoginCore_459, String string, String string2) {
        switch (NLoginCore_314.n[NLoginCore_459.com_nickuc_login_NLoginCore_036_a().ordinal()]) {
            case 1: 
            case 2: {
                NLoginCore_459.void_a(NLoginCore_027.F("֌ր֊վ֋քՠ֕փօ֐֊զ", (byte)126, 70) + string + NLoginCore_223.D("ՏքրՒ", (byte)126, 68) + string2, new Object[0]);
                break;
            }
            case 3: {
                NLoginCore_459.void_a(NLoginCore_559.C("հռօշօՔ։շչքվ՚", (byte)126, 67) + string + NLoginCore_575.D("ՏւնրմցպՖ֋ևՙ", (byte)126, 68) + string2, new Object[0]);
                break;
            }
            default: {
                throw new IllegalArgumentException(NLoginCore_575.C("ո֧֞֓֟֝֙Ֆְ֛֛֣֭֙֝֝՟ֲִֺ֨եե", (byte)126, 67) + (Object)((Object)NLoginCore_459.com_nickuc_login_NLoginCore_036_a()));
            }
        }
    }
}

