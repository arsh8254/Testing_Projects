package test.package5;

public class StudentDemo {
		String name;
		int age;
		String address;
		
		public StudentDemo (String name, int age, String address) {
			this.name =name;
			this.age =age;
			this.address =address;
		}
			public void setname( String name) {
				this.name= name;
			}
			public void setage(int age) {
				this.age= age;
			}
			public void setaddress(String address) {
				this.address =address;
			}
			public String getname() {
				return name;
			}
			public int getage() {
			return age;
		}
			public String getaddress() {
				return address;
			}
			public static void main(String [] args){
				StudentDemo John =new StudentDemo (" John ", 23, " west patna");
				System.out.println(John.getage());
				
			}
			{
			}
		}

