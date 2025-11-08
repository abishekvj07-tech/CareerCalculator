public class Career {
    private String skill;
    private String interest;
    private String careerName;

    public Career(String skill, String interest, String careerName) {
        this.skill = skill;
        this.interest = interest;
        this.careerName = careerName;
    }

    public String getSkill() { return skill; }
    public String getInterest() { return interest; }
    public String getCareerName() { return careerName; }

    @Override
    public String toString() {
        return "Career Suggestion: " + careerName +
                "(Skill: " + skill + ", Interest: " + interest + ")";
    }
}
