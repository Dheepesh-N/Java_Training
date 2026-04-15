import java.util.*;

//ABSTRACT CLASS (Abstraction)
abstract class User {
    private String name;
    private int id;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() { return name; }
    public int getId() { return id; }

    // Abstract method (Polymorphism)
    public abstract void displayRole();
}

//INHERITANCE
class Student extends User {

    public Student(int id, String name) {
        super(id, name);
    }

    @Override
    public void displayRole() {
        System.out.println("Role: Student");
    }
}

//ENCAPSULATION
class Question {
    private String questionText;
    private List<String> options;
    private int correctAnswer;

    public Question(String questionText, List<String> options, int correctAnswer) {
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public void displayQuestion() {
        System.out.println("\n" + questionText);
        for (int i = 0; i < options.size(); i++) {
            System.out.println((i + 1) + ". " + options.get(i));
        }
    }

    public boolean checkAnswer(int answer) {
        return answer == correctAnswer;
    }
}

//QUIZ CLASS
class Quiz {
    private List<Question> questions;

    public Quiz() {
        questions = new ArrayList<>();
    }

    public void addQuestion(Question q) {
        questions.add(q);
    }

    public int conductQuiz() {
        Scanner sc = new Scanner(System.in);
        int score = 0;

        for (Question q : questions) {
            q.displayQuestion();

            int answer;
            while (true) {  // Validation
                System.out.print("Enter your answer (1-4): ");
                if (sc.hasNextInt()) {
                    answer = sc.nextInt();
                    if (answer >= 1 && answer <= 4) break;
                } else {
                    sc.next(); // clear invalid input
                }
                System.out.println("Invalid input! Try again.");
            }

            if (q.checkAnswer(answer)) {
                score++;
            }
        }

        return score;
    }

    public int getTotalQuestions() {
        return questions.size();
    }
}

//RESULT CLASS
class Result {
    private int score;
    private int total;

    public Result(int score, int total) {
        this.score = score;
        this.total = total;
    }

    public void displayResult() {
        System.out.println("\n===== RESULT =====");
        System.out.println("Score: " + score + "/" + total);

        double percentage = (score * 100.0) / total;
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 50)
            System.out.println("Status: PASS");
        else
            System.out.println("Status: FAIL");
    }
}

//MAIN SYSTEM CLASS
public class QuizSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create Student
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        Student student = new Student(id, name);

        student.displayRole();
        System.out.println("Welcome, " + student.getName());

        // Create Quiz
        Quiz quiz = new Quiz();

        // Add Questions
        quiz.addQuestion(new Question(
                "What is Java?",
                Arrays.asList("Programming Language", "OS", "Browser", "Hardware"),
                1));

        quiz.addQuestion(new Question(
                "Which keyword is used for inheritance?",
                Arrays.asList("this", "super", "extends", "implements"),
                3));

        quiz.addQuestion(new Question(
                "Which is not OOP concept?",
                Arrays.asList("Encapsulation", "Polymorphism", "Compilation", "Inheritance"),
                3));

        
        int score = quiz.conductQuiz();

        // Show Result
        Result result = new Result(score, quiz.getTotalQuestions());
        result.displayResult();

        // EXTRA FEATURE: Retake Option
        System.out.print("\nDo you want to retake quiz? (yes/no): ");
        String choice = sc.next();

        if (choice.equalsIgnoreCase("yes")) {
            int newScore = quiz.conductQuiz();
            Result newResult = new Result(newScore, quiz.getTotalQuestions());
            newResult.displayResult();
        }

        System.out.println("\nThank you for using Quiz System!");
    }
}