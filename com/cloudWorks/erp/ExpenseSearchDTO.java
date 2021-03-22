package com.cloudWorks.erp;

public class ExpenseSearchDTO {
	private Object emp_no;
	private String begin_year;
	private String begin_month;
	private String end_year;
	private String end_month;
	private String expense_method_code;
	private String expense_field_code;
	private String sign;
	private String expense_price1;
	private String expense_price2;
	private String report_name;
	private int selectPageNo = 1;
	private int rowCntPerPage = 10;
	private String order;
	private String my_sign_name;
	private String mgr_sign_name;
	private String mgr_mgr_sign_name;
	public Object getEmp_no() {
		return emp_no;
	}
	public void setEmp_no(Object emp_no) {
		this.emp_no = emp_no;
	}
	public String getBegin_year() {
		return begin_year;
	}
	public void setBegin_year(String begin_year) {
		this.begin_year = begin_year;
	}
	public String getBegin_month() {
		return begin_month;
	}
	public void setBegin_month(String begin_month) {
		this.begin_month = begin_month;
	}
	public String getEnd_year() {
		return end_year;
	}
	public void setEnd_year(String end_year) {
		this.end_year = end_year;
	}
	public String getEnd_month() {
		return end_month;
	}
	public void setEnd_month(String end_month) {
		this.end_month = end_month;
	}
	public String getExpense_method_code() {
		return expense_method_code;
	}
	public void setExpense_method_code(String expense_method_code) {
		this.expense_method_code = expense_method_code;
	}
	public String getExpense_field_code() {
		return expense_field_code;
	}
	public void setExpense_field_code(String expense_field_code) {
		this.expense_field_code = expense_field_code;
	}
	public String getSign() {
		return sign;
	}
	public void setSign(String sign) {
		this.sign = sign;
	}
	public String getExpense_price1() {
		return expense_price1;
	}
	public void setExpense_price1(String expense_price1) {
		this.expense_price1 = expense_price1;
	}
	public String getExpense_price2() {
		return expense_price2;
	}
	public void setExpense_price2(String expense_price2) {
		this.expense_price2 = expense_price2;
	}
	public String getReport_name() {
		return report_name;
	}
	public void setReport_name(String report_name) {
		this.report_name = report_name;
	}
	public int getSelectPageNo() {
		return selectPageNo;
	}
	public void setSelectPageNo(int selectPageNo) {
		this.selectPageNo = selectPageNo;
	}
	public int getRowCntPerPage() {
		return rowCntPerPage;
	}
	public void setRowCntPerPage(int rowCntPerPage) {
		this.rowCntPerPage = rowCntPerPage;
	}
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	public String getMy_sign_name() {
		return my_sign_name;
	}
	public void setMy_sign_name(String my_sign_name) {
		this.my_sign_name = my_sign_name;
	}
	public String getMgr_sign_name() {
		return mgr_sign_name;
	}
	public void setMgr_sign_name(String mgr_sign_name) {
		this.mgr_sign_name = mgr_sign_name;
	}
	public String getMgr_mgr_sign_name() {
		return mgr_mgr_sign_name;
	}
	public void setMgr_mgr_sign_name(String mgr_mgr_sign_name) {
		this.mgr_mgr_sign_name = mgr_mgr_sign_name;
	}
	
	
}
