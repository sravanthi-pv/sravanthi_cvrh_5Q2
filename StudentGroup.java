import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	int n=0;
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
		n=length;
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return students;
		
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		try{
			if(students==null)
				throw new IllegalArgumentException();
			else
			{
				this.students=students;
			}
				
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Value cannot be null");
		}
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		try{
			if(index<0 || index>students.length)
				throw new IllegalArgumentException();
			else
				return students[index];
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("index crossed boundary value");
		}
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		try{
			if(student==null)
				throw new IllegalArgumentException();
			else
			{
				students[index]=student;
				n=n+1;
			}
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Value cant be null");
		}
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		int i=0;
		try{
			if(student==null)
				throw new IllegalArgumentException();
			else
			{
		for(i=students.length;i>0;i--)
		{
			students[i]=students[i-1];
		}
		students[0]=student;
		n=n+1;
		}
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Value cant be null");
		}
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		try{
			if(student==null)
				throw new IllegalArgumentException();
			else
			{
			students[students.length]=student;
			n=n+1;
			}
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Value cant be null");
		}
		
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		int i=0;
		try{
			if(student==null)
				throw new IllegalArgumentException();
			else
			{
		for(i=students.length;i>index;i--)
		{
			students[i]=students[i-1];
		}
		students[i]=student;
		n=n+1;
		}
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Value cant be null");
		}
	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		int i=0;
		try{
			if(index<0 || index>students.length)
				throw new IllegalArgumentException();
			else
			{
				for(i=index;i<students.length;i++)
				{
					
						students[i]=students[i+1];
					
				}
				
			}
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("index crossed boundary value");
		}
		
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		int i=0;
		try{
			for(i=0;i<students.length;i++)
			{
				if(students[i]==student)
				{
					break;
				}
			}
			if(i>students.length)
				throw new IllegalArgumentException();
			else
			{
			while(i<students.length)
			{
				students[i]=students[i+1];
			}
			}
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Student does.nt exist");
		}
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		int i=0;
		try{
			if(index<0 || index>students.length)
				throw new IllegalArgumentException();
			else
			{
				for(i=index+1;i<students.length;i++)
				{
					
						students[i]=null;
					
				}
				
			}
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("index crossed boundary value");
		}
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		int i=0;
		try{
			if(student==null)
			{
				throw new IllegalArgumentException();
			}
			else{
			for(i=0;i<students.length;i++)
			{
				if(students[i]==student)
				{
					break;
				}
			}
			while(i<students.length)
			{
				students[i]=null;
			}
			}
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Student cannot be null");
		}
		
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		int i=0;
		try{
			if(index<0 || index>students.length)
				throw new IllegalArgumentException();
			else
			{
				for(i=0;i<index;i++)
				{
					
						students[i]=students[i+1];
					
				}
				
			}
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("index crossed boundary value");
		}
		
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		int i=0;
		try{
			if(student==null)
			{
				throw new IllegalArgumentException();
			}
			else{
			for(i=0;i<students.length;i++)
			{
				if(students[i]!=student)
				{
					students[i]=students[i+1];
				}
				else
					break;
			}
			}
		}
		catch(IllegalArgumentException e)
		{
			System.out.println("Student cannot be null");
		}
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		int i,j;
		Student temp;
		for(i=0;i<students.length;i++)
		{
			for(j=0;j<students.length-i-1;j++)
			{
				if(students[j].compareTo(students[j+1])>0)
				{
					temp=students[j];
					students[j]=students[j+1];
					students[j+1]=temp;
					}
			}
		}
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		int i=0,j=0;
		Date d;
		Student[] s={};
		try{
			if(date==null)
				throw new IllegalArgumentException();
			
		for(i=0;i<students.length;i++)
		{
			d=students[i].getBirthDate();
			if(d.compareTo(date)<0)
			{
				s[j]=students[i];
				j++;
			}
		}
		}
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
