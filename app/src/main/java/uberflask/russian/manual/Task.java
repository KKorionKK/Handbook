package uberflask.russian.manual;

public class Task {
    private String number;
    private String description;
    private String answer;

    public Task() {
    }

    public Task(String number, String description, String answer) {
        this.number = number;
        this.description = description;
        this.answer = answer;
    }

    public String getNumber() {
        return number;
    }

    public String getDescription() {
        return description;
    }

    public  String getAnswer() {
        return answer;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
