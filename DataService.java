package mpmm;

@Service
public class DataService {
    private List<Person> persons;

    public DataService() {
        // Initialize the dataset with sample persons
        persons = new ArrayList<>();

        persons.add(new Person("John Doe", 35, "Doctor"));
        persons.add(new Person("Jane Smith", 42, "Nurse"));
        persons.add(new Person("David Johnson", 28, "Pharmacist"));
        persons.add(new Person("Michael Brown", 39, "Surgeon"));
        persons.add(new Person("Emily Davis", 31, "Physician Assistant"));
        persons.add(new Person("Daniel Wilson", 45, "Anesthesiologist"));
        persons.add(new Person("Sophia Martinez", 29, "Medical Technologist"));
        persons.add(new Person("Christopher Taylor", 36, "Radiologist"));
        persons.add(new Person("Olivia Anderson", 41, "Pediatrician"));
        persons.add(new Person("Matthew Thomas", 34, "Cardiologist"));
        persons.add(new Person("Ava Robinson", 47, "Orthopedic Surgeon"));
        persons.add(new Person("William Lee", 32, "Ophthalmologist"));
        persons.add(new Person("Isabella Hall", 38, "Dermatologist"));
        persons.add(new Person("Joseph Hernandez", 43, "Gastroenterologist"));
        persons.add(new Person("Mia Wright", 30, "Neurologist"));
        persons.add(new Person("Andrew Young", 33, "Urologist"));
        persons.add(new Person("Charlotte King", 40, "Endocrinologist"));
        persons.add(new Person("David Lopez", 37, "Psychiatrist"));
        persons.add(new Person("Samantha Scott", 44, "Obstetrician"));
        persons.add(new Person("Benjamin Green", 31, "Oncologist"));
        persons.add(new Person("Natalie Adams", 35, "Hematologist"));
        persons.add(new Person("Henry Baker", 42, "Nephrologist"));
        persons.add(new Person("Elizabeth Hill", 28, "Pulmonologist"));
        persons.add(new Person("James Allen", 39, "Rheumatologist"));
        persons.add(new Person("Amelia Cook", 36, "Allergist"));
        persons.add(new Person("Alexander Ward", 41, "Family Physician"));
        persons.add(new Person("Ella Ramirez", 37, "Emergency Medicine Physician"));
        persons.add(new Person("William Turner", 34, "Geriatrician"));
        persons.add(new Person("Grace Collins", 38, "Intensivist"));
        persons.add(new Person("Daniel Hughes", 45, "Neonatologist"));
        persons.add(new Person("Sofia Flores", 30, "Otolaryngologist"));
        persons.add(new Person("Michael Reed", 33, "Pathologist"));
        persons.add(new Person("Avery Campbell", 48, "Plastic Surgeon"));
        persons.add(new Person("Scarlett Price", 29, "Podiatrist"));
        persons.add(new Person("Carter Mitchell", 46, "Radiation Oncologist"));
        persons.add(new Person("Abigail Baker", 32, "Sleep Medicine Specialist"));
        persons.add(new Person("Henry Turner", 39, "Sports Medicine Physician"));
        persons.add(new Person("Emily Ward", 43, "Surgical Oncologist"));
        persons.add(new Person("Mason Torres", 31, "Thoracic Surgeon"));
        persons.add(new Person("Evelyn Collins", 35, "Vascular Surgeon"));
        persons.add(new Person("Liam Anderson", 40, "Developmental-Behavioral Pediatrician"));
        persons.add(new Person("Aria Roberts", 34, "Infectious Disease Specialist"));
        persons.add(new Person("Sebastian Morgan", 42, "Medical Geneticist"));
        persons.add(new Person("Layla Hughes", 37, "Pain Medicine Specialist"));
        persons.add(new Person("Jack Turner", 44, "Reproductive Endocrinologist"));
        persons.add(new Person("Avery Cooper", 33, "Interventional Radiologist"));
        persons.add(new Person("Chloe Ross", 46, "Clinical Neurophysiologist"));
        persons.add(new Person("Owen Peterson", 48, "Clinical Pharmacologist"));

    }

    public List<Person> getAllPersons() {
        return persons;
    }

    public List<Person> getPersonsByProfession(String profession) {
        List<Person> filteredPersons = new ArrayList<>();
        for (Person person : persons) {
            if (person.getProfession().equals(profession)) {
                filteredPersons.add(person);
            }
        }
        return filteredPersons;
    }

    // Other methods for data processing or manipulation
}
