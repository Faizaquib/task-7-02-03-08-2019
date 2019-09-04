
public  class EmpThread implements Runnable {
	
	 int eno;
	 String ename;
	 double salary;
	 
		EmpThread(int empno,String empname,double empsalary){
			this.eno = empno;
			this.ename = empname;
			this.salary = empsalary;
			
		}
		
		
		public void run()
		{
				System.out.println("HRA of "+Thread.currentThread().getName()+" is rs :"+salary*0.10);
					//System.out.println("hey");
					System.out.println("DA of "+Thread.currentThread().getName()+" is rs :"+salary*0.25);
					System.out.println("CA of "+Thread.currentThread().getName()+" is rs :"+salary*0.10);
			
			//System.out.println("hey "+salary+Thread.currentThread().getName());
			
		}
		
		/*public void calculate(EmpThread et)
		{
			double hra = et.getSalary()*0.10;
			double da = et.getSalary()*0.25;
			double ta = et.getSalary()*0.10;
		}*/

		public static void main(String[] args) {

			EmpThread et1 = new EmpThread(101,"Faiz",1000.0);
			EmpThread et2 = new EmpThread(102,"Aman",2000.0);
			EmpThread et3 = new EmpThread(103,"Dp",3000.0);
			EmpThread et4 = new EmpThread(104,"Rupal",4000.0);
			EmpThread et5 = new EmpThread(105,"Mansi",5000.0);
			
			
			
			Thread t1 = new Thread(et1);t1.setName("Faiz's");
			Thread t2 = new Thread(et2);t2.setName("Aman's");
			Thread t3 = new Thread(et3);t3.setName("Dp's");
			Thread t4 = new Thread(et4);t4.setName("Rupal's");
			Thread t5 = new Thread(et5);t5.setName("Mansi's");
			
			t1.start();
			t2.start();
			t3.start();
			t4.start();
			t5.start();
			
		}

	

}
