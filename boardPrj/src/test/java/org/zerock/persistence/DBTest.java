package org.zerock.persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.ReplyVO;
import org.zerock.mapper.TimeMapper;
import org.zerock.service.ReplyService;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class DBTest {

	@Setter(onMethod_ = {@Autowired})
	private ReplyService rservice;
	
	@Test
	public void test() {
		ReplyVO vo = new ReplyVO();
		vo.setBno(390L);
		String []reply = {"reply","댓글","샘플","sample"};
		String []replyer = {"사용자","tester","writer"};
		for (int i = 0; i < 137; i++) {
			vo.setReply(reply[i%4]+i);
			vo.setReplyer(replyer[i%3]+i);
			rservice.register(vo);
			log.info(i+"개 완료");
		}
		
	}
}
