package com.app.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Component;

@Component
public class WinnerService {

  private final Set<Integer> lotteryNumbersSet = new HashSet<>();

  public void storeLotteryNumbers(List<Integer> lotteryNumbers) {
    lotteryNumbersSet.addAll(lotteryNumbers);
  }

  public boolean checkNumber(int num) {
    return lotteryNumbersSet.contains(num);
  }
}
