public class Alumno {
	protected String firstName;
	protected String lastName;
	protected int lu;

	public Alumno(String fn, String ln, int lu) {
		firstName = fn;
		lastName = ln;
		this.lu = lu;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getLU() {
		return lu;
	}
}