void main() {
    int studentId;
    String stIdNum;
    int  total, subjectCount;
    double average;
    String dataRow = "";
    String[] name;

    final String H_LINE = "+" + "-".repeat(5) + "+" + "-".repeat(8) +
            "+" + "-".repeat(8) + "+" + "-".repeat(8) + "+" + "-".repeat(5) +
            "+" + "-".repeat(8) + "+";

    String firstName, lastName;
    final String[][][] studentDetails = {{{"1"}, {"Kasun", "Sampath"}, {"30", "80", "65"}},
            {{"2"}, {"Nuwan"}, {"40", "70", "-1"}},
            {{"3"}, {"Ruwan", null}, {"-1", "65", "80"}}};

    printHeadLinesOfTable(H_LINE);

    for (String[][] student : studentDetails) {

        stIdNum = getId(student[0][0]);

        name = student[1];
        firstName = getFirstName(name);
        lastName = getLastName(name);

        String[] marks = student[2];

        subjectCount = getSubjectCount(marks);

        total = getTotal(marks);

        average = (double) total / 3;

        dataRow = String.format(STR."|%-5s|%-8s|%-8s|%-8d|%-5d|%-8.2f|", stIdNum, firstName, lastName, subjectCount, total, average);

        System.out.println(dataRow);
    }
    System.out.println(H_LINE);

}

String getFirstName(String[] name) {
    return name[0];
}

String getLastName(String[] name) {
    return name.length != 2 || name[1] == null ? "-" : name[1];
}

String getId(String id) {
    return "S%03d".formatted(Integer.parseInt(id));
}

int getSubjectCount(String[] marks) {
    int subCount = 0;
    for (String mark : marks) {
        if (Integer.parseInt(mark) == -1) continue;
        subCount++;
    }
    return subCount;
}

int getTotal(String[] marks) {
    int total = 0;
    for (String mark : marks) {
        if (Integer.parseInt(mark) != -1) total += Integer.parseInt(mark);
    }
    return total;
}

void printHeadLinesOfTable(String H_LINE) {


    System.out.println(H_LINE);

    final String TITLES = String.format("\033[43;1m|%-5s|%-8s|%-8s|%-8s|%-5s|%-8s|\033[0m", "ID", "F. Name", "L. Name", "Subjects", "Total", "Average");
    System.out.println(TITLES);
    System.out.println(H_LINE);
}