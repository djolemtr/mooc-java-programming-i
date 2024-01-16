import java.util.ArrayList;

public class Points {
    private ArrayList<Integer> pointsList;
    private ArrayList<Integer> gradesList;

    public Points() {
        this.pointsList = new ArrayList<>();
        this.gradesList = new ArrayList<>();
    }

    public void add(int points) {
        pointsList.add(points);
        gradesList.add(pointsToGrade(points));
    }

    public double average() {
        int sum = 0;
        for (int p : pointsList) {
            sum += p;
        }

        return (double) sum / pointsList.size();
    }

    public double averageOfPassingPoints() {
        int sum = 0;
        for (int p : pointsList) {
            if (p > 49) {
                sum += p;
            }
        }
        return (double) sum / numberOfPassingPoints();
    }

    public double passPercentage() {
        return (double) 100 * numberOfPassingPoints() / pointsList.size();
    }

    public int numberOfPassingPoints() {
        int n = 0;
        for (int p : pointsList) {
            if (p > 49) {
                n++;
            }
        }
        return n;
    }

    public int pointsToGrade(int points) {
        if (points < 50) {
            return 0;
        }
        if (points < 60) {
            return 1;
        }
        if (points < 70) {
            return 2;
        }
        if (points < 80) {
            return 3;
        }
        if (points < 90) {
            return 4;
        } else {
            return 5;
        }

    }

    public int gradeDistribution(int grade) {
        int n = 0;
        for (int g : gradesList) {
            if (g == grade) {
                n++;
            }
        }
        return n;
    }

    public String stars(int grades) {
        String stars = "";
        for (int i = 0; i < grades; i++) {
            stars += "*";
        }
        return stars;
    }

}
