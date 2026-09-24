package com.nickuc.login;

public interface NLoginInterface_028 {
   default boolean b(NLoginType_008 var1) {
      try {
         if (this.a(var1)) {
            this.c(var1);
         }

         return true;
      } catch (Throwable var3) {
         NLoginCore_370.a(var3);
         if (NLoginCore_150.j()) {
            NLoginCore_370.d("");
            NLoginCore_370.d(NLoginCore_553.A("ÅôƊėÉĐĚĕÍĞĞģĤƟĩęġÖĚħħİĠĮıģıàİâĥĥĳĩĶèĭįëİĮĲľŃċò", (byte)19, 65) + this.q() + NLoginCore_004.E("ӽ", (byte)19, 69));
            NLoginCore_370.d(NLoginCore_530.B("ÅöĖĚÉĐČĢĜĠÛÐĔġġĨĖĪĜØħĩĮįĞÞĤıĶīĳĩÿ", (byte)19, 66));
            NLoginCore_370.d("");
            NLoginCore_370.d(NLoginCore_223.F("ӯԔԺՅԶՃՇԺԑӸրԼՒՓՔԌՍՉՄՍ\u0558ՇԓՉՖՕԘՎՔ՟Ր՝աՔ", (byte)19, 70));
            NLoginCore_370.d(NLoginCore_530.B("ÅëÔĕĊēėæÍŕĕģĦĢģģħĪ÷ĦĢĝĦıĠìĢįĮ", (byte)19, 66));
            if (NLoginCore_150.aM()) {
               NLoginCore_370.d(NLoginCore_471.C("ЎхлЫВҚњѬѭѮЦѧѣўѧѲѡЭѣѰѯвѺѰ", (byte)19, 67));
            }

            NLoginCore_370.d("");
            NLoginCore_370.d(NLoginCore_127.F("ӯԣԶՄՉԽԹՅՉӸԽԿՎՈՆՅՀՒׂԂՈՑԅԜԗԈ՜ՏՒա՛Ւ՞գ", (byte)19, 70));
            NLoginCore_370.d("");
         } else {
            NLoginCore_370.d("");
            NLoginCore_370.d(NLoginCore_004.F("ӯԤԹԷӳԸԶՊԸԺԺՍՀӼՀՍՔՌՅԂՑՓՙԆՉՍԉՍ՚՚գՓադՖՖԭԔ", (byte)19, 70) + this.q() + NLoginCore_453.A("Ó", (byte)19, 65));
            NLoginCore_370.d(NLoginCore_004.B("ÅöēčĊĝĐÌĐĝĝĤĒĕħÔĤīĩØĭğĜĩ÷", (byte)19, 66));
            NLoginCore_370.d("");
            NLoginCore_370.d(NLoginCore_427.D("ЎгљѤѕѢѦљаЗҟћѱѲѳЫѬѨѣѬѷѦвѨѵѴзѭѳѾѯѼҀѳ", (byte)19, 68));
            NLoginCore_370.d(NLoginCore_183.D("ЎдѝђћџЮЕҝѝѫѮѪѫѫѯѲпѮѪѥѮѹѨдѪѷѶ", (byte)19, 68));
            if (NLoginCore_150.aM()) {
               NLoginCore_370.d(NLoginCore_521.B("ÅüòâÉőđģĤĥÝĞĚĕĞĩĘäĚħĦéıħ", (byte)19, 66));
            }

            NLoginCore_370.d("");
            NLoginCore_370.d(NLoginCore_201.C("ЎтѕѣѨјѦЕѭѠѤѥКѮѤѲѲПѤѰѹѱФѮѴЧойЪѾѱѰѽѽѴ҄", (byte)19, 67));
            NLoginCore_370.d("");
         }

         return false;
      }
   }

   String q();

   void c(NLoginType_008 var1);

   static void M() {
      try {
         Thread.sleep(60000L);
      } catch (InterruptedException var1) {
         NLoginCore_370.a(var1);
      }

      System.exit(1);
   }

   boolean a(NLoginType_008 var1);

   static void e(NLoginType_008 var0) {
      if (!NLoginCore_019.a.b(var0)) {
         M();
      }

      if (!NLoginCore_167.a.b(var0)) {
         M();
      }

      if (!NLoginCore_108.a.b(var0)) {
         M();
      }

      if (!NLoginCore_286.a.b(var0)) {
         M();
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   default void a(NLoginCore_459 var1, String var2, String var3) {
      switch (NLoginCore_314.n[var1.a().ordinal()]) {
         case 1:
         case 2:
            var1.a(NLoginCore_241.F("\u058cր֊վ\u058bքՠ֕փօ\u0590֊զ", (byte)126, 70) + var2 + NLoginCore_223.D("ՏքրՒ", (byte)126, 68) + var3);
            break;
         case 3:
            var1.a(NLoginCore_232.C("հռօշօՔ։շչքվ՚", (byte)126, 67) + var2 + NLoginCore_575.D("ՏւնրմցպՖ\u058bևՙ", (byte)126, 68) + var3);
            break;
         default:
            throw new IllegalArgumentException(NLoginCore_575.C("ո֧֞֓֟֝֙Ֆְ֛֛֣֭֙֝֝՟ֲִֺ֨եե", (byte)126, 67) + var1.a());
      }
   }
}
