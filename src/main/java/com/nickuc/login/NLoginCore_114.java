package com.nickuc.login;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import lombok.Generated;

public class NLoginCore_114<T> extends AbstractSet<T> {
   private static int a = (0 >>> 53 | 0 << -53) & -1;
   public static final Set<?> p = new NLoginCore_114(new HashSet<>());
   public static final Set<String> q = new NLoginCore_114<>(new HashSet<>());
   public static final Set<Integer> r = new NLoginCore_114<>(new HashSet<>());
   private final Set<T> s;

   @Override
   public boolean contains(Object var1) {
      return this.s.contains(var1);
   }

   @Override
   public Iterator<T> iterator() {
      return this.s.iterator();
   }

   @SafeVarargs
   public static <T> NLoginCore_114<T> a(T... var0) {
      HashSet var1 = new HashSet<>(Arrays.asList(var0));
      return new NLoginCore_114<>(var1);
   }

   @Override
   public boolean equals(Object var1) {
      return (boolean)(var1 instanceof Set ? var1.equals(this.s) : a);
   }

   public static <T> NLoginCore_114<T> a(Set<T> var0) {
      return new NLoginCore_114<>(var0);
   }

   @Generated
   private NLoginCore_114(Set<T> var1) {
      this.s = var1;
   }

   @Override
   public int size() {
      return this.s.size();
   }
}
