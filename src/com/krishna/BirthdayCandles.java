package com.krishna;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BirthdayCandles {

   private static final Logger LOG = Logger.getLogger(Main.class.getName());

   public static void main(String[] args) {

      List<Integer> intArgs = Stream.of(args)
            .mapToInt(Integer::parseInt)
            .boxed()
            .collect(Collectors.toList());

      int candles = birthdayCakeCandles(intArgs);

      LOG.info(String.valueOf(candles));
   }

   private int birthdayCakeCandles(final List<Integer> candles) {
      int tallHeight = candles.stream()
            .max(Integer::compare).get();

      int tallestCandles = (int) candles.stream()
            .filter(a -> a == tallHeight).count();

      return tallestCandles;
   }
}
