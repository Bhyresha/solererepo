

	
	import java.util.Objects;
	
	public class Employee {
		private int Emp_id;
		private String Emp_name;
		public int getEmp_id() {
			return Emp_id;
		}
		
		

		public String getEmp_name() {
			return Emp_name;
		}



		public void setEmp_name(String Emp_name) {
			this.Emp_name = Emp_name;
		}



		public void setEmp_id(int Emp_id) {
			this.Emp_id = Emp_id;
		}



		@Override
		public int hashCode() {
			return Objects.hash(Emp_name, Emp_id);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			//return Objects.equals(Employee, other.Employee) && Emp_id == other.Emp_id;
			return this.Emp_id==other.Emp_id;
		}
		@Override
		public String toString() {
			return "Employee [Emp_id=" + Emp_id + ", Employee=" + Emp_name + "]";
		}
		
		
		
			
		
	}
	


