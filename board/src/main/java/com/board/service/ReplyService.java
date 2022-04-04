package com.board.service;

import java.util.List;

import com.board.domain.ReplyVO;

public interface ReplyService {

	// ��� ��ȸ
	public List<ReplyVO> list(int bno) throws Exception;

	// ��� ��ȸ
	public void write(ReplyVO vo) throws Exception;

	// ��� ����
	public void modify(ReplyVO vo) throws Exception;

	// ��� ����
	public void delete(ReplyVO vo) throws Exception;
}