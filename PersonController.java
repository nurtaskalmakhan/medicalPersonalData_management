package mpmm;

@Controller
public class PersonController {
    @Autowired
    private DataService dataService;

    @GetMapping("/persons")
    public String showPersons(Model model) {
        List<Person> allPersons = dataService.getAllPersons();
        model.addAttribute("persons", allPersons);
        return "persons-page";
    }

    @GetMapping("/persons/{profession}")
    public String showPersonsByProfession(@PathVariable String profession, Model model) {
        List<Person> personsByProfession = dataService.getPersonsByProfession(profession);
        model.addAttribute("persons", personsByProfession);
        return "persons-by-profession-page";
    }

    // Other methods for data processing or handling form submissions
}

