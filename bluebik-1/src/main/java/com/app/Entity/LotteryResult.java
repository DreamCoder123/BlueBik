package com.app.Entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity
@Table(name = "lottery_results")
public class LotteryResult {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "winning_number")
  private Integer winningNumber;

  @OneToMany(mappedBy = "lotteryResult", cascade = CascadeType.ALL)
  private List<LotteryWinner> winners;

  public LotteryResult() {
  }

  public LotteryResult(Integer winningNumber) {
    this.winningNumber = winningNumber;
  }

}
