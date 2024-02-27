void main() {
    String customerId;

    String dataRow;
    String name, mobileNo, landPhone;

    final String H_LINE = STR."+\{"-".repeat(5)}+\{"-".repeat(8)}+\{"-".repeat(12)}+\{"-".repeat(12)}+";

    String[][] customers = {{"1", "2", "3", "4"}, {"Kasun", "Nuwan", "Ruwan", "Supun"}, {"077-1234567", "078-1234567", "071-1234567", "041-1234567"}, {"011-1234567", "-", null, "033-1234567"}};

    printHeadLinesOfTable(H_LINE);

    int noOfCustomers = customers[0].length;

    for (int i = 0; i < noOfCustomers; i++) {
        customerId = getId(customers[0][i]);
        name = getName(customers[1], i);
        mobileNo = getPhoneNo(customers[2], i);
        landPhone = getPhoneNo(customers[3], i);

        dataRow = String.format("|%-5s|%-8s|%-12s|%-12s|", customerId, name, mobileNo, landPhone);

        System.out.println(dataRow);

    }

    System.out.println(H_LINE);

}

String getName(String[] name, int index) {
    return name[index];
}


String getId(String id) {
    return "C-%03d".formatted(Integer.parseInt(id));
}

String getPhoneNo(String[] phoneNos, int index) {
    return phoneNos[index] != null ? phoneNos[index] : "NA";
}

void printHeadLinesOfTable(String H_LINE) {
    System.out.println(H_LINE);
    final String TITLES = String.format("\033[43;1m|%-5s|%-8s|%-12s|%-12s|\033[0m", "ID", "Name", "Mobile", "Land Phone");
    System.out.println(TITLES);
    System.out.println(H_LINE);
}