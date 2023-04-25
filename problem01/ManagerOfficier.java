package problem01;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ManagerOfficier {
    private List<Officier> officiers;

    public ManagerOfficier() {
        this.officiers = new ArrayList<>();
    }

    public void AddOfficier(Officier officier) {
        this.officiers.add(officier);
    }

    public List<Officier> SearchOfficier(String name) {
        return this.officiers.stream().filter(o -> o.GetName().contains(name)).collect(Collectors.toList());
    }

    public void ShowInforOfficier() {
        this.officiers.forEach(o -> System.out.println(o.toString()));
    }
}
