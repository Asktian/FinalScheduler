package data.general;
/**
 * 
 * @ClassName: UpdateFilter  
 * @Description: TODO(查询过滤接口)  
 * @author giscafer 
 * @date 2015-11-4 上午12:49:37  
 *
 */
public class UpdateFilter {

	private String setFields;
	private String whereString;
	public String getSetFields() {
		return setFields;
	}
	public void setSetFields(String setFields) {
		this.setFields = setFields;
	}
	public String getWhereString() {
		return whereString;
	}
	public void setWhereString(String whereString) {
		this.whereString = whereString;
	}
	
}
