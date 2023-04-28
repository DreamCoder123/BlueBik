package com.app.Service;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lottery")
public class CalculationService {

  private final WinnerService winnerService;

  public CalculationService(WinnerService winnerService) {
    this.winnerService = winnerService;
  }

  @PostMapping("/numbers")
  public void pushLotteryNumbers(@RequestBody List<Integer> lotteryNumbers) {
    winnerService.storeLotteryNumbers(lotteryNumbers);
  }
}

