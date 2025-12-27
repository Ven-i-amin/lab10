public class Main {

	public static void main(String[] args) {
		Institute institute = new Institute();
		institute.setName("Технический институт");
		institute.setAddress("ул. Ленина, 1");
		System.out.println("Институт: название=" + institute.getName() + ", адрес=" + institute.getAddress());

		Faculty faculty = new Faculty();
		faculty.setName("Информатика");
		faculty.setAttribute(42);
		System.out.println("Факультет: название=" + faculty.getName() + ", атрибут=" + faculty.getAttribute());

		University university = new University();
		university.setNumberOfEmployers(2500);
		System.out.println("Университет: количество сотрудников=" + university.getNumberOfEmployers());

		Course course = new Course();
		course.setUniqueNumber(101_001L);
		course.setName("Разработка программного обеспечения");
		course.setWeeklyDuration(6);
		System.out.println(
				"Курс: номер=" + course.getUniqueNumber() + ", название=" + course.getName() + ", часов в неделю="
						+ course.getWeeklyDuration());

		Project project = new Project();
		project.setName("Демонстрационный проект");
		project.setStartingDate(1_700_000_000_000L);
		project.setEndDate(1_701_000_000_000L);
		project.setHours(120);
		System.out.println("Проект: название=" + project.getName() + ", дата начала=" + project.getStartingDate()
				+ ", дата окончания=" + project.getEndDate() + ", часы=" + project.getHours());

		Participation participation = new Participation();
		participation.setHours(10);
		System.out.println("Участие: часы=" + participation.getHours());

		ResearchPersonal researchPersonal = new ResearchPersonal();
		researchPersonal.setName("Иван Иванов");
		researchPersonal.setEmail("ivan.ivanov@example.com");
		researchPersonal.setSocialSecurityNumber(100_200_300L);
		System.out.println("Научный сотрудник: имя=" + researchPersonal.getName() + ", email=" + researchPersonal.getEmail()
				+ ", страховой номер=" + researchPersonal.getSocialSecurityNumber());

		Lecturer lecturer = new Lecturer();
		lecturer.setName("Пётр Петров");
		lecturer.setEmail("petr.petrov@example.com");
		lecturer.setSocialSecurityNumber(200_300_400L);
		System.out.println(
				"Преподаватель: имя=" + lecturer.getName() + ", email=" + lecturer.getEmail() + ", страховой номер=" + lecturer.getSocialSecurityNumber());

		Dean dean = new Dean();
		dean.setName("Мария Смирнова");
		dean.setEmail("maria.smirnova@example.com");
		dean.setSocialSecurityNumber(300_400_500L);
		System.out.println("Декан: имя=" + dean.getName() + ", email=" + dean.getEmail() + ", страховой номер=" + dean.getSocialSecurityNumber());

		AdministrativePersonal admin = new AdministrativePersonal();
		admin.setName("Ольга Кузнецова");
		admin.setEmail("olga.kuznetsova@example.com");
		admin.setSocialSecurityNumber(400_500_600L);
		System.out.println("Административный персонал: имя=" + admin.getName() + ", email=" + admin.getEmail() + ", страховой номер="
				+ admin.getSocialSecurityNumber());
	}
}
