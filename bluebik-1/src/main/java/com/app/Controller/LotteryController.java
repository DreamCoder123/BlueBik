package com.app.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Service.WinnerService;

@RestController
@RequestMapping("/api")
public class LotteryController {

  private final WinnerService winnerService;

  public LotteryController(WinnerService winnerService) {
    this.winnerService = winnerService;
  }

  @GetMapping("/check-number/{num}")
  public boolean checkNumber(@PathVariable int num) {
    return winnerService.checkNumber(num);
  }
}
