package problem3;

import java.util.ArrayList;
import java.util.List;

public class Enrollment {
    List<Candidates> candidates;

    public Enrollment() {
        this.candidates = new ArrayList<>();
    }

    public void insertCandidate(Candidates candidate) {
        candidates.add(candidate);
    }

    public void showCandidateInfor() {
        this.candidates.stream().forEach(cand -> System.out.println(cand.toString()));
    }

    public Candidates searchCandidate(int canID) {
        return this.candidates.stream().filter(candidate -> candidate.getCandidateID() == canID).findFirst().orElse(null);
    }
}

