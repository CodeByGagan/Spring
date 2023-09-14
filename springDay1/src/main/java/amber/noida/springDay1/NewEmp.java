package amber.noida.springDay1;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class NewEmp {

	private int id;
	private String name;
	private List<String> phoneList;
	private Set<Integer> markSet;
	private Map<String, String> courseMap;
	private Address add;
	
	
	public NewEmp() {
		super();
	}
	
	public NewEmp(int id, String name, Address add, List<String> phoneList, Set<Integer> markSet,
			Map<String, String> courseMap) {
		super();
		this.id = id;
		this.name = name;
		this.add = add;
		this.phoneList = phoneList;
		this.markSet = markSet;
		this.courseMap = courseMap;
	}
	
	
	public Map<String, String> getCourseMap() {
		return courseMap;
	}
	public void setCourseMap(Map<String, String> courseMap) {
		this.courseMap = courseMap;
	}
	public Set<Integer> getMarkSet() {
		return markSet;
	}
	public void setMarkSet(Set<Integer> markSet) {
		this.markSet = markSet;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Address getAdd() {
		return add;
	}
	public void setAdd(Address add) {
		this.add = add;
	}
	
	public List<String> getPhoneList() {
		return phoneList;
	}
	public void setPhoneList(List<String> phoneList) {
		this.phoneList = phoneList;
	}
	@Override
	public String toString() {
		return "NewEmp [id=" + id + ", name=" + name + ", add=" + add + ", phoneList=" + phoneList + ", markSet="
				+ markSet + ", courseMap=" + courseMap + "]";
	}
	
}
