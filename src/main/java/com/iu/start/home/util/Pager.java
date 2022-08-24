package com.iu.start.home.util;

public class Pager {
	
	//멤버변수 => flid
	/*jsp에서 꺼내서 사용할 변수 
	//mapper에서 꺼내서 사용할 변수 (startRow lastRow)
	parameter를 담을 변수 
	perPage: 한페이지에 출력할 글의 갯수
	perblock: 한페이지(jsp)에 출려할 번호의 갯수
	 */
	
	
	private Long startNum;//jsp
	private Long lastNum;//jsp
	private Long page; //parameter
	private Long startRow; //mapper
	private Long lastRow; //mapper
	private Long perPage; 
	private Long perBlock; 
	
	public Pager() {
		// TODO Auto-generated constructor stub
	this.perPage= 10L;
	this.perBlock= 5L;
	
	}
	
//	paging 처리하는 기능 
	
//	1. mapper에서 사용하는 값 계산
	public void getRowNum() throws Exception{
		
		this.startRow=(this.getPage()-1)*this.getPerPage()+1;
		this.lastRow=this.getPage()*this.getPerPage();
	}
	
//	2. jsp에서 사용할 값 계산 (시작번호와 끝번호를 가져옴)
	public void getNum(Long totalCount) throws Exception {
	    
		//2. totalCount로 totalPage 구하기
		Long totalPage = totalCount/getPerPage();
		if(totalCount%this.getPerPage() != 0) {
			totalPage++;
						
		}
		
		//3. totalPage로 totalBlock 구하기
		Long totalBlock= totalPage/this.getPerBlock();
		if(totalPage%this.getPerBlock() != 0 ) {
			
			totalBlock ++;		
		}
		
		// 4. parameter로 넘어온 Page로 curBlock 찾기
		Long curBlock= this.getPage()/this.getPerBlock();
		if(this.getPerPage()%this.getPerBlock() != 0) {
			curBlock++;
			
		}
		//5. curBlock으로 startNum, lastNum 구하기
		this.startNum= (curBlock-1)*this.getPerBlock()+1;
		this.lastNum= curBlock * this.getPerBlock();
	}
	
	
	public Long getStartNum() {
		return startNum;
	}
	public void setStartNum(Long startNum) {
		this.startNum = startNum;
	}
	public Long getLastNum() {
		return lastNum;
	}
	public void setLastNum(Long lastNum) {
		this.lastNum = lastNum;
	}
	public Long getPage() {
		if(this.page==null) {
			this.page=1L;
			}
		return page;
	}
	public void setPage(Long page) {
		this.page = page;
	}
	public Long getStartRow() {
		return startRow;
	}
	public void setStartRow(Long startRow) {
		this.startRow = startRow;
	}
	public Long getLastRow() {
		return lastRow;
	}
	public void setLastRow(Long lastRow) {
		this.lastRow = lastRow;
	}

	public Long getPerPage() {
		if(this.page==null) {
			this.perPage=10L;
			
		}
		return perPage;
	}

	public void setPerPage(Long perPage) {
		this.perPage = perPage;
	}
	public Long getPerBlock() {
		return perBlock;
	}
	public void setPerBlock(Long perBlock) {
		this.perBlock = perBlock;
	} 
	
	
	
	
}
