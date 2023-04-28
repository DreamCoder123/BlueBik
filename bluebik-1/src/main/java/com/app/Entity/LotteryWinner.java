package com.app.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity
@Table(name = "lottery_winners")
public class LotteryWinner {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne
  @JoinColumn(name = "user_id", referencedColumnName = "id")
  private User user;

  @ManyToOne
  @JoinColumn(name = "lottery_result_id", referencedColumnName = "id")
  private LotteryResult lotteryResult;

  public LotteryWinner() {
  }

  public LotteryWinner(User user, LotteryResult lotteryResult) {
    this.user = user;
    this.lotteryResult = lotteryResult;
  }


}
