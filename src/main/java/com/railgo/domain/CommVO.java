package com.railgo.domain;

import java.util.Date;

import lombok.Data;

@Data
public class CommVO {
	private int comm_code; // ?κΈ?μ½λ
	private String code; // ?/?/κ΄?/κ³?/?/SNS ?΅?©μ½λ
	private int mem_code; // ??μ½λ
	private int origin_code; // ???κΈ?? ? ??μ½λ
	private Date regDate; // ?±λ‘λ μ§?
}
