package org.zerock.domain;

import java.util.Date;

import lombok.Data;

@Data
public class BoardVO {

	private Long bno;
	private String title;
	private String content;
	private String writer;
	private Date regdate;
	private Date updateDate;
	private int replyCnt;
	//UPDATE tbl_board A SET A.replyCnt = (SELECT COUNT(*) FROM tbl_reply B WHERE A.bno = B.bno) WHERE bno > 0 
}
