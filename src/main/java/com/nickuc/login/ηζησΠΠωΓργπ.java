package com.nickuc.login;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.Generated;

public class ηζησΠΠωΓργπ<T> extends AbstractList<T> {
   private static int a = (0 >>> 1 | 0 << -1) & -1;
   public static final List<String> o = new ηζησΠΠωΓργπ<>(new ArrayList<>());
   private final List<T> q;
   public static final List<Integer> p = new ηζησΠΠωΓργπ<>(new ArrayList<>());
   public static final List<?> n = new ηζησΠΠωΓργπ(new ArrayList<>());

   @Override
   public int size() {
      return this.q.size();
   }

   @Override
   public boolean contains(Object var1) {
      return this.q.contains(var1);
   }

   @Override
   public boolean equals(Object var1) {
      return (boolean)(var1 instanceof List ? var1.equals(this.q) : a);
   }

   @SafeVarargs
   public static <T> ηζησΠΠωΓργπ<T> a(T... var0) {
      List var1 = Arrays.asList(var0);
      return new ηζησΠΠωΓργπ<>(var1);
   }

   public static <T> ηζησΠΠωΓργπ<T> a(List<T> var0) {
      return new ηζησΠΠωΓργπ<>(new ArrayList<>(var0));
   }

   @Override
   public T get(int var1) {
      return this.q.get(var1);
   }

   @Generated
   private ηζησΠΠωΓργπ(List<T> var1) {
      this.q = var1;
   }
}
