package com.app.Entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Entity
@Table(name = "lottery_numbers")
public class LotteryNumber {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "lottery_number")
  private Integer lotteryNumber;

  public LotteryNumber() {
  }

  public LotteryNumber(Integer lotteryNumber) {
    this.lotteryNumber = lotteryNumber;
  }


}
